---
title: Class Node
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Xbrl.Dom.Node kelas. Kelas Node adalah tipe data utama untuk seluruh Model objek Dokumen. Ini mewakili satu simpul di pohon dokumen.
type: docs
weight: 7460
url: /id/net/aspose.finance.xbrl.dom/node/
---
## Node class

Kelas Node adalah tipe data utama untuk seluruh Model objek Dokumen. Ini mewakili satu simpul di pohon dokumen.

```csharp
public abstract class Node
```

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Mendapatkan URI basis absolut dari node ini atau null jika implementasi tidak dapat memperoleh URI absolut. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Mendapat node anak. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Mendapat anak pertama dari node ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Mendapat apakah simpul ini memiliki turunan. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Mendapat anak terakhir dari node ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | Mendapatkan bagian lokal dari nama yang memenuhi syarat dari node ini. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | Mendapat URI namespace dari node ini. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Mendapatkan simpul segera setelah simpul ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| abstract [NodeName](../../aspose.finance.xbrl.dom/node/nodename/) { get; } | Mendapatkan nama node, tergantung pada jenisnya. |
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

## Bidang

| Nama | Keterangan |
| --- | --- |
| const [COMMENT_NODE](../../aspose.finance.xbrl.dom/node/comment_node/) | Jenis simpul komentar. |
| const [DOCUMENT_NODE](../../aspose.finance.xbrl.dom/node/document_node/) | Jenis simpul dokumen. |
| const [DOCUMENT_TYPE_NODE](../../aspose.finance.xbrl.dom/node/document_type_node/) | Tipe node tipe dokumen. |
| const [ELEMENT_NODE](../../aspose.finance.xbrl.dom/node/element_node/) | Jenis simpul elemen. |
| const [PROCESSING_INSTRUCTION_NODE](../../aspose.finance.xbrl.dom/node/processing_instruction_node/) | Memproses tipe node instruksi. |
| const [TEXT_NODE](../../aspose.finance.xbrl.dom/node/text_node/) | Jenis node teks. |

### Lihat juga

* ruang nama [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* perakitan [Aspose.Finance](../../)


