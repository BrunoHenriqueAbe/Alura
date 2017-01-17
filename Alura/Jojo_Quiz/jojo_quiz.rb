require_relative "ui"
def chama_pergunta 
	perguntas = ["Quem foi o primeiro membro da família Joestar a desenvolver o Hamon?",
				"Qual é o nome da esposa de Joseph Joestar?",
				"Qual é o nome do filho bastardo de Joseph Joestar",
				"Qual é o nome do Stand de Kujo Jotaro",
				"Qual é o nome da música da segunda abertura da saga 'Phantom Blood + Battle Tendency?'",
				"Qual é o nome do Stand de Dio Brando?",
				"Qual é o nome do Stand de Kira?"]

	respostas = ["jonathan joestar",
				"suzie q",
				"higashikata josuke",
				"star platinum",
				"bloody stream",
				"the world",
				"killer queen"]

	pontuacao_inicial = 0

	for quantidade_de_perguntas in 0..6
		puts perguntas[quantidade_de_perguntas]
		puts
		quantidade_de_respostas = quantidade_de_perguntas
		resposta = gets.strip
		if resposta.downcase == respostas[quantidade_de_respostas]
			pontuacao_inicial += 200
			puts "\nParabéns, você acertou! Você ganhou #{pontuacao_inicial}. Sua pontuação agora é de #{pontuacao_inicial} pontos."
		else
			pontuacao_inicial -= 200
			puts "\nQue pena, você errou! Você perdeu #{pontuacao_inicial}. Sua pontuação agora é de #{pontuacao_inicial}. pontos."
		end
	end
end




nome = boas_vindas
chama_pergunta