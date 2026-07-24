---
title: "System::IO::Directory kelas"
linktitle: "Directory"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::Directory. Berisi metode untuk memanipulasi direktori. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.io/directory/
---
## Directory class


Berisi metode untuk memanipulasi direktori. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh membuat instance darinya dengan cara apapun.

```cpp
class Directory
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | Membuat semua direktori dalam jalur yang ditentukan jika belum ada. |
| static [Delete](./delete/)(const String\&, bool) | Menghapus file atau direktori yang ditentukan. Tidak melempar pengecualian. |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | Menelusuri direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut. |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | Menelusuri file yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut. |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | Menelusuri file dan direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut. |
| static [Exists](./exists/)(const String\&) | Menentukan apakah jalur yang ditentukan mengacu pada direktori yang ada. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Mengembalikan waktu pembuatan entitas yang ditentukan sebagai waktu lokal. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Mengembalikan waktu pembuatan entitas yang ditentukan sebagai waktu UTC. |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | Mengembalikan nama lengkap (termasuk jalur) dari direktori saat ini. |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | Menelusuri direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut. |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | Mengembalikan direktori root dari jalur yang ditentukan. |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | Menelusuri file yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut. |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | Menelusuri file dan direktori yang memenuhi kriteria pencarian yang ditentukan, baik di dalam direktori yang ditentukan maupun di seluruh pohon direktori yang berakar pada direktori tersebut. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Mengembalikan waktu akses terakhir entitas yang ditentukan sebagai waktu lokal. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Mengembalikan waktu akses terakhir entitas yang ditentukan sebagai waktu UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Mengembalikan waktu penulisan terakhir entitas yang ditentukan sebagai waktu lokal. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Mengembalikan waktu penulisan terakhir entitas yang ditentukan sebagai waktu UTC. |
| static [GetLogicalDrives](./getlogicaldrives/)() | BELUM DIIMPLEMENTASIKAN. |
| static [GetParent](./getparent/)(const String\&) | Mengembalikan shared pointer ke objek [DirectoryInfo](../directoryinfo/) yang mewakili direktori induk dari entitas yang ditentukan. |
| static [Move](./move/)(const String\&, const String\&) | Memindahkan entitas yang ditentukan ke lokasi baru. Jika entitas yang dipindahkan adalah direktori, maka akan dipindahkan beserta semua isinya. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | Mengatur waktu pembuatan entitas yang ditentukan sebagai waktu lokal. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | Mengatur waktu pembuatan entitas yang ditentukan sebagai waktu UTC. |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | Mengatur direktori saat ini. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | Mengatur waktu akses terakhir entitas yang ditentukan sebagai waktu lokal. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | Mengatur waktu akses terakhir entitas yang ditentukan sebagai waktu UTC. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Menetapkan waktu penulisan terakhir entitas yang ditentukan sebagai waktu lokal. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Menetapkan waktu penulisan terakhir entitas yang ditentukan sebagai waktu UTC. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | Alias untuk shared pointer ke objek IEnumerable yang mengiterasi sekumpulan objek [String](../../system/string/). |
## Catatan



```cpp
#include "system/io/directory.h"
#include "system/io/path.h"
#include "system/string.h"
#include <iostream>

void PrintMessage(const System::String &path)
{
  std::cout << "Directory '" << path << (System::IO::Directory::Exists(path) ? "' exists." : "' doesn't exist.") << std::endl;
}

int main()
{
  // Membuat string yang berisi jalur ke direktori.
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // Memeriksa apakah direktori ada.
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // Mencetak informasi direktori temporer.
  std::cout <<
    "Creation Time: " << System::IO::Directory::GetCreationTime(tempPath) << std::endl <<
    "Last Access Time: " << System::IO::Directory::GetLastAccessTime(tempPath) << std::endl <<
    "Last Write Time: " << System::IO::Directory::GetLastWriteTime(tempPath) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Directory 'C:\' exists.
Directory 'C:\Some directory' doesn't exist.
Directory 'C:\Users\lanor\AppData\Local\Temp\' exists.
Creation Time: 27.08.2021 14:21:42
Last Access Time: 07.10.2021 12:16:41
Last Write Time: 07.10.2021 12:16:41
*/
```

## Lihat Juga

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
