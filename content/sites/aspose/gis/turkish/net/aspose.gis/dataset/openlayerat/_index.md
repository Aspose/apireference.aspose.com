---
title: Dataset.OpenLayerAt
second_title: Aspose.GIS for .NET API Referansı
description: Dataset yöntem. Belirtilen dizindeki katmanı okuma için açar.
type: docs
weight: 120
url: /tr/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

Belirtilen dizindeki katmanı okuma için açar.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| index | Int32 | Açılacak katmanın dizini. |
| options | DriverOptions | Seçenekleri açın. |

### Geri dönüş değeri

Katman okuma için açıldı.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi, bu veri kümesi için yanlış bir türe sahip. |
| ArgumentOutOfRangeException | Dizin aralığın dışında |
| ArgumentException | Seçenekler nesnesi, bu veri kümesi için yanlış bir türe sahip. |
| [GisException](../../gisexception/) | Katmandan özellik okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* ad alanı [Aspose.Gis](../../dataset/)
* toplantı [Aspose.GIS](../../../)


