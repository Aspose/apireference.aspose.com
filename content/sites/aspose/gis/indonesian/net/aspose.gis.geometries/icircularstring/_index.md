---
title: Interface ICircularString
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Geometries.ICircularString antarmuka. Kurva multisimpul dengan interpolasi melingkar antar titik.
type: docs
weight: 960
url: /id/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

Kurva multi-simpul dengan interpolasi melingkar antar titik.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## Metode

| Nama | Keterangan |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | Mendapatkan salinan geometri ini yang dapat diedit. |

### Perkataan

Itu`CircularString` terdiri dari satu atau lebih segmen busur lingkaran yang terhubung ujung ke ujung. Tiga titik pertama menentukan segmen pertama. Titik pertama adalah titik awal dari busur. Titik kedua adalah titik tengah pada busur selain dari titik awal atau akhir. Titik ketiga adalah akhir dari busur. Busur selanjutnya ditentukan oleh titik tengah dan titik akhir saja, karena titik awal secara implisit ditentukan sebagai titik akhir segmen sebelumnya.

### Lihat juga

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* ruang nama [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* perakitan [Aspose.GIS](../../)


