---
title: "System::Collections::IEnumeratorImplValueType klass"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Page för C++"
description: "System::Collections::IEnumeratorImplValueType klass. Wrapper som skapar icke‑generisk IEnumerator-implementation över den generiska Iterator IEnumeratorImplRefType – wrapper för värdetyper i C++."
type: docs
weight: 800
url: /sv/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Wrapper som skapar icke‑generisk [IEnumerator](../ienumerator/) implementation över den generiska Iterator [IEnumeratorImplRefType](../ienumeratorimplreftype/) - wrapper för värdetyper.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Parameter | Beskrivning |
| --- | --- |
| T | Elementtyp. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Current](./get_current/)() const override | Hämtar aktuellt element. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | wrapperkonstruktor |
| [MoveNext](./movenext/)() override | Flyttar enumerator till nästa element. Om inget element har refererats tidigare, sätts referensen till det första tillgängliga elementet. Om behållarens slut nås, gör den ingenting. |

## Se även

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
