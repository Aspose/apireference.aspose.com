---
title: "System::Collections::IEnumeratorImplValueType sınıfı"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Page için C++"
description: "System::Collections::IEnumeratorImplValueType sınıfı. Generic Iterator IEnumeratorImplRefType üzerine generic olmayan IEnumerator uygulaması oluşturan bir sarmalayıcı - C++'ta değer tipleri için sarmalayıcı."
type: docs
weight: 800
url: /tr/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Generic Iterator [IEnumeratorImplRefType](../ienumeratorimplreftype/) üzerine generic olmayan [IEnumerator](../ienumerator/) uygulaması oluşturan bir sarmalayıcı - değer tipleri için sarmalayıcı.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Current](./get_current/)() const override | Geçerli öğeyi alır. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | sarmalayıcı yapıcı |
| [MoveNext](./movenext/)() override | Enumerator'ı bir sonraki öğeye taşır. Daha önce hiçbir öğe referans alınmamışsa, referansı mevcut ilk öğeye ayarlar. Eğer konteyner sonuna gelinmişse, hiçbir şey yapmaz. |

## Ayrıca Bakınız

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
