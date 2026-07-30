---
title: "System::Nullable::operator== metodu"
linktitle: "operator=="
second_title: "Aspose.Font için C++"
description: "System::Nullable::operator== metodu. C++'de geçerli nesne tarafından temsil edilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değere eşit olup olmadığını belirler."
type: docs
weight: 1900
url: /tr/cpp/system/nullable/operator==/
---
## Nullable::operator==(const Nullable\<T1\>\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değere eşit olup olmadığını belirler.

```cpp
template<typename T1> bool System::Nullable<T>::operator==(const Nullable<T1> &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Karşılaştırma için [Nullable](../) nesnesine sabit referans |

### ReturnValue

Doğru, geçerli nesne tarafından temsil edilen değer belirtilen [Nullable](../) nesnesi tarafından temsil edilen değere eşitse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(const T1\&) const method


Geçerli nesne tarafından temsil edilen değerin belirtilen değerle eşit olup olmadığını belirler.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator==(const T1 &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak değerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırılacak değere sabit referans |

### ReturnValue

Doğru, geçerli nesne tarafından temsil edilen değer belirtilen değere eşitse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(std::nullptr_t) const method


Geçerli nesne tarafından temsil edilen değerin null olup olmadığını belirler.

```cpp
bool System::Nullable<T>::operator==(std::nullptr_t) const
```


### ReturnValue

Doğru, geçerli nesne tarafından temsil edilen değer null ise, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
