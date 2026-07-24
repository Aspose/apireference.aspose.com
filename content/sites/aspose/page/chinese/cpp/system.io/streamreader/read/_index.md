---
title: "System::IO::StreamReader::Read 方法"
linktitle: "读取"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::StreamReader::Read 方法。 在 C++ 中读取流中的单个字符。"
type: docs
weight: 900
url: /zh/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


从流中读取单个字符。

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

读取使用 UTF-16 编码的字符；如果读取的字符在 UTF-16 编码中由两个代码点表示，则仅返回高位代理项。

## 另见

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


从流中读取指定数量的字符，将其转换为 UTF-16 编码，并将生成的 UTF-16 字符写入指定字符数组，从指定位置开始。

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | ArrayPtr\<char_t\> | 用于写入从流中读取的字符的 UTF-16 字符数组 |
| 索引 | int | 在 **buffer** 中的 0 基索引，指定写入的起始位置 |
| count | int | 要从流中读取的字符数 |

### ReturnValue

从流中读取的字符数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
