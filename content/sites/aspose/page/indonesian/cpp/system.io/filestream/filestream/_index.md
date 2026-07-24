---
title: "System::IO::FileStream::FileStream konstruktor"
linktitle: "FileStream"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan konstruktor FileStream dari kelas System::IO::FileStream dalam C++."
type: docs
weight: 100
url: /id/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## Lihat Juga

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


Membuat instance baru dari kelas [FileStream](../) dan menginisialisasinya dengan parameter yang ditentukan.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file yang akan dibuka. |
| mode | FileMode | Menentukan mode untuk membuka file. |

## Lihat Juga

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


Membuat instance baru dari kelas [FileStream](../) dan menginisialisasinya dengan parameter yang ditentukan.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file yang akan dibuka. |
| mode | FileMode | Menentukan mode untuk membuka file. |
| access | FileAccess | Jenis akses yang diminta. |
| share | FileShare | Jenis akses yang dimiliki objek [FileStream](../) lain terhadap file yang dibuka. |
| buffer_size | int32_t | Jumlah byte yang di-buffer selama operasi baca dan tulis. |
| useAsync | bool | Menentukan apakah akan menggunakan I/O asynchronous atau I/O synchronous. |
## Catatan



Sistem operasi yang mendasari mungkin tidak mendukung I/O asynchronous.

## Lihat Juga

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


Membuat instance baru dari kelas [FileStream](../) dan menginisialisasinya dengan parameter yang ditentukan.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | const String\& | Jalur file yang akan dibuka. |
| mode | FileMode | Menentukan mode untuk membuka file. |
| access | FileAccess | Jenis akses yang diminta. |
| share | FileShare | Jenis akses yang dimiliki objek [FileStream](../) lain terhadap file yang dibuka. |
| buffer_size | int32_t | Jumlah byte yang di-buffer selama operasi baca dan tulis. |
| opsi | FileOptions | Opsi tambahan. |

## Lihat Juga

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
