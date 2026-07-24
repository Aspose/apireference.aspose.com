---
title: "Kelas System::Xml::XmlConvert"
linktitle: "XmlConvert"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlConvert. Mengkodekan dan mendekode nama XML, serta menyediakan metode untuk mengonversi antara tipe runtime dan tipe bahasa definisi skema XML (XSD). Saat mengonversi tipe data, nilai yang dikembalikan tidak bergantung pada locale dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.xml/xmlconvert/
---
## XmlConvert class


Mengkodekan dan mendekode nama XML, serta menyediakan metode untuk mengonversi antara tipe runtime dan tipe bahasa definisi [Schema](../../system.xml.schema/) XML (XSD). Saat mengonversi tipe data, nilai yang dikembalikan tidak bergantung pada locale.

```cpp
class XmlConvert : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | Mendekode sebuah nama. Metode ini melakukan kebalikan dari metode XmlConvert::EncodeName(String) dan XmlConvert::EncodeLocalName(String). |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | Mengonversi nama menjadi nama lokal XML yang valid. |
| static [EncodeName](./encodename/)(const String\&) | Mengonversi nama menjadi nama XML yang valid. |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | Memverifikasi bahwa nama valid menurut spesifikasi XML. |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | Memeriksa apakah karakter yang diberikan merupakan tipe karakter non-titik dua yang valid. |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | Mengembalikan instance karakter yang diberikan jika karakter dalam argumen merupakan karakter id publik yang valid, jika tidak **nullptr**. |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | Memeriksa apakah karakter yang diberikan merupakan tipe Karakter Nama Awal yang valid. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | Memeriksa apakah karakter yang diberikan adalah karakter spasi putih XML yang valid. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | Memeriksa apakah karakter yang diberikan adalah karakter XML yang valid. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | Memeriksa apakah pasangan surrogate karakter yang diberikan adalah karakter XML yang valid. |
| static [ToBoolean](./toboolean/)(String) | Mengonversi [String](../../system/string/) menjadi ekivalen [Boolean](../../system/boolean/). |
| static [ToByte](./tobyte/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [Byte](../../system/byte/). |
| static [ToChar](./tochar/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [Char](../../system/char/). |
| static [ToDateTime](./todatetime/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | Mengonversi [String](../../system/string/) menjadi [DateTime](../../system/datetime/) menggunakan [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) yang ditentukan. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | Mengonversi [String](../../system/string/) yang disediakan menjadi ekivalen [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | Mengonversi [String](../../system/string/) yang disediakan menjadi ekivalen [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | Mengonversi [String](../../system/string/) yang disediakan menjadi ekivalen [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDecimal](./todecimal/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [Decimal](../../system/decimal/). |
| static [ToDouble](./todouble/)(String) | Mengonversi [String](../../system/string/) menjadi ekivalen [Double](../../system/double/). |
| static [ToGuid](./toguid/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [Guid](../../system/guid/). |
| static [ToInt16](./toint16/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [Int16](../../system/int16/). |
| static [ToInt32](./toint32/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [Int32](../../system/int32/). |
| static [ToInt64](./toint64/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [Int64](../../system/int64/). |
| static [ToSByte](./tosbyte/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [SByte](../../system/sbyte/). |
| static [ToSingle](./tosingle/)(String) | Mengonversi [String](../../system/string/) menjadi ekivalen [Single](../../system/single/). |
| static [ToString](./tostring/)(bool) | Mengonversi [Boolean](../../system/boolean/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(char16_t) | Mengonversi [Char](../../system/char/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(Decimal) | Mengonversi [Decimal](../../system/decimal/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(int8_t) | Mengonversi [SByte](../../system/sbyte/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(int16_t) | Mengonversi [Int16](../../system/int16/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(int32_t) | Mengonversi [Int32](../../system/int32/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(int64_t) | Mengonversi [Int64](../../system/int64/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(uint8_t) | Mengonversi [Byte](../../system/byte/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(uint16_t) | Mengonversi [UInt16](../../system/uint16/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(uint32_t) | Mengonversi [UInt32](../../system/uint32/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(uint64_t) | Mengonversi [UInt64](../../system/uint64/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(float) | Mengonversi [Single](../../system/single/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(double) | Mengonversi [Double](../../system/double/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(TimeSpan) | Mengonversi [TimeSpan](../../system/timespan/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime) | Mengonversi [DateTime](../../system/datetime/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, const String\&) | Mengonversi [DateTime](../../system/datetime/) menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | Mengonversi [DateTime](../../system/datetime/) menjadi [String](../../system/string/) menggunakan [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) yang ditentukan. |
| static [ToString](./tostring/)(DateTimeOffset) | Mengonversi [DateTimeOffset](../../system/datetimeoffset/) yang diberikan menjadi [String](../../system/string/). |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | Mengonversi [DateTimeOffset](../../system/datetimeoffset/) yang diberikan menjadi [String](../../system/string/) dalam format yang ditentukan. |
| static [ToString](./tostring/)(Guid) | Mengonversi [Guid](../../system/guid/) menjadi [String](../../system/string/). |
| static [ToTimeSpan](./totimespan/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [TimeSpan](../../system/timespan/). |
| static [ToUInt16](./touint16/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [UInt16](../../system/uint16/). |
| static [ToUInt32](./touint32/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [UInt32](../../system/uint32/). |
| static [ToUInt64](./touint64/)(const String\&) | Mengonversi [String](../../system/string/) menjadi ekivalen [UInt64](../../system/uint64/). |
| static [VerifyName](./verifyname/)(const String\&) | Memverifikasi bahwa nama tersebut adalah nama yang valid menurut rekomendasi W3C Extended Markup Language. |
| static [VerifyNCName](./verifyncname/)(const String\&) | Memverifikasi bahwa nama tersebut adalah **NCName** yang valid menurut rekomendasi W3C Extended Markup Language. Sebuah **NCName** adalah nama yang tidak dapat mengandung tanda titik dua. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | Memverifikasi bahwa string tersebut adalah NMTOKEN yang valid menurut rekomendasi W3C XML [Schema](../../system.xml.schema/) Bagian 2: Datatypes. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | Mengembalikan instance string yang diberikan jika semua karakter dalam argumen string adalah karakter public id yang valid. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | Memverifikasi bahwa string tersebut adalah token yang valid menurut rekomendasi W3C XML [Schema](../../system.xml.schema/) Bagian 2: Datatypes. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | Mengembalikan instance string yang diberikan jika semua karakter dalam argumen string adalah karakter spasi putih yang valid. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | Mengembalikan string yang diberikan jika semua karakter dan pasangan surrogate dalam argumen string adalah karakter XML yang valid, jika tidak sebuah [XmlException](../xmlexception/) akan dilemparkan dengan informasi tentang karakter tidak valid pertama yang ditemukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
