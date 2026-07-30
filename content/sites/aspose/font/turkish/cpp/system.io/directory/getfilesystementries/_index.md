---
title: "System::IO::Directory::GetFileSystemEntries metodu"
linktitle: "GetFileSystemEntries"
second_title: "Aspose.Font için C++"
description: "System::IO::Directory::GetFileSystemEntries metodu. Belirtilen arama kriterlerini karşılayan dosya ve dizinleri, belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında C++'da arar."
type: docs
weight: 1300
url: /tr/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dosya ve dizinlerin ad deseni |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dosya ve dizinlerin tam yollarını içeren bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
