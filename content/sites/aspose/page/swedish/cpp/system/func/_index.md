---
title: "System::Func class"
linktitle: "Func"
second_title: "Aspose.Page för C++"
description: "System::Func class. Funktionsdelegat. Denna typ bör allokeras på stacken och skickas till funktioner som värde eller referens. Använd aldrig System::SmartPtr-klassen för att hantera objekt av denna typ i C++."
type: docs
weight: 2800
url: /sv/cpp/system/func/
---
## Func class


Funktionsdelegat. Denna typ bör allokeras på stacken och skickas till funktioner som värde eller referens. Använd aldrig klassen [System::SmartPtr](../smartptr/) för att hantera objekt av denna typ.

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| Parameter | Beskrivning |
| --- | --- |
| Argument | Anropsargument, följt av obligatorisk returtyp. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Func](./func/)() | Standardkonstruktor som skapar null-Func. |
| [Func](./func/)(T\&&) | Konstruktor som skapar ett [Func](./)-objekt och tilldelar ett värde (antingen en faktisk återuppringning eller nullptr) till det. |
| [Func](./func/)(const Func\&) | Kopieringskonstruktor. |
| [Func](./func/)(Func\&&) | Flyttkonstruktor. |
| [operator=](./operator=/)(const Func\&) | Kopieringstilldelning. |
| [operator=](./operator=/)(Func\&&) | Flyttilldelning. |
| [~Func](./~func/)() | Destruktor. |
## Anmärkningar



```cpp
#include "system/func.h"
#include <iostream>

// Denna funktion accepterar en instans av delegaten System::Func som en parameter.
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // Skapa en instans av delegaten System::Func.
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // Skicka den skapade instansen som ett funktionsargument.
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

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
