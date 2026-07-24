---
title: "System::Nullable::operator<= yöntemi"
linktitle: "operator<="
second_title: "Aspose.Page için C++"
description: "System::Nullable::operator<= yöntemi. Geçerli nesne tarafından temsil edilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değere C++'ta operator<=() uygulanarak daha küçük veya eşit olup olmadığını belirler."
type: docs
weight: 1700
url: /tr/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değere [operator<=()](./) uygulanarak daha küçük veya eşit olup olmadığını belirler.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Karşılaştırılacak [Nullable](../) nesnesine sabit bir referans |

### ReturnValue

Geçerli nesne tarafından temsil edilen değer, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değere daha küçük veya eşit ise doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(const T1\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen değere [operator<=()](./) uygulanarak daha küçük veya eşit olup olmadığını belirler.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak değerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Karşılaştırılacak değere sabit bir referans |

### ReturnValue

Geçerli nesne tarafından temsil edilen değer, belirtilen değere daha küçük veya eşit ise doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


Her zaman false döndürür.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
başlık: System::Nullable::operator>= yöntemi
linktitle: operator>=
second_title: Aspose.Page for C++
description: 'System::Nullable::operator>= yöntemi. Geçerli nesne tarafından temsil edilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değere C++'ta operator>=() uygulanarak daha büyük veya eşit olup olmadığını belirler.'
type: docs
ağırlık: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değere [operator>=()](./) uygulanarak daha büyük veya eşit olup olmadığını belirler.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Karşılaştırılacak [Nullable](../) nesnesine sabit bir referans |

### ReturnValue

Doğru ise geçerli nesne tarafından temsil edilen değer, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değerden büyük veya eşitse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(const T1\&) const method


Belirler, geçerli nesne tarafından temsil edilen değer, belirtilen nesne tarafından temsil edilen değerden büyük veya eşit olup olmadığını, bu değerlere [operator>=()](./) uygulayarak.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Geçerli nesne tarafından temsil edilen değeri karşılaştırmak için kullanılan değerin temel türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | Geçerli nesneyle karşılaştırmak için bir nesneye sabit referans |

### ReturnValue

Doğru ise geçerli nesne tarafından temsil edilen değer, belirtilen nesne tarafından temsil edilen değerden büyük veya eşitse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


Her zaman false döndürür.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

Her zaman - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
başlık: System::Nullable::operator|= yöntemi
bağlantı başlığı: operator|=
second_title: Aspose.Page for C++
açıklama: 'System::Nullable::operator|= yöntemi. Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere operator|=() uygular C++'ta.'
type: docs
ağırlık: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator|=()](./) uygular.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | SFINAE'in çalışmasını sağlamak için şablon parametresi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | bool | Sağ taraf değeri olarak kullanılan bir boolean değer [operator | =()](./) geçerli nesne tarafından temsil edilen değere uygulanır. |

### ReturnValue

Kendisine bir referans.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
