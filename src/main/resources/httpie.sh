# Insere um Cliente
http POST \
	https://projeto-delivery-bil.run-eu-central1.goorm.site/clientes   \
	nome="João Paulo" \
	email="jp@site.com" \
	telefone="(35) 99999-1011"   \
	endereco="Rua das Árvores, 456, Varginha, MG"   \
	ativo:=true

# Busca um Cliente
http GET \
	https://projeto-delivery-bil.run-eu-central1.goorm.site/clientes/3

