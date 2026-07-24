---
title: "System::Collections::IEnumeratorImplRefType class"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Page voor C++"
description: "System::Collections::IEnumeratorImplRefType class. Wrapper die een niet-generieke IEnumerator-implementatie maakt over de generieke Iterator IEnumeratorImplRefType - wrapper voor de referentietypen in C++."
type: docs
weight: 700
url: /nl/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


Wrapper die een niet-generieke [IEnumerator](../ienumerator/) implementatie maakt over de generieke Iterator [IEnumeratorImplRefType](./) - wrapper voor de referentietypen.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Current](./get_current/)() const override | Haalt het huidige element op. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | wrapper-constructor |
| [MoveNext](./movenext/)() override | Verplaatst de enumerator naar het volgende element. Als er eerder geen element werd gerefereerd, wordt de referentie ingesteld op het eerste beschikbare element. Als het einde van de container is bereikt, gebeurt er niets. |

## Zie ook

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
