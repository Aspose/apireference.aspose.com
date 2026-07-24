---
title: "System::Tuple klasse"
linktitle: "Tuple"
second_title: "Aspose.Page voor C++"
description: "System::Tuple klasse. Klasse die een tuple-gegevensstructuur vertegenwoordigt. Het maximale aantal items is 8 in C++."
type: docs
weight: 6400
url: /nl/cpp/system/tuple/
---
## Tuple class


Klasse die een tuple‑datastructuur voorstelt. Het maximale aantal items is 8.

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| Parameter | Beschrijving |
| --- | --- |
| Argumenten | De types van de tuple‑elementen. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Bepaalt of het huidige en het opgegeven object identiek zijn. |
| [get_Item](./get_item/)() const | Haalt de waarde op van de component van het [Tuple](./) object. |
| [Tuple](./tuple/)(Args...) | Construeert een tuple‑object. |
## Opmerkingen



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::MakeObject<System::Tuple<int, int, int>>(32, 16, 128);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 32
Item 2: 16
Item 3: 128
*/
```

## Zie ook

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
