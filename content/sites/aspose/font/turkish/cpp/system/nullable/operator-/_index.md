---
title: "System::Nullable::operator- yöntemi"
linktitle: "operator-"
second_title: "Aspose.Font için C++"
description: "System::Nullable::operator- yöntemi. C++'ta nullable değerleri çıkarır."
type: docs
weight: 1400
url: /tr/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


Nullable değerleri çıkarır.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Sağ operand türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| diğer | const Nullable\<T1\>\& | çıkarılacak değer. |

### ReturnValue

Çıkarma sonucu.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-(const T1\&) const method


Nullable ve non-nullable değerleri çıkarır.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Sağ operand türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | çıkarılacak değer. |

### ReturnValue

Çıkarma sonucu.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-(T1) const method


Nullable ve null işaretli değerleri çıkarır.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Sağ operand tipi, nullptr_t olmalıdır. |

### ReturnValue

Boş [Nullable](../) nesnesi.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
