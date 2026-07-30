---
title: "System::IO::Directory::Delete 方法"
linktitle: "Delete"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Directory::Delete 方法。删除指定的文件或目录。在 C++ 中不会抛出异常。"
type: docs
weight: 200
url: /zh/cpp/system.io/directory/delete/
---
## Directory::Delete method


删除指定的文件或目录。不会抛出异常。

```cpp
static void System::IO::Directory::Delete(const String &path, bool recursive=false)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要删除的目录或文件的路径 |
| 递归 | bool | 如果 **path** 指定的是非空目录，则 **recursive** 指定是否应递归删除目录的所有内容；如果 **path** 指定的目录非空且 **recursive** 为 'false'，则操作失败 |

## 另见

* Class [String](../../../system/string/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
