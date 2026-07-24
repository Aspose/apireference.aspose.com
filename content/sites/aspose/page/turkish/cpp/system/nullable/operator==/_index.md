---
title: "System::Nullable::operator== method"
linktitle: "operator=="
second_title: "Aspose.Page için C++"
description: "System::Nullable::operator== method. Geçerli nesne tarafından temsil edilen değerin, C++'da belirtilen Nullable nesnesi tarafından temsil edilen değerle eşit olup olmadığını belirler."
type: docs
weight: 1900
url: /tr/cpp/system/nullable/operator==/
---
## Nullable::operator==(const Nullable\<T1\>\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değerle eşit olup olmadığını belirler.

```cpp
template<typename T1> bool System::Nullable<T>::operator==(const Nullable<T1> &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Karşılaştırılacak [Nullable](../) nesnesine sabit bir referans |

### ReturnValue

Doğru ise geçerli nesne tarafından temsil edilen değer, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değerle eşitse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator==(const T1\&) const method


Geçerli nesne tarafından temsil edilen değerin belirtilen değerle eşit olup olmadığını belirler.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator==(const T1 &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak değerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırılacak değere sabit bir referans |

### ReturnValue

Doğru ise geçerli nesne tarafından temsil edilen değer belirtilen değerle eşitse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator==(std::nullptr_t) const method


Geçerli nesne tarafından temsil edilen değerin null olup olmadığını belirler.

```cpp
bool System::Nullable<T>::operator==(std::nullptr_t) const
```


### ReturnValue

Doğru ise geçerli nesne tarafından temsil edilen değer null ise, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
