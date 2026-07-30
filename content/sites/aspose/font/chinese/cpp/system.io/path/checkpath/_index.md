---
title: "System::IO::Path::CheckPath 方法"
linktitle: "CheckPath"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Path::CheckPath 方法。通过检查指定路径是否包含无效字符来确定其是否有效。如果路径包含无效字符，则在 C++ 中抛出异常。"
type: docs
weight: 200
url: /zh/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


通过检查指定路径是否包含无效字符来确定其是否有效。如果路径包含无效字符，将抛出异常。

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要检查的路径 |
| msg | const String\& | 传递给异常对象构造函数的消息 |
| allow_empty | bool | 指定是否应将空字符串或 null 字符串视为有效路径（true）或无效路径（false）；如果此参数为 false 且 **path** 为空，则抛出 ArgumentException；如果此参数为 false 且 **path** 为 null，则抛出 ArgumentNullException |

## 另见

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
