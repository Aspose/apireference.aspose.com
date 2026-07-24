---
title: "System::IO::File::AppendAllLines 方法"
linktitle: "AppendAllLines"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::File::AppendAllLines 方法。在 C++ 中使用指定的编码，将指定字符串集合中的字符串追加到指定文件，每个字符串写入新行。如果指定的文件不存在，则会创建该文件。写入所有字符串后关闭文件。"
type: docs
weight: 100
url: /zh/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


使用指定的编码，将指定字符串集合中的字符串逐行写入指定文件。如果指定的文件不存在，则会创建该文件。写入所有字符串后关闭文件。

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要追加字符串的文件路径 |
| 内容 | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | 要写入文件的字符串 |
| encoding | const EncodingPtr\& | 要使用的字符编码 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
