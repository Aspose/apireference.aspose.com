---
title: "System::IO::Directory::EnumerateFileSystemEntries метод"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Font для C++"
description: "System::IO::Directory::EnumerateFileSystemEntries метод. Ищет файлы и каталоги, которые соответствуют указанным критериям поиска, либо в указанном каталоге, либо во всём дереве каталогов, корневым в указанном каталоге, в C++."
type: docs
weight: 500
url: /ru/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


Ищет файлы и каталоги, соответствующие указанным критериям поиска, либо в указанном каталоге, либо во всём дереве каталогов, корнем которого является указанный каталог.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Полный или относительный путь к каталогу для поиска |
| searchPattern | const String\& | Шаблон имени файлов и каталогов для поиска |
| searchOption | SearchOption | Указывает, должен ли поиск выполняться только в указанном каталоге или во всём дереве каталогов, корнем которого является указанный каталог |

### ReturnValue

Перечисляемая коллекция полных путей найденных файлов и каталогов, имена которых соответствуют **searchPattern**

## См. также

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
