---
title: "System::Collections::IEnumeratorImplRefType klass"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Page för C++"
description: "System::Collections::IEnumeratorImplRefType klass. En wrapper som skapar icke-generisk IEnumerator-implementation över den generiska iteratorn IEnumeratorImplRefType – wrapper för referenstyperna i C++."
type: docs
weight: 700
url: /sv/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


Wrapper som skapar icke-generisk [IEnumerator](../ienumerator/) implementation över den generiska iteratorn [IEnumeratorImplRefType](./) - wrapper för referenstyperna.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| Parameter | Beskrivning |
| --- | --- |
| T | Elementtyp. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Current](./get_current/)() const override | Hämtar aktuellt element. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | wrapperkonstruktor |
| [MoveNext](./movenext/)() override | Flyttar enumerator till nästa element. Om inget element har refererats tidigare, sätts referensen till det första tillgängliga elementet. Om behållarens slut nås, gör den ingenting. |

## Se även

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
