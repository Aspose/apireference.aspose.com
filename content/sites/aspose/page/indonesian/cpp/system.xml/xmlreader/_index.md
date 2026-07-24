---
title: "System::Xml::XmlReader class"
linktitle: "XmlReader"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader class. Mewakili pembaca yang menyediakan akses cepat, tidak tercache, hanya maju ke data XML dalam C++."
type: docs
weight: 3300
url: /id/cpp/system.xml/xmlreader/
---
## XmlReader class


Mewakili pembaca yang menyediakan akses cepat, tidak ter-cache, hanya maju ke data XML.

```cpp
class XmlReader : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Close](./close/)() | Ketika dioverride dalam kelas turunan, mengubah [XmlReader::get_ReadState](./get_readstate/) menjadi [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | Membuat sebuah instance baru [XmlReader](./) dengan URI yang ditentukan. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan URI dan pengaturan yang ditentukan. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan URI, pengaturan, dan informasi konteks untuk parsing yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan stream yang ditentukan dengan pengaturan default. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Membuat sebuah instance baru [XmlReader](./) dengan stream dan pengaturan yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan stream, URI dasar, dan pengaturan yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan stream, pengaturan, dan informasi konteks untuk parsing yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan pembaca teks yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan pembaca teks dan pengaturan yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan pembaca teks, pengaturan, dan URI dasar yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan pembaca teks, pengaturan, dan informasi konteks untuk parsing yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Membuat sebuah instance baru [XmlReader](./) dengan menggunakan pembaca XML dan pengaturan yang ditentukan. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh instance [XmlReader](./) saat ini. |
| virtual [get_AttributeCount](./get_attributecount/)() | Saat ditimpa dalam kelas turunan, mendapatkan jumlah atribut pada node saat ini. |
| virtual [get_BaseURI](./get_baseuri/)() | Saat ditimpa dalam kelas turunan, mendapatkan URI dasar dari node saat ini. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | Mengembalikan nilai yang menunjukkan apakah [XmlReader](./) mengimplementasikan metode pembacaan konten biner. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | Mengembalikan nilai yang menunjukkan apakah [XmlReader](./) mengimplementasikan metode [XmlReader::ReadValueChunk](./readvaluechunk/). |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Mengembalikan nilai yang menunjukkan apakah pembaca ini dapat mengurai dan menyelesaikan entitas. |
| virtual [get_Depth](./get_depth/)() | Saat ditimpa dalam kelas turunan, mendapatkan kedalaman node saat ini dalam dokumen XML. |
| virtual [get_EOF](./get_eof/)() | Saat ditimpa dalam kelas turunan, mendapatkan nilai yang menunjukkan apakah pembaca berada pada akhir aliran. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Mengembalikan nilai yang menunjukkan apakah node saat ini memiliki atribut apa pun. |
| virtual [get_HasValue](./get_hasvalue/)() | Saat ditimpa dalam kelas turunan, mendapatkan nilai yang menunjukkan apakah node saat ini dapat memiliki nilai [XmlReader::get_Value](./get_value/). |
| virtual [get_IsDefault](./get_isdefault/)() | Saat ditimpa dalam kelas turunan, mendapatkan nilai yang menunjukkan apakah node saat ini adalah atribut yang dihasilkan dari nilai default yang didefinisikan dalam DTD atau skema. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Saat ditimpa dalam kelas turunan, mendapatkan nilai yang menunjukkan apakah node saat ini adalah elemen kosong (misalnya, **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | Saat ditimpa dalam kelas turunan, mendapatkan nama lokal node saat ini. |
| virtual [get_Name](./get_name/)() | Saat ditimpa dalam kelas turunan, mendapatkan nama yang memenuhi syarat (qualified) dari node saat ini. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Saat ditimpa dalam kelas turunan, mendapatkan URI namespace (seperti yang didefinisikan dalam spesifikasi Namespace W3C) dari node tempat pembaca berada. |
| virtual [get_NameTable](./get_nametable/)() | Saat ditimpa dalam kelas turunan, mengambil [XmlNameTable](../xmlnametable/) yang terkait dengan implementasi ini. |
| virtual [get_NodeType](./get_nodetype/)() | Saat ditimpa dalam kelas turunan, mengambil tipe node saat ini. |
| virtual [get_Prefix](./get_prefix/)() | Saat ditimpa dalam kelas turunan, mengambil awalan ruang nama yang terkait dengan node saat ini. |
| virtual [get_QuoteChar](./get_quotechar/)() | Saat ditimpa dalam kelas turunan, mengambil karakter tanda kutip yang digunakan untuk mengelilingi nilai node atribut. |
| virtual [get_ReadState](./get_readstate/)() | Saat ditimpa dalam kelas turunan, mengambil status pembaca. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Mengembalikan informasi skema yang telah diberikan ke node saat ini sebagai hasil dari validasi skema. |
| virtual [get_Settings](./get_settings/)() | Mengembalikan objek [XmlReaderSettings](../xmlreadersettings/) yang digunakan untuk membuat instance [XmlReader](./) ini. |
| virtual [get_Value](./get_value/)() | Saat ditimpa dalam kelas turunan, mengambil nilai teks dari node saat ini. |
| virtual [get_ValueType](./get_valuetype/)() | Mengembalikan tipe untuk node saat ini. |
| virtual [get_XmlLang](./get_xmllang/)() | Saat ditimpa dalam kelas turunan, mengambil ruang lingkup **xml:lang** saat ini. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Saat ditimpa dalam kelas turunan, mengambil ruang lingkup **xml:space** saat ini. |
| virtual [GetAttribute](./getattribute/)(String) | Saat ditimpa dalam kelas turunan, mengambil nilai atribut dengan nilai [XmlReader::get_Name](./get_name/) yang ditentukan. |
| virtual [GetAttribute](./getattribute/)(String, String) | Saat ditimpa dalam kelas turunan, mengambil nilai atribut dengan nilai [XmlReader::get_LocalName](./get_localname/) dan [XmlReader::get_NamespaceURI](./get_namespaceuri/) yang ditentukan. |
| virtual [GetAttribute](./getattribute/)(int32_t) | Saat ditimpa dalam kelas turunan, mengambil nilai atribut dengan indeks yang ditentukan. |
| virtual [idx_get](./idx_get/)(int32_t) | Saat ditimpa dalam kelas turunan, mengambil nilai atribut dengan indeks yang ditentukan. |
| virtual [idx_get](./idx_get/)(String) | Saat ditimpa dalam kelas turunan, mengambil nilai atribut dengan nilai [XmlReader::get_Name](./get_name/) yang ditentukan. |
| virtual [idx_get](./idx_get/)(String, String) | Saat ditimpa dalam kelas turunan, mengambil nilai atribut dengan nilai [XmlReader::get_LocalName](./get_localname/) dan [XmlReader::get_NamespaceURI](./get_namespaceuri/) yang ditentukan. |
| static [IsName](./isname/)(const String\&) | Mengembalikan nilai yang menunjukkan apakah argumen string merupakan nama XML yang valid. |
| static [IsNameToken](./isnametoken/)(const String\&) | Mengembalikan nilai yang menunjukkan apakah argumen string merupakan token nama XML yang valid atau tidak. |
| virtual [IsStartElement](./isstartelement/)() | Memanggil [XmlReader::MoveToContent](./movetocontent/) dan menguji apakah node konten saat ini adalah tag pembuka atau tag elemen kosong. |
| virtual [IsStartElement](./isstartelement/)(String) | Memanggil [XmlReader::MoveToContent](./movetocontent/) dan menguji apakah node konten saat ini adalah tag pembuka atau tag elemen kosong serta apakah nilai [XmlReader::get_Name](./get_name/) dari elemen yang ditemukan cocok dengan argumen yang diberikan. |
| virtual [IsStartElement](./isstartelement/)(String, String) | Memanggil [XmlReader::MoveToContent](./movetocontent/) dan menguji apakah node konten saat ini adalah tag pembuka atau tag elemen kosong serta apakah nilai [XmlReader::get_LocalName](./get_localname/) dan [XmlReader::get_NamespaceURI](./get_namespaceuri/) dari elemen yang ditemukan cocok dengan string yang diberikan. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Saat ditimpa dalam kelas turunan, menyelesaikan awalan ruang nama dalam ruang lingkup elemen saat ini. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | Saat ditimpa dalam kelas turunan, berpindah ke atribut dengan nilai [XmlReader::get_Name](./get_name/) yang ditentukan. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Saat ditimpa dalam kelas turunan, berpindah ke atribut dengan nilai [XmlReader::get_LocalName](./get_localname/) dan [XmlReader::get_NamespaceURI](./get_namespaceuri/) yang ditentukan. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | Saat ditimpa dalam kelas turunan, berpindah ke atribut dengan indeks yang ditentukan. |
| virtual [MoveToContent](./movetocontent/)() | Memeriksa apakah node saat ini adalah node konten (teks non-spasi putih, **CDATA**, **Element**, **EndElement**, **EntityReference**, atau **EndEntity**). Jika node bukan node konten, pembaca melompati ke node konten berikutnya atau akhir berkas. Ia melompati node dengan tipe berikut: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, atau **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | Saat ditimpa dalam kelas turunan, berpindah ke elemen yang berisi node atribut saat ini. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Saat ditimpa dalam kelas turunan, bergerak ke atribut pertama. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Saat ditimpa dalam kelas turunan, bergerak ke atribut berikutnya. |
| virtual [Read](./read/)() | Saat ditimpa dalam kelas turunan, membaca node berikutnya dari aliran. |
| virtual [ReadAttributeValue](./readattributevalue/)() | Saat ditimpa dalam kelas turunan, mengurai nilai atribut menjadi satu atau lebih node **[Text](../../system.text/)**, **EntityReference**, atau **EndEntity**. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Membaca konten sebagai objek dari tipe yang ditentukan. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Membaca konten dan mengembalikan byte biner yang didekodekan Base64. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Membaca konten dan mengembalikan byte biner yang didekode **BinHex**. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Membaca konten teks pada posisi saat ini sebagai [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Membaca konten teks pada posisi saat ini sebagai objek [DateTime](../../system/datetime/). |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Membaca konten teks pada posisi saat ini sebagai objek [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Membaca konten teks pada posisi saat ini sebagai objek [Decimal](../../system/decimal/). |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Membaca konten teks pada posisi saat ini sebagai angka floating-point double presisi. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Membaca konten teks pada posisi saat ini sebagai angka floating-point single presisi. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Membaca konten teks pada posisi saat ini sebagai integer bertanda 32-bit. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Membaca konten teks pada posisi saat ini sebagai integer bertanda 64-bit. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Membaca konten teks pada posisi saat ini sebagai [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | Membaca konten teks pada posisi saat ini sebagai objek [String](../../system/string/). |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Membaca konten elemen sebagai tipe yang diminta. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Memeriksa bahwa nama lokal dan URI namespace yang ditentukan cocok dengan elemen saat ini, kemudian membaca konten elemen sebagai tipe yang diminta. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Membaca elemen dan mendekode konten **Base64**. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Membaca elemen dan mendekode konten **BinHex**. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Membaca elemen saat ini dan mengembalikan kontennya sebagai objek [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Memeriksa bahwa nama lokal dan URI namespace yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan kontennya sebagai objek [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Membaca elemen saat ini dan mengembalikan kontennya sebagai objek [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Memeriksa bahwa nama lokal dan URI namespace yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan kontennya sebagai objek [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Membaca elemen saat ini dan mengembalikan kontennya sebagai objek [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Memeriksa bahwa nama lokal dan URI namespace yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan kontennya sebagai objek [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Membaca elemen saat ini dan mengembalikan kontennya sebagai angka floating-point double presisi. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Memeriksa bahwa nama lokal dan URI ruang nama yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan isinya sebagai angka floating-point presisi ganda. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Membaca elemen saat ini dan mengembalikan isinya sebagai angka floating-point presisi tunggal. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Memeriksa bahwa nama lokal dan URI ruang nama yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan isinya sebagai angka floating-point presisi tunggal. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Membaca elemen saat ini dan mengembalikan isinya sebagai integer bertanda 32-bit. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Memeriksa bahwa nama lokal dan URI ruang nama yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan isinya sebagai integer bertanda 32-bit. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Membaca elemen saat ini dan mengembalikan isinya sebagai integer bertanda 64-bit. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Memeriksa bahwa nama lokal dan URI ruang nama yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan isinya sebagai integer bertanda 64-bit. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Membaca elemen saat ini dan mengembalikan isinya sebagai sebuah [Object](../../system/object/). |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Memeriksa bahwa nama lokal dan URI ruang nama yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan isinya sebagai sebuah [Object](../../system/object/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Membaca elemen saat ini dan mengembalikan isinya sebagai objek [String](../../system/string/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Memeriksa bahwa nama lokal dan URI ruang nama yang ditentukan cocok dengan elemen saat ini, kemudian membaca elemen saat ini dan mengembalikan isinya sebagai objek [String](../../system/string/). |
| virtual [ReadElementString](./readelementstring/)() | Membaca elemen yang hanya berisi teks. Namun, disarankan untuk menggunakan metode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) sebagai gantinya, karena metode tersebut memberikan cara yang lebih langsung untuk menangani operasi ini. |
| virtual [ReadElementString](./readelementstring/)(String) | Memeriksa bahwa nilai [XmlReader::get_Name](./get_name/) dari elemen yang ditemukan cocok dengan string yang diberikan sebelum membaca elemen yang hanya berisi teks. Namun, disarankan untuk menggunakan metode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) sebagai gantinya, karena metode tersebut memberikan cara yang lebih langsung untuk menangani operasi ini. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Memeriksa bahwa nilai [XmlReader::get_LocalName](./get_localname/) dan [XmlReader::get_NamespaceURI](./get_namespaceuri/) dari elemen yang ditemukan cocok dengan string yang diberikan sebelum membaca elemen yang hanya berisi teks. Namun, disarankan untuk menggunakan metode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) sebagai gantinya, karena metode tersebut memberikan cara yang lebih langsung untuk menangani operasi ini. |
| virtual [ReadEndElement](./readendelement/)() | Memeriksa bahwa node konten saat ini adalah tag penutup dan memajukan pembaca ke node berikutnya. |
| virtual [ReadInnerXml](./readinnerxml/)() | Ketika dioverride dalam kelas turunan, membaca semua konten, termasuk markup, sebagai string. |
| virtual [ReadOuterXml](./readouterxml/)() | Ketika dioverride dalam kelas turunan, membaca konten, termasuk markup, yang mewakili node ini dan semua anaknya. |
| virtual [ReadStartElement](./readstartelement/)() | Memeriksa bahwa node saat ini adalah elemen dan memajukan pembaca ke node berikutnya. |
| virtual [ReadStartElement](./readstartelement/)(String) | Memeriksa bahwa node konten saat ini adalah elemen dengan nilai [XmlReader::get_Name](./get_name/) yang diberikan dan memajukan pembaca ke node berikutnya. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Memeriksa bahwa node konten saat ini adalah elemen dengan nilai [XmlReader::get_LocalName](./get_localname/) dan [XmlReader::get_NamespaceURI](./get_namespaceuri/) yang diberikan serta memajukan pembaca ke node berikutnya. |
| virtual [ReadString](./readstring/)() | Ketika dioverride dalam kelas turunan, membaca isi elemen atau node teks sebagai string. Namun, disarankan untuk menggunakan metode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) sebagai gantinya, karena metode tersebut memberikan cara yang lebih langsung untuk menangani operasi ini. |
| virtual [ReadSubtree](./readsubtree/)() | Mengembalikan sebuah instance [XmlReader](./) baru yang dapat digunakan untuk membaca node saat ini, dan semua turunannya. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | Meneruskan [XmlReader](./) ke elemen keturunan berikutnya dengan nama yang memenuhi kualifikasi yang ditentukan. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | Meneruskan [XmlReader](./) ke elemen keturunan berikutnya dengan nama lokal dan URI ruang nama yang ditentukan. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Membaca sampai sebuah elemen dengan nama yang memenuhi kualifikasi yang ditentukan ditemukan. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Membaca sampai sebuah elemen dengan nama lokal dan URI namespace yang ditentukan ditemukan. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | Meneruskan [XmlReader](./) ke elemen saudara berikutnya dengan nama terkualifikasi yang ditentukan. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | Meneruskan [XmlReader](./) ke elemen saudara berikutnya dengan nama lokal dan URI namespace yang ditentukan. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Membaca aliran teks besar yang tertanam dalam dokumen XML. |
| virtual [ResolveEntity](./resolveentity/)() | Ketika dioverride dalam kelas turunan, menyelesaikan referensi entitas untuk node **EntityReference**. |
| virtual [Skip](./skip/)() | Melewati anak-anak node saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
