---
title: "System::IO::File::WriteAllLines 方法"
linktitle: "WriteAllLines"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::File::WriteAllLines 方法。创建一个新文本文件或覆盖已有文件，并使用指定的编码在 C++ 中将指定字符串数组中的所有字符串写入文件，每个字符串占一行。"
type: docs
weight: 3600
url: /zh/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


创建新文本文件或覆盖已有文件，并使用指定的编码将指定字符串数组中的所有字符串写入文件，每个字符串占一行。

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要创建或覆盖的文件 |
| 内容 | const ArrayPtr\<String\>\& | 字符串数组 |
| encoding | const EncodingPtr\& | 要使用的字符编码 |

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


创建新文本文件或覆盖已有文件，并使用指定的编码将指定可枚举字符串集合中的所有字符串写入文件，每个字符串占一行。

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const String\& | 要创建或覆盖的文件 |
| 内容 | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | 可枚举的字符串集合 |
| encoding | const EncodingPtr\& | 要使用的字符编码 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
