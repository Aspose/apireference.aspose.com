---
title: "System::Net::Sockets::NetworkStream::Seek 方法"
linktitle: "Seek"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::NetworkStream::Seek 方法。在 C++ 中设置当前对象所表示的流的位置。"
type: docs
weight: 2000
url: /zh/cpp/system.net.sockets/networkstream/seek/
---
## NetworkStream::Seek method


设置由当前对象表示的流的位置。

```cpp
int64_t System::Net::Sockets::NetworkStream::Seek(int64_t offset, IO::SeekOrigin origin) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| offset | int64_t | 相对于 **origin** 指定的位置的字节偏移量 |
| origin | IO::SeekOrigin | 指定计算偏移量的起始位置及其方向 |

### ReturnValue

流的新位置

## 另见

* Enum [SeekOrigin](../../../system.io/seekorigin/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
