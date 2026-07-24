---
title: "System::Delegate< ReturnType(ArgumentTypes...)> class"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page voor C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)> class. Vertegenwoordigt een pointer naar een functie, methode of een functie‑object. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr class om objecten van dit type in C++ te beheren."
type: docs
weight: 2100
url: /nl/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


Vertegenwoordigt een pointer naar een functie, methode of een functie‑object. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/) class om objecten van dit type te beheren.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parameter | Beschrijving |
| --- | --- |
| ReturnType | Het returntype van een functie, methode of een functie‑objectpointer die door de class wordt vertegenwoordigd |
| ArgumentTypes | De argumentenlijst van een functie, methode of een functie‑objectpointer die door de class wordt vertegenwoordigd |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Delegate](./delegate/)() | Standaardconstructor. Construeert het delegate‑object dat nergens naar wijst. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | Verplaatsende copy‑constructor. Neemt het eigendom over van een entiteit waarnaar de opgegeven delegate wijst. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | Constructor. Construeert een delegate‑object vanuit de opgegeven pointer naar een vrije functie of statische methode. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | Constructor. Construeert een delegate vanuit de opgegeven pointer naar het functie‑object gegenereerd door std::bind(). |
| [Delegate](./delegate/)(int, T\&) | Constructor. Construeert een delegate vanuit het opgegeven functie‑object. |
| [Delegate](./delegate/)(long, T\&&) | Verplaatsende constructor. Construeert een delegate vanuit het opgegeven functie‑object. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | Constructor. Construeert een delegate die wijst naar de opgegeven niet‑statische methode van het opgegeven object. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | Constructor. Construeert een delegate die wijst naar de opgegeven niet‑statische methode van het opgegeven object. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | Construeert een delegate‑object dat wijst naar een std::function functie‑object. |
| [Empty](./empty/)() const | Bepaalt of het huidige delegate‑object leeg is, bijv. niet naar een entiteit wijst. |
| [operator()](./operator()/)(ArgumentTypes...) const | Roep een functie, methode of een functie‑object aan waar het huidige delegate‑object naar wijst. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | Verplaatsende toewijzingsoperator. Neemt het eigendom over van een entiteit waarnaar de opgegeven delegate wijst. |
| [operator==](./operator==/)(const Delegate\&) const | Vergelijkt twee delegate-objecten om te controleren of ze naar dezelfde entiteit wijzen. |
## Opmerkingen



```cpp
#include "system/delegate.h"
#include <iostream>

// Declareer de delegate.
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // Wijs aan een variabele het adres van de PrintMessage-functie toe.
  Message mes = Message(&PrintMessage);

  // Roep de functie aan.
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
