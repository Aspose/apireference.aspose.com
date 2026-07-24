---
title: "Metode System::IO::File::Create"
linktitle: "Buat"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::File::Create. Membuat file baru (atau menimpa yang ada) dan membukanya untuk akses membaca dan menulis menggunakan ukuran buffer dan opsi yang ditentukan dalam C++."
type: docs
weight: 500
url: /id/cpp/system.io/file/create/
---
## File::Create method


Membuat file baru (atau menimpa yang ada) dan membukanya untuk akses baca dan tulis menggunakan ukuran buffer dan opsi yang ditentukan.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file yang akan dibuat atau ditimpa |
| bufferSize | int32_t | Jumlah byte yang di-buffer saat membaca dan menulis ke file |
| opsi | FileOptions | Menentukan cara membuat atau menimpa file |

### ReturnValue

Pointer bersama ke objek [FileStream](../../filestream/) yang terkait dengan file yang ditentukan

## Lihat Juga

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
