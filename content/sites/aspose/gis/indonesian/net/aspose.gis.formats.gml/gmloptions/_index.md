---
title: Class GmlOptions
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Formats.Gml.GmlOptions kelas. Opsi khusus driver untuk format GML.
type: docs
weight: 350
url: /id/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

Opsi khusus driver untuk format GML.

```csharp
public class GmlOptions : DriverOptions
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [GmlOptions](gmloptions/)() | Buat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Menentukan apakah menutup yang tidak tertutupLinearRing dalam setiap geometri. Default ke`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Menentukan jika menambahkan titik baru di tengah setiap segmen geometri. Default ke`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Menentukan apakah menghapus titik dekat di setiap geometri. Default ke`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Menentukan jarak untuk[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Default ke`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Toleransi yang digunakan untuk linierisasi geometri kurva. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/) { get; set; } | Menentukan apakah Aspose.GIS diizinkan memuat skema XML dari Internet. Jika disetel ke`false` skema dengan URI absolut yang tidak dimulai dengan 'file://' tidak akan dimuat. Defaultnya adalah`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat M saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator/) { get; set; } | Mendapat atau menetapkan string yang digunakan untuk memisahkan komponen atribut bersarang. Standarnya adalah "_". |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema/) { get; set; } | Menentukan apakah Aspose.GIS diizinkan untuk mengurai atribut dalam file Gml di mana skema XML tidak ada atau tidak dapat dimuat. Jika disetel ke`true` , pembaca Aspose.GIS tidak memerlukan keberadaan Skema XML. Standarnya adalah`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation/) { get; set; } | Daftar pasangan URI yang dipisahkan spasi. URI pertama di setiap pasangan adalah URI namespace, URI kedua adalah skema Path to XML dari namespace. Jika disetel ke`null` ,[`GmlDriver`](../gmldriver/) akan mencoba membaca schemaLocation dari elemen root document. Defaultnya adalah`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Menentukan apakah menghapus titik yang terletak pada segmen yang sama di setiap geometri. Default ke`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Menentukan jarak untuk[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Default ke`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Menentukan apakah geometri harus divalidasi saat ditambahkan ke lapisan. Jika disetel ke`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) dipanggil untuk each geometri saat ditambahkan ke lapisan, dan jika validasi gagal ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) adalah`false` ),[`GisException`](../../aspose.gis/gisexception/) dilempar. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Menentukan apakah transformasi poligon atau multipoligon ke garis garis diperbolehkan. Default ke`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver/) { get; set; } | A[`XmlResolver`](./xmlresolver/) digunakan untuk menyelesaikan sumber daya eksternal. Default adalahXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat X dan Y saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat Z saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Lihat juga

* class [DriverOptions](../../aspose.gis/driveroptions/)
* ruang nama [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml/)
* perakitan [Aspose.GIS](../../)


