---
title: SVGListBase1.Item
second_title: Aspose.SVG untuk Referensi .NET API
description: SVGListBase Properti. Mengembalikan item indeks dalam daftar.
type: docs
weight: 10
url: /id/net/aspose.svg.collections/svglistbase-1/item/
---
## SVGListBase&lt;T&gt; indexer

Mengembalikan item indeks dalam daftar.

```csharp
public T this[ulong index] { get; set; }
```

| Parameter | Keterangan |
| --- | --- |
| index | Indeks dalam daftar. |

### Nilai Pengembalian

Objek yang disimpan pada posisi indeks dalam daftar.

### Nilai properti

Jenis item yang disimpan dalam daftar.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Kode[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Dimunculkan saat daftar tidak dapat diubah. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Kode[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Dimunculkan jika nomor indeks lebih besar atau sama dengan jumlahItem. |

### Lihat juga

* class [SVGListBase&lt;T&gt;](../)
* ruang nama [Aspose.Svg.Collections](../../svglistbase-1/)
* perakitan [Aspose.SVG](../../../)


