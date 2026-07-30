---
title: "System::IO::DirectoryInfo::GetFileSystemInfos 方法"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::DirectoryInfo::GetFileSystemInfos 方法。返回一个数组，包含指向 FileSystemInfo 对象的共享指针，这些对象表示当前对象所表示目录中所有的文件和子目录（C++）。"
type: docs
weight: 1400
url: /zh/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


返回一个数组，包含指向 [FileSystemInfo](../../filesysteminfo/) 对象的共享指针，这些对象表示当前对象所表示目录中所有的文件和子目录。

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


在当前对象表示的目录中搜索满足指定搜索条件的文件和目录。

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 要搜索的文件和目录的名称模式 |

### ReturnValue

一个数组，包含指向 [FileSystemInfo](../../filesysteminfo/) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的已找到文件和目录。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


在当前对象表示的目录或以该目录为根的整个目录树中搜索满足指定搜索条件的文件和目录。

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 要搜索的文件和目录的名称模式 |
| searchOption | SearchOption | 指定搜索是仅在当前对象表示的目录中进行，还是在以该目录为根的整个目录树中进行 |

### ReturnValue

一个数组，包含指向 [FileSystemInfo](../../filesysteminfo/) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的已找到文件和目录。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
