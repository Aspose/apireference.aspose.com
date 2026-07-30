---
title: "System::Decimal::Round yöntemi"
linktitle: "Yuvarla"
second_title: "Aspose.Font için C++"
description: "System::Decimal::Round yöntemi. Belirtilen değeri, belirtilen kesirli basamak sayısına sahip en yakın değere yuvarlar. Bir parametre, belirtilen değer iki en yakın sayıya eşit derecede yakın olduğunda fonksiyonun davranışını C++ içinde belirtir."
type: docs
weight: 4400
url: /tr/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Belirtilen değeri, belirtilen ondalık basamak sayısına sahip en yakın değere yuvarlar. Bir parametre, belirtilen değer iki en yakın sayıya eşit uzaklıkta olduğunda fonksiyonun davranışını belirler.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| d | const Decimal\& | Yuvarlanacak değer |
| basamaklar | int | Yuvarlanmış değerdeki kesirli basamak sayısı |
| mod | MidpointRounding | İki en yakın sayıya **value** eşit derecede yakın olduğunda yuvarlamanın nasıl yapılacağını belirtir. |

### ReturnValue

Belirtilen basamak sayısına sahip, **value** değerine en yakın sayı

## Ayrıca Bakınız

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Belirtilen değeri en yakın tam sayıya yuvarlar. Bir parametre, belirtilen değer iki en yakın sayıya eşit uzaklıkta olduğunda fonksiyonun davranışını belirler.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| d | const Decimal\& | Yuvarlanacak değer |
| mod | MidpointRounding | İki en yakın sayıya **value** eşit derecede yakın olduğunda yuvarlamanın nasıl yapılacağını belirtir. |

### ReturnValue

**d** rounded to the nearest integral value

## Ayrıca Bakınız

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
