---
title: "System::Equals< float, float > yöntemi"
linktitle: "Eşittir< float, float >"
second_title: "Aspose.Page için C++"
description: "System::Equals< float, float > yöntemi. Tek duyarlıklı kayan nokta değerleri için özelleştirme. IEC 60559:1989 tarafından iki kayan nokta NaN'ının her zaman eşit olmayan olarak karşılaştırılması tanımlansa da, System.Object.Equals sözleşmesi, geçersiz kılmaların bir eşdeğerlik operatörü gereksinimlerini karşılamasını zorunlu kılar. Bu nedenle, System.Double.Equals ve System.Single.Equals iki NaN karşılaştırıldığında True döndürür, oysa eşitlik operatörü bu durumda False döndürür, C++'taki standartta gerektiği gibi."
type: docs
weight: 18400
url: /tr/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Tek duyarlıklı kayan nokta değerleri için özelleştirme. IEC 60559:1989 tarafından iki kayan nokta NaN'ının her zaman eşit olmayan olarak karşılaştırılması tanımlansa da, [System.Object.Equals](../object/equals/) sözleşmesi, geçersiz kılmaların bir eşdeğerlik operatörü gereksinimlerini karşılamasını zorunlu kılar. Bu nedenle, System.Double.Equals ve System.Single.Equals iki NaN karşılaştırıldığında True döndürür, oysa eşitlik operatörü bu durumda False döndürür, standartta gerektiği gibi.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| a | const float\& | İlk karşılaştırılan |
| b | const float\& | İkinci karşılaştırılan |

### ReturnValue

Her iki değer NaN ise veya eşitse doğru, aksi takdirinde - yanlış

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
