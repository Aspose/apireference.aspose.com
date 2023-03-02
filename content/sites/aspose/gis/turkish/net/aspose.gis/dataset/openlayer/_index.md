---
title: Dataset.OpenLayer
second_title: Aspose.GIS for .NET API Referansı
description: Dataset yöntem. Belirtilen ada sahip katmanı okumak için açar.
type: docs
weight: 110
url: /tr/net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

Belirtilen ada sahip katmanı okumak için açar.

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| name | String | Açılacak katmanın adı. |
| options | DriverOptions | Seçenekleri açın. |

### Geri dönüş değeri

Katman okuma için açıldı.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Belirtilen ada sahip katman mevcut değil; Seçenekler nesnesi bu veri kümesi için yanlış bir türe sahip. |
| ArgumentException | Seçenekler nesnesi, bu veri kümesi için yanlış bir türe sahip. |
| ArgumentNullException | İsmi`null`. |
| [GisException](../../gisexception/) | Katmandan özellik okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* ad alanı [Aspose.Gis](../../dataset/)
* toplantı [Aspose.GIS](../../../)


