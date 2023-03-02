---
title: TopoJsonOptions.DefaultObjectName
second_title: Aspose.GIS untuk Referensi .NET API
description: TopoJsonOptions Properti. Nama objek tempat fitur diletakkan secara default.
type: docs
weight: 20
url: /id/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

Nama objek tempat fitur diletakkan secara default.

```csharp
public string DefaultObjectName { get; set; }
```

### Perkataan

Ini adalah opsi penulisan - ini tidak memengaruhi pembacaan. TopoJSON dapat berisi sejumlah objek bernama. Setiap objek tersebut dapat berisi beberapa fitur. Untuk menentukan di objek mana untuk meletakkan fitur Anda, gunakan [`ObjectNameAttribute`](../objectnameattribute/) property. Jika atribut dengan nama[`ObjectNameAttribute`](../objectnameattribute/) adalah`null`atau unset for beberapa fitur, fitur ini ditambahkan ke objek dengan nama`DefaultObjectName` . Jika atribut dengan nama[`ObjectNameAttribute`](../objectnameattribute/) tidak hadir di[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) Koleksi , semua fitur dimasukkan ke dalam objek dengan nama[`ObjectNameAttribute`](../objectnameattribute/) . Nilai default adalah "tanpa nama".

### Lihat juga

* class [TopoJsonOptions](../)
* ruang nama [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* perakitan [Aspose.GIS](../../../)


