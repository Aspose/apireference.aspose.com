---
title: "System::operator- method"
linktitle: "operator-"
second_title: "Aspose.Font için C++"
description: "System::operator- yöntemi. Belirtilen değerden, belirtilen Decimal nesnesi tarafından temsil edilen değerin çıkarılması sonucunda oluşan değeri temsil eden Decimal sınıfının yeni bir örneğini döndürür C++ içinde."
type: docs
weight: 28200
url: /tr/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


Belirtilen değerden, belirtilen [Decimal](../decimal/) nesnesi tarafından temsil edilen değerin çıkarılması sonucunda oluşan değeri temsil eden [Decimal](../decimal/) sınıfının yeni bir örneğini döndürür.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | const T\& | Çıkarılacak değer |
| d | const Decimal\& | Çıkarılan değeri temsil eden [Decimal](../decimal/) nesnesi |

### ReturnValue

Yeni bir [Decimal](../decimal/) sınıfı örneği, **x**'den **d** tarafından temsil edilen değerin çıkarılması sonucunda oluşan değeri temsil eder.

## Ayrıca Bakınız

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


Null olmayan ve nullable değerleri çıkarır.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Sol operand türü. |
| T2 | Sağ operand türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bazı | const T1\& | Sol operand. |
| diğer | const Nullable\<T2\>\& | Sağ operand. |

### ReturnValue

Çıkarma sonucu.

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


Haftanın iki günü arasındaki gün sayısını hesaplar.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | DayOfWeek | Azalan |
| b | DayOfWeek | Çıkan |

### ReturnValue

**a** ve **b** hafta içi günleri arasındaki gün sayısı; dönüş değeri, *goes* sonrasında ise negatif bir sayı olur ****

## Ayrıca Bakınız

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Sağ el delegesindeki tüm geri çağırmaları, sol el delegesinin geri çağırma listesinin sonundan itibaren kaldırır.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Geri çağırmaların kaldırılacağı delege. |
| rhv | MulticastDelegate\<T\> | Geri çağırmaları kaldırılacak delege. |

### ReturnValue

Sağ el değerinin geri çağırmaları olmadan, sol el değerinin geri çağırmalarını içeren bir delege döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
