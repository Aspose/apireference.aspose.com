---
title: FeaturesSequence.SaveTo
second_title: Aspose.GIS for .NET API Referansı
description: FeaturesSequence yöntem. Unsur sırasını katmana kaydeder.
type: docs
weight: 50
url: /tr/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

Unsur sırasını katmana kaydeder.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| destinationPath | String | Çıkış katmanına giden yol. |
| destinationDriver | FileDriver | Çıkış katmanı için biçim sürücüsü. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Herhangi bir argüman`null`. |
| [GisException](../../gisexception/) | Özelliği dosyaya/dosyadan okurken veya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Öznitelik geometrisinin kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürülmesi başarısız oldu. |

### Ayrıca bakınız

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* ad alanı [Aspose.Gis](../../featuressequence/)
* toplantı [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

Unsur sırasını katmana kaydeder.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| destinationPath | AbstractPath | Çıkış katmanına giden yol. |
| destinationDriver | FileDriver | Çıkış katmanı için biçim sürücüsü. |

### istisnalar

| istisna | şart |
| --- | --- |
| [GisException](../../gisexception/) | Özelliği dosyaya/dosyadan okurken veya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Öznitelik geometrisinin kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürülmesi başarısız oldu. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* ad alanı [Aspose.Gis](../../featuressequence/)
* toplantı [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

Unsur sırasını katmana kaydeder.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| destinationPath | String | Çıkış katmanına giden yol. |
| destinationDriver | FileDriver | Çıkış katmanı için biçim sürücüsü. |
| options | SavingOptions | Kaydetme prosedürü için seçenekler. |

### istisnalar

| istisna | şart |
| --- | --- |
| [GisException](../../gisexception/) | Özelliği dosyaya/dosyadan okurken veya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Öznitelik geometrisinin kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürülmesi başarısız oldu. |
| NotSupportedException | Belirtilen uzamsal referans sistemi*options* tarafından desteklenmiyor*destinationDriver* . |

### Ayrıca bakınız

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* ad alanı [Aspose.Gis](../../featuressequence/)
* toplantı [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

Unsur sırasını katmana kaydeder.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| destinationPath | AbstractPath | Çıkış katmanına giden yol. |
| destinationDriver | FileDriver | Çıkış katmanı için biçim sürücüsü. |
| options | SavingOptions | Kaydetme prosedürü için seçenekler. |

### istisnalar

| istisna | şart |
| --- | --- |
| [GisException](../../gisexception/) | Özelliği dosyaya/dosyadan okurken veya yazarken hata oluştu. |
| IOException | Bir G/Ç hatası oluştu. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Öznitelik geometrisinin kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürülmesi başarısız oldu. |
| NotSupportedException | Belirtilen uzamsal referans sistemi*options* tarafından desteklenmiyor*destinationDriver* . |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* ad alanı [Aspose.Gis](../../featuressequence/)
* toplantı [Aspose.GIS](../../../)


