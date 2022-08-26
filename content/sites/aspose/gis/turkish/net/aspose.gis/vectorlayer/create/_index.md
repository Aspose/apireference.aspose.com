---
title: Create
second_title: Aspose.GIS for .NET API Referansı
description: Katmanı oluşturur ve yeni özellikler eklemek için açar.
type: docs
weight: 10
url: /tr/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Katmanı oluşturur ve yeni özellikler eklemek için açar.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| driver | FileDriver | Kullanılacak sürücü. |

### Geri dönüş değeri

Salt okunur bir katman.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi, bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception) | Özellik dosyaya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Katmanı oluşturur ve yeni özellikler eklemek için açar.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| driver | FileDriver | Kullanılacak sürücü. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

Salt okunur bir katman.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi, bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception) | Özellik dosyaya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Katmanı oluşturur ve yeni özellikler eklemek için açar.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| driver | FileDriver | Kullanılacak sürücü. |

### Geri dönüş değeri

Salt okunur bir katman.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi, bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception) | Özellik dosyaya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Katmanı oluşturur ve yeni özellikler eklemek için açar.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| driver | FileDriver | Kullanılacak sürücü. |
| options | DriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

Salt okunur bir katman.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi, bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception) | Özellik dosyaya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Katmanı oluşturur ve ekleme için açar.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| driver | FileDriver | Kullanılacak sürücü. |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception) | Özellik dosyadan/dosyadan okunurken veya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Mekansal referans sistemi sürücü tarafından desteklenmiyor. Kullanım[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) uzamsal referans sisteminin desteklenip desteklenmediğini kontrol etmek için. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Katmanı oluşturur ve ekleme için açar.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| driver | FileDriver | Kullanılacak sürücü. |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| [GisException](../../gisexception) | Özellik dosyadan/dosyadan okunurken veya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Mekansal referans sistemi sürücü tarafından desteklenmiyor. Kullanım[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) uzamsal referans sisteminin desteklenip desteklenmediğini kontrol etmek için. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Katmanı oluşturur ve ekleme için açar.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| driver | FileDriver | Kullanılacak sürücü. |
| options | DriverOptions | Sürücüye özel seçenekler. |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi, bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception) | Özellik dosyadan/dosyadan okunurken veya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Mekansal referans sistemi sürücü tarafından desteklenmiyor. Kullanım[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) uzamsal referans sisteminin desteklenip desteklenmediğini kontrol etmek için. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Katmanı oluşturur ve ekleme için açar.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| driver | FileDriver | Kullanılacak sürücü. |
| options | DriverOptions | Sürücüye özel seçenekler. |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../vectorlayer).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| ArgumentException | Seçenekler nesnesi, bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception) | Özellik dosyadan/dosyadan okunurken veya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Mekansal referans sistemi sürücü tarafından desteklenmiyor. Kullanım[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) uzamsal referans sisteminin desteklenip desteklenmediğini kontrol etmek için. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
