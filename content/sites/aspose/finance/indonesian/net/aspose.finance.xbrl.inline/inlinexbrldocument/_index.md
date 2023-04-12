---
title: Class InlineXbrlDocument
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Xbrl.Inline.InlineXbrlDocument kelas. Dokumen XBRL sebaris.
type: docs
weight: 7790
url: /id/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

Dokumen XBRL sebaris.

```csharp
public class InlineXbrlDocument : Document
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument/#constructor)(Stream) | Menginisialisasi instance baru dari`InlineXbrlDocument` kelas dan membukanya dengan aliran.. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_2)(string) | Menginisialisasi instance baru dari`InlineXbrlDocument` kelas dan buka file. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_1)(Stream, LoadOptions) | Menginisialisasi instance baru dari`InlineXbrlDocument` kelas dan membukanya dengan aliran. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_3)(string, LoadOptions) | Menginisialisasi instance baru dari`InlineXbrlDocument` kelas dan buka file. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences/) { get; } | Mendapat koleksi[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference/) dalam dokumen XBRL sebaris. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Mendapatkan URI basis absolut dari node ini atau null jika implementasi tidak dapat memperoleh URI absolut. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | Mendapat penyandian dokumen. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | Mendapat elemen anak. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Mendapat node anak. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | Mendapat jenis konten dokumen. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts/) { get; } | Mendapat koleksi[`Context`](../../aspose.finance.xbrl/context/) dalam dokumen XBRL sebaris. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations/) { get; } | Mendapat koleksi[`InlineContinuation`](../inlinecontinuation/) dalam dokumen XBRL sebaris. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | Ini adalah atribut kenyamanan yang memungkinkan akses langsung ke simpul anak yang merupakan elemen dokumen dari dokumen. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | Mendapat URI dokumen. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts/) { get; } | Mendapat koleksi[`InlineFact`](../inlinefact/) dalam dokumen XBRL sebaris. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Mendapat anak pertama dari node ini. Jika tidak ada simpul seperti itu, ini mengembalikan nol. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes/) { get; } | Mendapat koleksi[`InlineFootnote`](../inlinefootnote/) dalam dokumen XBRL sebaris. |
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
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references/) { get; } | Mendapatkan[`InlineReferences`](../inlinereferences/) dalam dokumen XBRL sebaris. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships/) { get; } | Mendapat koleksi[`InlineRelationship`](../inlinerelationship/) dalam dokumen XBRL sebaris. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences/) { get; } | Mendapat koleksi[`RoleReference`](../../aspose.finance.xbrl/rolereference/) dalam dokumen XBRL sebaris. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | Mendapat atau menyetel konten teks dari node ini dan turunannya. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units/) { get; } | Mendapat koleksi[`Unit`](../../aspose.finance.xbrl/unit/) dalam dokumen XBRL sebaris. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors/) { get; set; } | Mendapat koleksi[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror/) dalam dokumen XBRL sebaris. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | Menambahkan node newChild ke akhir daftar anak dari node ini. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement/)(string, string) | Membuat elemen Html. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement/)(string, string) | Membuat elemen xbrl sebaris. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement/)(string, string) | Membuat elemen contoh xbrl. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement/)(string, string) | Membuat elemen xbrl linkbase. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl)() | Ekspor ke objek XbrlDocument. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_1)(Stream) | Ekspor ke aliran xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_2)(string) | Ekspor ke file xbrl. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri/)(string) | Mendapat ArcroleType yang memiliki uri. yang ditentukan |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid/)(string) | Mendapat konteks yang memiliki id yang ditentukan. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc/)(Loc) | Mendapat konsep dari locator. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname/)(string) | Mendapat konsep yang memiliki nama tertentu. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid/)(string) | Mendapat konteks yang memiliki id yang ditentukan. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference/)(string) | Mendapat rangkaian lanjutan sesuai dengan referensi lanjutan. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri/)(string) | Mendapat RoleType yang memiliki uri. yang ditentukan |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid/)(string) | Mendapat unit yang memiliki id yang ditentukan. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid/)() | Mengecek apakah dokumen inlince XBRL ini valid. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects/)() | Jika menambah, memperbarui, menghapus elemen Inline Xbrl di pohon DOM, metode ini harus dipanggil untuk me-refresh objek xbrl inline. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Menghapus simpul anak yang ditunjukkan oleh anak lama dari daftar anak. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Mengganti simpul anak anak lama dengan anak baru dalam daftar anak, dan mengembalikan simpul anak lama. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save)(Stream) | Membuat dan menyimpan file xbrl sebaris ke aliran. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_2)(string) | Membuat dan menyimpan file xbrl sebaris ke disk. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_1)(Stream, SaveOptions) | Membuat dan menyimpan file xbrl sebaris ke aliran. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_3)(string, SaveOptions) | Membuat dan menyimpan file xbrl sebaris ke disk. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate/)() | Memvalidasi dokumen XBRL sebaris ini. |

### Lihat juga

* class [Document](../../aspose.finance.xbrl.dom/document/)
* ruang nama [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline/)
* perakitan [Aspose.Finance](../../)


