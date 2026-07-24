---
title: "System::Collections::Generic::ReverseEnumerator class"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::ReverseEnumerator class. Enumerator die omgekeerd door de container itereert. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3800
url: /nl/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| Parameter | Beschrijving |
| --- | --- |
| Container | Container om doorheen te itereren. |
| Element | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Current](./get_current/)() const override | Haalt het 'huidige' element op. |
| [IsValid](./isvalid/)() const | Controleert of [MoveNext()](./movenext/) is aangeroepen en het einde niet is bereikt. |
| [MoveNext](./movenext/)() override | Enumerator‑stijl increment. |
| [Reset](./reset/)() override | Reset de enumerator om elementen opnieuw te enumereren. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | Initialiseert iterator. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | Destructor. |

## Zie ook

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
