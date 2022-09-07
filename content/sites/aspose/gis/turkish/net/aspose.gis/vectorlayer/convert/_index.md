---
title: Convert
second_title: Aspose.GIS for .NET API Referansı
description: Bir katmanı farklı bir biçime dönüştürün.
type: docs
weight: 180
url: /tr/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Bir katmanı farklı bir biçime dönüştürün.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| sourcePath | String | Dönüştürülecek katmanın yolu. |
| sourceDriver | FileDriver | Kaynak katman için biçim sürücüsü. |
| destinationPath | String | Dönüştürme sonucunda oluşturulacak katmanın yolu. |
| destinationDriver | FileDriver | Hedef katman için biçim sürücüsü. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Yollardan herhangi biri`null`. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Bir katmanı farklı bir biçime dönüştürün.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| sourcePath | AbstractPath | Dönüştürülecek katmanın yolu. |
| sourceDriver | FileDriver | Kaynak katman için biçim sürücüsü. |
| destinationPath | AbstractPath | Dönüştürme sonucunda oluşturulacak katmanın yolu. |
| destinationDriver | FileDriver | Hedef katman için biçim sürücüsü. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Yollardan herhangi biri`null`. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Bir katmanı farklı bir biçime dönüştürün.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| sourcePath | String | Dönüştürülecek katmanın yolu. |
| sourceDriver | FileDriver | Kaynak katman için biçim sürücüsü. |
| destinationPath | String | Dönüştürme sonucunda oluşturulacak katmanın yolu. |
| destinationDriver | FileDriver | Hedef katman için biçim sürücüsü. |
| options | ConversionOptions | Dönüştürme prosedürü için seçenekler. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Yollardan herhangi biri`null`. |
| ArgumentException | Seçenekler nesnesi, bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception) | Özellik dosyadan/dosyadan okunurken veya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Şurada belirtilen uzamsal referans sistemi*options*tarafından desteklenmiyor*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Unsur geometrisinin kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürülmesi başarısız oldu. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Bir katmanı farklı bir biçime dönüştürün.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| sourcePath | AbstractPath | Dönüştürülecek katmanın yolu. |
| sourceDriver | FileDriver | Kaynak katman için biçim sürücüsü. |
| destinationPath | AbstractPath | Dönüştürme sonucunda oluşturulacak katmanın yolu. |
| destinationDriver | FileDriver | Hedef katman için biçim sürücüsü. |
| options | ConversionOptions | Dönüştürme prosedürü için seçenekler. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Yollardan herhangi biri`null`. |
| ArgumentException | Seçenekler nesnesi, bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception) | Özellik dosyadan/dosyadan okunurken veya yazılırken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Şurada belirtilen uzamsal referans sistemi*options*tarafından desteklenmiyor*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Unsur geometrisinin kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürülmesi başarısız oldu. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* ad alanı [Aspose.Gis](../../vectorlayer)
* toplantı [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
