console.log("console message");
fetch("http://localhost:8080/student")
.then(function (response){
    return response.json();
})
.then(function (data){
    console.log(data);
})