---
title: VectorLayer.NearestTo
second_title: Aspose.GIS for .NET API Referansı
description: VectorLayer yöntem. Sağlanan koordinata en yakın özelliği alır.
type: docs
weight: 150
url: /tr/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

Sağlanan koordinata en yakın özelliği alır.

```csharp
public Feature NearestTo(double x, double y)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| x | Double | koordinatın X'i. |
| y | Double | Y koordinatı. |

### Geri dönüş değeri

Sağlanan koordinata en yakın özellik.

### Ayrıca bakınız

* class [Feature](../../feature/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

Sağlanan noktaya en yakın özelliği alır.

```csharp
public Feature NearestTo(IPoint point)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| point | IPoint | Nokta. |

### Geri dönüş değeri

Sağlanan noktaya en yakın özellik.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Nokta`null`. |
| ArgumentException | Puan boş veya geçerli değil. |

### Ayrıca bakınız

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)


