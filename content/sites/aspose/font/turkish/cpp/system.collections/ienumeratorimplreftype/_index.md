---
title: "System::Collections::IEnumeratorImplRefType sınıfı"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Font için C++"
description: "System::Collections::IEnumeratorImplRefType sınıfı. Wrapper, jenerik olmayan IEnumerator uygulamasını jenerik Iterator IEnumeratorImplRefType üzerine oluşturur - C++'daki Referans Tipleri için bir sarmalayıcı."
type: docs
weight: 700
url: /tr/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


Wrapper, jenerik olmayan [IEnumerator](../ienumerator/) uygulamasını jenerik Iterator [IEnumeratorImplRefType](./) üzerine oluşturur - Referans Tipleri için bir sarmalayıcı.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Current](./get_current/)() const override | Geçerli öğeyi alır. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | sarmalayıcı yapıcı |
| [MoveNext](./movenext/)() override | Enumerator'ı bir sonraki elemana taşır. Daha önce bir elemana referans verilmemişse, referansı mevcut ilk elemana ayarlar. Eğer konteyner sonuna gelinmişse, hiçbir şey yapmaz. |

## Ayrıca Bakınız

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
