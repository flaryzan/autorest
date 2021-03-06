/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package storage.implementation;

import .StorageManagementClient;
import .StorageAccounts;
import .Usages;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the StorageManagementClient class.
 */
public class StorageManagementClientImpl extends ServiceClient implements StorageManagementClient {

    /** Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public StorageManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Client Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself
     */
    public StorageManagementClientImpl withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * The StorageAccounts object to access its operations.
     */
    private StorageAccounts storageAccounts;

    /**
     * Gets the StorageAccounts object to access its operations.
     * @return the StorageAccounts object.
     */
    public StorageAccounts storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * The Usages object to access its operations.
     */
    private Usages usages;

    /**
     * Gets the Usages object to access its operations.
     * @return the Usages object.
     */
    public Usages usages() {
        return this.usages;
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     */
    public StorageManagementClientImpl() {
        this("https://management.azure.com");
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public StorageManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public StorageManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://management.azure.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public StorageManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public StorageManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.storageAccounts = new StorageAccountsImpl(retrofit(), this);
        this.usages = new UsagesImpl(retrofit(), this);
    }
}
