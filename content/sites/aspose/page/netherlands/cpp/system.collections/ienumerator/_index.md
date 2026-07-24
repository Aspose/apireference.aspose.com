---
title: "System::Collections::IEnumerator class"
linktitle: "IEnumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::IEnumerator class. Interface van enumerator die kan worden gebruikt om door enkele elementen te itereren. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wrap deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 600
url: /nl/cpp/system.collections/ienumerator/
---
## IEnumerator class


Interface van enumerator die kan worden gebruikt om door enkele elementen te itereren. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wrap deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Current](./current/)() const | Haalt het huidige element op. |
| virtual [get_Current](./get_current/)() const | Haalt het huidige element op. |
| virtual [MoveNext](./movenext/)() | Verplaatst de enumerator naar het volgende element. Als er eerder geen element werd gerefereerd, wordt de referentie ingesteld op het eerste beschikbare element. Als het einde van de container is bereikt, gebeurt er niets. |
| virtual [Reset](./reset/)() | Reset de enumerator naar de positie vóór het eerste element. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ValueType](./valuetype/) | RTTI-informatie. |

## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
