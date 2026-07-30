---
title: "System::Nullable::operator< yöntemi"
linktitle: "operator<"
second_title: "Aspose.Font için C++"
description: "System::Nullable::operator< yöntemi. Belirtilen Nullable nesnesi tarafından temsil edilen değerle karşılaştırarak, bu değerleri C++'ta operator<() uygulayarak, geçerli nesne tarafından temsil edilen değerin daha küçük olup olmadığını belirler."
type: docs
weight: 1600
url: /tr/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değerden daha küçük olup olmadığını, bu değerlere [operator<()](./) uygulayarak belirler.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Karşılaştırma için [Nullable](../) nesnesine sabit referans |

### ReturnValue

Geçerli nesne tarafından temsil edilen değer, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değerden daha küçükse true, aksi takdirde false.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<(const T1\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen değerden daha küçük olup olmadığını, bu değerlere [operator<()](./) uygulayarak belirler.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak değerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırılacak değere sabit referans |

### ReturnValue

Doğru, geçerli nesne tarafından temsil edilen değer belirtilen değerden küçükse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Her zaman false döndürür.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
başlık: System::Nullable::operator> metodu
bağlantı başlığı: operator>
ikinci başlık: Aspose.Font for C++
açıklama: 'System::Nullable::operator> metodu. Geçerli nesne tarafından temsil edilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değerden büyük olup olmadığını, bu değerlere operator>() uygulayarak C++'de belirler.'
tür: docs
ağırlık: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değerden büyük olup olmadığını, bu değerlere [operator>()](./) uygulayarak belirler.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Karşılaştırma için [Nullable](../) nesnesine sabit referans |

### ReturnValue

Doğru, geçerli nesne tarafından temsil edilen değer belirtilen [Nullable](../) nesnesi tarafından temsil edilen değerden büyükse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>(const T1\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen değerden büyük olup olmadığını, bu değerlere [operator>()](./) uygulayarak belirler.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak değerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırılacak değere sabit referans |

### ReturnValue

Doğru, geçerli nesne tarafından temsil edilen değer belirtilen değerden büyükse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Her zaman false döndürür.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
