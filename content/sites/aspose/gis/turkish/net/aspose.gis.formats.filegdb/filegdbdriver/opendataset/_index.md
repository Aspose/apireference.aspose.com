---
title: FileGdbDriver.OpenDataset
second_title: Aspose.GIS for .NET API Referansı
description: FileGdbDriver yöntem. Veri kümesini açar.
type: docs
weight: 70
url: /tr/net/aspose.gis.formats.filegdb/filegdbdriver/opendataset/
---
## OpenDataset(string, FileGdbOptions) {#opendataset_5}

Veri kümesini açar.

```csharp
public Dataset OpenDataset(string path, FileGdbOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Veri kümesinin yolu. |
| options | FileGdbOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`Dataset`](../../../aspose.gis/dataset/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Veri kümesinden katman okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |

### Ayrıca bakınız

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* ad alanı [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Veri kümesini açar.

```csharp
public override Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Veri kümesinin yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`Dataset`](../../../aspose.gis/dataset/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Veri kümesinden katman okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |

### Ayrıca bakınız

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* ad alanı [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, FileGdbOptions) {#opendataset_2}

Veri kümesini açar.

```csharp
public Dataset OpenDataset(AbstractPath path, FileGdbOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Veri kümesinin yolu. |
| options | FileGdbOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`Dataset`](../../../aspose.gis/dataset/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Veri kümesinden katman okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |

### Ayrıca bakınız

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* ad alanı [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* toplantı [Aspose.GIS](../../../)


