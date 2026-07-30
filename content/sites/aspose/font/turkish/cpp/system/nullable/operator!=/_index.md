---
title: "System::Nullable::operator!= yöntemi"
linktitle: "operator!="
second_title: "Aspose.Font için C++"
description: "System::Nullable::operator!= yöntemi. Geçerli nesne tarafından temsil edilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değere C++'ta eşit olmadığını belirler."
type: docs
weight: 1000
url: /tr/cpp/system/nullable/operator!=/
---
## Nullable::operator!=(const Nullable\<T1\>\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değere eşit olmadığını belirler.

```cpp
template<typename T1> bool System::Nullable<T>::operator!=(const Nullable<T1> &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Karşılaştırma için [Nullable](../) nesnesine sabit referans |

### ReturnValue

Geçerli nesne tarafından temsil edilen değer, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değere eşit değilse doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator!=(const T1\&) const method


Geçerli nesne tarafından temsil edilen değerin belirtilen değere eşit olmadığını belirler.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator!=(const T1 &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak değerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırılacak değere sabit referans |

### ReturnValue

Geçerli nesne tarafından temsil edilen değer, belirtilen değere eşit değilse doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator!=(std::nullptr_t) const method


Geçerli nesne tarafından temsil edilen değerin null olmadığını belirler.

```cpp
bool System::Nullable<T>::operator!=(std::nullptr_t) const
```


### ReturnValue

Geçerli nesne tarafından temsil edilen değer null değilse doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
