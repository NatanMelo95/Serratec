class cadastro {
	constructor(nomeCompleto, enderecoEmail, cep, logradouro, numero, complemento, bairro, localidade, uf, referencia, password, confirmarPassword){
		this.nomeCompleto = nomeCompleto
		this.enderecoEmail = enderecoEmail
		this.cep = cep
		this.logradouro = logradouro
		this.numero = numero
		this.complemento = valor
        this.bairro = bairro
        this.localidade = localidade
        this.uf = uf
        this.referencia = referencia
        this.password = password
        this.confirmarPassword = confirmarPassword
	}

	validarDados(){
		for(let i in this){
			if(this[i] == null || this[i] == undefined || this[i] == ''){
				return false
			}
		}

		return true
	}

}