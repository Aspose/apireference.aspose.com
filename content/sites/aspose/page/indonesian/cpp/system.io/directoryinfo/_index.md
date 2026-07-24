---
title: "Kelas System::IO::DirectoryInfo"
linktitle: "DirectoryInfo"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::DirectoryInfo. Mewakili jalur sistem file, sebuah direktori yang dirujuk oleh jalur ini dan menyediakan metode instansi untuk memanipulasi direktori. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instansi tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.io/directoryinfo/
---
## DirectoryInfo class


Mewakili jalur sistem file, sebuah direktori yang dirujuk oleh jalur ini dan menyediakan metode instansi untuk memanipulasi direktori. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instansi tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class DirectoryInfo : public System::IO::FileSystemInfo
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Create](./create/)() | Membuat sebuah direktori pada jalur yang diwakili oleh objek saat ini. |
| [CreateSubdirectory](./createsubdirectory/)(const String\&) | Membuat subdirektori pada jalur yang ditentukan. |
| [Delete](./delete/)() override | Menghapus direktori yang dirujuk oleh jalur yang diwakili oleh objek saat ini jika direktori tersebut kosong. |
| [Delete](./delete/)(bool) | Menghapus direktori yang dirujuk oleh jalur yang diwakili oleh objek saat ini. Sebuah parameter menentukan apakah isi direktori harus dihapus secara rekursif jika direktori tidak kosong. |
| [DirectoryInfo](./directoryinfo/)(const String\&) | Membuat sebuah instansi dari kelas [DirectoryInfo](./) pada jalur yang ditentukan. |
| [EnumerateDirectories](./enumeratedirectories/)() | Mengembalikan koleksi enumerable yang berisi semua direktori yang berada dalam direktori yang diwakili oleh objek saat ini. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&) | Mencari direktori yang memenuhi kriteria pencarian yang ditentukan dalam direktori yang diwakili oleh objek saat ini. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&, SearchOption) | Mencari direktori yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini. |
| [EnumerateFiles](./enumeratefiles/)() | Mengembalikan koleksi enumerable yang berisi semua file yang terletak di direktori yang direpresentasikan oleh objek saat ini. |
| [EnumerateFiles](./enumeratefiles/)(const String\&) | Mencari file yang memenuhi kriteria pencarian yang ditentukan di dalam direktori yang direpresentasikan oleh objek saat ini. |
| [EnumerateFiles](./enumeratefiles/)(const String\&, SearchOption) | Mencari file yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)() | Mengembalikan koleksi enumerable yang berisi semua file dan direktori yang terletak di direktori yang direpresentasikan oleh objek saat ini. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&) | Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan di dalam direktori yang direpresentasikan oleh objek saat ini. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&, SearchOption) | Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini. |
| [get_Exists](./get_exists/)() override | Menentukan apakah jalur yang direpresentasikan oleh objek saat ini mengacu pada direktori yang ada. |
| [get_Name](./get_name/)() override | Mengembalikan nama entitas yang dirujuk oleh jalur yang direpresentasikan oleh objek saat ini. |
| [get_Parent](./get_parent/)() | Mengembalikan shared pointer ke objek [DirectoryInfo](./) yang merepresentasikan jalur yang merujuk ke direktori induk dari direktori yang direpresentasikan oleh objek saat ini. |
| [get_Root](./get_root/)() | Mengembalikan shared pointer ke objek [DirectoryInfo](./) yang merepresentasikan jalur yang merujuk ke direktori root dari direktori yang direpresentasikan oleh objek saat ini. |
| [GetDirectories](./getdirectories/)() | Mengembalikan array yang berisi shared pointer ke objek [DirectoryInfo](./) yang merepresentasikan semua direktori yang terletak di direktori yang direpresentasikan oleh objek saat ini. |
| [GetDirectories](./getdirectories/)(const String\&) | Mencari direktori yang memenuhi kriteria pencarian yang ditentukan dalam direktori yang diwakili oleh objek saat ini. |
| [GetDirectories](./getdirectories/)(const String\&, SearchOption) | Mencari direktori yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini. |
| [GetFiles](./getfiles/)() | Mengembalikan array yang berisi shared pointer ke objek [FileInfo](../fileinfo/) yang merepresentasikan semua direktori yang terletak di direktori yang direpresentasikan oleh objek saat ini. |
| [GetFiles](./getfiles/)(const String\&) | Mencari file yang memenuhi kriteria pencarian yang ditentukan di dalam direktori yang direpresentasikan oleh objek saat ini. |
| [GetFiles](./getfiles/)(const String\&, SearchOption) | Mencari file yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini. |
| [GetFileSystemInfos](./getfilesysteminfos/)() | Mengembalikan array yang berisi shared pointer ke objek [FileSystemInfo](../filesysteminfo/) yang merepresentasikan semua file dan direktori yang terletak di direktori yang direpresentasikan oleh objek saat ini. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&) | Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan di dalam direktori yang direpresentasikan oleh objek saat ini. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&, SearchOption) | Mencari file dan direktori yang memenuhi kriteria pencarian yang ditentukan baik di dalam direktori yang direpresentasikan oleh objek saat ini maupun di seluruh pohon direktori yang berakar pada direktori yang direpresentasikan oleh objek saat ini. |
| [MoveTo](./moveto/)(const String\&) | Memindahkan direktori yang direpresentasikan oleh objek saat ini beserta semua isinya ke lokasi yang ditentukan. |
| [ToString](./tostring/)() const override | Mengembalikan string yang berisi jalur yang direpresentasikan oleh objek saat ini. |
## Lihat Juga

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
