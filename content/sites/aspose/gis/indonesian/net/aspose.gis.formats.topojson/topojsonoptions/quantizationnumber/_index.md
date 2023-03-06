---
title: TopoJsonOptions.QuantizationNumber
second_title: Aspose.GIS untuk Referensi .NET API
description: TopoJsonOptions Properti. Menentukan nomor kuantisasi yang akan digunakan untuk mengkuantisasi koordinat dan arc deltaencode dalam output TopoJSON.
type: docs
weight: 50
url: /id/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

Menentukan nomor kuantisasi yang akan digunakan untuk mengkuantisasi koordinat dan arc delta-encode dalam output TopoJSON.

```csharp
public int? QuantizationNumber { get; set; }
```

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Argumen kurang dari dua. |

### Perkataan

Ini adalah opsi menulis - tidak memengaruhi pembacaan. Opsi ini saling eksklusif dengan[`Transform`](../transform/) - hanya satu dari dua opsi ini yang tidak bisa`null` . Jika tidak`null` - Koordinat TopoJSON keluaran dikuantisasi dan busur dikodekan delta dengan nomor kuantisasi yang ditentukan. Angka kuantisasi menentukan jumlah maksimum nilai yang dapat diekspresikan per dimensi dalam koordinat terkuantisasi yang dihasilkan; biasanya kekuatan sepuluh dipilih. Default ke`null` .

### Lihat juga

* class [TopoJsonOptions](../)
* ruang nama [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* perakitan [Aspose.GIS](../../../)


