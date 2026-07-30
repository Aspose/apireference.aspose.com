---
title: "System::IO::BinaryWriter::BinaryWriter 构造函数"
linktitle: "BinaryWriter"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BinaryWriter::BinaryWriter 构造函数。构造一个 BinaryWriter 类的实例，该实例使用指定的编码将数据写入指定的流（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


构造一个 [BinaryWriter](../) 类的实例，该实例使用指定的编码将数据写入指定的流。

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const StreamPtr\& | 输出流 |
| encoding | const EncodingPtr\& | 要使用的编码 |
| leaveopen | bool | 指定在当前对象被释放后，流 **stream** 是否应保持打开状态（true）或关闭（false） |

## 另见

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
