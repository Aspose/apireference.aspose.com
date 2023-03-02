---
title: Extent.GetTransformed
second_title: Aspose.GIS for .NET API Referansı
description: Extent yöntem. Belirtilen yeni kapsamı döndürürSpatialReferenceSystem bu kapsamı içeren.
type: docs
weight: 150
url: /tr/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

Belirtilen yeni kapsamı döndürür[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) bu kapsamı içeren.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) dönüştürmek için. |

### Geri dönüş değeri

Belirtilen SRS'ye bu ölçüde dönüştürmenin sonucu.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null` . |
| NotSupportedException | Sağlanan SRS'ye dönüştürme desteklenmiyor. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Dönüşüm başarısız oldu. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) bu ölçüde`null` . |

### Ayrıca bakınız

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* ad alanı [Aspose.Gis](../../extent/)
* toplantı [Aspose.GIS](../../../)


