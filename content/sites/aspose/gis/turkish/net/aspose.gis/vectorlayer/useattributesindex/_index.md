---
title: VectorLayer.UseAttributesIndex
second_title: Aspose.GIS for .NET API Referansı
description: VectorLayer yöntem. gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için öznitelik dizini yüklerWhereGreater. Dizin yoksa önce onu oluşturur. KullanmakforceRebuild dizin oluşturmayı zorlamak için.
type: docs
weight: 180
url: /tr/net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için öznitelik dizini yükler[`WhereGreater`](../../featuressequence/wheregreater/). Dizin yoksa önce onu oluşturur. Kullanmak*forceRebuild* dizin oluşturmayı zorlamak için.

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| indexPath | String | İndeks dosyasının yolu. |
| attributeName | String | Üzerinde dizin oluşturulacak özelliğin adı. |
| forceRebuild | Boolean | Dizin zaten mevcut olsa bile yeniden oluşturulup oluşturulmayacağı. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Katmanda böyle bir ada sahip öznitelik yok. |
| IOException | Bir G/Ç hatası oluştu. |
| InvalidOperationException | Bu katman için önceden yüklenmiş olan belirtilen öznitelik için dizin. |
| [GisException](../../gisexception/) | Dosya var ve Aspose.GIS tarafından oluşturulmuş bir öznitelik dizin dosyası değil. |

### Ayrıca bakınız

* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için öznitelik dizini yükler[`WhereGreater`](../../featuressequence/wheregreater/). Dizin yoksa önce onu oluşturur. Kullanmak*forceRebuild* dizin oluşturmayı zorlamak için.

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| indexPath | AbstractPath | İndeks dosyasının yolu. |
| attributeName | String | Üzerinde dizin oluşturulacak özelliğin adı. |
| forceRebuild | Boolean | Dizin zaten mevcut olsa bile yeniden oluşturulup oluşturulmayacağı. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Katmanda böyle bir ada sahip öznitelik yok. |
| IOException | Bir G/Ç hatası oluştu. |
| InvalidOperationException | Bu katman için önceden yüklenmiş olan belirtilen öznitelik için dizin. |
| [GisException](../../gisexception/) | Dosya var ve Aspose.GIS tarafından oluşturulmuş bir öznitelik dizin dosyası değil. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)


