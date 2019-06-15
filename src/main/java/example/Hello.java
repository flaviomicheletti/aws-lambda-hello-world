package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Object, String> {

   public String handleRequest(Object request, Context context) {
      context.getLogger().log("Request: " + request);

      System.out.println("AWS Lambda function name: " + context.getFunctionName());
      System.out.println("Memory Allocated: " + context.getMemoryLimitInMB());
      System.out.println("Time remaining in milliseconds: " + context.getRemainingTimeInMillis());
      System.out.println("Cloudwatch group name " + context.getLogGroupName());
      System.out.println("AWS Lambda Request Id " + context.getAwsRequestId());
      return "Hello from Lambda!";
   }
}