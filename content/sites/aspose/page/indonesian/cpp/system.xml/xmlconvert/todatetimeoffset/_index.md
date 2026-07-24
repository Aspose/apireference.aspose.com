---
title: "System::Xml::XmlConvert::ToDateTimeOffset metode"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlConvert::ToDateTimeOffset metode. Mengonversi String yang diberikan ke ekivalen DateTimeOffset dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


Mengonversi [String](../../../system/string/) yang diberikan ke ekivalen [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | String yang akan dikonversi. String harus sesuai dengan sebagian rekomendasi W3C untuk tipe XML dateTime. Untuk informasi lebih lanjut, lihat bagian [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) dari spesifikasi XML [Schema](../../../system.xml.schema/). |

### ReturnValue

Ekivalen [DateTimeOffset](../../../system/datetimeoffset/) dari string yang diberikan.

## Lihat Juga

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


Mengonversi [String](../../../system/string/) yang diberikan ke ekivalen [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | String yang akan dikonversi. |
| formats | const ArrayPtr\<String\>\& | Array format yang dapat mengonversi **s**. Setiap format dalam **formats** dapat berupa subset apa pun dari rekomendasi W3C untuk tipe XML dateTime. Untuk informasi lebih lanjut, lihat bagian [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) dari spesifikasi XML [Schema](../../../system.xml.schema/). String **s** divalidasi terhadap salah satu format ini. |

### ReturnValue

Ekivalen [DateTimeOffset](../../../system/datetimeoffset/) dari string yang diberikan.

## Lihat Juga

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


Mengonversi [String](../../../system/string/) yang diberikan ke ekivalen [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | String yang akan dikonversi. |
| format | const String\& | Format yang digunakan untuk mengonversi **s**. Parameter format dapat berupa subset apa pun dari rekomendasi W3C untuk tipe XML dateTime. Untuk informasi lebih lanjut, lihat bagian [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) dari spesifikasi XML [Schema](../../../system.xml.schema/). String **s** divalidasi terhadap format ini. |

### ReturnValue

Ekivalen [DateTimeOffset](../../../system/datetimeoffset/) dari string yang diberikan.

## Lihat Juga

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
