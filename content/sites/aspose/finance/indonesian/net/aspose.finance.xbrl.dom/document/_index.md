---
title: Class Document
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Xbrl.Dom.Document kelas. Dokumen mewakili seluruh dokumen xbrl sebaris. Secara konseptual ini adalah akar pohon dokumen dan menyediakan akses utama ke data dokumen.
type: docs
weight: 6690
url: /id/net/aspose.finance.xbrl.dom/document/
---
## Document class

Dokumen mewakili seluruh dokumen xbrl sebaris. Secara konseptual, ini adalah akar pohon dokumen, dan menyediakan akses utama ke data dokumen.

```csharp
public class Document : Node
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Document](document/)() | Konstruktor default. |

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Mendapatkan URI basis absolut dari node ini atau null jika implementasi tidak dapat memperoleh URI absolut. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | Mendapat penyandian dokumen. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | Mendapat elemen anak. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Mendapat node anak. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | Mendapat jenis konten dokumen. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | Ini adalah atribut kenyamanan yang memungkinkan akses langsung ke simpul anak yang merupakan elemen dokumen dari dokumen. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | Mendapat URI dokumen. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Mendapat anak pertama dari node ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Mendapat apakah simpul ini memiliki turunan. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Mendapat anak terakhir dari node ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | Mendapatkan bagian lokal dari nama yang memenuhi syarat dari node ini. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | Mendapat URI namespace dari node ini. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Mendapatkan simpul segera setelah simpul ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename/) { get; } | Mendapat nama simpul dari dokumen. |
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
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Menghapus simpul anak yang ditunjukkan oleh anak lama dari daftar anak. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Mengganti simpul anak anak lama dengan anak baru dalam daftar anak, dan mengembalikan simpul anak lama. |

### Lihat juga

* class [Node](../node/)
* ruang nama [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* perakitan [Aspose.Finance](../../)


