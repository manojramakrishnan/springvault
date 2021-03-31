Install Vault binary from vaultproject.io

run the vault server by executing the following command:

vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"

After starting the vault server, set the vault address like this mentioned below:-

set VAULT_ADDR=http://localhost:8200





# spring-vault-config-example

# write : 
vault kv put secret/spring-vault-config-example hashicorpvault.username=Manoj hashicorpvault.password=Manoj_pwd

# read : 
vault kv get secret/spring-vault-config-example

# Delete: 
vault kv delete secret/spring-vault-config-example
