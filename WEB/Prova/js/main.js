function funcAddTask(e) {
    
    //onde sera adicionada a task
    var listaTask = document.getElementById('listaTasks')
    
    //Criacao do elemento a ser adicionado
    var task = document.createElement('div')
    
    //Adicionando a classe do elemento
    task.setAttribute('class', 'taskBox')
    
    //obter a entrada do usuario
    var entrada = document.getElementsByClassName('taskName')
    
    //criando o input e o botao de remover
    var taskInput = document.createElement('input')
    taskInput.setAttribute('class', 'taskItem')
    taskInput.value = entrada.item(0).value
    //apago o input de entrada
    entrada.item(0).value = ''
    
    var btnRemove = document.createElement('a')
    btnRemove.setAttribute('href', '')
    btnRemove.setAttribute('class', 'removeTask')
    btnRemove.setAttribute('onclick', 'removeTask(event)')
    btnRemove.textContent = '-'
    
    //colocando os elementos dentro da div
    task.appendChild(taskInput)
    task.appendChild(btnRemove)
    
    //colocando o elemento
    listaTask.appendChild(task)
    
    e.preventDefault();
}

function removeTask(e) {
    
    //nao deixa o evento fazer os padroes
    e.preventDefault()
    
    //obtem elemento que ativa a funcao
    var alvo = e.target
    
    //deleto o elemento pai do alvo
    var pai = alvo.parentNode
    pai.remove()
}

function removerTodos(e) {
    
    //nao deixa o evento fazer os padroes
    e.preventDefault()
    
    //obtenho o pai do alvo do evento
    var pai = e.target.parentNode.parentNode

    var nodesss = pai.querySelectorAll('div')

    console.log(nodesss)

    for (const iterator of nodesss) {
        iterator.remove()
    }
    
}