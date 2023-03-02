---
title: Geometry.AsImage
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometriyi bir görüntü sunumuna aktarın.
type: docs
weight: 120
url: /tr/net/aspose.gis.geometries/geometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

Bu geometriyi bir görüntü sunumuna aktarın.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| outputPath | AbstractPath | Çıkış görüntüsünün yolu. |
| width | Measurement | Haritanın genişliği. |
| height | Measurement | Haritanın yüksekliği. |
| renderer | Renderer | Kullanılacak oluşturucu. |
| symbolizer | VectorSymbolizer | İşleme için kullanılacak bir sembolleştirici. Eğer`null`, varsayılan simgeleyici kullanılır. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Herhangi bir argüman`null`. |
| IOException | Bir G/Ç hatası oluştu. |
| [GisException](../../../aspose.gis/gisexception/) | CBS verilerini işlerken veya okurken bir hata oluştu. |
| ArgumentException | Genişlik veya yükseklik birimi!:Unit.MapUnits . |
| ArgumentOutOfRangeException | Genişlik veya yükseklik negatif veya sıfırdır. |

### Ayrıca bakınız

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

Bu geometriyi bir görüntü sunumuna aktarın.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| outputPath | String | Çıkış görüntüsünün yolu. |
| width | Measurement | Haritanın genişliği. |
| height | Measurement | Haritanın yüksekliği. |
| renderer | Renderer | Kullanılacak oluşturucu. |
| symbolizer | VectorSymbolizer | İşleme için kullanılacak bir sembolleştirici. Eğer`null`, varsayılan simgeleyici kullanılır. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Herhangi bir argüman`null`. |
| IOException | Bir G/Ç hatası oluştu. |
| [GisException](../../../aspose.gis/gisexception/) | CBS verilerini işlerken veya okurken bir hata oluştu. |
| ArgumentException | Genişlik veya yükseklik birimi!:Unit.MapUnits . |
| ArgumentOutOfRangeException | Genişlik veya yükseklik negatif veya sıfırdır. |

### Ayrıca bakınız

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

Bu geometriyi bir görüntü sunumuna aktarın.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| width | Measurement | Haritanın genişliği. |
| height | Measurement | Haritanın yüksekliği. |
| renderer | Renderer | Kullanılacak oluşturucu. |
| symbolizer | VectorSymbolizer | İşleme için kullanılacak bir sembolleştirici. Eğer`null`, varsayılan simgeleyici kullanılır. |

### Geri dönüş değeri

Akış olarak görüntü

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Herhangi bir argüman`null`. |
| IOException | Bir G/Ç hatası oluştu. |
| [GisException](../../../aspose.gis/gisexception/) | CBS verilerini işlerken veya okurken bir hata oluştu. |
| ArgumentException | Genişlik veya yükseklik birimi!:Unit.MapUnits . |
| ArgumentOutOfRangeException | Genişlik veya yükseklik negatif veya sıfırdır. |

### Ayrıca bakınız

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


