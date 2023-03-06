---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters kelas. Parameter untuk membuat proyeksi SRS. Beberapa parameter memiliki default. Beberapa parameter memiliki default yang masuk akal jadi Anda tidak perlu menetapkannya saja. Jika Anda menetapkannull ke parameter tersebut nilai default akan digunakan. ProjectionMethodName DanBase tidak memiliki default  Anda harus menetapkan beberapa nonnull nilai ke properti ini.
type: docs
weight: 2230
url: /id/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

Parameter untuk membuat proyeksi SRS. Beberapa parameter memiliki default. Beberapa parameter memiliki default yang masuk akal, jadi Anda tidak perlu menetapkannya saja. Jika Anda menetapkan`null` ke parameter tersebut, nilai default akan digunakan. [`ProjectionMethodName`](./projectionmethodname/) Dan[`Base`](./base/) tidak memiliki default - Anda harus menetapkan beberapa non`null` nilai ke properti ini.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | Konstruktor default. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | Urutan sumbu. Default keXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | SRS geografis dasar (SRS tempat proyeksi diterapkan). Anda HARUS menyetel properti ini agar tidak`null` nilai untuk membuat SRS yang valid, properti ini tidak memiliki default. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | Unit yang akan digunakan dalam SRS ini. Default adalah[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | Nama SRS yang diproyeksikan. Standarnya adalah "Tanpa Nama". |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | Pengidentifikasi metode proyeksi. Tidak ada nilai default, Anda dapat menyetel parameter ini ke tidak`null` value, jika Anda ingin melampirkan pengidentifikasi ke proyeksi. Jika Anda melakukannya - terserah Anda untuk memastikan bahwa pengidentifikasi dalam metode proyeksi yang konsisten nama (nama metode proyeksi tidak akan berubah saat Anda menyetel properti ini). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | Nama metode proyeksi. Tidak ada default dan Anda HARUS menyetel parameter ini ke tidak`null` nilai, karena SRS yang diproyeksikan tanpa nama proyeksi tidak berguna. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | Sumbu yang menggambarkan dimensi X (horizontal). Default ke sumbu dengan arah timur. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Sumbu yang menggambarkan dimensi Y (vertikal). Default ke sumbu dengan arah utara. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | Menambahkan parameter proyeksi ke SRS ini. Jika parameter dengan nama tersebut sudah ditambahkan - perbarui. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | Mendapat parameter proyeksi dengan nama tertentu. |

### Lihat juga

* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


