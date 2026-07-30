---
title: "System::Random Klasse"
linktitle: "Random"
second_title: "Aspose.Font für C++"
description: "System::Random Klasse. Stellt einen Pseudo-Zufallszahlengenerator dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 5200
url: /de/cpp/system/random/
---
## Random class


Stellt einen Pseudo-Zufallszahlengenerator dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Random : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [IsNull](./isnull/)() const | Gibt immer false zurück. |
| virtual [Next](./next/)() | Gibt eine nichtnegative Zufallszahl zurück, die kleiner als der maximale int32-Wert ist. |
| virtual [Next](./next/)(int32_t) | Gibt eine nichtnegative Zufallszahl zurück, die kleiner als das angegebene Maximum ist. |
| virtual [Next](./next/)(int32_t, int32_t) | Gibt eine Zufallszahl innerhalb des angegebenen Bereichs zurück. |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | Füllt die Elemente des angegebenen Byte-Arrays mit Zufallszahlen. |
| virtual [NextDouble](./nextdouble/)() | Gibt eine Zufallszahl zwischen 0,0 und 1,0 zurück. |
| [Random](./random/)() | Initialisiert eine neue Instanz unter Verwendung eines zeitabhängigen Standard-Seed-Werts. |
| [Random](./random/)(int32_t) | Initialisiert eine neue Instanz der [System.Random](./) Klasse unter Verwendung des angegebenen Seed-Werts. |
## Hinweise



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // Erhalte eine zufällige Monatszahl und gib sie aus.
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // Fülle das Array mit Zufallszahlen.
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // Gib das Array aus.
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
