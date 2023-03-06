---
title: VectorLayer.Convert
second_title: Aspose.GIS for .NET API Referansı
description: VectorLayer yöntem. Bir katmanı farklı bir formata dönüştürün.
type: docs
weight: 200
url: /tr/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Bir katmanı farklı bir formata dönüştürün.

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
| ArgumentNullException | yollardan herhangi biri`null`. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Bir katmanı farklı bir formata dönüştürün.

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
| ArgumentNullException | yollardan herhangi biri`null`. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Bir katmanı farklı bir formata dönüştürün.

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
| ArgumentNullException | yollardan herhangi biri`null`. |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception/) | Özelliği dosyaya/dosyadan okurken veya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Belirtilen uzamsal referans sistemi*options* tarafından desteklenmiyor*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Öznitelik geometrisinin kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürülmesi başarısız oldu. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Bir katmanı farklı bir formata dönüştürün.

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
| ArgumentNullException | yollardan herhangi biri`null`. |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| [GisException](../../gisexception/) | Özelliği dosyaya/dosyadan okurken veya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Belirtilen uzamsal referans sistemi*options* tarafından desteklenmiyor*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Öznitelik geometrisinin kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürülmesi başarısız oldu. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)


