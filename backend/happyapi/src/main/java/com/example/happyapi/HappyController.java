package com.example.happyapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HappyController {
    @GetMapping("/display")
    public String display(){
        return "hi"+
                "<br>" +
                "<html>" +
                "<body>" +
                "<img src=https://tinyurl.com/56jp889d height=50% width=50% >" +
                "<h1> Welcome to happy API </h1>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/display/{name}")
    public String displayname(@PathVariable String name){
        return "hi"+
                "<br>" +
                "<html>" +
                "<style>"+"body{text-align:center}"+
                "</style>"+
                "<body>" +
                "<img src=https://tinyurl.com/56jp889d height=50% width=50% >" +
                "<h1> Welcome to happy API </h1><marquee>"
                +name+
                "</marquee></body>" +
                "</html>";
    }

    @GetMapping("/myarmstrongchecker/{n}")
    public String armstrong(@PathVariable int n){
        int c=0;
        int o=n,t=n;
        int sum=0;
        while(n>0) {
            c++;
            n /= 10;
        }
        while(o>0){
            sum=sum+(int)(Math.pow(o%10,c));
            o/=10;
        }
        if(t==sum)return "Yes, It is an Armstrong number"+"<br><html><style>body{text-align:center}</style><body><img src=https://tse3.mm.bing.net/th/id/OIP.Ez3ke0xvFejMS_9MqtyMNQHaH_?rs=1&pid=ImgDetMain&o=7&rm=3 height=60% width=40%></body></html>";
        return "No, It is not an Armstrong number"+"<br><html><style>body{text-align:center}</style><body><img src=https://static.vecteezy.com/system/resources/thumbnails/001/622/543/original/error-wrong-mark-icon-animation-video.jpg align=center height=60% width=40%></body></html>";
    }

    @GetMapping("/allinone/{name}/{n}")
    public String all(@PathVariable String name,
                      @PathVariable int n){
        return "hi"+
                "<br>" +
                "<html>" +
                "<style>"+"body{text-align:center}"+
                "</style>"+
                "<body>" +
                "<img src=https://tinyurl.com/56jp889d height=50% width=50% >" +
                "<h1> Welcome to happy API </h1><marquee>"
                +name+
                "</marquee></body>" +
                "</html><br>"+armstrong(n);
    }

    @GetMapping("/printstring/{x}/{y}/{z}")
    public String greaterthan100(@PathVariable float x,
                              @PathVariable float y,
                              @PathVariable float z){
        float sum=x+y+z;
        if(x+y+z>100)return String.valueOf(sum);
        return x+" "+y+" "+z;
    }

    @GetMapping("/printint/{x}/{y}/{z}")
    public Object greter(@PathVariable float x,
                         @PathVariable float y,
                         @PathVariable float z){
        float sum=x+y+z;
        if(x+y+z>100)return sum;
        else return x+" "+y+" "+z;
    }


    }


