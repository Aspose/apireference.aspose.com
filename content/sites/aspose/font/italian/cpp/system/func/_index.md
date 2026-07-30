---
title: "System::Func class"
linktitle: "Func"
second_title: "Aspose.Font per C++"
description: "System::Func class. Delegato di funzione. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 2800
url: /it/cpp/system/func/
---
## Func class


Delegato di funzione. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| Parametro | Descrizione |
| --- | --- |
| Argomenti | Argomenti della chiamata, poi tipo di ritorno obbligatorio. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Func](./func/)() | Costruttore predefinito che crea null-Func. |
| [Func](./func/)(T\&&) | Costruttore che crea l'oggetto [Func](./) e assegna un valore (sia il callback reale sia nullptr) ad esso. |
| [Func](./func/)(const Func\&) | Costruttore di copia. |
| [Func](./func/)(Func\&&) | Costruttore di spostamento. |
| [operator=](./operator=/)(const Func\&) | Assegnazione di copia. |
| [operator=](./operator=/)(Func\&&) | Assegnazione di spostamento. |
| [~Func](./~func/)() | Distruttore. |
## Osservazioni



```cpp
#include "system/func.h"
#include <iostream>

// Questa funzione accetta un'istanza del delegato System::Func come parametro.
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // Crea un'istanza del delegato System::Func.
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // Passa l'istanza creata come argomento della funzione.
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

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
