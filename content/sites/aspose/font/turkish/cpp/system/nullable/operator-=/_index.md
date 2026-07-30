---
title: "System::Nullable::operator-= yöntemi"
linktitle: "operator-="
second_title: "Aspose.Font için C++"
description: "System::Nullable::operator-= yöntemi. Belirtilen Nullable nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere operator-=() uygular C++'da."
type: docs
weight: 1500
url: /tr/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


Belirtilen [Nullable](../) nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator-=()](./) uygular.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| Parametre | Açıklama |
| --- | --- |
| T1 | [operator-=()](./) için sağ taraf argümanı olarak kullanılan değeri temsil eden bir [Nullable](../) nesnesinin temel türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Geçerli nesne tarafından temsil edilen değere uygulanan [operator-=()](./) için sağ taraf argümanı olarak kullanılan değeri temsil eden bir [Nullable](../) nesnesine sabit referans. |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(const T1\&) method


Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator-=()](./) uygular.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| Parametre | Açıklama |
| --- | --- |
| T1 | [operator-=()](./) için sağ taraf değeri olarak kullanılan değerin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | const T1\& | Geçerli nesne tarafından temsil edilen değere uygulanan [operator-=()](./) için sağ taraf değeri olarak kullanılan değere sabit referans. |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(T1) method


Null değerini temsil eden bir [Nullable](../) sınıf örneği döndürür.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
