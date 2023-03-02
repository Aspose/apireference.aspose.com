---
title: TopoJsonOptions.Transform
second_title: Aspose.GIS untuk Referensi .NET API
description: TopoJsonOptions Properti. Menentukan objek transformasi yang akan digunakan untuk mengkuantisasi koordinat dan busur deltaencode dalam output TopoJSON.
type: docs
weight: 60
url: /id/net/aspose.gis.formats.topojson/topojsonoptions/transform/
---
## TopoJsonOptions.Transform property

Menentukan objek transformasi yang akan digunakan untuk mengkuantisasi koordinat dan busur delta-encode dalam output TopoJSON.

```csharp
public TopoJsonTransform Transform { get; set; }
```

### Perkataan

Ini adalah opsi menulis - tidak memengaruhi pembacaan. Opsi ini saling eksklusif dengan[`QuantizationNumber`](../quantizationnumber/) - hanya satu dari dua opsi ini yang tidak bisa`null` . Jika tidak`null` - output koordinat TopoJSON terkuantisasi dan busur disandikan delta dengan objek transformasi yang ditentukan. Lihat spesifikasi TopoJSON untuk detail lebih lanjut tentang objek transformasi. Default ke`null` .

### Lihat juga

* class [TopoJsonTransform](../../topojsontransform/)
* class [TopoJsonOptions](../)
* ruang nama [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* perakitan [Aspose.GIS](../../../)


