---
title: "System::Xml::XmlWriter kelas"
linktitle: "XmlWriter"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlWriter. Mewakili penulis yang menyediakan cara cepat, tidak ter-cache, hanya maju untuk menghasilkan aliran atau file yang berisi data XML dalam C++."
type: docs
weight: 4400
url: /id/cpp/system.xml/xmlwriter/
---
## XmlWriter class


Mewakili penulis yang menyediakan cara cepat, tidak ter-cache, hanya maju untuk menghasilkan aliran atau file yang berisi data XML.

```cpp
class XmlWriter : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Close](./close/)() | Saat dioverride dalam kelas turunan, menutup aliran ini dan aliran dasar. |
| static [Create](./create/)(const String\&) | Membuat sebuah instance [XmlWriter](./) baru menggunakan nama file yang ditentukan. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | Membuat sebuah instance [XmlWriter](./) baru menggunakan nama file dan objek [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Membuat sebuah instance [XmlWriter](./) baru menggunakan aliran yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | Membuat sebuah instance [XmlWriter](./) baru menggunakan aliran dan objek [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | Membuat sebuah instance [XmlWriter](./) baru menggunakan TextWriter yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Membuat sebuah instance [XmlWriter](./) baru menggunakan TextWriter dan objek-objek [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | Membuat sebuah instance [XmlWriter](./) baru menggunakan [Text::StringBuilder](../../system.text/stringbuilder/) yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | Membuat sebuah instance [XmlWriter](./) baru menggunakan [Text::StringBuilder](../../system.text/stringbuilder/) dan objek-objek [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | Membuat sebuah instance [XmlWriter](./) baru menggunakan objek [XmlWriter](./) yang ditentukan. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Membuat sebuah instance [XmlWriter](./) baru menggunakan objek [XmlWriter](./) dan [XmlWriterSettings](../xmlwritersettings/) yang ditentukan. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh instance [XmlWriter](./) kelas saat ini. |
| virtual [Flush](./flush/)() | Saat dioverride dalam kelas turunan, mengosongkan apa pun yang ada di buffer ke aliran dasar dan juga mengosongkan aliran dasar. |
| virtual [get_Settings](./get_settings/)() | Mengembalikan objek [XmlWriterSettings](../xmlwritersettings/) yang digunakan untuk membuat instance [XmlWriter](./) ini. |
| virtual [get_WriteState](./get_writestate/)() | Saat dioverride dalam kelas turunan, mendapatkan status penulis. |
| virtual [get_XmlLang](./get_xmllang/)() | Saat ditimpa dalam kelas turunan, mengambil ruang lingkup **xml:lang** saat ini. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Saat dioverride dalam kelas turunan, mendapatkan sebuah [XmlSpace](../xmlspace/) yang mewakili ruang lingkup **xml:space** saat ini. |
| virtual [LookupPrefix](./lookupprefix/)(String) | Saat dioverride dalam kelas turunan, mengembalikan prefiks terdekat yang didefinisikan dalam ruang lingkup namespace saat ini untuk URI namespace. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | Saat dioverride dalam kelas turunan, menulis semua atribut yang ditemukan pada posisi saat ini dalam [XmlReader](../xmlreader/). |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | Saat dioverride dalam kelas turunan, menulis sebuah atribut dengan nama lokal, URI namespace, dan nilai yang ditentukan. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | Saat dioverride dalam kelas turunan, menulis atribut dengan nama lokal dan nilai yang ditentukan. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | Saat dioverride dalam kelas turunan, menulis atribut dengan prefiks, nama lokal, URI namespace, dan nilai yang ditentukan. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Saat dioverride dalam kelas turunan, mengkodekan byte biner yang ditentukan sebagai Base64 dan menulis teks yang dihasilkan. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Saat dioverride dalam kelas turunan, mengkodekan byte biner yang ditentukan sebagai **BinHex** dan menulis teks yang dihasilkan. |
| virtual [WriteCData](./writecdata/)(String) | Ketika dioverride dalam kelas turunan, menulis blok **...** yang berisi teks yang ditentukan. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | Ketika dioverride dalam kelas turunan, memaksa pembuatan entitas karakter untuk nilai Unicode yang ditentukan. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Ketika dioverride dalam kelas turunan, menulis teks satu buffer pada satu waktu. |
| virtual [WriteComment](./writecomment/)(String) | Ketika dioverride dalam kelas turunan, menulis komentar **** yang berisi teks yang ditentukan. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | Ketika dioverride dalam kelas turunan, menulis deklarasi DOCTYPE dengan nama yang ditentukan dan atribut opsional. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | Menulis elemen dengan nama lokal yang ditentukan dan nilai. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | Menulis elemen dengan nama lokal, URI ruang nama, dan nilai yang ditentukan. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | Menulis elemen dengan awalan, nama lokal, URI ruang nama, dan nilai yang ditentukan. |
| virtual [WriteEndAttribute](./writeendattribute/)() | Ketika dioverride dalam kelas turunan, menutup pemanggilan XmlWriter::WriteStartAttribute(String,String) sebelumnya. |
| virtual [WriteEndDocument](./writeenddocument/)() | Ketika dioverride dalam kelas turunan, menutup semua elemen atau atribut yang terbuka dan mengembalikan penulis ke keadaan Start. |
| virtual [WriteEndElement](./writeendelement/)() | Ketika dioverride dalam kelas turunan, menutup satu elemen dan mengeluarkan ruang nama yang bersesuaian. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | Ketika dioverride dalam kelas turunan, menulis referensi entitas sebagai **&name**;. |
| virtual [WriteFullEndElement](./writefullendelement/)() | Ketika dioverride dalam kelas turunan, menutup satu elemen dan mengeluarkan ruang nama yang bersesuaian. |
| virtual [WriteName](./writename/)(const String\&) | Ketika dioverride dalam kelas turunan, menulis nama yang ditentukan, memastikan bahwa itu adalah nama yang valid menurut rekomendasi W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | Ketika dioverride dalam kelas turunan, menulis nama yang ditentukan, memastikan bahwa itu adalah NmToken yang valid menurut rekomendasi W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | Ketika dioverride dalam kelas turunan, menyalin semua dari pembaca ke penulis dan memindahkan pembaca ke awal saudara berikutnya. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | Menyalin semua dari objek XPathNavigator ke penulis. Posisi XPathNavigator tetap tidak berubah. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | Ketika dioverride dalam kelas turunan, menulis instruksi pemrosesan dengan spasi antara nama dan teks sebagai berikut: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | Ketika dioverride dalam kelas turunan, menulis nama yang memenuhi ruang nama. Metode ini mencari awalan yang berada dalam cakupan untuk ruang nama yang diberikan. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Ketika dioverride dalam kelas turunan, menulis markup mentah secara manual dari buffer karakter. |
| virtual [WriteRaw](./writeraw/)(const String\&) | Ketika dioverride dalam kelas turunan, menulis markup mentah secara manual dari string. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | Menulis awal atribut dengan nama lokal dan URI ruang nama yang ditentukan. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | Ketika dioverride dalam kelas turunan, menulis awal atribut dengan awalan, nama lokal, dan URI ruang nama yang ditentukan. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | Menulis awal atribut dengan nama lokal yang ditentukan. |
| virtual [WriteStartDocument](./writestartdocument/)() | Ketika dioverride dalam kelas turunan, menulis deklarasi XML dengan versi \"1.0\". |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | Ketika dioverride dalam kelas turunan, menulis deklarasi XML dengan versi \"1.0\" dan atribut standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | Ketika dioverride dalam kelas turunan, menulis tag pembuka yang ditentukan dan mengaitkannya dengan namespace yang diberikan. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | Ketika dioverride dalam kelas turunan, menulis tag pembuka yang ditentukan dan mengaitkannya dengan namespace serta prefiks yang diberikan. |
| [WriteStartElement](./writestartelement/)(const String\&) | Ketika dioverride dalam kelas turunan, menulis tag pembuka dengan nama lokal yang ditentukan. |
| virtual [WriteString](./writestring/)(const String\&) | Ketika dioverride dalam kelas turunan, menulis konten teks yang diberikan. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | Ketika dioverride dalam kelas turunan, menghasilkan dan menulis entitas karakter surrogate untuk pasangan karakter surrogate. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | Menulis nilai objek. |
| virtual [WriteValue](./writevalue/)(const String\&) | Menulis nilai [String](../../system/string/). |
| virtual [WriteValue](./writevalue/)(bool) | Menulis nilai [Boolean](../../system/boolean/). |
| virtual [WriteValue](./writevalue/)(DateTime) | Menulis nilai [DateTime](../../system/datetime/). |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | Menulis nilai [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [WriteValue](./writevalue/)(double) | Menulis nilai [Double](../../system/double/). |
| virtual [WriteValue](./writevalue/)(float) | Menulis angka floating-point presisi tunggal. |
| virtual [WriteValue](./writevalue/)(Decimal) | Menulis nilai [Decimal](../../system/decimal/). |
| virtual [WriteValue](./writevalue/)(int32_t) | Menulis nilai [Int32](../../system/int32/). |
| virtual [WriteValue](./writevalue/)(int64_t) | Menulis nilai [Int64](../../system/int64/). |
| virtual [WriteWhitespace](./writewhitespace/)(String) | Ketika dioverride dalam kelas turunan, menulis spasi putih yang diberikan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
