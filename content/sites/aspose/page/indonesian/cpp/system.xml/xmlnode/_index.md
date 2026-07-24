---
title: "Kelas System::Xml::XmlNode"
linktitle: "XmlNode"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlNode. Mewakili satu node tunggal dalam dokumen XML dalam C++."
type: docs
weight: 2500
url: /id/cpp/system.xml/xmlnode/
---
## XmlNode class


Mewakili satu node tunggal dalam dokumen XML.

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | Menambahkan node yang ditentukan ke akhir daftar node anak, dari node ini. |
| virtual [Clone](./clone/)() | Membuat duplikat dari node ini. |
| virtual [CloneNode](./clonenode/)(bool) | Membuat duplikat node, ketika dioverride dalam kelas turunan. |
| [CreateNavigator](./createnavigator/)() override | Membuat XPathNavigator untuk menavigasi objek ini. |
| virtual [get_Attributes](./get_attributes/)() | Mengembalikan [XmlAttributeCollection](../xmlattributecollection/) yang berisi atribut node ini. |
| virtual [get_BaseURI](./get_baseuri/)() | Mengembalikan URI dasar dari node saat ini. |
| virtual [get_ChildNodes](./get_childnodes/)() | Mengembalikan semua node anak dari node tersebut. |
| virtual [get_FirstChild](./get_firstchild/)() | Mengembalikan anak pertama dari node tersebut. |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | Mengembalikan nilai yang menunjukkan apakah node ini memiliki node anak. |
| virtual [get_InnerText](./get_innertext/)() | Mengembalikan nilai yang digabungkan dari node ini dan semua node anaknya. |
| virtual [get_InnerXml](./get_innerxml/)() | Mengembalikan markup yang mewakili hanya node anak dari node ini. |
| virtual [get_IsReadOnly](./get_isreadonly/)() | Mengembalikan nilai yang menunjukkan apakah node bersifat read-only. |
| virtual [get_LastChild](./get_lastchild/)() | Mengembalikan anak terakhir dari node tersebut. |
| virtual [get_LocalName](./get_localname/)() | Mengembalikan nama lokal node, ketika ditimpa dalam kelas turunan. |
| virtual [get_Name](./get_name/)() | Mengembalikan nama lengkap (qualified) node, ketika ditimpa dalam kelas turunan. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Mengembalikan URI namespace dari node ini. |
| virtual [get_NextSibling](./get_nextsibling/)() | Mengembalikan node yang langsung mengikuti node ini. |
| virtual [get_NodeType](./get_nodetype/)() | Mengembalikan tipe node saat ini, ketika ditimpa dalam kelas turunan. |
| virtual [get_OuterXml](./get_outerxml/)() | Mengembalikan markup yang berisi node ini dan semua node anaknya. |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | Mengembalikan [XmlDocument](../xmldocument/) yang menjadi milik node ini. |
| virtual [get_ParentNode](./get_parentnode/)() | Mengembalikan induk dari node ini (untuk node yang dapat memiliki induk). |
| virtual [get_Prefix](./get_prefix/)() | Mengembalikan prefiks namespace dari node ini. |
| virtual [get_PreviousSibling](./get_previoussibling/)() | Mengembalikan node yang langsung mendahului node ini. |
| virtual [get_PreviousText](./get_previoustext/)() | Mengembalikan node teks yang langsung mendahului node ini. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Mengembalikan infoset validasi skema pasca yang telah diberikan ke node ini sebagai hasil dari validasi skema. |
| virtual [get_Value](./get_value/)() | Mengembalikan nilai dari node. |
| [GetEnumerator](./getenumerator/)() override | Mengembalikan enumerator yang mengiterasi node anak dalam node saat ini. |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | Mencari deklarasi **xmlns** terdekat untuk prefiks yang diberikan yang berada dalam cakupan node saat ini dan mengembalikan URI namespace dalam deklarasi tersebut. |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | Mencari deklarasi **xmlns** terdekat untuk URI namespace yang diberikan yang berada dalam cakupan node saat ini dan mengembalikan prefiks yang didefinisikan dalam deklarasi tersebut. |
| virtual [idx_get](./idx_get/)(String) | Mengembalikan elemen anak pertama dengan [XmlNode::get_Name](./get_name/) yang ditentukan. |
| virtual [idx_get](./idx_get/)(String, String) | Mengembalikan elemen anak pertama dengan nilai [XmlNode::get_LocalName](./get_localname/) dan [XmlNode::get_NamespaceURI](./get_namespaceuri/) yang ditentukan. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Menyisipkan node yang ditentukan tepat setelah node referensi yang ditentukan. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Menyisipkan node yang ditentukan tepat sebelum node referensi yang ditentukan. |
| virtual [Normalize](./normalize/)() | Menempatkan semua node [XmlText](../xmltext/) pada kedalaman penuh sub‑pohon di bawah [XmlNode](./) ini ke dalam bentuk \"normal\" di mana hanya markup (yaitu, tag, komentar, instruksi pemrosesan, bagian CDATA, dan referensi entitas) yang memisahkan node [XmlText](../xmltext/), sehingga tidak ada node [XmlText](../xmltext/) yang bersebelahan. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | Menambahkan node yang ditentukan ke awal daftar node anak untuk node ini. |
| virtual [RemoveAll](./removeall/)() | Menghapus semua node anak dan/atau atribut dari node saat ini. |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | Menghapus node anak yang ditentukan. |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Mengganti node anak **oldChild** dengan node **newChild**. |
| [SelectNodes](./selectnodes/)(const String\&) | Memilih daftar node yang cocok dengan ekspresi [XPath](../../system.xml.xpath/). |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Memilih daftar node yang cocok dengan ekspresi [XPath](../../system.xml.xpath/). Setiap prefiks yang ditemukan dalam ekspresi [XPath](../../system.xml.xpath/) diselesaikan menggunakan [XmlNamespaceManager](../xmlnamespacemanager/) yang disediakan. |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | Memilih [XmlNode](./) pertama yang cocok dengan ekspresi [XPath](../../system.xml.xpath/). |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Memilih [XmlNode](./) pertama yang cocok dengan ekspresi [XPath](../../system.xml.xpath/). Setiap prefiks yang ditemukan dalam ekspresi [XPath](../../system.xml.xpath/) diselesaikan menggunakan [XmlNamespaceManager](../xmlnamespacemanager/) yang disediakan. |
| virtual [set_InnerText](./set_innertext/)(String) | Mengatur nilai yang digabungkan dari node dan semua node anaknya. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Mengatur markup yang mewakili hanya node anak dari node ini. |
| virtual [set_Prefix](./set_prefix/)(String) | Mengatur prefiks namespace node ini. |
| virtual [set_Value](./set_value/)(String) | Mengatur nilai dari node. |
| virtual [Supports](./supports/)(String, String) | Menguji apakah implementasi DOM mendukung fitur tertentu. |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | Menyimpan semua node anak dari node ke [XmlWriter](../xmlwriter/) yang ditentukan, ketika ditimpa dalam kelas turunan. |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | Menyimpan node saat ini ke [XmlWriter](../xmlwriter/) yang ditentukan, ketika ditimpa dalam kelas turunan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
