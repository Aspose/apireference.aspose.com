---
title: "System::IO::File::OpenText 方法"
linktitle: "OpenText"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::File::OpenText 方法。使用 UTF-8 编码在 C++ 中以无共享方式打开指定的已存在文件进行文本读取。"
type: docs
weight: 2100
url: /zh/cpp/system.io/file/opentext/
---
## File::OpenText method


使用 UTF-8 编码打开指定的现有文件进行文本读取，且不共享。

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要打开的文件路径 |
| encoding | const EncodingPtr\& | 要使用的字符编码 |

### ReturnValue

一个指向已打开文件的 [StreamWriter](../../streamwriter/) 对象的共享指针

## 另见

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
