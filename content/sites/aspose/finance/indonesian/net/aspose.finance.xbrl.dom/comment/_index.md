---
title: Class Comment
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Xbrl.Dom.Comment kelas. Mewarisi dari CharacterData dan mewakili konten komentar.
type: docs
weight: 6680
url: /id/net/aspose.finance.xbrl.dom/comment/
---
## Comment class

Mewarisi dari CharacterData dan mewakili konten komentar.

```csharp
public class Comment : CharacterData
```

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Mendapatkan URI basis absolut dari node ini atau null jika implementasi tidak dapat memperoleh URI absolut. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Mendapat node anak. |
| [Data](../../aspose.finance.xbrl.dom/characterdata/data/) { get; set; } | Mendapat atau menetapkan data karakter dari node yang mengimplementasikan antarmuka ini. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Mendapat anak pertama dari node ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Mendapat apakah simpul ini memiliki turunan. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Mendapat anak terakhir dari node ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| [Length](../../aspose.finance.xbrl.dom/characterdata/length/) { get; } | Mendapat jumlah unit 16-bit yang tersedia melalui data. Ini mungkin memiliki nilai nol, yaitu node CharacterData mungkin kosong. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | Mendapatkan bagian lokal dari nama yang memenuhi syarat dari node ini. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | Mendapat URI namespace dari node ini. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Mendapatkan simpul segera setelah simpul ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| override [NodeName](../../aspose.finance.xbrl.dom/comment/nodename/) { get; } | Mendapat nama simpul dari komentar. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | Mendapat tipe node. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | Mendapat atau menetapkan nilai node ini, tergantung pada jenisnya. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | Mendapatkan objek dokumen yang terkait dengan node ini. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | Mendapat simpul induk. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix/) { get; set; } | Mendapat atau menyetel prefiks namespace dari node ini. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | Mendapat simpul tepat sebelum simpul ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | Mendapat atau menyetel konten teks dari node ini dan turunannya. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | Menambahkan node newChild ke akhir daftar anak dari node ini. |
| virtual [AppendData](../../aspose.finance.xbrl.dom/characterdata/appenddata/)(string) | Menambahkan string ke akhir data karakter node. |
| virtual [DeleteData](../../aspose.finance.xbrl.dom/characterdata/deletedata/)(int, int) | Menghapus berbagai konten dari node. |
| virtual [InsertData](../../aspose.finance.xbrl.dom/characterdata/insertdata/)(int, string) | Menyisipkan string pada offset yang ditentukan. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Menghapus simpul anak yang ditunjukkan oleh anak lama dari daftar anak. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Mengganti simpul anak anak lama dengan anak baru dalam daftar anak, dan mengembalikan simpul anak lama. |
| virtual [ReplaceData](../../aspose.finance.xbrl.dom/characterdata/replacedata/)(int, int, string) | Mengganti karakter yang dimulai dari offset yang ditentukan dengan string yang ditentukan. |
| virtual [Substring](../../aspose.finance.xbrl.dom/characterdata/substring/)(int, int) | Mengekstrak berbagai data dari node. |

### Lihat juga

* class [CharacterData](../characterdata/)
* ruang nama [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* perakitan [Aspose.Finance](../../)


