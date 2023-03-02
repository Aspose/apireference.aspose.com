---
title: Geometry.AsImage
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Ekspor geometri ini ke representasi gambar.
type: docs
weight: 120
url: /id/net/aspose.gis.geometries/geometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

Ekspor geometri ini ke representasi gambar.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| outputPath | AbstractPath | Jalur ke gambar keluaran. |
| width | Measurement | Lebar peta. |
| height | Measurement | Ketinggian peta. |
| renderer | Renderer | Penyaji untuk digunakan. |
| symbolizer | VectorSymbolizer | Symboler yang digunakan untuk rendering. Jika`null`, simbol default digunakan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen apapun`null`. |
| IOException | Terjadi kesalahan I/O. |
| [GisException](../../../aspose.gis/gisexception/) | Kesalahan saat memproses atau membaca data GIS. |
| ArgumentException | Satuan lebar atau tinggi adalah!:Unit.MapUnits . |
| ArgumentOutOfRangeException | Lebar atau tinggi adalah negatif atau nol. |

### Lihat juga

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

Ekspor geometri ini ke representasi gambar.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| outputPath | String | Jalur ke gambar keluaran. |
| width | Measurement | Lebar peta. |
| height | Measurement | Ketinggian peta. |
| renderer | Renderer | Penyaji untuk digunakan. |
| symbolizer | VectorSymbolizer | Symboler yang digunakan untuk rendering. Jika`null`, simbol default digunakan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen apapun`null`. |
| IOException | Terjadi kesalahan I/O. |
| [GisException](../../../aspose.gis/gisexception/) | Kesalahan saat memproses atau membaca data GIS. |
| ArgumentException | Satuan lebar atau tinggi adalah!:Unit.MapUnits . |
| ArgumentOutOfRangeException | Lebar atau tinggi adalah negatif atau nol. |

### Lihat juga

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

Ekspor geometri ini ke representasi gambar.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| width | Measurement | Lebar peta. |
| height | Measurement | Ketinggian peta. |
| renderer | Renderer | Penyaji untuk digunakan. |
| symbolizer | VectorSymbolizer | Symboler yang digunakan untuk rendering. Jika`null`, simbol default digunakan. |

### Nilai Pengembalian

Gambar sebagai aliran

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen apapun`null`. |
| IOException | Terjadi kesalahan I/O. |
| [GisException](../../../aspose.gis/gisexception/) | Kesalahan saat memproses atau membaca data GIS. |
| ArgumentException | Satuan lebar atau tinggi adalah!:Unit.MapUnits . |
| ArgumentOutOfRangeException | Lebar atau tinggi adalah negatif atau nol. |

### Lihat juga

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


