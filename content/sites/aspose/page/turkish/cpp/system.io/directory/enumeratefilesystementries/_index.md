---
title: "System::IO::Directory::EnumerateFileSystemEntries metodu"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Page için C++"
description: "System::IO::Directory::EnumerateFileSystemEntries metodu. Belirtilen arama kriterlerini karşılayan dosyaları ve dizinleri, belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında arar C++'de."
type: docs
weight: 500
url: /tr/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


Belirtilen dizinde veya belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dosya ve dizinlerin ad deseni |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizin kökünde bulunan tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

**searchPattern** ile eşleşen bulunan dosya ve dizinlerin tam yollarının enumerable koleksiyonu

## Ayrıca Bakınız

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
