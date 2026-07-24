---
title: "System::IO::DirectoryInfo::EnumerateFiles 方法"
linktitle: "EnumerateFiles"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::DirectoryInfo::EnumerateFiles 方法。返回一个可枚举集合，包含当前对象所代表的目录中所有的文件（在 C++ 中）。"
type: docs
weight: 600
url: /zh/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


返回一个可枚举集合，包含当前对象表示的目录中所有文件。

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


在当前对象表示的目录中搜索满足指定搜索条件的文件。

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 要搜索的文件的名称模式 |

### ReturnValue

可枚举的集合，包含指向 [FileInfo](../../fileinfo/) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的已找到文件。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


在当前对象表示的目录中或在以该目录为根的整个目录树中搜索满足指定搜索条件的文件。

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 要搜索的文件的名称模式 |
| searchOption | SearchOption | 指定搜索是仅在当前对象所代表的目录中进行，还是在以该目录为根的整个目录树中进行。 |

### ReturnValue

可枚举的集合，包含指向 [FileInfo](../../fileinfo/) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的已找到文件。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
