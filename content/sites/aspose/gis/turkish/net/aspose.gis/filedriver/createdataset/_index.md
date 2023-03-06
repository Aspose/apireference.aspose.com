---
title: FileDriver.CreateDataset
second_title: Aspose.GIS for .NET API Referansı
description: FileDriver yöntem. Bir veri kümesi oluşturur.
type: docs
weight: 50
url: /tr/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

Bir veri kümesi oluşturur.

```csharp
public Dataset CreateDataset(string path)
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
| [GisException](../../gisexception/) | Veri kümesi oluşturulurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Veri kümesi zaten var. |

### Ayrıca bakınız

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

Bir veri kümesi oluşturur.

```csharp
public Dataset CreateDataset(AbstractPath path)
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
| [GisException](../../gisexception/) | Veri kümesi oluşturulurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Veri kümesi zaten var. |

### Ayrıca bakınız

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

Bir veri kümesi oluşturur.

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
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
| [GisException](../../gisexception/) | Veri kümesi oluşturulurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Veri kümesi zaten var. |

### Ayrıca bakınız

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Bir veri kümesi oluşturur.

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../gisexception/) | Veri kümesi oluşturulurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü veri kümelerini açamaz (bkz.[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Veri kümesi zaten var. |

### Ayrıca bakınız

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)


