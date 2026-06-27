package Module4_TDD_Logging.Mockito_Exercise2_VerifyingInteractions;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {

        this.api = api;

    }

    public String fetchData() {

        return api.getData();

    }

}