---
title: "Metode System::DateTimeOffset::ParseExact"
linktitle: "ParseExact"
second_title: "Aspose.Page untuk C++"
description: "Metode System::DateTimeOffset::ParseExact. Mengonversi string yang ditentukan menjadi objek DateTimeOffset menggunakan format, penyedia format, dan gaya pemformatan yang ditentukan dalam C++."
type: docs
weight: 5600
url: /id/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Mengonversi string yang ditentukan menjadi objek [DateTimeOffset](../) menggunakan format, penyedia format, dan gaya pemformatan yang ditentukan.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const String\& | [String](../../string/) untuk dikonversi. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) dari string format. |
| penyedia | const SharedPtr\<IFormatProvider\>\& | Penyedia format. |
| styles | Globalization::DateTimeStyles | Gaya pemformatan tanggal dan waktu. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Lihat Juga

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Mengonversi string yang ditentukan menjadi objek [DateTimeOffset](../) menggunakan format yang ditentukan, penyedia format, dan gaya pemformatan.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input | const String\& | [String](../../string/) untuk dikonversi. |
| format | const String\& | String format. |
| penyedia | const SharedPtr\<IFormatProvider\>\& | Penyedia format. |
| styles | Globalization::DateTimeStyles | Gaya pemformatan tanggal dan waktu. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Lihat Juga

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
