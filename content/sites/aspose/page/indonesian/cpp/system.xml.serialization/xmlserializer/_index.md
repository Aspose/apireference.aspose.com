---
title: "System::Xml::Serialization::XmlSerializer kelas"
linktitle: "XmlSerializer"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Serialization::XmlSerializer kelas. Melakukan serialisasi dan deserialisasi objek ke dan dari dokumen XML. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen di C++."
type: docs
weight: 600
url: /id/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Melakukan serialisasi dan deserialisasi objek ke dan dari dokumen XML. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class XmlSerializer : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Memeriksa apakah pembaca tertentu berada dalam keadaan dapat dideserialisasi. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | Mendeserialisasi dokumen XML menjadi objek. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | Mendeserialisasi dokumen XML menjadi objek. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | Mendeserialisasi dokumen XML menjadi objek. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | Mendeserialisasi dokumen XML menjadi objek. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | Menyerialkan dokumen menjadi XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | Menyerialkan dokumen menjadi XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | Menyerialkan dokumen menjadi XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Menyerialkan dokumen menjadi XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Menyerialkan dokumen menjadi XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Menyerialkan dokumen menjadi XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | Menyerialkan dokumen menjadi XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | Menyerialkan dokumen menjadi XML. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | Menyandikan nama ruang nama. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | Nama ruang nama tipe WSDL. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
