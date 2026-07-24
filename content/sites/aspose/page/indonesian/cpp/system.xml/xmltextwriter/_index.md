---
title: "Kelas System::Xml::XmlTextWriter"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlTextWriter. Mewakili penulis yang menyediakan cara cepat, tidak ter-cache, hanya maju untuk menghasilkan aliran atau berkas yang berisi data XML yang mematuhi W3C Extensible Markup Language (XML) 1.0 dan rekomendasi Namespaces in XML dalam C++."
type: docs
weight: 4000
url: /id/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


Mewakili penulis yang menyediakan cara cepat, tidak ter-cache, hanya maju untuk menghasilkan aliran atau file yang berisi data XML yang sesuai dengan W3C Extensible Markup Language (XML) 1.0 dan rekomendasi Namespaces in XML.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Menutup aliran ini dan aliran dasar. |
| [Flush](./flush/)() override | Mengosongkan apa pun yang ada di buffer ke aliran dasar dan juga mengosongkan aliran dasar. |
| [get_BaseStream](./get_basestream/)() | Mengembalikan objek aliran dasar. |
| [get_Formatting](./get_formatting/)() | Menunjukkan bagaimana output diformat. |
| [get_Indentation](./get_indentation/)() | Mengembalikan berapa banyak IndentChars yang ditulis untuk setiap level dalam hierarki ketika [XmlTextWriter::set_Formatting](./set_formatting/) diatur ke [Formatting::Indented](../formatting/). |
| [get_IndentChar](./get_indentchar/)() | Mengembalikan karakter yang digunakan untuk indentasi ketika [XmlTextWriter::set_Formatting](./set_formatting/) diatur ke [Formatting::Indented](../formatting/). |
| [get_Namespaces](./get_namespaces/)() | Mengembalikan nilai yang menunjukkan apakah dukungan namespace diaktifkan. |
| [get_QuoteChar](./get_quotechar/)() | Mengembalikan karakter yang digunakan untuk mengutip nilai atribut. |
| [get_WriteState](./get_writestate/)() override | Mengembalikan status penulis. |
| [get_XmlLang](./get_xmllang/)() override | Mengembalikan ruang lingkup **xml:lang** saat ini. |
| [get_XmlSpace](./get_xmlspace/)() override | Mengembalikan sebuah [XmlSpace](../xmlspace/) yang mewakili ruang lingkup **xml:space** saat ini. |
| [LookupPrefix](./lookupprefix/)(String) override | Mengembalikan prefiks terdekat yang didefinisikan dalam ruang lingkup namespace saat ini untuk URI namespace. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | Menunjukkan bagaimana output diformat. |
| [set_Indentation](./set_indentation/)(int32_t) | Mengatur berapa banyak IndentChars yang ditulis untuk setiap level dalam hierarki ketika [XmlTextWriter::set_Formatting](./set_formatting/) diatur ke [Formatting::Indented](../formatting/). |
| [set_IndentChar](./set_indentchar/)(char16_t) | Mengatur karakter yang digunakan untuk indentasi ketika [XmlTextWriter::set_Formatting](./set_formatting/) diatur ke [Formatting::Indented](../formatting/). |
| [set_Namespaces](./set_namespaces/)(bool) | Mengatur nilai yang menunjukkan apakah mendukung namespace. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | Mengatur karakter yang akan digunakan untuk mengutip nilai atribut. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Mengkode byte biner yang ditentukan sebagai base64 dan menulis teks hasilnya. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Mengkode byte biner yang ditentukan sebagai binhex dan menulis teks hasilnya. |
| [WriteCData](./writecdata/)(String) override | Menulis blok **...** yang berisi teks yang ditentukan. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | Memaksa pembuatan entitas karakter untuk nilai karakter Unicode yang ditentukan. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Menulis teks satu buffer pada satu waktu. |
| [WriteComment](./writecomment/)(String) override | Menulis komentar **** yang berisi teks yang ditentukan. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | Menulis deklarasi DOCTYPE dengan nama yang ditentukan dan atribut opsional. |
| [WriteEndAttribute](./writeendattribute/)() override | Menutup pemanggilan [XmlTextWriter::WriteStartAttribute](./writestartattribute/) sebelumnya. |
| [WriteEndDocument](./writeenddocument/)() override | Menutup semua elemen atau atribut yang terbuka dan mengembalikan penulis ke keadaan Start. |
| [WriteEndElement](./writeendelement/)() override | Menutup satu elemen dan mengeluarkan ruang nama yang bersesuaian. |
| [WriteEntityRef](./writeentityref/)(const String\&) override | Menulis referensi entitas sebagai **&name**;. |
| [WriteFullEndElement](./writefullendelement/)() override | Menutup satu elemen dan mengeluarkan ruang nama yang bersesuaian. |
| [WriteName](./writename/)(const String\&) override | Menulis nama yang ditentukan, memastikan itu adalah nama yang valid menurut [rekomendasi W3C XML 1.0](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteNmToken](./writenmtoken/)(const String\&) override | Menulis nama yang ditentukan, memastikan itu adalah **NmToken** yang valid menurut [rekomendasi W3C XML 1.0](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | Menulis instruksi pemrosesan dengan spasi antara nama dan teks sebagai berikut: **<?name text?>**. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | Menulis nama yang memenuhi namespace. Metode ini mencari prefiks yang berada dalam cakupan untuk namespace yang diberikan. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Menulis markup mentah secara manual dari buffer karakter. |
| [WriteRaw](./writeraw/)(const String\&) override | Menulis markup mentah secara manual dari string. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | Menulis awal atribut. |
| [WriteStartDocument](./writestartdocument/)() override | Menulis deklarasi XML dengan versi "1.0". |
| [WriteStartDocument](./writestartdocument/)(bool) override | Menulis deklarasi XML dengan versi "1.0" dan atribut standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | Menulis tag pembuka yang ditentukan dan mengaitkannya dengan namespace serta prefiks yang diberikan. |
| [WriteString](./writestring/)(const String\&) override | Menulis konten teks yang diberikan. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | Membuat dan menulis entitas karakter surrogate untuk pasangan karakter surrogate. |
| [WriteWhitespace](./writewhitespace/)(String) override | Menulis spasi putih yang diberikan. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Membuat instance kelas [XmlTextWriter](./) menggunakan aliran dan enkoding yang ditentukan. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | Membuat instance kelas [XmlTextWriter](./) menggunakan file yang ditentukan. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | Membuat instance kelas [XmlTextWriter](./) menggunakan TextWriter yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Disarankan untuk menggunakan kelas [XmlWriter](../xmlwriter/) sebagai gantinya.

Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
