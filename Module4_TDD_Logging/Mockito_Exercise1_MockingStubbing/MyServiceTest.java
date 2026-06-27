package Module4_TDD_Logging.Mockito_Exercise1_MockingStubbing;

public class MyServiceTest {

    public void testExternalApi() {

        ExternalApi mockApi = new ExternalApi() {
            @Override
            public String getData() {
                return "Mock Data";
            }
        };

        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        System.out.println(result);
    }

    public static void main(String[] args) {
        new MyServiceTest().testExternalApi();
    }
}