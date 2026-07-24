---
title: "System::With yöntemi"
linktitle: "With"
second_title: "Aspose.Page için C++"
description: "System::With yöntemi. C++'da referans kaydını klonlar ve başlatıcı fonktörünü ona uygular."
type: docs
weight: 40100
url: /tr/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Referans kaydını klonlar ve başlatıcı fonktörünü ona uygular.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parameter | Açıklama |
| --- | --- |
| T | Klonlanacak kayıt tipi. |
| A | Başlatma fonktör tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| kayıt | const SharedPtr\<T\>\& | Klonlanacak ve başlatılacak nesneye yönelik paylaşımlı işaretçi. |
| başlatıcı | const A\& | Kayıt klonuna uygulanan başlatma fonktörü. |

### ReturnValue

Klonlanmış kayda ait paylaşımlı gösterici.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


Yapı kaydını kopyalar ve ona başlatıcı fonktörünü uygular.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parameter | Açıklama |
| --- | --- |
| T | Kopyalanacak kayıt türü. |
| A | Başlatma fonktör tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| kayıt | const T\& | Kopyalanacak ve başlatılacak kayıt. |
| başlatıcı | const A\& | Kayıt kopyasına uygulanan başlatıcı fonktör. |

### ReturnValue

Kopyalanmış kayıt.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
