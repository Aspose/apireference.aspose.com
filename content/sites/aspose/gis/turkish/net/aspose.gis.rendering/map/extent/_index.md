---
title: Map.Extent
second_title: Aspose.GIS for .NET API Referansı
description: Map mülk. Oluşturulacak haritanın sınırlarını belirtir. Olarak ayarlanırsanull  kapsam oluşturma sırasında tüm katmanlardaki tüm geometrileri içerecek şekilde hesaplanır.
type: docs
weight: 40
url: /tr/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

Oluşturulacak haritanın sınırlarını belirtir. Olarak ayarlanırsa`null` , kapsam, oluşturma sırasında tüm katmanlardaki tüm geometrileri içerecek şekilde hesaplanır.

```csharp
public Extent Extent { get; set; }
```

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) dır-dir`false`.[`Width`](../../../aspose.gis/extent/width/) sıfırdan küçük veya eşittir.[`Height`](../../../aspose.gis/extent/height/) sıfırdan küçük veya eşittir.[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) dır-dir`null`. |

### Notlar

Kapsamın uzamsal referans sistemi, haritanın uzamsal referans sistemine eşit değilse, kapsam, oluşturma sırasında hedef uzamsal referans sistemine dönüştürülüyor.

### Ayrıca bakınız

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* ad alanı [Aspose.Gis.Rendering](../../map/)
* toplantı [Aspose.GIS](../../../)


