---
title: "System::IO::File::AppendText 方法"
linktitle: "AppendText"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::File::AppendText 方法。创建一个使用 UTF-8 编码将文本追加到指定文件的 StreamWriter 对象。如果指定的文件不存在，则在 C++ 中创建它。"
type: docs
weight: 300
url: /zh/cpp/system.io/file/appendtext/
---
## File::AppendText method


创建一个使用 UTF-8 编码将文本追加到指定文件的 [StreamWriter](../../streamwriter/) 对象。如果指定的文件不存在，则会创建它。

```cpp
static StreamWriterPtr System::IO::File::AppendText(const String &path)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要打开或创建的文件路径 |

### ReturnValue

指向已创建的与指定文件关联的 [StreamWriter](../../streamwriter/) 对象的共享指针

## 另见

* Typedef [StreamWriterPtr](../../../system/streamwriterptr/)
* Class [String](../../../system/string/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
