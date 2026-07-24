---
title: "System::Collections::IEnumeratorImplValueType Klasse"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Page für C++"
description: "System::Collections::IEnumeratorImplValueType Klasse. Wrapper, der eine nicht generische IEnumerator-Implementierung über den generischen Iterator IEnumeratorImplRefType erstellt – Wrapper für die Werttypen in C++."
type: docs
weight: 800
url: /de/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Wrapper, der eine nicht generische [IEnumerator](../ienumerator/) Implementierung über den generischen Iterator [IEnumeratorImplRefType](../ienumeratorimplreftype/) erstellt – Wrapper für die Werttypen.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Current](./get_current/)() const override | Ruft das aktuelle Element ab. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | Wrapper-Konstruktor |
| [MoveNext](./movenext/)() override | Bewegt den Enumerator zum nächsten Element. Wenn zuvor kein Element referenziert wurde, wird die Referenz auf das erste verfügbare Element gesetzt. Wenn das Ende des Containers erreicht ist, geschieht nichts. |

## Siehe auch

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
