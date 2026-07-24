---
title: "System::Collections::IEnumeratorImplValueType class"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Page voor C++"
description: "System::Collections::IEnumeratorImplValueType class. Wrapper die een niet-generieke IEnumerator-implementatie maakt boven de generieke Iterator IEnumeratorImplRefType - wrapper voor de waarde-typen in C++."
type: docs
weight: 800
url: /nl/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Wrapper die een niet-generieke [IEnumerator](../ienumerator/) implementatie maakt boven de generieke Iterator [IEnumeratorImplRefType](../ienumeratorimplreftype/) - wrapper voor de waarde-typen.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Current](./get_current/)() const override | Haalt het huidige element op. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | wrapper-constructor |
| [MoveNext](./movenext/)() override | Verplaatst de enumerator naar het volgende element. Als er eerder geen element werd gerefereerd, wordt de referentie ingesteld op het eerste beschikbare element. Als het einde van de container is bereikt, gebeurt er niets. |

## Zie ook

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
