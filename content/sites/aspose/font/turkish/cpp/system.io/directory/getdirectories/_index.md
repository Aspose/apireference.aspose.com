---
title: "System::IO::Directory::GetDirectories yöntemi"
linktitle: "GetDirectories"
second_title: "Aspose.Font için C++"
description: "System::IO::Directory::GetDirectories yöntemi. Belirtilen arama kriterlerini karşılayan dizinleri, belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında C++'ta arar."
type: docs
weight: 1000
url: /tr/cpp/system.io/directory/getdirectories/
---
## Directory::GetDirectories method


Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
static ArrayPtr<String> System::IO::Directory::GetDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dizinlerin ad deseni |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

**searchPattern** ile eşleşen bulunan dizinlerin tam yollarının bir dizisi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
