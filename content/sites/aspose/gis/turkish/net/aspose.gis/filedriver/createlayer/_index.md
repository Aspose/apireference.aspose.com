---
title: FileDriver.CreateLayer
second_title: Aspose.GIS for .NET API Referansı
description: FileDriver yöntem. Katmanı oluşturur ve eklemek için açar.
type: docs
weight: 60
url: /tr/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Katmanı oluşturur ve eklemek için açar.

```csharp
public VectorLayer CreateLayer(string path)
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
| [GisException](../../gisexception/) | Özelliği dosyaya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü vektör katmanları oluşturamaz (bkz.[`CanCreateLayers`](../cancreatelayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Katmanı oluşturur ve eklemek için açar.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
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
| [GisException](../../gisexception/) | Özelliği dosyaya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü vektör katmanları oluşturamaz (bkz.[`CanCreateLayers`](../cancreatelayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Katmanı oluşturur ve eklemek için açar.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
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
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception/) | Özelliği dosyaya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü vektör katmanları oluşturamaz (bkz.[`CanCreateLayers`](../cancreatelayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Katmanı oluşturur ve eklemek için açar.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
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
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception/) | Özelliği dosyaya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü vektör katmanları oluşturamaz (bkz.[`CanCreateLayers`](../cancreatelayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Katmanı oluşturur ve eklemek için açar.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Özelliği dosyaya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Uzamsal referans sistemi sürücü tarafından desteklenmiyor. Kullanım[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) uzamsal referans sisteminin desteklenip desteklenmediğini kontrol etmek için. |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Katmanı oluşturur ve eklemek için açar.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception/) | Özelliği dosyaya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Uzamsal referans sistemi sürücü tarafından desteklenmiyor. Kullanım[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) uzamsal referans sisteminin desteklenip desteklenmediğini kontrol etmek için. |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Katmanı oluşturur ve eklemek için açar.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception/) | Özelliği dosyaya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Uzamsal referans sistemi sürücü tarafından desteklenmiyor. Kullanım[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) uzamsal referans sisteminin desteklenip desteklenmediğini kontrol etmek için. |
| NotSupportedException | Sürücü vektör katmanları oluşturamaz (bkz.[`CanCreateLayers`](../cancreatelayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Katmanı oluşturur ve eklemek için açar.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception/) | Özelliği dosyaya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Uzamsal referans sistemi sürücü tarafından desteklenmiyor. Kullanım[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) uzamsal referans sisteminin desteklenip desteklenmediğini kontrol etmek için. |
| NotSupportedException | Sürücü vektör katmanları oluşturamaz (bkz.[`CanCreateLayers`](../cancreatelayers/)). |

### Ayrıca bakınız

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ad alanı [Aspose.Gis](../../filedriver/)
* toplantı [Aspose.GIS](../../../)


