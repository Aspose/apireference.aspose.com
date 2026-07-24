---
title: "System::IO::DirectoryInfo::EnumerateDirectories 方法"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::DirectoryInfo::EnumerateDirectories 方法。返回一个可枚举集合，包含当前对象所代表目录中的所有目录（在 C++ 中）。"
type: docs
weight: 500
url: /zh/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


返回一个可枚举集合，包含当前对象表示的目录中所有子目录。

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


在当前对象表示的目录中搜索满足指定搜索条件的目录。

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 要搜索的目录的名称模式 |

### ReturnValue

可枚举集合，包含指向 [DirectoryInfo](../) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的找到的目录。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


在当前对象表示的目录或以其为根的整个目录树中搜索满足指定搜索条件的目录。

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| searchPattern | const String\& | 要搜索的目录的名称模式 |
| searchOption | SearchOption | 指定搜索是仅在当前对象所代表的目录中进行，还是在以该目录为根的整个目录树中进行。 |

### ReturnValue

可枚举集合，包含指向 [DirectoryInfo](../) 对象的共享指针，这些对象表示名称匹配 **searchPattern** 的找到的目录。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
