---
title: "System::IO::FileStream::Seek 方法"
linktitle: "Seek"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::FileStream::Seek 方法。 在 C++ 中设置当前对象所表示的流的位置。"
type: docs
weight: 1600
url: /zh/cpp/system.io/filestream/seek/
---
## FileStream::Seek method


设置由当前对象表示的流的位置。

```cpp
int64_t System::IO::FileStream::Seek(int64_t offset, SeekOrigin origin) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| offset | int64_t | 相对于 **origin** 指定位置的字节偏移量。 |
| origin | SeekOrigin | 指定计算偏移量的起始位置以及偏移的方向。 |

### ReturnValue

流的新位置。

## 另见

* Enum [SeekOrigin](../../seekorigin/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
