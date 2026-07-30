---
title: "System::Net::Sockets::NetworkStream::Seek 方法"
linktitle: "定位"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::NetworkStream::Seek 方法。设置当前对象所表示的流的位置（C++）。"
type: docs
weight: 2000
url: /zh/cpp/system.net.sockets/networkstream/seek/
---
## NetworkStream::Seek method


设置当前对象所表示的流的位置。

```cpp
int64_t System::Net::Sockets::NetworkStream::Seek(int64_t offset, IO::SeekOrigin origin) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| offset | int64_t | 相对于 **origin** 指定位置的字节偏移量 |
| origin | IO::SeekOrigin | 指定计算偏移量的起始位置和方向 |

### ReturnValue

流的新位置

## 另见

* Enum [SeekOrigin](../../../system.io/seekorigin/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
