---
title: "System::DateTime::ParseExact method"
linktitle: "ParseExact"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode ParseExact dari kelas System::DateTime dalam C++."
type: docs
weight: 6700
url: /id/cpp/system/datetime/parseexact/
---
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles)
```

## Lihat Juga

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles)
```

## Lihat Juga

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](../) yang setara menggunakan format yang ditentukan, informasi format spesifik budaya, dan gaya. Format representasi string harus cocok secara tepat dengan satu atau lebih format yang ditentukan. Melemparkan pengecualian jika konversi gagal.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | Representasi string dari nilai tanggal dan waktu yang akan dikonversi. |
| format | const ArrayPtr\<String\>\& | Array format string. |
| provider | const SharedPtr\<IFormatProvider\>\& | Objek [IFormatProvider](../../iformatprovider/) yang menyediakan informasi format spesifik budaya. |
| styles | Globalization::DateTimeStyles | Kombinasi bitwise dari nilai enumerasi yang memberikan informasi tambahan tentang **s**, tentang elemen gaya yang mungkin ada dalam **s**, atau tentang konversi dari **s** ke objek [DateTime](../). |

### ReturnValue

Instansi baru dari kelas [DateTime](../) yang mewakili nilai tanggal dan waktu yang setara dengan yang direpresentasikan oleh string yang ditentukan.

## Lihat Juga

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles)
```

## Lihat Juga

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Lihat Juga

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Lihat Juga

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu ke objek [DateTime](../) yang setara menggunakan format yang ditentukan dan informasi format spesifik budaya. Format representasi string harus cocok persis dengan format yang ditentukan. Melemparkan pengecualian jika konversi gagal.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | Representasi string dari nilai tanggal dan waktu yang akan dikonversi. |
| format | const String\& | Format string. |
| provider | const SharedPtr\<IFormatProvider\>\& | Objek [IFormatProvider](../../iformatprovider/) yang menyediakan informasi format spesifik budaya. |
| styles | Globalization::DateTimeStyles | Kombinasi bitwise dari nilai enumerasi yang memberikan informasi tambahan tentang **s**, tentang elemen gaya yang mungkin ada dalam **s**, atau tentang konversi dari **s** ke objek [DateTime](../). |

### ReturnValue

Instansi baru dari kelas [DateTime](../) yang mewakili nilai tanggal dan waktu yang setara dengan yang direpresentasikan oleh string yang ditentukan.

## Lihat Juga

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Lihat Juga

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
