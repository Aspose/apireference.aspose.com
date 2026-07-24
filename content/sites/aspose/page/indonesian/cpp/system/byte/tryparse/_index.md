---
title: "System::Byte::TryParse metode"
linktitle: "TryParse"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode TryParse dari kelas System::Byte dalam C++."
type: docs
weight: 200
url: /id/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer 8-bit tak bertanda yang setara menggunakan informasi format yang diberikan dan gaya angka.

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi. |
| styles | Globalization::NumberStyles | Kombinasi bitwise dari nilai-nilai enum NumberStyles yang menentukan gaya yang diizinkan dari representasi string sebuah angka. |
| penyedia | const SharedPtr\<IFormatProvider\>\& | Pointer ke objek yang berisi informasi format string. |
| hasil | uint8_t\& | Referensi ke variabel integer tak bertanda 8-bit tempat hasil konversi disimpan. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## Lihat Juga

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer 8-bit tak bertanda yang setara.

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | String yang akan dikonversi. |
| hasil | uint8_t\& | Referensi ke variabel integer tak bertanda 8-bit tempat hasil konversi disimpan. |

### ReturnValue

Benar jika konversi berhasil, jika tidak - salah.

## Lihat Juga

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
