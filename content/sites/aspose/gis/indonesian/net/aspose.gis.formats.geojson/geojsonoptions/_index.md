---
title: Class GeoJsonOptions
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions kelas. Opsi khusus driver untuk format GeoJSON.
type: docs
weight: 310
url: /id/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

Opsi khusus driver untuk format GeoJSON.

```csharp
public class GeoJsonOptions : DriverOptions
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | Buat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Apakah akan mengekspos array string, integer, atau real JSon sebagai string. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | mengontrol terjemahan atribut: ya - lewati semua atribut |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | Otomatis buat id |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Menentukan apakah menutup yang tidak tertutupLinearRing dalam setiap geometri. Default ke`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Menentukan jika menambahkan titik baru di tengah setiap segmen geometri. Default ke`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | Apakah akan mengekspos tanggal/waktu/tanggal-waktu JSon sebagai string. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Menentukan apakah menghapus titik dekat di setiap geometri. Default ke`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Menentukan jarak untuk[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Default ke`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Deskripsi pada tingkat kumpulan fitur (untuk pembuatan layer) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | kontrol terjemahan geometri: ya - bungkus geometri dengan tipe GeometryCollection |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Toleransi yang digunakan untuk linierisasi geometri kurva. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat M saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Nama pada tingkat kumpulan fitur (untuk pembuatan layer) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | Mendapat atau menetapkan string yang digunakan untuk memisahkan komponen atribut bersarang. Standarnya adalah "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Menentukan apakah Bounding Boxes ('bbox') harus dibaca sebagai atribut dengan nama 'bbox_0', 'bbox_1', dll. Nilai defaultnya adalah`false` . Itu[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) string digunakan di bbox_0, bbox_1,.. nama. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Menentukan apakah menghapus titik yang terletak pada segmen yang sama di setiap geometri. Default ke`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Menentukan jarak untuk[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Default ke`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Menentukan apakah geometri harus divalidasi saat ditambahkan ke lapisan. Jika disetel ke`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) dipanggil untuk each geometri saat ditambahkan ke lapisan, dan jika validasi gagal ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) adalah`false` ),[`GisException`](../../aspose.gis/gisexception/) dilempar. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | Menentukan apakah objek GeoJSON harus menyertakan informasi rentang koordinat untuk Geometrinya. Jika disetel ke`true` , anggota "bbox" dihasilkan untuk setiap geometri (bukan nol) saat ditambahkan ke lapisan. Nilai defaultnya adalah`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Menentukan apakah transformasi poligon atau multipoligon ke garis garis diperbolehkan. Default ke`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | Apakah akan menulis atribut yang tidak disetel dengan menambahkan nilai 'null' |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat X dan Y saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat Z saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Lihat juga

* class [DriverOptions](../../aspose.gis/driveroptions/)
* ruang nama [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* perakitan [Aspose.GIS](../../)


