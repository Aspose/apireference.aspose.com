---
title: "System::IO::BufferedStream::Seek 方法"
linktitle: "Seek"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::BufferedStream::Seek 方法。设置当前对象所表示的流在 C++ 中的位置。"
type: docs
weight: 1100
url: /zh/cpp/system.io/bufferedstream/seek/
---
## BufferedStream::Seek method


设置由当前对象表示的流的位置。

```cpp
virtual int64_t System::IO::BufferedStream::Seek(int64_t offset, SeekOrigin origin) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| offset | int64_t | 相对于 **origin** 指定的位置的字节偏移量 |
| origin | SeekOrigin | 指定计算偏移量的起始位置及其方向 |

### ReturnValue

流的新位置

## 另见

* Enum [SeekOrigin](../../seekorigin/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
