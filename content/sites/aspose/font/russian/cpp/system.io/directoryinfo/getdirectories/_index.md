---
title: "System::IO::DirectoryInfo::GetDirectories метод"
linktitle: "GetDirectories"
second_title: "Aspose.Font для C++"
description: "System::IO::DirectoryInfo::GetDirectories метод. Возвращает массив, содержащий shared pointers к объектам DirectoryInfo, представляющим все каталоги, находящиеся в директории, представленной текущим объектом, в C++."
type: docs
weight: 1200
url: /ru/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Возвращает массив, содержащий shared pointers к объектам [DirectoryInfo](../), представляющим все каталоги, находящиеся в директории, представленной текущим объектом.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Ищет каталоги, соответствующие указанным критериям поиска, в каталоге, представленном текущим объектом.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| searchPattern | const String\& | Шаблон имени каталогов для поиска |

### ReturnValue

Массив разделяемых указателей на объекты [DirectoryInfo](../), представляющие найденные каталоги, имена которых соответствуют **searchPattern**

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Ищет каталоги, соответствующие указанным критериям поиска, либо в каталоге, представленном текущим объектом, либо во всём дереве каталогов, корнем которого является каталог, представленный текущим объектом.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| searchPattern | const String\& | Шаблон имени каталогов для поиска |
| searchOption | SearchOption | Указывает, следует ли выполнять поиск только в каталоге, представленном текущим объектом, или во всём дереве каталогов, корнем которого является каталог, представленный текущим объектом |

### ReturnValue

Массив разделяемых указателей на объекты [DirectoryInfo](../), представляющие найденные каталоги, имена которых соответствуют **searchPattern**

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
