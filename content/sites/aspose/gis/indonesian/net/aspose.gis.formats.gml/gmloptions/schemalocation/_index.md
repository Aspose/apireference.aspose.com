---
title: GmlOptions.SchemaLocation
second_title: Aspose.GIS untuk Referensi .NET API
description: GmlOptions Properti. Daftar pasangan URI yang dipisahkan spasi. URI pertama di setiap pasangan adalah URI namespace URI kedua adalah skema Path to XML dari namespace. Jika disetel kenull GmlDriver akan mencoba membaca schemaLocation dari elemen root document. Defaultnya adalahnull .
type: docs
weight: 50
url: /id/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

Daftar pasangan URI yang dipisahkan spasi. URI pertama di setiap pasangan adalah URI namespace, URI kedua adalah skema Path to XML dari namespace. Jika disetel ke`null` ,[`GmlDriver`](../../gmldriver/) akan mencoba membaca schemaLocation dari elemen root document. Defaultnya adalah`null` .

```csharp
public string SchemaLocation { get; set; }
```

### Perkataan

Aspose.GIS menggunakan skema XML dari file GML untuk membuatnya[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) Secara default, lokasi skema diekstrak dari atribut schemaLocation. Jika tidak ada atribut seperti itu atau menunjuk ke lokasi yang tidak valid, Aspose.GIS akan gagal membaca file GML. Dalam hal ini - setel opsi ini, sehingga Aspose.GIS dapat memuat schema.

### Contoh

"http://site.com/namespace http://site.com/schema.xsd"

### Lihat juga

* class [GmlOptions](../)
* ruang nama [Aspose.Gis.Formats.Gml](../../gmloptions/)
* perakitan [Aspose.GIS](../../../)


