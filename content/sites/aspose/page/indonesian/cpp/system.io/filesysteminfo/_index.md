---
title: "System::IO::FileSystemInfo class"
linktitle: "FileSystemInfo"
second_title: "Aspose.Page untuk C++"
description: "System::IO::FileSystemInfo class. Kelas dasar untuk FileInfo dan DirectoryInfo. Objek dari kelas ini hanya boleh dialokasikan menggunakan System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam System::SmartPtr pointer dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


Kelas dasar untuk [FileInfo](../fileinfo/) dan [DirectoryInfo](../directoryinfo/). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class FileSystemInfo : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Delete](./delete/)() | Menghapus entitas yang diwakili oleh objek saat ini. |
| virtual [Finalize](./finalize/)() | Tidak melakukan apa-apa. |
| [get_Attributes](./get_attributes/)() | Mengembalikan atribut entitas yang diwakili oleh objek saat ini. |
| [get_CreationTime](./get_creationtime/)() | Mengembalikan waktu pembuatan entitas yang diwakili oleh objek saat ini dalam waktu lokal. |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | Mengembalikan waktu pembuatan entitas yang diwakili oleh objek saat ini dalam waktu UTC. |
| virtual [get_Exists](./get_exists/)() | Menentukan apakah entitas yang direferensikan oleh jalur yang diwakili oleh objek saat ini ada. |
| [get_Extension](./get_extension/)() | Mengembalikan ekstensi file yang diwakili oleh objek saat ini. |
| virtual [get_FullName](./get_fullname/)() | Mengembalikan nama lengkap (termasuk jalur) dari entitas yang diwakili oleh objek saat ini. |
| [get_LastAccessTime](./get_lastaccesstime/)() | Mengembalikan waktu akses terakhir dari entitas yang diwakili oleh objek saat ini sebagai waktu lokal. |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | Mengembalikan waktu akses terakhir dari entitas yang diwakili oleh objek saat ini sebagai waktu UTC. |
| [get_LastWriteTime](./get_lastwritetime/)() | Mengembalikan waktu penulisan terakhir dari entitas yang diwakili oleh objek saat ini sebagai waktu lokal. |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | Mengembalikan waktu penulisan terakhir dari entitas yang diwakili oleh objek saat ini sebagai waktu UTC. |
| virtual [get_Name](./get_name/)() | Mengembalikan nama entitas yang diwakili oleh objek saat ini. |
| [Refresh](./refresh/)() | Menyegarkan keadaan objek saat ini. |
| [set_Attributes](./set_attributes/)(FileAttributes) | Menetapkan atribut yang ditentukan pada entitas yang diwakili oleh objek saat ini. |
| [set_CreationTime](./set_creationtime/)(DateTime) | Menetapkan waktu pembuatan entitas yang diwakili oleh objek saat ini sebagai waktu lokal. |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | Menetapkan waktu pembuatan entitas yang diwakili oleh objek saat ini sebagai waktu UTC. |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | Menetapkan waktu akses terakhir entitas yang diwakili oleh objek saat ini sebagai waktu lokal. |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | Menetapkan waktu akses terakhir entitas yang diwakili oleh objek saat ini sebagai waktu UTC. |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | Menetapkan waktu penulisan terakhir entitas yang diwakili oleh objek saat ini sebagai waktu lokal. |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | Menetapkan waktu penulisan terakhir entitas yang diwakili oleh objek saat ini sebagai waktu UTC. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
