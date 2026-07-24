---
title: "System::IO::BinaryWriter::Seek 方法"
linktitle: "Seek"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::BinaryWriter::Seek 方法。设置当前对象所表示的流的位置（在 C++ 中）。"
type: docs
weight: 700
url: /zh/cpp/system.io/binarywriter/seek/
---
## BinaryWriter::Seek method


设置由当前对象表示的流的位置。

```cpp
int64_t System::IO::BinaryWriter::Seek(int offset, System::IO::SeekOrigin origin=System::IO::SeekOrigin::Begin)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| offset | int | 相对于 **origin** 指定的位置的字节偏移量 |
| origin | System::IO::SeekOrigin | 指定计算偏移量的起始位置及其方向 |

### ReturnValue

流的新位置

## 另见

* Enum [SeekOrigin](../../seekorigin/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
