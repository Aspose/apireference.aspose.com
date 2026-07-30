---
title: "System::Equals< float, float > yöntemi"
linktitle: "Eşittir< float, float >"
second_title: "Aspose.Font için C++"
description: "System::Equals< float, float > yöntemi. Tek duyarlıklı kayan nokta değerleri için özelleştirme. IEC 60559:1989 tarafından iki kayan nokta NaN'ının her zaman eşit olmayan olarak karşılaştırılması tanımlansa da, System.Object.Equals sözleşmesi, geçersiz kılmaların bir eşdeğerlik operatörü gereksinimlerini karşılamasını zorunlu kılar. Bu nedenle, System.Double.Equals ve System.Single.Equals iki NaN'ı karşılaştırırken True döndürür, oysa eşitlik operatörü bu durumda False döndürür, C++ standardında belirtildiği gibi."
type: docs
weight: 18500
url: /tr/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Tek duyarlıklı kayan nokta değerleri için özelleştirme. IEC 60559:1989 tarafından iki kayan nokta NaN'ının her zaman eşit olmayan olarak karşılaştırılması tanımlansa da, [System.Object.Equals](../object/equals/) sözleşmesi, geçersiz kılmaların bir eşdeğerlik operatörü gereksinimlerini karşılamasını zorunlu kılar. Bu nedenle, System.Double.Equals ve System.Single.Equals iki NaN'ı karşılaştırırken True döndürür, oysa eşitlik operatörü bu durumda False döndürür, standartta belirtildiği gibi.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | const float\& | İlk karşılaştırılan |
| b | const float\& | İkinci karşılaştırılan |

### ReturnValue

Her iki değer NaN ise veya eşitse True, aksi takdirde - false

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
