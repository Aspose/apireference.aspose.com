---
title: "System::Tuple Klasse"
linktitle: "Tuple"
second_title: "Aspose.Font für C++"
description: "System::Tuple Klasse. Klasse, die eine Tupel‑Datenstruktur darstellt. Die maximale Anzahl von Elementen beträgt 8 in C++."
type: docs
weight: 6400
url: /de/cpp/system/tuple/
---
## Tuple class


Klasse, die eine Tupel‑Datenstruktur darstellt. Die maximale Anzahl von Elementen beträgt 8.

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| Parameter | Beschreibung |
| --- | --- |
| Argumente | Die Typen der Tupel‑Elemente. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Bestimmt, ob das aktuelle und das angegebene Objekt identisch sind. |
| [get_Item](./get_item/)() const | Liefert den Wert der Komponente des [Tuple](./)-Objekts. |
| [Tuple](./tuple/)(Args...) | Konstruiert ein Tupel‑Objekt. |
## Hinweise



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

## Siehe auch

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
