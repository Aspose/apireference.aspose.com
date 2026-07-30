---
title: "System::IO::DirectoryInfo::GetFiles method"
linktitle: "GetFiles"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::DirectoryInfo::GetFiles method. 返回一个数组，包含指向 FileInfo 对象的共享指针，这些对象表示当前对象表示的目录中所有文件（C++）。"
type: docs
weight: 1300
url: /zh/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


返回一个数组，包含指向 [FileInfo](../../fileinfo/) 对象的共享指针，这些对象表示当前对象表示的目录中所有目录。

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


在当前对象表示的目录中搜索满足指定搜索条件的文件。

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 用于搜索的文件名称模式 |

### ReturnValue

一个数组，包含指向 [FileInfo](../../fileinfo/) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的已找到文件

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


在当前对象表示的目录或以该目录为根的整个目录树中搜索满足指定搜索条件的文件。

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 用于搜索的文件名称模式 |
| searchOption | SearchOption | 指定搜索是仅在当前对象表示的目录中进行，还是在以该目录为根的整个目录树中进行 |

### ReturnValue

一个数组，包含指向 [FileInfo](../../fileinfo/) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的已找到文件

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
