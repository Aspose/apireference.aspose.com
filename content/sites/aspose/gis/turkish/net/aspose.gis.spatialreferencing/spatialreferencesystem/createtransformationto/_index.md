---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Aspose.GIS for .NET API Referansı
description: SpatialReferenceSystem yöntem. Bundan dönüşüm oluştururMekansal Referans Sistemi başka birMekansal Referans Sistemi .
type: docs
weight: 180
url: /tr/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Bir diğer`Mekansal Referans Sistemi`. |

### Geri dönüş değeri

Bundan dönüşüm`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi`.

### istisnalar

| istisna | şart |
| --- | --- |
| NotSupportedException | Bunun arasında dönüşüm`Mekansal Referans Sistemi` ve bağımsız değişken desteklenmiyor. Bu durum, projeksiyonlardan birinin desteklenmemesi veya sistemlerden birinin desteklenmemesi nedeniyle olabilir.[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) or [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | İçindeki yanlış parametreler nedeniyle dönüşüm oluşturulamadı`Mekansal Referans Sistemi` . |

### Ayrıca bakınız

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* ad alanı [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* toplantı [Aspose.GIS](../../../)


