---
title: "System::IO::Directory::EnumerateFileSystemEntries yöntemi"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Font için C++"
description: "System::IO::Directory::EnumerateFileSystemEntries yöntemi. Belirtilen dizinde veya belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosya ve dizinleri C++'ta arar."
type: docs
weight: 500
url: /tr/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dosya ve dizinlerin ad deseni |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dosya ve dizinlerin tam yollarını içeren yinelenebilir bir koleksiyon

## Ayrıca Bakınız

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
