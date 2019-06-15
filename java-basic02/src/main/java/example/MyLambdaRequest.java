package example;

public class MyLambdaRequest
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyLambdaRequest [name=" + name + "]";
    }
}
