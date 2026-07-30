---
title: "System::Collections::IEnumeratorImplValueType sınıfı"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Font için C++"
description: "System::Collections::IEnumeratorImplValueType sınıfı. Genel Iterator IEnumeratorImplRefType üzerine jenerik olmayan IEnumerator uygulaması oluşturan bir sarmalayıcı - C++'ta değer tipleri için sarmalayıcı."
type: docs
weight: 800
url: /tr/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Genel Iterator [IEnumeratorImplRefType](../ienumeratorimplreftype/) üzerine jenerik olmayan [IEnumerator](../ienumerator/) uygulaması oluşturan bir sarmalayıcı - değer tipleri için sarmalayıcı.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Current](./get_current/)() const override | Geçerli öğeyi alır. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | sarmalayıcı yapıcı |
| [MoveNext](./movenext/)() override | Enumerator'ı bir sonraki elemana taşır. Daha önce bir elemana referans verilmemişse, referansı mevcut ilk elemana ayarlar. Eğer konteyner sonuna gelinmişse, hiçbir şey yapmaz. |

## Ayrıca Bakınız

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
