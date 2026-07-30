---
title: "System::With yöntemi"
linktitle: "With"
second_title: "Aspose.Font için C++"
description: "System::With yöntemi. C++'ta referans kaydını kopyalar ve başlatıcı fonktörü ona uygular."
type: docs
weight: 40200
url: /tr/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Referans kaydını kopyalar ve başlatıcı fonktörü ona uygular.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parametre | Açıklama |
| --- | --- |
| T | Kopyalanacak kayıt tipi. |
| A | Başlatıcı fonktör tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kayıt | const SharedPtr\<T\>\& | Klonlanacak ve başlatılacak nesneye ait paylaşımlı gösterici. |
| başlatıcı | const A\\& | Kayıt klonuna uygulanan başlatma fonktörü. |

### ReturnValue

Klonlanmış kayda ait paylaşımlı gösterici.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::With(const T\&, const A\&) method


Yapı kaydını kopyalar ve ona başlatıcı fonktörü uygular.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parametre | Açıklama |
| --- | --- |
| T | Kopyalanacak kayıt türü. |
| A | Başlatıcı fonktör tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kayıt | const T\& | Kopyalanacak ve başlatılacak kayıt. |
| başlatıcı | const A\\& | Kayıt kopyasına uygulanan başlatma fonktörü. |

### ReturnValue

Kopyalanmış kayıt.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
