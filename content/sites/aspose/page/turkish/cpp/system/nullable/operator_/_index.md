---
title: "System::Nullable::operator< metodu"
linktitle: "operator<"
second_title: "Aspose.Page için C++"
description: "System::Nullable::operator< metodu. Mevcut nesne tarafından temsil edilen değerin, belirtilen Nullable nesne tarafından temsil edilen değerden daha küçük olup olmadığını, bu değerlere operator<() uygulayarak C++'ta belirler."
type: docs
weight: 1600
url: /tr/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Mevcut nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesne tarafından temsil edilen değerden daha küçük olup olmadığını, bu değerlere [operator<()](./) uygulayarak belirler.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Karşılaştırılacak [Nullable](../) nesnesine sabit bir referans |

### ReturnValue

Eğer mevcut nesne tarafından temsil edilen değer, belirtilen [Nullable](../) nesne tarafından temsil edilen değerden daha küçükse true, aksi takdirde false

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


Mevcut nesne tarafından temsil edilen değerin, belirtilen değerden daha küçük olup olmadığını, bu değerlere [operator<()](./) uygulayarak belirler.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak değerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırılacak değere sabit bir referans |

### ReturnValue

Eğer mevcut nesne tarafından temsil edilen değer, belirtilen değerden daha küçükse true, aksi takdirde false

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Her zaman false döndürür.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator> metodu
linktitle: operator>
second_title: Aspose.Page for C++
description: 'System::Nullable::operator> metodu. Mevcut nesne tarafından temsil edilen değerin, belirtilen Nullable nesne tarafından temsil edilen değerden daha büyük olup olmadığını, bu değerlere operator>() uygulayarak C++'ta belirler.'
type: docs
weight: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Mevcut nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesne tarafından temsil edilen değerden daha büyük olup olmadığını, bu değerlere [operator>()](./) uygulayarak belirler.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Karşılaştırılacak [Nullable](../) nesnesine sabit bir referans |

### ReturnValue

Eğer mevcut nesne tarafından temsil edilen değer, belirtilen [Nullable](../) nesne tarafından temsil edilen değerden daha büyükse true, aksi takdirde false

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


Mevcut nesne tarafından temsil edilen değerin, belirtilen değerden daha büyük olup olmadığını, bu değerlere [operator>()](./) uygulayarak belirler.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak değerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırılacak değere sabit bir referans |

### ReturnValue

Doğru ise geçerli nesne tarafından temsil edilen değer belirtilen değerden büyükse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Her zaman false döndürür.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
