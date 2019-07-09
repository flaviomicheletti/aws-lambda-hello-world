# AWS Lambda Java

Esse é uma lambda(AWS) Java no estilo hello world.

Baseado neste tutorial https://www.tutorialspoint.com/aws_lambda/aws_lambda_function_in_java.htm


__Executando:__

Crie o arquivo`jar`.

    mvn package

Faça upload no console do AWS e execute a aplicação.


__evocando no powershell__

     aws lambda invoke --function-name hw-java --log-type Tail --payload '{\"name\": \"Flavio\"}' outputfile.md


__evocando no gitbash__

     aws lambda invoke --function-name hw-java --log-type Tail --payload '{"name": "Flavio"}' outputfile.md

Por padrão ele procura na área `us-est-2`. Se precisar mudar, inclua `--region us-east-1`, por exemplo.

__Integração com API-Gateway:__

Talvez esteja funcionando...

https://lsdk5p7kkg.execute-api.us-east-2.amazonaws.com/testing
