---
title: Class PrecisionModel
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.PrecisionModel sınıf. PrecisionModel bir koordinatta bir dizi önemli basamak belirtir.
type: docs
weight: 1310
url: /tr/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` bir koordinatta bir dizi önemli basamak belirtir.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | Kesin kesinlik modelini döndürür. Kesin kesinlik modeline göre, çift değerdeki tüm basamaklar anlamlıdır. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | Bu kesinlik modelinin kesin olup olmadığını gösteren bir değer alır. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | Bu kesinlik modelinin yuvarlanıp yuvarlanmadığını gösteren bir değer alır. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | Yuvarlıyorsa, hassas modelde bir dizi önemli basamak alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | Bir yuvarlama kesinliği modeli döndürür. Yuvarlama kesinliği modeline göre yalnızca sınırlı sayıda rakam önemlidir. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | Geçerli nesnenin aynı türden başka bir nesneye eşit olup olmadığını gösterir. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | Geçerli nesnenin aynı türden başka bir nesneye eşit olup olmadığını gösterir. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | Varsayılan karma işlevi olarak işlev görür. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | ==. operatörünü uygular |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | !=. operatörünü uygular |

### Notlar

İki tür PrecisionModel vardır:  Bire bir aynı`PrecisionModel` (tüm rakamlar anlamlıdır); yuvarlatılmış`PrecisionModel` (bazı basamak sayıları önemlidir). bir`PrecisionModel` olarak ayarlanabilir[`VectorLayer`](../vectorlayer/) aracılığıyla[`DriverOptions`](../driveroptions/) Geometrileri yazarken veya okurken koordinatları yuvarlamak için .

### Ayrıca bakınız

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* ad alanı [Aspose.Gis](../../aspose.gis/)
* toplantı [Aspose.GIS](../../)


