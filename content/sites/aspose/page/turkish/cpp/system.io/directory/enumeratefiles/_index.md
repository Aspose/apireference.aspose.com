---
title: "System::IO::Directory::EnumerateFiles yöntemi"
linktitle: "EnumerateFiles"
second_title: "Aspose.Page için C++"
description: "System::IO::Directory::EnumerateFiles yöntemi. Belirtilen arama kriterlerini karşılayan dosyaları, belirtilen dizinde ya da belirtilen dizin kökünde bulunan tüm dizin ağacında C++'ta arar."
type: docs
weight: 400
url: /tr/cpp/system.io/directory/enumeratefiles/
---
## Directory::EnumerateFiles method


Belirtilen dizinde veya belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dosyaların ad kalıbı |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizin kökünde bulunan tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dosyaların tam yollarının yinelemeli koleksiyonu

## Ayrıca Bakınız

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
