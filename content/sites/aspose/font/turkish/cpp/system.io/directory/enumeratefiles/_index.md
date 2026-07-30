---
title: "System::IO::Directory::EnumerateFiles yöntemi"
linktitle: "EnumerateFiles"
second_title: "Aspose.Font için C++"
description: "System::IO::Directory::EnumerateFiles yöntemi. Belirtilen arama kriterlerini karşılayan dosyaları, belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında C++'ta arar."
type: docs
weight: 400
url: /tr/cpp/system.io/directory/enumeratefiles/
---
## Directory::EnumerateFiles method


Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dosyaların ad deseni |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

**searchPattern** ile eşleşen bulunan dosyaların tam yollarının yinelemeli koleksiyonu

## Ayrıca Bakınız

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
