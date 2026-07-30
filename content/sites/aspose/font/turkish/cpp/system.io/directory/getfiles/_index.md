---
title: "System::IO::Directory::GetFiles yöntemi"
linktitle: "GetFiles"
second_title: "Aspose.Font için C++"
description: "System::IO::Directory::GetFiles yöntemi. Belirtilen dizinde veya belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosyaları C++'ta arar."
type: docs
weight: 1200
url: /tr/cpp/system.io/directory/getfiles/
---
## Directory::GetFiles method


Belirtilen dizinde ya da belirtilen dizinde köklenen tüm dizin ağacında, belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Aranacak dizine tam veya göreli yol |
| searchPattern | const String\& | Aranacak dosyaların ad deseni |
| searchOption | SearchOption | Aramanın yalnızca belirtilen dizinde mi yoksa belirtilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dosyaların tam yollarını içeren bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
