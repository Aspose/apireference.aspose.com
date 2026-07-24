---
title: "System::IO::Directory::EnumerateDirectories yöntemi"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page için C++"
description: "System::IO::Directory::EnumerateDirectories yöntemi. Belirtilen arama kriterlerini karşılayan dizinleri, belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında C++'ta arar."
type: docs
weight: 300
url: /tr/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


Belirtilen dizinde veya belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dizinlerin ad kalıbı |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizin kökünde bulunan tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

**searchPattern** ile eşleşen bulunan dizinlerin tam yollarının yinelenebilir koleksiyonu

## Ayrıca Bakınız

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
