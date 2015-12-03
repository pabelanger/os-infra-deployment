import jenkins.model.Jenkins;
import com.cloudbees.plugins.credentials.domains.Domain;
import com.cloudbees.plugins.credentials.CredentialsScope;
import com.cloudbees.jenkins.plugins.sshcredentials.impl.BasicSSHUserPrivateKey;

domain = Domain.global()
credentials_store =
    Jenkins.instance.getExtensionList(
        'com.cloudbees.plugins.credentials.SystemCredentialsProvider'
    )[0].getStore()
credentials = new BasicSSHUserPrivateKey(
    CredentialsScope.GLOBAL,
    "9292f6a1-ebc6-40e8-80da-b8940261cdce",
    "jenkins",
    new BasicSSHUserPrivateKey.UsersPrivateKeySource(),
    "",
    "Managed by Ansible"
)
credentials_store.addCredentials(domain, credentials)
