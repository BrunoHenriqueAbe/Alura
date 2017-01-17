def boas_vindas
	puts "Bem-vindo ao Jojo Quiz. Neste jogo testaremos seu conhecimento sobre Jojo's Bizarre Adventures."
	puts
	puts "Insira seu nome."
	puts
	nome = gets.strip
	puts
	puts "O jogo começará agora, #{nome}"
	puts
	puts "Sua pontuação inicial é de 0 pontos."
	nome
end
