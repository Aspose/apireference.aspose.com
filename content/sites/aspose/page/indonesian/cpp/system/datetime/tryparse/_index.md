---
title: "System::DateTime::TryParse metode"
linktitle: "TryParse"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode TryParse dari kelas System::DateTime dalam C++."
type: docs
weight: 6900
url: /id/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Lihat Juga

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Lihat Juga

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](../) yang setara menggunakan informasi format dan gaya spesifik budaya yang ditentukan.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | Representasi string dari nilai tanggal dan waktu yang akan dikonversi. |
| provider | const SharedPtr\<IFormatProvider\>\& | Objek [IFormatProvider](../../iformatprovider/) yang menyediakan informasi format spesifik budaya. |
| styles | Globalization::DateTimeStyles | Kombinasi bitwise dari nilai enumerasi yang memberikan informasi tambahan tentang **s**, tentang elemen gaya yang mungkin ada dalam **s**, atau tentang konversi dari **s** ke objek [DateTime](../). |
| hasil | DateTime\& | Argumen output yang, jika konversi berhasil, berisi hasil konversi. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](../) yang setara.

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | const String\& | Representasi string dari nilai tanggal dan waktu yang akan dikonversi. |
| hasil | DateTime\& | Argumen output yang, jika konversi berhasil, berisi hasil konversi. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
