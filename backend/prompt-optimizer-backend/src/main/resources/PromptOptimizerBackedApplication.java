package com.example.prompt_optimizer_backend;

import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.google.vertexai.gemini.GoogleVertexAiGeminiChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
@CrossOrigin(origins = "*")
public class PromptOptimizerBackedApplication {

	private final GoogleVertexAiGeminiChatModel chatModel;

	public PromptOptimizerBackedApplication(GoogleVertexAiGeminiChatModel chatModel) {
		this.chatModel = chatModel;
	}

	public static void main(String[] args) {
		// FIXED: This now correctly matches the class name
		SpringApplication.run(PromptOptimizerBackedApplication.class, args);
	}

	@PostMapping("/api/v1/optimizer/generate")
	public Map<String, String> optimize(@RequestBody Map<String, String> payload) {
		String rawPrompt = payload.get("userPrompt");
		String taskType = payload.get("task");

		String instruction = "You are an expert Prompt Engineer. Rewrite this: '" + rawPrompt +
				"' into a professional prompt for " + taskType + ". Return only the prompt.";

		// This calls the Gemini API
		var response = chatModel.call(new Prompt(instruction));
		String result = response.getResult().getOutput().getContent();

		return Map.of("optimized", result);
	}
}