---
title: "System::IO::Directory::EnumerateDirectories метод"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Font для C++"
description: "System::IO::Directory::EnumerateDirectories метод. Ищет каталоги, которые соответствуют указанным критериям поиска, либо в указанном каталоге, либо во всём дереве каталогов, корневым в указанном каталоге, в C++."
type: docs
weight: 300
url: /ru/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


Ищет каталоги, соответствующие указанным критериям поиска, либо в указанном каталоге, либо во всём дереве каталогов, корнем которого является указанный каталог.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Полный или относительный путь к каталогу для поиска |
| searchPattern | const String\& | Шаблон имени каталогов для поиска |
| searchOption | SearchOption | Указывает, должен ли поиск выполняться только в указанном каталоге или во всём дереве каталогов, корнем которого является указанный каталог |

### ReturnValue

Перечисляемая коллекция полных путей найденных каталогов, имена которых соответствуют **searchPattern**

## См. также

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
