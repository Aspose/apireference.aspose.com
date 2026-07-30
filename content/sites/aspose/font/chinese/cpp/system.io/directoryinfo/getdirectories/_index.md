---
title: "System::IO::DirectoryInfo::GetDirectories 方法"
linktitle: "GetDirectories"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::DirectoryInfo::GetDirectories 方法。返回一个数组，包含指向在 C++ 中由当前对象表示的目录中所有子目录的 DirectoryInfo 对象的共享指针。"
type: docs
weight: 1200
url: /zh/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


返回一个数组，包含指向 [DirectoryInfo](../) 对象的共享指针，这些对象表示当前对象所代表目录中所有子目录。

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


在当前对象表示的目录中搜索满足指定搜索条件的目录。

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 用于搜索的目录名称模式 |

### ReturnValue

一个包含指向 [DirectoryInfo](../) 对象的共享指针的数组，这些对象表示名称匹配 **searchPattern** 的已找到目录

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


在当前对象表示的目录或以该目录为根的整个目录树中搜索满足指定搜索条件的目录。

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 用于搜索的目录名称模式 |
| searchOption | SearchOption | 指定搜索是仅在当前对象表示的目录中进行，还是在以该目录为根的整个目录树中进行 |

### ReturnValue

一个包含指向 [DirectoryInfo](../) 对象的共享指针的数组，这些对象表示名称匹配 **searchPattern** 的已找到目录

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
