---
title: "System::IO::TextReader::Read 方法"
linktitle: "Read"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::TextReader::Read 方法。在 C++ 中从流中读取单个字符。"
type: docs
weight: 400
url: /zh/cpp/system.io/textreader/read/
---
## TextReader::Read() method


从流中读取单个字符。

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

读取使用 UTF-16 编码的字符；如果读取的字符在 UTF-16 编码中由两个代码点表示，则仅返回高位代理项。

## 另见

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


从流中读取指定数量的字符，并将它们写入指定字符数组，从指定位置开始。

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | 用于写入从流中读取的字符的 UTF-16 字符数组 |
| 索引 | int | 在 **buffer** 中的 0 基索引，指示写入的起始位置 |
| count | int | 要从流中读取的字符数 |

### ReturnValue

从流中读取的字符数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
