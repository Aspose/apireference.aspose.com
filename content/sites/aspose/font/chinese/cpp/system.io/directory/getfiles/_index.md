---
title: "System::IO::Directory::GetFiles 方法"
linktitle: "GetFiles"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Directory::GetFiles 方法。搜索满足指定搜索条件的文件，可以在指定目录中或在以该目录为根的整个目录树中进行（C++）。"
type: docs
weight: 1200
url: /zh/cpp/system.io/directory/getfiles/
---
## Directory::GetFiles method


在指定目录或以指定目录为根的整个目录树中搜索满足指定搜索条件的文件。

```cpp
static ArrayPtr<String> System::IO::Directory::GetFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要搜索的目录的完整路径或相对路径 |
| searchPattern | const String\& | 用于搜索的文件名称模式 |
| searchOption | SearchOption | 指定搜索是仅在指定目录中进行，还是在以指定目录为根的整个目录树中进行 |

### ReturnValue

一个数组，包含名称匹配 **searchPattern** 的找到的文件的完整路径

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
