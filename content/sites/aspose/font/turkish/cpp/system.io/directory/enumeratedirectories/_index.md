---
title: "System::IO::Directory::EnumerateDirectories yöntemi"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Font için C++"
description: "System::IO::Directory::EnumerateDirectories yöntemi. Belirtilen dizinde veya belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dizinleri C++'ta arar."
type: docs
weight: 300
url: /tr/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dizinlerin ad deseni |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dizinlerin tam yollarını içeren yinelenebilir bir koleksiyon

## Ayrıca Bakınız

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
