---
title: "System::IO::StringReader::Read 方法"
linktitle: "Read"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::StringReader::Read 方法. 在 C++ 中从流读取单个字符。"
type: docs
weight: 500
url: /zh/cpp/system.io/stringreader/read/
---
## StringReader::Read() method


从流中读取单个字符。

```cpp
virtual int System::IO::StringReader::Read() override
```


### ReturnValue

读取的字符，若未读取字符则返回 -1

## 另见

* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StringReader::Read(ArrayPtr\<char_t\>, int, int) method


从流中读取指定数量的字符到指定的字符数组中，起始位置为指定的索引。

```cpp
virtual int System::IO::StringReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | 用于写入从流读取的字符的字符数组 |
| 索引 | int | 在 **buffer** 中的 0 基索引，指示写入的起始位置 |
| count | int | 要从流中读取的字符数 |

### ReturnValue

从流中读取的字符数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
