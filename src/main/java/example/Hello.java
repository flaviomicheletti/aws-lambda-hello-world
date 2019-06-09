package example;

import com.amazonaws.services.lambda.runtime.Context;

public class Hello {

    // Define two classes/POJOs for use with Lambda function.
    public static class RequestClass {

		public Object getFirstName() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getLastName() {
			// TODO Auto-generated method stub
			return null;
		}
    }

    public static class ResponseClass {

		public ResponseClass(String greetingString) {
			// TODO Auto-generated constructor stub
		}

    }

    public static ResponseClass myHandler(RequestClass request, Context context) {
        String greetingString = String.format("Hello %s, %s.", request.getFirstName(), request.getLastName());
        return new ResponseClass(greetingString);
    }
}