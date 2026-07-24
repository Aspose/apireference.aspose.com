---
title: "Metode System::Xml::XmlConvert::ToDateTime"
linktitle: "ToDateTime"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlConvert::ToDateTime. Mengonversi String menjadi ekivalen DateTime dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


Mengonversi [String](../../../system/string/) menjadi ekivalen [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | String yang akan dikonversi. |

### ReturnValue

Ekivalen [DateTime](../../../system/datetime/) dari string.

## Lihat Juga

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


Mengonversi [String](../../../system/string/) menjadi ekivalen [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | String yang akan dikonversi. |
| formats | const ArrayPtr\<String\>\& | Array yang berisi struktur format yang akan diterapkan pada [DateTime](../../../system/datetime/) yang dikonversi. Format yang valid meliputi "yyyy-MM-ddTHH:mm:sszzzzzz" dan subsetnya. |

### ReturnValue

Ekivalen [DateTime](../../../system/datetime/) dari string.

## Lihat Juga

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


Mengonversi [String](../../../system/string/) menjadi ekivalen [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | String yang akan dikonversi. |
| format | const String\& | Struktur format yang diterapkan pada [DateTime](../../../system/datetime/) yang dikonversi. Format yang valid meliputi "yyyy-MM-ddTHH:mm:sszzzzzz" dan subsetnya. String divalidasi terhadap format ini. |

### ReturnValue

Ekivalen [DateTime](../../../system/datetime/) dari string.

## Lihat Juga

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


Mengonversi [String](../../../system/string/) menjadi [DateTime](../../../system/datetime/) menggunakan [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) yang ditentukan.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | Nilai [String](../../../system/string/) yang akan dikonversi. |
| dateTimeOption | XmlDateTimeSerializationMode | Salah satu nilai enumerasi yang menentukan apakah tanggal harus dikonversi ke waktu lokal atau dipertahankan sebagai Coordinated Universal Time (UTC), jika itu adalah tanggal UTC. |

### ReturnValue

Ekivalen [DateTime](../../../system/datetime/) dari [String](../../../system/string/).

## Lihat Juga

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
