---
title: Class NamedNodeMap
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Collections.NamedNodeMap kelas. Mewakili kumpulan atribut yang dapat diakses dengan nama.
type: docs
weight: 30
url: /id/net/aspose.svg.collections/namednodemap/
---
## NamedNodeMap class

Mewakili kumpulan atribut yang dapat diakses dengan nama.

```csharp
public class NamedNodeMap : DOMObject, IDisposable, IEnumerable<Attr>
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Item](../../aspose.svg.collections/namednodemap/item/) { get; } | Mengembalikan item ke-indeks di peta. Jika indeks lebih besar dari atau sama dengan jumlah node di peta ini, ini mengembalikan null. (2 indexers) |
| [Length](../../aspose.svg.collections/namednodemap/length/) { get; } | Jumlah node di peta ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [GetEnumerator](../../aspose.svg.collections/namednodemap/getenumerator/)() | Mengembalikan pencacah yang mengulang melalui koleksi. |
| [GetNamedItem](../../aspose.svg.collections/namednodemap/getnameditem/)(string) | Mengambil simpul yang ditentukan oleh nama. |
| [GetNamedItemNS](../../aspose.svg.collections/namednodemap/getnameditemns/)(string, string) | Mengambil simpul yang ditentukan oleh nama lokal dan namespace URI. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Metode ini digunakan untuk mengambil objek ECMAScriptType . |
| [RemoveNamedItem](../../aspose.svg.collections/namednodemap/removenameditem/)(string) | Menghapus simpul yang ditentukan oleh nama. |
| [RemoveNamedItemNS](../../aspose.svg.collections/namednodemap/removenameditemns/)(string, string) | Menghapus simpul yang ditentukan oleh nama lokal dan namespace URI. |
| [SetNamedItem](../../aspose.svg.collections/namednodemap/setnameditem/)(Attr) | Menambahkan node menggunakan atribut nodeName. Jika node dengan nama itu sudah ada di peta ini, itu akan diganti dengan yang baru. Mengganti node dengan sendirinya tidak berpengaruh. |
| [SetNamedItemNS](../../aspose.svg.collections/namednodemap/setnameditemns/)(Attr) | Menambahkan node menggunakan namespaceURI dan localName. Jika node dengan namespace URI dan nama lokal tersebut sudah ada di peta ini, maka akan diganti dengan yang baru. Mengganti node dengan sendirinya tidak berpengaruh. |

### Lihat juga

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Attr](../../aspose.svg.dom/attr/)
* ruang nama [Aspose.Svg.Collections](../../aspose.svg.collections/)
* perakitan [Aspose.SVG](../../)


