---
title: "System::operator- method"
linktitle: "operator-"
second_title: "Aspose.Page için C++"
description: "System::operator- yöntemi. Belirtilen değerden, belirtilen Decimal nesnesi tarafından temsil edilen değerin çıkarılması sonucunu temsil eden yeni bir Decimal sınıfı örneği döndürür."
type: docs
weight: 28100
url: /tr/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


Belirtilen değerden, belirtilen [Decimal](../decimal/) nesnesi tarafından temsil edilen değerin çıkarılması sonucunu temsil eden yeni bir [Decimal](../decimal/) sınıfı örneği döndürür.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | const T\& | Çıkarma yapılacak değer |
| d | const Decimal\& | Çıkarılan değeri temsil eden [Decimal](../decimal/) nesnesi |

### ReturnValue

**x**'den **d** tarafından temsil edilen değerin çıkarılması sonucunda elde edilen bir değeri temsil eden yeni bir [Decimal](../decimal/) sınıfı örneği.

## Ayrıca Bakınız

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


null olmayan ve nullable değerleri çıkarır.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Sol operand tipi. |
| T2 | Sağ operand tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| bazı | const T1\& | Sol operand. |
| diğer | const Nullable\<T2\>\& | Sağ operand. |

### ReturnValue

Alt istasyon sonucu.

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


Haftanın iki günü arasındaki gün sayısını hesaplar.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| a | DayOfWeek | Azalan |
| b | DayOfWeek | Çıkarılan |

### ReturnValue

**a** ve **b** hafta içi günleri arasındaki gün sayısı; dönüş değeri, *goes* sonrası negatif bir sayı ise ****

## Ayrıca Bakınız

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Sağ el delegesindeki tüm geri çağrıları sol el delegesinin geri çağrı listesinin sonundan ayırır.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Geri çağrıların kaldırılacağı delege. |
| rhv | MulticastDelegate\<T\> | Geri çağrıları kaldırılacak delege. |

### ReturnValue

Sağ el değerinin geri çağrıları olmadan, sol el değerinin geri çağrılarını içeren bir delege döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
