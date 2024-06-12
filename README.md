# Projeto de Estrutura de Dados

## Justificativa

### Análise da Ordem dos Números

Os números exibidos na fila estão na ordem inversa da inserção inicial devido às operações realizadas com a pilha e a fila. Aqui está uma análise detalhada do processo:

1. **Inserção na Lista**:
   - Inicialmente, os números `[1, 2, 3, 4, 5]` são inseridos na lista.

2. **Transferência para a Pilha**:
   - Os números são removidos da lista e inseridos na pilha na ordem `[1, 2, 3, 4, 5]`.
   - Como a pilha funciona com o princípio LIFO (Last In, First Out), a ordem interna na pilha será `[5, 4, 3, 2, 1]`.

3. **Transferência para a Fila**:
   - Os números são removidos da pilha e inseridos na fila. A ordem de remoção da pilha e inserção na fila será `[5, 4, 3, 2, 1]`.
   - Como a fila funciona com o princípio FIFO (First In, First Out), a ordem interna na fila será `[5, 4, 3, 2, 1]`.

4. **Inserção dos Números Restantes na Lista**:
   - Os números `[6, 7, 8, 9, 10]` são inseridos na lista.

5. **Repetição do Processo**:
   - Novamente, os números são removidos da lista e inseridos na pilha na ordem `[6, 7, 8, 9, 10]`, resultando em uma ordem interna na pilha de `[10, 9, 8, 7, 6]`.
   - Esses números são então transferidos para a fila, que agora terá a ordem `[5, 4, 3, 2, 1, 10, 9, 8, 7, 6]`.

### Conclusão

A ordem final dos números na fila está invertida em relação à ordem de inserção original na lista, devido às propriedades das operações de pilha (LIFO) e fila (FIFO). Esse comportamento é esperado e demonstra a correta implementação das estruturas de dados solicitadas.
