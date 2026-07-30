---
title: "System::IO::BinaryReader::Read 方法"
linktitle: "Read"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BinaryReader::Read 方法。读取输入流中的单个字符（C++）。"
type: docs
weight: 700
url: /zh/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


从输入流读取单个字符。

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

读取使用 UTF-16 编码的字符；如果读取的字符在 UTF-16 编码中由两个代码点表示，则仅返回高位代理项。

## 另见

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


从输入流读取指定数量的字符，将其转换为 UTF-16 编码，并将生成的 UTF-16 字符写入指定字符数组的指定位置开始处。

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | 用于写入从输入流读取的字符的 UTF-16 字符数组 |
| 索引 | int | 在 **buffer** 中的 0 基索引，指示写入的起始位置 |
| count | int | 要从流中读取的字符数 |

### ReturnValue

从输入流读取的字符数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


从输入流读取指定数量的字节并将其写入指定的字节数组。

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | 用于写入读取字节的字节数组 |
| 索引 | int | 在 **buffer** 中开始写入的 0 基位置 |
| count | int | 要读取的字节数 |

### ReturnValue

读取的字节数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
