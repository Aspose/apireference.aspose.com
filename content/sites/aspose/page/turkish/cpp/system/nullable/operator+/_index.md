---
title: "System::Nullable::operator+ metodu"
linktitle: "operator+"
second_title: "Aspose.Page için C++"
description: "System::Nullable::operator+ metodu. C++'ta nullable değerleri toplar."
type: docs
weight: 1200
url: /tr/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


Nullable değerleri toplar.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Sağ operand tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | const Nullable\<T1\>\& | eklenecek değer. |

### ReturnValue

Toplama sonucu.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(const T1\&) const method


Nullable ve non-nullable değerleri toplar.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Sağ operand tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | const T1\& | eklenecek değer. |

### ReturnValue

Toplama sonucu.

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Nullable<T> sınıfının varsayılan olarak oluşturulmuş bir örneğini döndürür.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## Ayrıca Bakınız

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
