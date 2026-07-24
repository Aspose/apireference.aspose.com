---
title: "System::Collections::IEnumeratorImplRefType sınıfı"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Page için C++"
description: "System::Collections::IEnumeratorImplRefType sınıfı. Genel olmayan IEnumerator uygulamasını, genel Iterator IEnumeratorImplRefType üzerine oluşturan sarmalayıcı - C++'daki Referans Tipleri için sarmalayıcı."
type: docs
weight: 700
url: /tr/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


Genel olmayan [IEnumerator](../ienumerator/) uygulamasını, genel Iterator [IEnumeratorImplRefType](./) üzerine oluşturan sarmalayıcı - Referans Tipleri için sarmalayıcı.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Current](./get_current/)() const override | Geçerli öğeyi alır. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | sarmalayıcı yapıcı |
| [MoveNext](./movenext/)() override | Enumerator'ı bir sonraki öğeye taşır. Daha önce hiçbir öğe referans alınmamışsa, referansı mevcut ilk öğeye ayarlar. Eğer konteyner sonuna gelinmişse, hiçbir şey yapmaz. |

## Ayrıca Bakınız

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
