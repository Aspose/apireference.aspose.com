---
title: "System::DateTimeOffset::TryParseExact metode"
linktitle: "TryParseExact"
second_title: "Aspose.Page untuk C++"
description: "System::DateTimeOffset::TryParseExact metode. Mencoba mengonversi string yang ditentukan menjadi objek DateTimeOffset menggunakan format, penyedia format, dan gaya pemformatan yang ditentukan dalam C++."
type: docs
weight: 5800
url: /id/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Mencoba mengonversi string yang ditentukan menjadi objek [DateTimeOffset](../) menggunakan format, penyedia format, dan gaya pemformatan yang ditentukan.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const String\& | [String](../../string/) untuk dikonversi. |
| format | const ArrayPtr\<String\>\& | Array string format. |
| penyedia | const SharedPtr\<IFormatProvider\>\& | Penyedia format. |
| styles | Globalization::DateTimeStyles | Gaya pemformatan tanggal dan waktu. |
| result | DateTimeOffset\& | [DateTimeOffset](../) yang setara dengan **input**. |

### ReturnValue

true jika **input** berhasil dikonversi, jika tidak - false.

## Lihat Juga

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Mencoba mengonversi string yang ditentukan menjadi objek [DateTimeOffset](../) menggunakan format, penyedia format, dan gaya pemformatan yang ditentukan.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const String\& | [String](../../string/) untuk dikonversi. |
| format | const String\& | String format. |
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
