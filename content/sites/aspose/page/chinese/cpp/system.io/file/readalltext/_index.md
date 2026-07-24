---
title: "System::IO::File::ReadAllText 方法"
linktitle: "ReadAllText"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::File::ReadAllText 方法。在 C++ 中使用指定的字符编码，将指定文本文件的内容读取为单个 String 对象。"
type: docs
weight: 2500
url: /zh/cpp/system.io/file/readalltext/
---
## File::ReadAllText method


使用指定的字符编码，将指定文本文件的内容读取为单个 [String](../../../system/string/) 对象。

```cpp
static String System::IO::File::ReadAllText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要读取的文件路径 |
| encoding | const EncodingPtr\& | 要使用的字符编码 |

### ReturnValue

包含指定文件内容的字符串

## 另见

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
