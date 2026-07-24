---
title: "System::IO::Directory::GetFileSystemEntries yöntemi"
linktitle: "GetFileSystemEntries"
second_title: "Aspose.Page için C++"
description: "System::IO::Directory::GetFileSystemEntries yöntemi. Belirtilen arama kriterlerini karşılayan dosya ve dizinleri, belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında C++'da arar."
type: docs
weight: 1300
url: /tr/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


Belirtilen dizinde veya belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosya ve dizinleri arar.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dosya ve dizinlerin ad deseni |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizin kökünde bulunan tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

Bulunan dosya ve dizinlerin, adları **searchPattern** ile eşleşen tam yollarının bir dizisi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
