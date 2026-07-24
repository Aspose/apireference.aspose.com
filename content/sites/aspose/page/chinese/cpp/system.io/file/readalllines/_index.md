---
title: "System::IO::File::ReadAllLines 方法"
linktitle: "ReadAllLines"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::File::ReadAllLines 方法。使用指定的字符编码逐行读取指定文本文件的内容，并将其存入字符串数组（在 C++ 中）。"
type: docs
weight: 2400
url: /zh/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


使用指定的字符编码逐行读取指定文本文件的内容到字符串数组中。

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要读取的文件路径 |
| encoding | const EncodingPtr\& | 要使用的字符编码 |

### ReturnValue

一个字符串数组，其中每个元素代表指定文件中的单独一行

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
