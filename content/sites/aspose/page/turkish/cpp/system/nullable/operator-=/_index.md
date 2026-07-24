---
title: "System::Nullable::operator-= yöntemi"
linktitle: "operator-="
second_title: "Aspose.Page için C++"
description: "System::Nullable::operator-= yöntemi. Belirtilen Nullable nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, mevcut nesne tarafından temsil edilen değere C++'da operator-=() uygular."
type: docs
weight: 1500
url: /tr/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


Belirtilen [Nullable](../) nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, mevcut nesne tarafından temsil edilen değere [operator-=()](./) uygular.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | [operator-=()](./) için sağ taraf argümanı olarak kullanılan değeri temsil eden bir [Nullable](../) nesnesinin temel türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Mevcut nesne tarafından temsil edilen değere uygulanan [operator-=()](./) için sağ taraf argümanı olarak kullanılan değeri temsil eden bir [Nullable](../) nesnesine sabit referans. |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(const T1\&) method


Belirtilen değeri sağ taraf argümanı olarak kullanarak, mevcut nesne tarafından temsil edilen değere [operator-=()](./) uygular.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | [operator-=()](./) için sağ taraf değeri olarak kullanılan değerin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const T1\& | Mevcut nesne tarafından temsil edilen değere uygulanan [operator-=()](./) için sağ taraf değeri olarak kullanılan değere sabit referans. |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(T1) method


Null değeri temsil eden bir [Nullable](../) sınıf örneği döndürür.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
