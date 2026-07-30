---
title: "System::Net::Sockets::SocketType 枚举"
linktitle: "SocketType"
second_title: "Aspose.Font 适用于 C++"
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
| 流 | 1 | 支持可靠、双向、基于连接的字节流的类型，且不产生数据重复，也不保留边界。 |
| 数据报 | 2 | 支持数据报的类型，数据报是无连接、不可靠且具有固定最大长度的消息。 |
| Raw | 3 | 支持访问底层传输协议的类型。 |
| Rdm | 4 | 支持无连接、面向消息、可靠传递且在数据中保留消息边界的类型。 |
| Seqpacket | 5 | 提供面向连接且可靠的双向有序字节流在网络中传输的类型。 |
| 未知 | n/a | 未知类型。 |

## 另见

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
