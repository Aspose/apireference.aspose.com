---
title: "System::Func klasse"
linktitle: "Func"
second_title: "Aspose.Page voor C++"
description: "System::Func klasse. Functie‑delegate. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 2800
url: /nl/cpp/system/func/
---
## Func class


Functie‑delegate. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/) klasse om objecten van dit type te beheren.

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| Parameter | Beschrijving |
| --- | --- |
| Argumenten | Aanroepargumenten, gevolgd door verplichte retourtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Func](./func/)() | Standaardconstructor die een null‑Func maakt. |
| [Func](./func/)(T\&&) | Constructor die een [Func](./) object maakt en er een waarde (ofwel een daadwerkelijke callback of nullptr) aan toewijst. |
| [Func](./func/)(const Func\&) | Copy-constructor. |
| [Func](./func/)(Func\&&) | Move-constructor. |
| [operator=](./operator=/)(const Func\&) | Kopie‑toewijzing. |
| [operator=](./operator=/)(Func\&&) | Verplaats‑toewijzing. |
| [~Func](./~func/)() | Destructor. |
## Opmerkingen



```cpp
#include "system/func.h"
#include <iostream>

// Deze functie accepteert een instantie van de System::Func delegate als parameter.
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // Maak een instantie van de System::Func delegate.
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // Geef de gemaakte instantie door als functie‑argument.
  Print(1, func);
  Print(2, func);
  Print(3, func);

  return 0;
}
/*
This code example produces the following output:
1
4
9
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
