---
title: "System::IO::Directory::GetDirectories 方法"
linktitle: "GetDirectories"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Directory::GetDirectories 方法。搜索满足指定搜索条件的目录，可以在指定目录或以指定目录为根的整个目录树中进行（C++）。"
type: docs
weight: 1000
url: /zh/cpp/system.io/directory/getdirectories/
---
## Directory::GetDirectories method


在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的目录。

```cpp
static ArrayPtr<String> System::IO::Directory::GetDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要搜索的目录的完整路径或相对路径 |
| searchPattern | const String\& | 用于搜索的目录名称模式 |
| searchOption | SearchOption | 指定搜索是仅在指定目录中进行，还是在以指定目录为根的整个目录树中进行 |

### ReturnValue

一个数组，包含名称匹配 **searchPattern** 的已找到目录的完整路径

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
