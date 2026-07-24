---
title: "Kelas System::IO::Path"
linktitle: "Path"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::Path. Menyediakan metode untuk memanipulasi jalur. Ini adalah tipe statis tanpa layanan instance. Anda tidak pernah boleh membuat instance darinya dengan cara apapun dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.io/path/
---
## Path class


Menyediakan metode untuk memanipulasi jalur. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh membuat instance darinya dengan cara apa pun.

```cpp
class Path
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | Mengubah ekstensi pada jalur file yang ditentukan. |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | Menentukan apakah jalur yang ditentukan valid dengan memeriksa apakah mengandung karakter tidak valid. Pengecualian dilemparkan jika jalur mengandung karakter tidak valid. |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | Menggabungkan segmen jalur yang ditentukan menjadi satu jalur dengan menyisipkan karakter pemisah direktori di antara segmen jika diperlukan. |
| static [Combine](./combine/)(const String\&, const String\&) | Menggabungkan dua segmen jalur yang ditentukan menjadi satu jalur dengan menyisipkan karakter pemisah direktori di antara segmen jika diperlukan. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | Menggabungkan tiga segmen jalur yang ditentukan menjadi satu jalur dengan menyisipkan karakter pemisah direktori di antara segmen jika diperlukan. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | Menggabungkan empat segmen jalur yang ditentukan menjadi satu jalur dengan menyisipkan karakter pemisah direktori di antara segmen jika diperlukan. |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | Mengembalikan nama direktori yang direferensikan oleh jalur yang ditentukan. |
| static [GetExtension](./getextension/)(const String\&) | Mengembalikan ekstensi file yang direferensikan oleh jalur yang ditentukan. |
| static [GetFileName](./getfilename/)(const String\&) | Mengembalikan nama file yang direferensikan oleh jalur yang ditentukan. |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | Mengembalikan nama tanpa ekstensi dari file yang direferensikan oleh jalur yang ditentukan. |
| static [GetFullPath](./getfullpath/)(const String\&) | Mengonversi jalur yang ditentukan menjadi jalur absolut. |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | Mengembalikan array yang berisi karakter yang tidak diizinkan dalam nama file. |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | Mengembalikan array yang berisi karakter yang tidak diizinkan dalam nama jalur. |
| static [GetPathRoot](./getpathroot/)(const String\&) | Mengembalikan direktori root dari jalur yang ditentukan. |
| static [GetRandomFileName](./getrandomfilename/)() | Mengembalikan nama file yang dihasilkan secara acak. |
| static [GetTempFileName_](./gettempfilename_/)() | Membuat file baru dengan nama unik dan mengembalikan jalur lengkap ke file tersebut. |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | Membuat file baru dengan nama unik dan mengembalikan jalur lengkap ke file tersebut. Merupakan sinonim dari metode [GetTempFileName_()](./gettempfilename_/). |
| static [GetTempPath](./gettemppath/)() | Mengembalikan jalur direktori sementara pengguna saat ini. |
| static [HasExtension](./hasextension/)(const String\&) | Menentukan apakah jalur yang ditentukan merujuk ke file dengan ekstensi. |
| static [IsPathRooted](./ispathrooted/)(const String\&) | Menentukan apakah jalur yang ditentukan mengandung root. |
| static [NormalizePath](./normalizepath/)(const String\&) | Menormalkan jalur yang ditentukan. |
| static [ToBoost](./toboost/)(const String\&) | Mengembalikan instance dari kelas boost::filesystem::path yang merepresentasikan jalur yang ditentukan. |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | Mengembalikan representasi string dari objek path Boost yang ditentukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | Karakter alternatif yang digunakan untuk memisahkan tingkat direktori dalam sebuah jalur. |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | Karakter yang digunakan untuk memisahkan tingkat direktori dalam sebuah jalur. |
| static [PathSeparator](./pathseparator/) | Karakter pemisah yang digunakan untuk memisahkan string jalur dalam variabel lingkungan. |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | Karakter pemisah volume. |
## Catatan



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // Menghasilkan nama file acak.
  auto filename = Path::GetRandomFileName();

  // Mencetak informasi tentang nama file.
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## Lihat Juga

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
