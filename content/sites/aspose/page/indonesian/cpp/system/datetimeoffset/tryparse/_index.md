---
title: "Metode System::DateTimeOffset::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Page untuk C++"
description: "Metode System::DateTimeOffset::TryParse. Mencoba mengonversi string yang ditentukan menjadi objek DateTimeOffset menggunakan penyedia format dan gaya pemformatan yang ditentukan dalam C++."
type: docs
weight: 5700
url: /id/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Mencoba mengonversi string yang ditentukan menjadi objek [DateTimeOffset](../) menggunakan penyedia format dan gaya pemformatan yang ditentukan.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const String\& | [String](../../string/) untuk dikonversi. |
| penyedia | const SharedPtr\<IFormatProvider\>\& | Penyedia format. |
| styles | Globalization::DateTimeStyles | Gaya pemformatan tanggal dan waktu. |
| result | DateTimeOffset\& | [DateTimeOffset](../) yang setara dengan **input**. |

### ReturnValue

true jika **input** berhasil dikonversi, jika tidak - false.

## Lihat Juga

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


Mencoba mengonversi string yang ditentukan menjadi objek [DateTimeOffset](../).

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const String\& | [String](../../string/) untuk dikonversi. |
| result | DateTimeOffset\& | [DateTimeOffset](../) yang setara dengan **input**. |

### ReturnValue

true jika **input** berhasil dikonversi, jika tidak - false.

## Lihat Juga

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
