---
title: "System::Collections::Generic::BaseEnumerator-klasse"
linktitle: "BaseEnumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::BaseEnumerator-klasse. Enumeratordefinitie om STL-achtige types te omsluiten voor C#-achtige gebruik. Maakt geen aannames over de containerstructuur behalve het bestaan van een sequentiële iterator. Gebruikt begin() en end() functies. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| Parameter | Beschrijving |
| --- | --- |
| Container | STL-achtige containertype. |
| Element | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | Initialiseert iterator. |
| [IsValid](./isvalid/)() const | Controleert of [MoveNext()](./movenext/) is aangeroepen en het einde niet is bereikt. |
| [MoveNext](./movenext/)() override | Enumerator‑stijl increment. |
| [Reset](./reset/)() override | Reset de enumerator om elementen opnieuw te enumereren. |

## Zie ook

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
