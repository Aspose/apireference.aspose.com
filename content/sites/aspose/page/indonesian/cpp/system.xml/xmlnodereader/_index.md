---
title: "System::Xml::XmlNodeReader kelas"
linktitle: "XmlNodeReader"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::XmlNodeReader. Mewakili pembaca yang menyediakan akses cepat, non-cached, hanya maju ke data XML dalam sebuah XmlNode dalam C++."
type: docs
weight: 2800
url: /id/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


Mewakili pembaca yang menyediakan akses cepat, non-cached, hanya maju ke data XML dalam sebuah [XmlNode](../xmlnode/).

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Mengubah [XmlNodeReader::get_ReadState](./get_readstate/) menjadi [ReadState::Closed](../readstate/). |
| [get_AttributeCount](./get_attributecount/)() override | Mengembalikan jumlah atribut pada node saat ini. |
| [get_BaseURI](./get_baseuri/)() override | Mengembalikan URI dasar dari node saat ini. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Mengembalikan nilai yang menunjukkan apakah [XmlNodeReader](./) mengimplementasikan metode pembacaan konten biner. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Mengembalikan nilai yang menunjukkan apakah pembaca ini dapat mengurai dan menyelesaikan entitas. |
| [get_Depth](./get_depth/)() override | Mengembalikan kedalaman node saat ini dalam dokumen XML. |
| [get_EOF](./get_eof/)() override | Mengembalikan nilai yang menunjukkan apakah pembaca berada pada akhir aliran. |
| [get_HasAttributes](./get_hasattributes/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini memiliki atribut apa pun. |
| [get_HasValue](./get_hasvalue/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini dapat memiliki nilai [XmlNodeReader::get_Value](./get_value/). |
| [get_IsDefault](./get_isdefault/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini adalah atribut yang dihasilkan dari nilai default yang didefinisikan dalam definisi tipe dokumen (DTD) atau skema. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini adalah elemen kosong (misalnya, **<MyElement/>**). |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node saat ini. |
| [get_Name](./get_name/)() override | Mengembalikan nama yang memenuhi syarat dari node saat ini. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Mengembalikan URI ruang nama (seperti yang didefinisikan dalam spesifikasi Namespace W3C) dari node tempat pembaca berada. |
| [get_NameTable](./get_nametable/)() override | Mengembalikan [XmlNameTable](../xmlnametable/) yang terkait dengan implementasi ini. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_Prefix](./get_prefix/)() override | Mengembalikan awalan ruang nama yang terkait dengan node saat ini. |
| [get_ReadState](./get_readstate/)() override | Mengembalikan status pembaca. |
| [get_SchemaInfo](./get_schemainfo/)() override | Mengembalikan informasi skema yang telah ditetapkan ke node saat ini. |
| [get_Value](./get_value/)() override | Mengembalikan nilai teks dari node saat ini. |
| [get_XmlLang](./get_xmllang/)() override | Mengembalikan ruang lingkup **xml:lang** saat ini. |
| [get_XmlSpace](./get_xmlspace/)() override | Mengembalikan ruang lingkup **xml:space** saat ini. |
| [GetAttribute](./getattribute/)(String) override | Mengembalikan nilai atribut dengan nama yang ditentukan. |
| [GetAttribute](./getattribute/)(String, String) override | Mengembalikan nilai atribut dengan nama lokal dan URI ruang nama yang ditentukan. |
| [GetAttribute](./getattribute/)(int32_t) override | Mengembalikan nilai atribut dengan indeks yang ditentukan. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Menyelesaikan awalan ruang nama dalam ruang lingkup elemen saat ini. |
| [MoveToAttribute](./movetoattribute/)(String) override | Berpindah ke atribut dengan nama yang ditentukan. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Berpindah ke atribut dengan nama lokal dan URI ruang nama yang ditentukan. |
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
| [ResolveEntity](./resolveentity/)() override | Menyelesaikan referensi entitas untuk node **EntityReference**. |
| [Skip](./skip/)() override | Melewati anak-anak node saat ini. |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | Membuat instance kelas [XmlNodeReader](./) menggunakan [XmlNode](../xmlnode/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
