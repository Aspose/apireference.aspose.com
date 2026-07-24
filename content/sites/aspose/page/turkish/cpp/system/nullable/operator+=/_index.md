---
title: "System::Nullable::operator+= yöntemi"
linktitle: "operator+="
second_title: "Aspose.Page için C++"
description: "System::Nullable::operator+= yöntemi. Belirtilen Nullable nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere operator+=() uygular C++'ta."
type: docs
weight: 1300
url: /tr/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


Belirtilen [Nullable](../) nesnesi tarafından temsil edilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator+=()](./) uygular.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Bir [Nullable](../) nesnesinin, temsil ettiği değerin [operator+=()](./) için sağ taraf argümanı olarak kullanıldığı temel tür |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Geçerli nesne tarafından temsil edilen değere uygulanan [operator+=()](./) için sağ taraf argümanı olarak kullanılan, temsil ettiği değerin [Nullable](../) nesnesine sabit referans |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(const T1\&) method


Belirtilen değeri sağ taraf argümanı olarak kullanarak, geçerli nesne tarafından temsil edilen değere [operator+=()](./) uygular.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | [operator+=()](./) için sağ taraf değeri olarak kullanılan değerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const T1\& | Geçerli nesne tarafından temsil edilen değere uygulanan [operator+=()](./) için sağ taraf değeri olarak kullanılan değere sabit referans |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


Geçerli nesneyi, null değeri temsil edecek şekilde sıfırlar.

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

Kendisinin bir kopyası

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
