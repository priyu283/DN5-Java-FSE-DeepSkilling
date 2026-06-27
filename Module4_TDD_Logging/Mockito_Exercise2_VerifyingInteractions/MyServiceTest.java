package Module4_TDD_Logging.Mockito_Exercise2_VerifyingInteractions;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();

    }

    private ExternalApi verify(ExternalApi mockApi) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verify'");
    }

    private ExternalApi mock(Class<ExternalApi> class1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mock'");
    }

}