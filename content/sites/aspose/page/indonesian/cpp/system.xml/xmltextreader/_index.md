---
title: "Kelas System::Xml::XmlTextReader"
linktitle: "XmlTextReader"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlTextReader. Mewakili pembaca yang menyediakan akses cepat, tidak ter-cache, hanya maju ke data XML dalam C++."
type: docs
weight: 3900
url: /id/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


Mewakili pembaca yang menyediakan akses cepat, tidak ter-cache, hanya maju ke data XML.

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Mengubah [XmlReader::get_ReadState](../xmlreader/get_readstate/) menjadi **Closed**. |
| [get_AttributeCount](./get_attributecount/)() override | Mengembalikan jumlah atribut pada node saat ini. |
| [get_BaseURI](./get_baseuri/)() override | Mengembalikan URI dasar dari node saat ini. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Mengembalikan nilai yang menunjukkan apakah [XmlTextReader](./) mengimplementasikan metode pembacaan konten biner. |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | Mengembalikan nilai yang menunjukkan apakah [XmlTextReader](./) mengimplementasikan metode [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/). |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Mengembalikan nilai yang menunjukkan apakah pembaca ini dapat mengurai dan menyelesaikan entitas. |
| [get_Depth](./get_depth/)() override | Mengembalikan kedalaman node saat ini dalam dokumen XML. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Mengembalikan enumerasi [DtdProcessing](../dtdprocessing/). |
| [get_Encoding](./get_encoding/)() | Mengembalikan enkoding dokumen. |
| [get_EntityHandling](./get_entityhandling/)() | Mengembalikan nilai yang menentukan bagaimana pembaca menangani entitas. |
| [get_EOF](./get_eof/)() override | Mengembalikan nilai yang menunjukkan apakah pembaca berada pada akhir aliran. |
| [get_HasValue](./get_hasvalue/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini dapat memiliki [XmlTextReader::get_Value](./get_value/) selain [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini adalah atribut yang dihasilkan dari nilai default yang didefinisikan dalam DTD atau skema. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini adalah elemen kosong (misalnya, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Mengembalikan nomor baris saat ini. |
| [get_LinePosition](./get_lineposition/)() override | Mengembalikan posisi baris saat ini. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node saat ini. |
| [get_Name](./get_name/)() override | Mengembalikan nama yang memenuhi syarat dari node saat ini. |
| [get_Namespaces](./get_namespaces/)() | Mengembalikan nilai yang menunjukkan apakah dukungan namespace diaktifkan. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Mengembalikan URI ruang nama (seperti yang didefinisikan dalam spesifikasi Namespace W3C) dari node tempat pembaca berada. |
| [get_NameTable](./get_nametable/)() override | Mengembalikan [XmlNameTable](../xmlnametable/) yang terkait dengan implementasi ini. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_Normalization](./get_normalization/)() | Mengembalikan nilai yang menunjukkan apakah harus menormalkan spasi putih dan nilai atribut. |
| [get_Prefix](./get_prefix/)() override | Mengembalikan awalan ruang nama yang terkait dengan node saat ini. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Mengembalikan nilai yang menunjukkan apakah memperbolehkan pemrosesan DTD. |
| [get_QuoteChar](./get_quotechar/)() override | Mengembalikan karakter tanda kutip yang digunakan untuk mengelilingi nilai node atribut. |
| [get_ReadState](./get_readstate/)() override | Mengembalikan status pembaca. |
| [get_Value](./get_value/)() override | Mengembalikan nilai teks dari node saat ini. |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | Mengembalikan nilai yang menentukan bagaimana spasi putih ditangani. |
| [get_XmlLang](./get_xmllang/)() override | Mengembalikan ruang lingkup **xml:lang** saat ini. |
| [get_XmlSpace](./get_xmlspace/)() override | Mengembalikan ruang lingkup **xml:space** saat ini. |
| [GetAttribute](./getattribute/)(String) override | Mengembalikan nilai atribut dengan nama yang ditentukan. |
| [GetAttribute](./getattribute/)(String, String) override | Mengembalikan nilai atribut dengan nama lokal dan URI ruang nama yang ditentukan. |
| [GetAttribute](./getattribute/)(int32_t) override | Mengembalikan nilai atribut dengan indeks yang ditentukan. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Mengembalikan koleksi yang berisi semua namespace yang saat ini dalam lingkup. |
| [GetRemainder](./getremainder/)() | Mengembalikan sisa XML yang di-buffer. |
| [HasLineInfo](./haslineinfo/)() override | Mengembalikan nilai yang menunjukkan apakah kelas dapat mengembalikan informasi baris. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Menyelesaikan awalan ruang nama dalam ruang lingkup elemen saat ini. |
| [MoveToAttribute](./movetoattribute/)(String) override | Berpindah ke atribut dengan nama yang ditentukan. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Berpindah ke atribut dengan nama lokal dan URI ruang nama yang ditentukan. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Berpindah ke atribut dengan indeks yang ditentukan. |
| [MoveToElement](./movetoelement/)() override | Berpindah ke elemen yang berisi node atribut saat ini. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Berpindah ke atribut pertama. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Berpindah ke atribut berikutnya. |
| [Read](./read/)() override | Membaca node berikutnya dari aliran. |
| [ReadAttributeValue](./readattributevalue/)() override | Menganalisis nilai atribut menjadi satu atau lebih **[Text](../../system.text/)**, **EntityReference**, atau **EndEntity** node. |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Mendekode Base64 dan mengembalikan byte biner yang telah didekode. |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Mendekode **BinHex** dan mengembalikan byte biner yang telah didekode. |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | Membaca isi teks elemen ke dalam buffer karakter. Metode ini dirancang untuk membaca aliran teks tersemat yang besar dengan memanggilnya secara berurutan. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Membaca konten dan mengembalikan byte biner yang didekode **Base64**. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Membaca konten dan mengembalikan byte biner yang didekode **BinHex**. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Membaca elemen dan mendekode konten Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Membaca elemen dan mendekode konten **BinHex**. |
| [ReadString](./readstring/)() override | Membaca isi elemen atau node teks sebagai string. |
| [ResetState](./resetstate/)() | Mengatur ulang status pembaca ke [ReadState::Initial](../readstate/). |
| [ResolveEntity](./resolveentity/)() override | Menyelesaikan referensi entitas untuk node **EntityReference**. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Mengatur enumerasi [DtdProcessing](../dtdprocessing/). |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Mengatur nilai yang menentukan bagaimana pembaca menangani entitas. |
| [set_Namespaces](./set_namespaces/)(bool) | Mengatur nilai yang menunjukkan apakah mendukung namespace. |
| [set_Normalization](./set_normalization/)(bool) | Mengatur nilai yang menunjukkan apakah harus menormalkan spasi putih dan nilai atribut. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Mengatur nilai yang menunjukkan apakah memperbolehkan pemrosesan DTD. |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | Mengatur nilai yang menentukan bagaimana spasi putih ditangani. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengatur [XmlResolver](../xmlresolver/) yang digunakan untuk menyelesaikan referensi DTD. |
| [Skip](./skip/)() override | Melewati anak-anak node saat ini. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan aliran yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan URL dan aliran yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan aliran yang ditentukan dan [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan URL, aliran, dan [XmlNameTable](../xmlnametable/) yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan TextReader yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan URL dan TextReader yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan TextReader dan [XmlNameTable](../xmlnametable/) yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan URL, TextReader, dan [XmlNameTable](../xmlnametable/) yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan aliran, [XmlNodeType](../xmlnodetype/), dan [XmlParserContext](../xmlparsercontext/) yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan string, [XmlNodeType](../xmlnodetype/), dan [XmlParserContext](../xmlparsercontext/) yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const String\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan file yang ditentukan. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlTextReader](./) dengan file dan [XmlNameTable](../xmlnametable/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Disarankan untuk menggunakan kelas [XmlReader](../xmlreader/) sebagai gantinya.

Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
