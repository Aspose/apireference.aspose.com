---
title: "System::IO::DirectoryInfo::EnumerateFiles method"
linktitle: "EnumerateFiles"
second_title: "Aspose.Font для C++"
description: "System::IO::DirectoryInfo::EnumerateFiles method. Возвращает перечисляемую коллекцию, содержащую все файлы, расположенные в каталоге, представленном текущим объектом, в C++."
type: docs
weight: 600
url: /ru/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


Возвращает перечисляемую коллекцию, содержащую все файлы, расположенные в каталоге, представленном текущим объектом.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


Ищет файлы, соответствующие указанным критериям поиска, в каталоге, представленном текущим объектом.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| searchPattern | const String\& | Шаблон имени файлов для поиска |

### ReturnValue

Перечисляемая коллекция разделяемых указателей на объекты [FileInfo](../../fileinfo/), представляющие найденные файлы, имена которых соответствуют **searchPattern**

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


Ищет файлы, соответствующие указанным критериям поиска, либо в каталоге, представленном текущим объектом, либо во всём дереве каталогов, корнем которого является каталог, представленный текущим объектом.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| searchPattern | const String\& | Шаблон имени файлов для поиска |
| searchOption | SearchOption | Указывает, следует ли выполнять поиск только в каталоге, представленном текущим объектом, или во всём дереве каталогов, корнем которого является каталог, представленный текущим объектом |

### ReturnValue

Перечисляемая коллекция разделяемых указателей на объекты [FileInfo](../../fileinfo/), представляющие найденные файлы, имена которых соответствуют **searchPattern**

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
