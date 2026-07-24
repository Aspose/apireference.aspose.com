---
title: "metode System::IO::File::Open"
linktitle: "Open"
second_title: "Aspose.Page untuk C++"
description: "metode System::IO::File::Open. Membuka file yang ditentukan dalam mode yang ditentukan untuk membaca dan menulis serta tanpa berbagi dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


Membuka file yang ditentukan dalam mode yang ditentukan untuk membaca dan menulis serta tanpa berbagi.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file yang akan dibuka |
| mode | FileMode | Menentukan mode di mana file akan dibuka |

### ReturnValue

Sebuah objek [FileStream](../../filestream/) yang terkait dengan file yang dibuka

## Lihat Juga

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


Membuka file yang ditentukan dalam mode yang ditentukan, dengan tipe akses yang ditentukan dan opsi berbagi.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file yang akan dibuka |
| mode | FileMode | Menentukan mode di mana file akan dibuka |
| access | FileAccess | Tipe akses yang diminta |
| share | FileShare | Tipe akses yang dimiliki objek [FileStream](../../filestream/) lain terhadap file yang dibuka |

### ReturnValue

Sebuah objek [FileStream](../../filestream/) yang terkait dengan file yang dibuka

## Lihat Juga

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
