---
title: "System::IO::Directory::EnumerateFiles 方法"
linktitle: "EnumerateFiles"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Directory::EnumerateFiles 方法。搜索满足指定搜索条件的文件，可以在指定目录或以指定目录为根的整个目录树中进行（C++）。"
type: docs
weight: 400
url: /zh/cpp/system.io/directory/enumeratefiles/
---
## Directory::EnumerateFiles method


在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的文件。

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要搜索的目录的完整路径或相对路径 |
| searchPattern | const String\& | 用于搜索的文件名称模式 |
| searchOption | SearchOption | 指定搜索是仅在指定目录中进行，还是在以指定目录为根的整个目录树中进行 |

### ReturnValue

一个可枚举集合，包含名称匹配 **searchPattern** 的已找到文件的完整路径

## 另见

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
