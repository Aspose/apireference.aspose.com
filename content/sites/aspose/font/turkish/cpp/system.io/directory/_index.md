---
title: "System::IO::Directory sınıfı"
linktitle: "Dizin"
second_title: "Aspose.Font için C++"
description: "System::IO::Directory sınıfı. Dizinleri manipüle etmek için yöntemler içerir. Bu, örnek hizmeti olmayan statik bir türdür. C++'ta hiçbir şekilde bu sınıfın örneklerini oluşturmamalısınız."
type: docs
weight: 1100
url: /tr/cpp/system.io/directory/
---
## Directory class


Dizinleri yönetmek için yöntemler içerir. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmamalısınız.

```cpp
class Directory
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | Belirtilen yolda mevcut değilse tüm dizinleri oluşturur. |
| static [Delete](./delete/)(const String\&, bool) | Belirtilen dosya veya dizini kaldırır. İstisna fırlatmaz. |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dizinleri arar. |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosyaları arar. |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar. |
| static [Exists](./exists/)(const String\&) | Belirtilen yolun mevcut bir dizine işaret edip etmediğini belirler. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Belirtilen varlığın oluşturulma zamanını yerel saat olarak döndürür. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Belirtilen varlığın oluşturulma zamanını UTC saat olarak döndürür. |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | Mevcut dizinin tam adını (yolu dahil) döndürür. |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dizinleri arar. |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | Belirtilen yolun kök dizinini döndürür. |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosyaları arar. |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Belirtilen varlığın son erişim zamanını yerel saat olarak döndürür. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Belirtilen varlığın son erişim zamanını UTC zamanı olarak döndürür. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Belirtilen varlığın son yazma zamanını yerel zaman olarak döndürür. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Belirtilen varlığın son yazma zamanını UTC zamanı olarak döndürür. |
| static [GetLogicalDrives](./getlogicaldrives/)() | UYGULANMADI. |
| static [GetParent](./getparent/)(const String\&) | Belirtilen varlığın üst dizinini temsil eden [DirectoryInfo](../directoryinfo/) nesnesine bir paylaşımlı işaretçi döndürür. |
| static [Move](./move/)(const String\&, const String\&) | Belirtilen varlığı yeni konuma taşır. Taşınacak varlık bir dizinse, tüm içeriğiyle birlikte taşınır. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | Belirtilen varlığın oluşturulma zamanını yerel saat olarak ayarlar. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | Belirtilen varlığın oluşturma zamanını UTC zamanı olarak ayarlar. |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | Geçerli dizini ayarlar. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | Belirtilen varlığın son erişim zamanını yerel zaman olarak ayarlar. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | Belirtilen varlığın son erişim zamanını UTC zamanı olarak ayarlar. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Belirtilen varlığın son yazma zamanını yerel zaman olarak ayarlar. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Belirtilen varlığın son yazma zamanını UTC zamanı olarak ayarlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | Bir dizi [String](../../system/string/) nesnesi üzerinde yineleme yapan IEnumerable nesnesine ortak gösterici için bir takma ad. |
## Açıklamalar



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
  // Dizin yollarını içeren dizeler oluştur.
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // Dizinlerin var olup olmadığını kontrol et.
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // Geçici dizin bilgilerini yazdır.
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

## Ayrıca Bakınız

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
