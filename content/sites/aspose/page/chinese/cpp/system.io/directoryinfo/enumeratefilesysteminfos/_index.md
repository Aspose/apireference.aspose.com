---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos 方法"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos 方法。返回一个可枚举的集合，包含当前对象所表示目录中所有的文件和子目录（C++）。"
type: docs
weight: 700
url: /zh/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


返回一个可枚举集合，包含当前对象表示的目录中所有文件和子目录。

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


在当前对象表示的目录中搜索满足指定搜索条件的文件和子目录。

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 要搜索的文件和目录的名称模式 |

### ReturnValue

可枚举的集合，包含指向 [FileSystemInfo](../../filesysteminfo/) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的找到的文件和目录

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


在当前对象表示的目录中或在以该目录为根的整个目录树中搜索满足指定搜索条件的文件和子目录。

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 要搜索的文件和目录的名称模式 |
| searchOption | SearchOption | 指定搜索是仅在当前对象所代表的目录中进行，还是在以该目录为根的整个目录树中进行。 |

### ReturnValue

可枚举的集合，包含指向 [FileSystemInfo](../../filesysteminfo/) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的找到的文件和目录

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
