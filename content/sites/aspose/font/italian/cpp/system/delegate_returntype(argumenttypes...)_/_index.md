---
title: "System::Delegate< ReturnType(ArgumentTypes...)> class"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font per C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)> class. Rappresenta un puntatore a una funzione, metodo o oggetto funzione. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 2100
url: /it/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


Rappresenta un puntatore a una funzione, metodo o oggetto funzione. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parametro | Descrizione |
| --- | --- |
| ReturnType | Il tipo di ritorno di una funzione, metodo o oggetto funzione a cui punta, rappresentato dalla classe |
| ArgumentTypes | L'elenco degli argomenti di una funzione, metodo o oggetto funzione a cui punta, rappresentato dalla classe |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Delegate](./delegate/)() | Costruttore predefinito. Costruisce l'oggetto delegate che non punta a nulla. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | Costruttore di copia con spostamento. Assume la proprietà di un'entità a cui punta il delegate specificato. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | Costruttore. Costruisce un oggetto delegate dal puntatore specificato a una funzione libera o a un metodo statico. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | Costruttore. Costruisce un delegate dal puntatore specificato all'oggetto funzione generato da std::bind(). |
| [Delegate](./delegate/)(int, T\&) | Costruttore. Costruisce un delegate dall'oggetto funzione specificato. |
| [Delegate](./delegate/)(long, T\&&) | Costruttore di spostamento. Costruisce un delegate dall'oggetto funzione specificato. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | Costruttore. Costruisce un delegate che punta al metodo non statico specificato dell'oggetto specificato. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | Costruttore. Costruisce un delegate che punta al metodo non statico specificato dell'oggetto specificato. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | Costruisce un oggetto delegate che punta a un oggetto funzione std::function. |
| [Empty](./empty/)() const | Determina se l'oggetto delegate corrente è vuoto, ad esempio non punta a nessuna entità. |
| [operator()](./operator()/)(ArgumentTypes...) const | Invoca una funzione, un metodo o un oggetto funzione a cui punta l'oggetto delegate corrente. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | Operatore di assegnazione con spostamento. Assume la proprietà di un'entità a cui punta il delegate specificato. |
| [operator==](./operator==/)(const Delegate\&) const | Confronta due oggetti delegate per verificare se puntano alla stessa entità. |
## Osservazioni



```cpp
#include "system/delegate.h"
#include <iostream>

// Dichiara il delegate.
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // Assegna alla variabile l'indirizzo della funzione PrintMessage.
  Message mes = Message(&PrintMessage);

  // Chiama la funzione.
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
