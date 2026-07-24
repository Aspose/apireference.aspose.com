---
title: "System::IO::File::ReadLines 方法"
linktitle: "ReadLines"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::File::ReadLines 方法。使用指定的字符编码逐行读取指定文本文件的内容，并返回一个可枚举的字符串集合，每个字符串代表文件内容中的一行，适用于 C++。"
type: docs
weight: 2600
url: /zh/cpp/system.io/file/readlines/
---
## File::ReadLines method


使用指定的字符编码逐行读取指定文本文件的内容，并返回可枚举的字符串集合，每个字符串表示文件内容中的一行。

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要读取的文件路径 |
| encoding | const EncodingPtr\& | 要使用的字符编码 |

### ReturnValue

一个可枚举的字符串集合，表示指定文件的内容

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
