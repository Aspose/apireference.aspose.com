---
title: "System::Net::Sockets::SocketType 枚举"
linktitle: "SocketType"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::SocketType 枚举。枚举 C++ 中的套接字类型。"
type: docs
weight: 1800
url: /zh/cpp/system.net.sockets/sockettype/
---
## SocketType enum


枚举套接字类型。

```cpp
enum class SocketType
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Stream | 1 | 支持可靠、双向、基于连接的字节流且不产生数据重复且不保留边界的类型。 |
| Dgram | 2 | 支持数据报的类型，数据报是无连接、不可靠、具有固定最大长度的消息。 |
| Raw | 3 | 支持访问底层传输协议的类型。 |
| Rdm | 4 | 支持无连接、面向消息、可靠传递且在数据中保留消息边界的类型。 |
| Seqpacket | 5 | 提供面向连接且可靠的双向有序字节流跨网络传输的类型。 |
| 未知 | n/a | 未知类型。 |

## 另见

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
