---
title: DatabaseDriver.OpenDataset
second_title: Aspose.GIS for .NET API Referansı
description: DatabaseDriver yöntem. Veri kümesini açar.
type: docs
weight: 10
url: /tr/net/aspose.gis/databasedriver/opendataset/
---
## DatabaseDriver.OpenDataset method

Veri kümesini açar.

```csharp
public abstract Dataset OpenDataset(IDbConnection connection)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| connection | IDbConnection | Veritabanı bağlantısı açıldı. |

### Geri dönüş değeri

bir örneği[`Dataset`](../../dataset/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağlantı`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [Dataset](../../dataset/)
* class [DatabaseDriver](../)
* ad alanı [Aspose.Gis](../../databasedriver/)
* toplantı [Aspose.GIS](../../../)


