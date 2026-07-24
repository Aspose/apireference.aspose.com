---
title: "Kelas System::Xml::XPath::XPathNavigator"
linktitle: "XPathNavigator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XPath::XPathNavigator. Menyediakan model kursor untuk menavigasi dan mengedit data XML dalam C++."
type: docs
weight: 500
url: /id/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


Menyediakan model kursor untuk menavigasi dan mengedit data XML.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | Mengembalikan objek [XmlWriter](../../system.xml/xmlwriter/) yang digunakan untuk membuat satu atau beberapa node anak baru di akhir daftar node anak dari node saat ini. |
| virtual [AppendChild](./appendchild/)(String) | Membuat node anak baru di akhir daftar node anak dari node saat ini menggunakan string data XML yang ditentukan. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | Membuat node anak baru di akhir daftar node anak dari node saat ini menggunakan isi XML dari objek [XmlReader](../../system.xml/xmlreader/) yang ditentukan. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | Membuat node anak baru di akhir daftar node anak dari node saat ini menggunakan node-node dalam [XPathNavigator](./) yang ditentukan. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | Membuat node elemen anak baru di akhir daftar node anak dari node saat ini menggunakan awalan ruang nama, nama lokal, dan URI ruang nama yang ditentukan dengan nilai yang diberikan. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | Memverifikasi bahwa data XML dalam [XPathNavigator](./) sesuai dengan skema bahasa definisi XML [Schema](../../system.xml.schema/) (XSD) yang disediakan. |
| virtual [Clone](./clone/)() | Ketika ditimpa dalam kelas turunan, membuat [XPathNavigator](./) baru yang diposisikan pada node yang sama dengan [XPathNavigator](./) ini. |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | Membandingkan posisi [XPathNavigator](./) saat ini dengan posisi [XPathNavigator](./) yang ditentukan. |
| virtual [Compile](./compile/)(String) | Menyusun string yang mewakili ekspresi [XPath](../) dan mengembalikan objek [XPathExpression](../xpathexpression/). |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | Membuat node atribut pada node elemen saat ini menggunakan awalan ruang nama, nama lokal, dan URI ruang nama yang ditentukan dengan nilai yang diberikan. |
| virtual [CreateAttributes](./createattributes/)() | Mengembalikan objek [XmlWriter](../../system.xml/xmlwriter/) yang digunakan untuk membuat atribut baru pada elemen saat ini. |
| [CreateNavigator](./createnavigator/)() override | Mengembalikan salinan dari [XPathNavigator](./). |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | Menghapus rentang node saudara dari node saat ini hingga node yang ditentukan. |
| virtual [DeleteSelf](./deleteself/)() | Menghapus node saat ini dan node anaknya. |
| virtual [Evaluate](./evaluate/)(String) | Mengevaluasi ekspresi [XPath](../) yang ditentukan dan mengembalikan hasil yang bertipe. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Mengevaluasi ekspresi [XPath](../) yang ditentukan dan mengembalikan hasil yang bertipe, menggunakan objek [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) yang ditentukan untuk menyelesaikan awalan ruang nama dalam ekspresi [XPath](../). |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | Mengevaluasi [XPathExpression](../xpathexpression/) dan mengembalikan hasil yang bertipe. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | Menggunakan konteks yang diberikan untuk mengevaluasi [XPathExpression](../xpathexpression/), dan mengembalikan hasil yang bertipe. |
| virtual [get_BaseURI](./get_baseuri/)() | Ketika ditimpa dalam kelas turunan, mengambil URI dasar untuk node saat ini. |
| virtual [get_CanEdit](./get_canedit/)() | Mengembalikan nilai yang menunjukkan apakah [XPathNavigator](./) dapat mengedit data XML yang mendasarinya. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Mengembalikan nilai yang menunjukkan apakah node saat ini memiliki atribut apa pun. |
| virtual [get_HasChildren](./get_haschildren/)() | Mengembalikan nilai yang menunjukkan apakah node saat ini memiliki node anak apa pun. |
| virtual [get_InnerXml](./get_innerxml/)() | Mengembalikan markup yang mewakili node anak dari node saat ini. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Ketika ditimpa dalam kelas turunan, mengambil nilai yang menunjukkan apakah node saat ini adalah elemen kosong tanpa tag elemen penutup. |
| [get_IsNode](./get_isnode/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini mewakili node [XPath](../). |
| virtual [get_LocalName](./get_localname/)() | Saat dioverride dalam kelas turunan, mendapatkan [XPathNavigator::get_Name](./get_name/) dari node saat ini tanpa awalan namespace apa pun. |
| virtual [get_Name](./get_name/)() | Saat ditimpa dalam kelas turunan, mendapatkan nama yang memenuhi syarat (qualified) dari node saat ini. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Saat dioverride dalam kelas turunan, mendapatkan URI namespace dari node saat ini. |
| virtual [get_NameTable](./get_nametable/)() | Saat dioverride dalam kelas turunan, mendapatkan [XmlNameTable](../../system.xml/xmlnametable/) dari [XPathNavigator](./). |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | Mengembalikan sebuah [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) yang digunakan untuk perbandingan kesetaraan objek [XPathNavigator](./). |
| virtual [get_NodeType](./get_nodetype/)() | Saat dioverride dalam kelas turunan, mendapatkan [XPathNodeType](../xpathnodetype/) dari node saat ini. |
| virtual [get_OuterXml](./get_outerxml/)() | Mengembalikan markup yang mewakili tag pembuka dan penutup dari node saat ini serta node anaknya. |
| virtual [get_Prefix](./get_prefix/)() | Saat ditimpa dalam kelas turunan, mengambil awalan ruang nama yang terkait dengan node saat ini. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Mengembalikan informasi skema yang telah diberikan ke node saat ini sebagai hasil dari validasi skema. |
| [get_TypedValue](./get_typedvalue/)() override | Mengembalikan node saat ini sebagai objek yang dibungkus dengan tipe yang paling sesuai. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | Digunakan oleh implementasi [XPathNavigator](./) yang menyediakan tampilan XML \"virtualized\" atas penyimpanan, untuk memberikan akses ke objek-objek dasar. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Mengembalikan nilai node saat ini sebagai [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Mengembalikan nilai node saat ini sebagai [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Mengembalikan nilai node saat ini sebagai [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Mengembalikan nilai node saat ini sebagai [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Mengembalikan nilai node saat ini sebagai [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Mengembalikan tipe dari node saat ini. |
| virtual [get_XmlLang](./get_xmllang/)() | Mengembalikan ruang lingkup **xml:lang** untuk node saat ini. |
| [get_XmlType](./get_xmltype/)() override | Mengembalikan informasi XmlSchemaType untuk node saat ini. |
| virtual [GetAttribute](./getattribute/)(String, String) | Mengembalikan nilai atribut dengan nama lokal dan URI ruang nama yang ditentukan. |
| virtual [GetNamespace](./getnamespace/)(String) | Mengembalikan nilai node namespace yang sesuai dengan nama lokal yang ditentukan. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Mengembalikan namespace dalam lingkup node saat ini. |
| virtual [InsertAfter](./insertafter/)() | Mengembalikan sebuah objek [XmlWriter](../../system.xml/xmlwriter/) yang digunakan untuk membuat node saudara baru setelah node yang saat ini dipilih. |
| virtual [InsertAfter](./insertafter/)(String) | Membuat node saudara baru setelah node yang saat ini dipilih menggunakan string XML yang ditentukan. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | Membuat node saudara baru setelah node yang saat ini dipilih menggunakan isi XML dari objek [XmlReader](../../system.xml/xmlreader/) yang ditentukan. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | Membuat node saudara baru setelah node yang saat ini dipilih menggunakan node-node dalam objek [XPathNavigator](./) yang ditentukan. |
| virtual [InsertBefore](./insertbefore/)() | Mengembalikan sebuah objek [XmlWriter](../../system.xml/xmlwriter/) yang digunakan untuk membuat node saudara baru sebelum node yang saat ini dipilih. |
| virtual [InsertBefore](./insertbefore/)(String) | Membuat node saudara baru sebelum node yang saat ini dipilih menggunakan string XML yang ditentukan. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | Membuat node saudara baru sebelum node yang saat ini dipilih menggunakan isi XML dari objek [XmlReader](../../system.xml/xmlreader/) yang ditentukan. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | Membuat node saudara baru sebelum node yang saat ini dipilih menggunakan node dalam [XPathNavigator](./) yang ditentukan. |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | Membuat elemen saudara baru setelah node saat ini menggunakan prefiks namespace, nama lokal, dan URI namespace yang ditentukan, dengan nilai yang ditentukan. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | Membuat elemen saudara baru sebelum node saat ini menggunakan prefiks namespace, nama lokal, dan URI namespace yang ditentukan, dengan nilai yang ditentukan. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | Menentukan apakah [XPathNavigator](./) yang ditentukan merupakan keturunan dari [XPathNavigator](./) saat ini. |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | Ketika dioverride dalam kelas turunan, menentukan apakah [XPathNavigator](./) saat ini berada pada posisi yang sama dengan [XPathNavigator](./) yang ditentukan. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Mengembalikan URI namespace untuk prefiks yang ditentukan. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Mengembalikan prefiks yang dideklarasikan untuk URI namespace yang ditentukan. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | Menentukan apakah node saat ini cocok dengan [XPathExpression](../xpathexpression/) yang ditentukan. |
| virtual [Matches](./matches/)(String) | Menentukan apakah node saat ini cocok dengan ekspresi [XPath](../) yang ditentukan. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | Ketika dioverride dalam kelas turunan, memindahkan [XPathNavigator](./) ke posisi yang sama dengan [XPathNavigator](./) yang ditentukan. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Memindahkan [XPathNavigator](./) ke atribut dengan nama lokal dan URI namespace yang cocok. |
| virtual [MoveToChild](./movetochild/)(String, String) | Memindahkan [XPathNavigator](./) ke node anak dengan nama lokal dan URI namespace yang ditentukan. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | Memindahkan [XPathNavigator](./) ke node anak dari [XPathNodeType](../xpathnodetype/) yang ditentukan. |
| virtual [MoveToFirst](./movetofirst/)() | Memindahkan [XPathNavigator](./) ke node saudara pertama dari node saat ini. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Ketika dioverride dalam kelas turunan, memindahkan [XPathNavigator](./) ke atribut pertama dari node saat ini. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | Ketika dioverride dalam kelas turunan, memindahkan [XPathNavigator](./) ke node anak pertama dari node saat ini. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | Ketika dioverride dalam kelas turunan, memindahkan [XPathNavigator](./) ke node namespace pertama yang cocok dengan [XPathNamespaceScope](../xpathnamespacescope/) yang ditentukan. |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | Memindahkan [XPathNavigator](./) ke node namespace pertama dari node saat ini. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | Memindahkan [XPathNavigator](./) ke elemen dengan nama lokal dan URI namespace yang ditentukan dalam urutan dokumen. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | Memindahkan [XPathNavigator](./) ke elemen dengan nama lokal dan URI namespace yang ditentukan, hingga batas yang ditentukan, dalam urutan dokumen. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | Memindahkan [XPathNavigator](./) ke elemen berikutnya dari [XPathNodeType](../xpathnodetype/) yang ditentukan dalam urutan dokumen. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | Memindahkan [XPathNavigator](./) ke elemen berikutnya dari [XPathNodeType](../xpathnodetype/) yang ditentukan, hingga batas yang ditentukan, dalam urutan dokumen. |
| virtual [MoveToId](./movetoid/)(String) | Ketika dioverride dalam kelas turunan, memindahkan ke node yang memiliki atribut berjenis **ID** dengan nilai yang cocok dengan [String](../../system/string/) yang ditentukan. |
| virtual [MoveToNamespace](./movetonamespace/)(String) | Memindahkan [XPathNavigator](./) ke node namespace dengan prefiks namespace yang ditentukan. |
| virtual [MoveToNext](./movetonext/)() | Ketika dioverride dalam kelas turunan, memindahkan [XPathNavigator](./) ke node saudara berikutnya dari node saat ini. |
| virtual [MoveToNext](./movetonext/)(String, String) | Memindahkan [XPathNavigator](./) ke node saudara berikutnya dengan nama lokal dan URI namespace yang ditentukan. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | Memindahkan [XPathNavigator](./) ke node saudara berikutnya dari node saat ini yang cocok dengan [XPathNodeType](../xpathnodetype/) yang ditentukan. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Ketika dioverride dalam kelas turunan, memindahkan [XPathNavigator](./) ke atribut berikutnya. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | Ketika dioverride dalam kelas turunan, memindahkan [XPathNavigator](./) ke node namespace berikutnya yang cocok dengan [XPathNamespaceScope](../xpathnamespacescope/) yang ditentukan. |
| [MoveToNextNamespace](./movetonextnamespace/)() | Memindahkan [XPathNavigator](./) ke node namespace berikutnya. |
| virtual [MoveToParent](./movetoparent/)() | Ketika dioverride dalam kelas turunan, memindahkan [XPathNavigator](./) ke node induk dari node saat ini. |
| virtual [MoveToPrevious](./movetoprevious/)() | Ketika dioverride dalam kelas turunan, memindahkan [XPathNavigator](./) ke node saudara sebelumnya dari node saat ini. |
| virtual [MoveToRoot](./movetoroot/)() | Memindahkan [XPathNavigator](./) ke node akar tempat node saat ini berada. |
| virtual [PrependChild](./prependchild/)() | Mengembalikan objek [XmlWriter](../../system.xml/xmlwriter/) yang digunakan untuk membuat node anak baru di awal daftar node anak dari node saat ini. |
| virtual [PrependChild](./prependchild/)(String) | Membuat node anak baru di awal daftar node anak dari node saat ini menggunakan string XML yang ditentukan. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | Membuat node anak baru di awal daftar node anak dari node saat ini menggunakan isi XML dari objek [XmlReader](../../system.xml/xmlreader/) yang ditentukan. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | Membuat node anak baru di awal daftar node anak dari node saat ini menggunakan node dalam objek [XPathNavigator](./) yang ditentukan. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | Membuat elemen anak baru di awal daftar node anak dari node saat ini menggunakan awalan namespace, nama lokal, dan URI namespace yang ditentukan dengan nilai yang diberikan. |
| virtual [ReadSubtree](./readsubtree/)() | Mengembalikan objek [XmlReader](../../system.xml/xmlreader/) yang berisi node saat ini dan node anaknya. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | Mengganti rentang node saudara dari node saat ini hingga node yang ditentukan. |
| virtual [ReplaceSelf](./replaceself/)(String) | Mengganti node saat ini dengan konten string yang ditentukan. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | Mengganti node saat ini dengan isi objek [XmlReader](../../system.xml/xmlreader/) yang ditentukan. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | Mengganti node saat ini dengan isi objek [XPathNavigator](./) yang ditentukan. |
| virtual [Select](./select/)(String) | Memilih sekumpulan node, menggunakan ekspresi [XPath](../) yang ditentukan. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Memilih sekumpulan node menggunakan ekspresi [XPath](../) yang ditentukan dengan objek [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) yang diberikan untuk menyelesaikan awalan namespace. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | Memilih sekumpulan node menggunakan [XPathExpression](../xpathexpression/) yang ditentukan. |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | Memilih semua node nenek moyang dari node saat ini yang memiliki [XPathNodeType](../xpathnodetype/) yang cocok. |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | Memilih semua node nenek moyang dari node saat ini yang memiliki nama lokal dan URI namespace yang ditentukan. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | Memilih semua node anak dari node saat ini yang memiliki [XPathNodeType](../xpathnodetype/) yang cocok. |
| virtual [SelectChildren](./selectchildren/)(String, String) | Memilih semua node anak dari node saat ini yang memiliki nama lokal dan URI namespace yang ditentukan. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | Memilih semua node keturunan dari node saat ini yang memiliki [XPathNodeType](../xpathnodetype/) yang cocok. |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | Memilih semua node turunan dari node saat ini dengan nama lokal dan URI namespace yang ditentukan. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | Memilih satu node dalam [XPathNavigator](./) menggunakan kueri [XPath](../) yang ditentukan. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Memilih satu node dalam objek [XPathNavigator](./) menggunakan kueri [XPath](../) yang ditentukan dengan objek [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) yang ditentukan untuk menyelesaikan prefiks namespace. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | Memilih satu node dalam [XPathNavigator](./) menggunakan objek [XPathExpression](../xpathexpression/) yang ditentukan. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Mengatur markup yang mewakili node anak dari node saat ini. |
| virtual [set_OuterXml](./set_outerxml/)(String) | Mengatur markup yang mewakili tag pembuka dan penutup dari node saat ini serta node anaknya. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | Mengatur nilai bertipe dari node saat ini. |
| virtual [SetValue](./setvalue/)(String) | Mengatur nilai node saat ini. |
| [ToString](./tostring/)() const override | Mengembalikan nilai teks dari node saat ini. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Mengembalikan nilai node saat ini sebagai Tipe yang ditentukan, menggunakan objek [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) yang ditentukan untuk menyelesaikan prefiks namespace. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | Menyalurkan node saat ini dan node anaknya ke objek [XmlWriter](../../system.xml/xmlwriter/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
