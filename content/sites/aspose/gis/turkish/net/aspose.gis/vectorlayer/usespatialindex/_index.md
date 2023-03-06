---
title: VectorLayer.UseSpatialIndex
second_title: Aspose.GIS for .NET API Referansı
description: VectorLayer yöntem. gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için uzamsal dizin yüklerWhereIntersects veNearestTo. Dizin yoksa önce onu oluşturur. KullanmakforceRebuild dizin oluşturmayı zorlamak için.
type: docs
weight: 190
url: /tr/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için uzamsal dizin yükler[`WhereIntersects`](../../featuressequence/whereintersects/) ve[`NearestTo`](../nearestto/). Dizin yoksa önce onu oluşturur. Kullanmak*forceRebuild* dizin oluşturmayı zorlamak için.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| indexPath | String | İndeks dosyasının yolu. |
| forceRebuild | Boolean | Dizin zaten mevcut olsa bile yeniden oluşturulup oluşturulmayacağı. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| IOException | Bir G/Ç hatası oluştu. |
| InvalidOperationException | Bu katman için uzamsal dizin zaten yüklenmiştir. |
| [GisException](../../gisexception/) | Dosya var ve Aspose.GIS tarafından oluşturulmuş bir uzamsal dizin dosyası değil. |

### Ayrıca bakınız

* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için uzamsal dizin yükler[`WhereIntersects`](../../featuressequence/whereintersects/) ve[`NearestTo`](../nearestto/). Dizin yoksa önce onu oluşturur. Kullanmak*forceRebuild* dizin oluşturmayı zorlamak için.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| indexPath | AbstractPath | İndeks dosyasının yolu. |
| forceRebuild | Boolean | Dizin zaten mevcut olsa bile yeniden oluşturulup oluşturulmayacağı. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | yol`null`. |
| IOException | Bir G/Ç hatası oluştu. |
| InvalidOperationException | Bu katman için uzamsal dizin zaten yüklenmiştir. |
| [GisException](../../gisexception/) | Dosya var ve Aspose.GIS tarafından oluşturulmuş bir uzamsal dizin dosyası değil. |

### Ayrıca bakınız

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* ad alanı [Aspose.Gis](../../vectorlayer/)
* toplantı [Aspose.GIS](../../../)


