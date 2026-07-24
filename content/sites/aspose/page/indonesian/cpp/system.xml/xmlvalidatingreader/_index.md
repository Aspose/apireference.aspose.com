---
title: "Kelas System::Xml::XmlValidatingReader"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlValidatingReader. Mewakili pembaca yang menyediakan validasi definisi tipe dokumen (DTD), skema XML-Data Reduced (XDR), dan bahasa definisi skema XML (XSD) dalam C++."
type: docs
weight: 4200
url: /id/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


Mewakili pembaca yang menyediakan validasi definisi tipe dokumen (DTD), skema XML-Data Reduced (XDR), dan bahasa definisi skema XML [Schema](../../system.xml.schema/) (XSD).

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Mengubah [XmlReader::get_ReadState](../xmlreader/get_readstate/) menjadi Closed. |
| [get_AttributeCount](./get_attributecount/)() override | Mengembalikan jumlah atribut pada node saat ini. |
| [get_BaseURI](./get_baseuri/)() override | Mengembalikan URI dasar dari node saat ini. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Mengembalikan nilai yang menunjukkan apakah [XmlValidatingReader](./) mengimplementasikan metode pembacaan konten biner. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Mengembalikan nilai yang menunjukkan apakah pembaca ini dapat mengurai dan menyelesaikan entitas. |
| [get_Depth](./get_depth/)() override | Mengembalikan kedalaman node saat ini dalam dokumen XML. |
| [get_Encoding](./get_encoding/)() | Mengembalikan atribut encoding untuk dokumen. |
| [get_EntityHandling](./get_entityhandling/)() | Mengembalikan nilai yang menentukan bagaimana pembaca menangani entitas. |
| [get_EOF](./get_eof/)() override | Mengembalikan nilai yang menunjukkan apakah pembaca berada pada akhir aliran. |
| [get_HasValue](./get_hasvalue/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini dapat memiliki [XmlValidatingReader::get_Value](./get_value/) selain [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini adalah atribut yang dihasilkan dari nilai default yang didefinisikan dalam definisi tipe dokumen (DTD) atau skema. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini adalah elemen kosong (misalnya, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Mengembalikan nomor baris saat ini. |
| [get_LinePosition](./get_lineposition/)() override | Mengembalikan posisi baris saat ini. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node saat ini. |
| [get_Name](./get_name/)() override | Mengembalikan nama yang memenuhi syarat dari node saat ini. |
| [get_Namespaces](./get_namespaces/)() | Mengembalikan nilai yang menunjukkan apakah dukungan namespace diaktifkan. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Mengembalikan Uniform Resource Identifier (URI) ruang nama (sebagaimana didefinisikan dalam spesifikasi Namespace Konsorsium World Wide [Web](../../system.web/) (W3C)) dari node tempat pembaca berada. |
| [get_NameTable](./get_nametable/)() override | Mengembalikan [XmlNameTable](../xmlnametable/) yang terkait dengan implementasi ini. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_Prefix](./get_prefix/)() override | Mengembalikan awalan ruang nama yang terkait dengan node saat ini. |
| [get_QuoteChar](./get_quotechar/)() override | Mengembalikan karakter tanda kutip yang digunakan untuk mengelilingi nilai node atribut. |
| [get_Reader](./get_reader/)() | Mengembalikan [XmlReader](../xmlreader/) yang digunakan untuk membuat [XmlValidatingReader](./) ini. |
| [get_ReadState](./get_readstate/)() override | Mengembalikan status pembaca. |
| [get_Schemas](./get_schemas/)() | Mengembalikan XmlSchemaCollection untuk digunakan dalam validasi. |
| [get_SchemaType](./get_schematype/)() | Mengembalikan objek tipe skema. |
| [get_ValidationType](./get_validationtype/)() | Mengembalikan nilai yang menunjukkan tipe validasi yang akan dilakukan. |
| [get_Value](./get_value/)() override | Mengembalikan nilai teks dari node saat ini. |
| [get_XmlLang](./get_xmllang/)() override | Mengembalikan ruang lingkup **xml:lang** saat ini. |
| [get_XmlSpace](./get_xmlspace/)() override | Mengembalikan ruang lingkup **xml:space** saat ini. |
| [GetAttribute](./getattribute/)(String) override | Mengembalikan nilai atribut dengan nama yang ditentukan. |
| [GetAttribute](./getattribute/)(String, String) override | Mengembalikan nilai atribut dengan nama lokal dan Uniform Resource Identifier (URI) ruang nama yang ditentukan. |
| [GetAttribute](./getattribute/)(int32_t) override | Mengembalikan nilai atribut dengan indeks yang ditentukan. |
| [HasLineInfo](./haslineinfo/)() override | Mengembalikan nilai yang menunjukkan apakah kelas dapat mengembalikan informasi baris. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Menyelesaikan awalan ruang nama dalam ruang lingkup elemen saat ini. |
| [MoveToAttribute](./movetoattribute/)(String) override | Berpindah ke atribut dengan nama yang ditentukan. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Berpindah ke atribut dengan nama lokal dan Uniform Resource Identifier (URI) ruang nama yang ditentukan. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Berpindah ke atribut dengan indeks yang ditentukan. |
| [MoveToElement](./movetoelement/)() override | Berpindah ke elemen yang berisi node atribut saat ini. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Berpindah ke atribut pertama. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Berpindah ke atribut berikutnya. |
| [Read](./read/)() override | Membaca node berikutnya dari aliran. |
| [ReadAttributeValue](./readattributevalue/)() override | Menganalisis nilai atribut menjadi satu atau lebih **[Text](../../system.text/)**, **EntityReference**, atau **EndEntity** node. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Membaca konten dan mengembalikan byte biner yang didekodekan Base64. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Membaca konten dan mengembalikan byte biner yang didekodekan BinHex. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Membaca elemen dan mendekode konten Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Membaca elemen dan mendekode konten BinHex. |
| [ReadString](./readstring/)() override | Membaca isi elemen atau node teks sebagai string. |
| [ReadTypedValue](./readtypedvalue/)() | Mengembalikan tipe runt-ime untuk tipe bahasa definisi XML [Schema](../../system.xml.schema/) (XSD) yang ditentukan. |
| [ResolveEntity](./resolveentity/)() override | Menyelesaikan referensi entitas untuk node **EntityReference**. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Mengatur nilai yang menentukan bagaimana pembaca menangani entitas. |
| [set_Namespaces](./set_namespaces/)(bool) | Mengatur nilai yang menunjukkan apakah mendukung namespace. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Mengatur nilai yang menunjukkan jenis validasi yang akan dilakukan. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengatur [XmlResolver](../xmlresolver/) yang digunakan untuk menyelesaikan referensi definisi tipe dokumen eksternal (DTD) dan lokasi skema. [XmlResolver](../xmlresolver/) juga digunakan untuk menangani elemen import atau include yang ditemukan dalam skema bahasa definisi XML [Schema](../../system.xml.schema/) (XSD). |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Menambahkan penangan peristiwa untuk menerima informasi tentang kesalahan validasi definisi tipe dokumen (DTD), skema XML-Data Reduced (XDR), dan skema bahasa definisi XML [Schema](../../system.xml.schema/) (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Menghapus penangan peristiwa untuk menerima informasi tentang kesalahan validasi definisi tipe dokumen (DTD), skema XML-Data Reduced (XDR), dan skema bahasa definisi XML [Schema](../../system.xml.schema/) (XSD). |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | Menginisialisasi instance baru dari kelas [XmlValidatingReader](./) yang memvalidasi konten yang dikembalikan dari [XmlReader](../xmlreader/) yang diberikan. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Menginisialisasi instance baru dari kelas [XmlValidatingReader](./) dengan nilai yang ditentukan. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Menginisialisasi instance baru dari kelas [XmlValidatingReader](./) dengan nilai yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan


## Deprecated
Kelas ini sudah usang. Disarankan untuk menggunakan kelas XmlReaderSettings dan metode XmlReader::Create untuk membuat pembaca XML yang memvalidasi.

Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
