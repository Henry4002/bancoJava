❌ Resumo dos ERROS

Retornar texto no lugar de variável
→ "saldo" e "titular" em vez dos valores reais
Uso de aspas em parâmetro
→ double "valor" (inválido em Java)
Falta de extends na herança
→ classe não herdava de Conta corretamente
Nome de classe digitado errado
→ ContaCorente em vez de ContaCorrente
Classe duplicada no mesmo arquivo
Imports incorretos
→ não respeitando o package org.example
Mistura de tipos
→ criar ContaCorrente e guardar em ContaPoupanca
Uso de variável errada no print
→ usar conta1 no lugar de cont2

✅ Resumo das CORREÇÕES
Retornar as variáveis corretas
→ return saldo; e return titular;
Remover aspas dos parâmetros
→ double valor
Adicionar herança corretamente
→ extends Conta
Corrigir nomes das classes
Remover código duplicado
Ajustar imports com o package correto
Usar o tipo certo para cada objeto
→ ContaCorrente com ContaCorrente
Corrigir uso das variáveis nos prints
