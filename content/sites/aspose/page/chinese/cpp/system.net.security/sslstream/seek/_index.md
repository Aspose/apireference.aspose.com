---
title: "System::Net::Security::SslStream::Seek 方法"
linktitle: "Seek"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Security::SslStream::Seek 方法。设置当前对象所表示的流的位置（C++）。"
type: docs
weight: 3300
url: /zh/cpp/system.net.security/sslstream/seek/
---
## SslStream::Seek method


设置由当前对象表示的流的位置。

```cpp
int64_t System::Net::Security::SslStream::Seek(int64_t offset, IO::SeekOrigin origin) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| offset | int64_t | 相对于 **origin** 指定的位置的字节偏移量 |
| origin | IO::SeekOrigin | 指定计算偏移量的起始位置及其方向 |

### ReturnValue

流的新位置

## 另见

* Enum [SeekOrigin](../../../system.io/seekorigin/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
