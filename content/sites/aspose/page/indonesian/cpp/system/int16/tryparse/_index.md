---
title: "System::Int16::TryParse method"
linktitle: "TryParse"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode TryParse dari kelas System::Int16 dalam C++."
type: docs
weight: 200
url: /id/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer bertanda 16-bit yang setara menggunakan informasi format yang diberikan dan gaya angka.

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi. |
| styles | Globalization::NumberStyles | Kombinasi bitwise dari nilai-nilai enum NumberStyles yang menentukan gaya yang diizinkan dari representasi string sebuah angka. |
| penyedia | const SharedPtr\<IFormatProvider\>\& | Pointer ke objek yang berisi informasi format string. |
| hasil | int16_t\& | Referensi ke variabel integer bertanda 16-bit tempat hasil konversi disimpan. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer bertanda 16-bit yang setara.

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi. |
| hasil | int16_t\& | Referensi ke variabel integer bertanda 16-bit tempat hasil konversi disimpan. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
