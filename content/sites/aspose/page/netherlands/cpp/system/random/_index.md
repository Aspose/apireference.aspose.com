---
title: "System::Random‑klasse"
linktitle: "Random"
second_title: "Aspose.Page voor C++"
description: "System::Random‑klasse. Vertegenwoordigt een pseudo‑willekeurige getallengenerator. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 5200
url: /nl/cpp/system/random/
---
## Random class


Vertegenwoordigt een pseudo‑willekeurige getallengenerator. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/)‑pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class Random : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [IsNull](./isnull/)() const | Geeft altijd false terug. |
| virtual [Next](./next/)() | Retourneert een niet‑negatief willekeurig getal kleiner dan de maximale int32‑waarde. |
| virtual [Next](./next/)(int32_t) | Retourneert een niet‑negatief willekeurig getal kleiner dan de opgegeven maximum. |
| virtual [Next](./next/)(int32_t, int32_t) | Retourneert een willekeurig getal binnen het opgegeven bereik. |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | Vult de elementen van de opgegeven byte‑array met willekeurige getallen. |
| virtual [NextDouble](./nextdouble/)() | Retourneert een willekeurig getal tussen 0,0 en 1,0. |
| [Random](./random/)() | Initialiseert een nieuw exemplaar met een tijdafhankelijke standaardzaadwaarde. |
| [Random](./random/)(int32_t) | Initialiseert een nieuw exemplaar van de [System.Random](./) klasse, met de opgegeven zaadwaarde. |
## Opmerkingen



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // Haal een willekeurig maandnummer op en druk het af.
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // Vul de array met willekeurige getallen.
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // Druk de array af.
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

## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
