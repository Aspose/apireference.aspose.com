---
title: "System::Int64::TryParse metode"
linktitle: "TryParse"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode TryParse dari kelas System::Int64 dalam C++."
type: docs
weight: 200
url: /id/cpp/system/int64/tryparse/
---
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int64_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int64_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer bertanda 64-bit yang setara menggunakan informasi format yang diberikan dan gaya angka.

```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int64_t &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi. |
| styles | Globalization::NumberStyles | Kombinasi bitwise dari nilai-nilai enum NumberStyles yang menentukan gaya yang diizinkan dari representasi string sebuah angka. |
| penyedia | const SharedPtr\<IFormatProvider\>\& | Pointer ke objek yang berisi informasi format string. |
| hasil | int64_t\& | Referensi ke variabel integer bertanda 64-bit tempat hasil konversi ditempatkan. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int64_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, int64_t\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer bertanda 64-bit yang setara.

```cpp
static bool System::Int64::TryParse(const String &value, int64_t &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi. |
| hasil | int64_t\& | Referensi ke variabel integer bertanda 64-bit tempat hasil konversi ditempatkan. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
