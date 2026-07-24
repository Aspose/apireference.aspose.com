---
title: "System::IO::Directory::EnumerateFiles 方法"
linktitle: "EnumerateFiles"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::Directory::EnumerateFiles 方法。在 C++ 中搜索满足指定搜索条件的文件，可以在指定目录中或在以指定目录为根的整个目录树中进行搜索。"
type: docs
weight: 400
url: /zh/cpp/system.io/directory/enumeratefiles/
---
## Directory::EnumerateFiles method


在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的文件。

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要搜索的目录的完整或相对路径 |
| searchPattern | const String\& | 要搜索的文件的名称模式 |
| searchOption | SearchOption | 指定搜索是仅在指定目录中进行，还是在以指定目录为根的整个目录树中进行 |

### ReturnValue

一个可枚举的集合，包含名称匹配 **searchPattern** 的找到的文件的完整路径

## 另见

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
