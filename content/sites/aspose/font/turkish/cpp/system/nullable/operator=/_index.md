---
title: "System::Nullable::operator= yöntemi"
linktitle: "operator="
second_title: "Aspose.Font için C++"
description: "System::Nullable::operator= yöntemi. Nesnenin'' şu anda temsil edilen değerini C++'ta belirtilen değerle değiştirir."
type: docs
weight: 1800
url: /tr/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


Nesnenin şu anda temsil edilen değerini belirtilen değerle değiştirir.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| Parametre | Açıklama |
| --- | --- |
| Bu | Geçerli nesne tarafından temsil edilecek yeni değerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | Geçerli nesne tarafından temsil edilecek yeni değer |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(const T1\&) method


Nesnenin şu anda temsil edilen değerini belirtilen değerle değiştirir.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| Parametre | Açıklama |
| --- | --- |
| Bu | Geçerli nesne tarafından temsil edilecek yeni değerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | const T1\& | Geçerli nesne tarafından temsil edilecek yeni değer |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


Geçerli nesneye null atar.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

Null-değeri temsil eden bir [Nullable](../) nesnesi.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
