---
title: "System::Nullable::operator+= yöntemi"
linktitle: "operator+="
second_title: "Aspose.Font için C++"
description: "System::Nullable::operator+= yöntemi. Belirtilen Nullable nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere operator+=() uygular C++'ta."
type: docs
weight: 1300
url: /tr/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


[operator+=()](./) uygular, geçerli nesne tarafından temsil edilen değere, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| Parametre | Açıklama |
| --- | --- |
| T1 | [Nullable](../) nesnesinin temel türü, onun tarafından temsil edilen değer, [operator+=()](./) için sağ taraf argümanı olarak kullanılır. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Geçerli nesne tarafından temsil edilen değere uygulanan [operator+=()](./) için sağ taraf argümanı olarak kullanılan, [Nullable](../) nesnesinin temsil ettiği değere sabit bir referans. |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+=(const T1\&) method


Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator+=()](./) uygular.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| Parametre | Açıklama |
| --- | --- |
| T1 | [operator+=()](./) için sağ taraf değeri olarak kullanılan değerin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | const T1\& | Geçerli nesne tarafından temsil edilen değere uygulanan [operator+=()](./) için sağ taraf değeri olarak kullanılan değere sabit bir referans. |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


Geçerli nesneyi, null bir değeri temsil edecek şekilde sıfırlar.

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

Nesnenin bir kopyası

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
