---
title: "System::Net::WebExceptionStatus 枚举"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebExceptionStatus 枚举。枚举 C++ 中 WebException 类的状态代码。"
type: docs
weight: 4900
url: /zh/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


枚举 [WebException](../webexception/) 类的状态代码。

```cpp
enum class WebExceptionStatus
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Success | 0 | 未发生错误。 |
| NameResolutionFailure | 1 | 名称解析服务无法解析主机名。 |
| ConnectFailure | 2 | 在传输层无法联系远程服务点。 |
| ReceiveFailure | 3 | 未从远程服务器收到完整响应。 |
| SendFailure | 4 | 无法向远程服务器发送完整请求。 |
| PipelineFailure | 5 | 该请求是流水线请求，但在收到响应之前连接已关闭。 |
| RequestCanceled | 6 | 请求被取消或出现未分类错误。 |
| ProtocolError | 7 | 从服务器收到的响应完整，但指示协议级错误。 |
| ConnectionClosed | 8 | 连接被过早关闭。 |
| TrustFailure | 9 | 服务器证书无法验证。 |
| SecureChannelFailure | 10 | 在使用 SSL 建立连接时发生错误。 |
| ServerProtocolViolation | 11 | 服务器响应不是有效的 HTTP 响应。 |
| KeepAliveFailure | 12 | 指定了 'Keep-Alive' 头的请求的连接意外关闭。 |
| Pending | 13 | 内部异步请求正在挂起。 |
| Timeout | 14 | 在请求的超时时间内未收到响应。 |
| ProxyNameResolutionFailure | 15 | 名称解析服务无法解析代理主机名。 |
| UnknownError | 16 | 发生了未知类型的异常。 |
| MessageLengthLimitExceeded | 17 | 收到了一条超出指定限制的消息。 |
| CacheEntryNotFound | 18 | 未找到指定的缓存条目。 |
| RequestProhibitedByCachePolicy | 19 | 该请求未被缓存策略允许。 |
| RequestProhibitedByProxy | 20 | 此请求未被代理允许。 |

## 另见

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
