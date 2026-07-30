---
title: "System::IO::TextReader::ReadBlock 方法"
linktitle: "ReadBlock"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::TextReader::ReadBlock 方法。读取当前文本读取器中指定的最大字符数，并将数据写入缓冲区，从指定的索引开始（在 C++ 中）。"
type: docs
weight: 500
url: /zh/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


从当前文本读取器读取指定的最大字符数，并将数据写入缓冲区，从指定索引开始。

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | 用于写入读取数据的字符缓冲区 |
| 索引 | int | 在 **buffer** 中的基于0的索引，用于开始写入 |
| count | int | 要读取的最大字符数 |

### ReturnValue

实际读取的字符数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
