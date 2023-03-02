---
title: FileDriver.OpenLayer
second_title: Aspose.GIS for .NET API Referansı
description: FileDriver yöntem. Okumak için katmanı açar.
type: docs
weight: 90
url: /tr/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

Okumak için katmanı açar.

```csharp
public VectorLayer OpenLayer(string path)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Dosyadan özellik okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü vektör katmanlarını açamıyor (bkz.[`CanOpenLayers`](../canopenlayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Okumak için katmanı açar.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Dosyadan özellik okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü vektör katmanlarını açamıyor (bkz.[`CanOpenLayers`](../canopenlayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

Okumak için katmanı açar.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Dosyadan özellik okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü vektör katmanlarını açamıyor (bkz.[`CanOpenLayers`](../canopenlayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

Okumak için katmanı açar.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Dosyadan özellik okunurken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü vektör katmanlarını açamıyor (bkz.[`CanOpenLayers`](../canopenlayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)


