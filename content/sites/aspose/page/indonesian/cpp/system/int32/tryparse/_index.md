---
title: "System::Int32::TryParse method"
linktitle: "TryParse"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode TryParse dari kelas System::Int32 dalam C++."
type: docs
weight: 200
url: /id/cpp/system/int32/tryparse/
---
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int32_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int32_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int32_t\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer bertanda 32-bit yang setara menggunakan informasi pemformatan yang diberikan dan gaya angka.

```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int32_t &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi. |
| styles | Globalization::NumberStyles | Kombinasi bitwise dari nilai-nilai enum NumberStyles yang menentukan gaya yang diizinkan dari representasi string sebuah angka. |
| penyedia | const SharedPtr\<IFormatProvider\>\& | Pointer ke objek yang berisi informasi format string. |
| hasil | int32_t\& | Referensi ke variabel integer bertanda 32-bit tempat hasil konversi disimpan. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int32_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, int32_t\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer bertanda 32-bit yang setara.

```cpp
static bool System::Int32::TryParse(const String &value, int32_t &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi. |
| hasil | int32_t\& | Referensi ke variabel integer bertanda 32-bit tempat hasil konversi disimpan. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
