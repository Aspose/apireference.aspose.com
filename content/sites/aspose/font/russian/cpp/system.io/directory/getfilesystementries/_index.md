---
title: "System::IO::Directory::GetFileSystemEntries метод"
linktitle: "GetFileSystemEntries"
second_title: "Aspose.Font для C++"
description: "System::IO::Directory::GetFileSystemEntries метод. Ищет файлы и каталоги, соответствующие указанным критериям поиска, либо в указанном каталоге, либо во всём дереве каталогов, корнем которого является указанный каталог, в C++."
type: docs
weight: 1300
url: /ru/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


Ищет файлы и каталоги, соответствующие указанным критериям поиска, либо в указанном каталоге, либо во всём дереве каталогов, корнем которого является указанный каталог.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | const String\& | Полный или относительный путь к каталогу для поиска |
| searchPattern | const String\& | Шаблон имени файлов и каталогов для поиска |
| searchOption | SearchOption | Указывает, должен ли поиск выполняться только в указанном каталоге или во всём дереве каталогов, корнем которого является указанный каталог |

### ReturnValue

Массив полных путей найденных файлов и каталогов, имена которых соответствуют **searchPattern**

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
