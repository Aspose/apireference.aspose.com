---
title: FileDriver.OpenDataset
second_title: Aspose.GIS for .NET API Referansı
description: FileDriver yöntem. Veri kümesini açar.
type: docs
weight: 80
url: /tr/net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

Veri kümesini açar.

```csharp
public Dataset OpenDataset(string path)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Veri kümesinin yolu. |

### Geri dönüş değeri

bir örneği[`Dataset`](../../dataset/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |

### Ayrıca bakınız

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

Veri kümesini açar.

```csharp
public Dataset OpenDataset(AbstractPath path)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Veri kümesinin yolu. |

### Geri dönüş değeri

bir örneği[`Dataset`](../../dataset/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |

### Ayrıca bakınız

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

Veri kümesini açar.

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Veri kümesinin yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`Dataset`](../../dataset/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |

### Ayrıca bakınız

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Veri kümesini açar.

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Veri kümesinin yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`Dataset`](../../dataset/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Veri kümesi okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |

### Ayrıca bakınız

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)


