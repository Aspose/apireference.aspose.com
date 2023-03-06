---
title: RasterLayer.GetSpatialPoint
second_title: Aspose.GIS for .NET API Referansı
description: RasterLayer yöntem. Belirtilen sütunu ve satırı uzamsal koordinata dönüştürür.
type: docs
weight: 150
url: /tr/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

Belirtilen sütunu ve satırı uzamsal koordinata dönüştürür.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| cellX | Int32 | Sütunun değeri (x-koordinatı). Numaralandırma 0'dan başlar. |
| cellY | Int32 | Satır değeri (y koordinatı). Numaralandırma 0'dan başlar. |

### Geri dönüş değeri

Bir sütun ve satır verildiğinde sol üst köşenin x koordinatını verir.

### Notlar

Parametrelerden herhangi biri rasterin ilgili boyutunun aralığının dışına geçirilirse, , raster ızgarasının raster sınırları dışında geçerli olduğunu varsayarak raster dışındaki koordinatları döndürür.

### Ayrıca bakınız

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* ad alanı [Aspose.Gis.Raster](../../rasterlayer/)
* toplantı [Aspose.GIS](../../../)


