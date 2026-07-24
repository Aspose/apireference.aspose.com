---
title: "System::Net::Cache::HttpRequestCacheLevel 枚举"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Cache::HttpRequestCacheLevel 枚举。该枚举描述了 C++ 中 HTTP 的缓存设置。"
type: docs
weight: 400
url: /zh/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


此枚举描述了 HTTP 的缓存设置。

```cpp
enum class HttpRequestCacheLevel
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Default | 0 | 满足对资源的请求，可以使用资源的缓存副本，或向服务器发送资源请求。 |
| BypassCache | 1 | 通过使用服务器来满足请求。 |
| CacheOnly | 2 | 始终使用客户端缓存获取资源。 |
| CacheIfAvailable | 3 | 如果缓存中有资源可用，则满足对资源的请求；否则向服务器发送请求。 |
| 重新验证 | 4 | 如果客户端时间戳与服务器上资源的时间戳相同，则使用资源的本地副本。否则，从服务器下载资源。 |
| 重新加载 | 5 | 资源始终从服务器下载。 |
| NoCacheNoStore | 6 | 永不通过使用缓存中的资源来满足请求，并且不缓存资源。 |
| CacheOrNextCacheOnly | 7 | 满足对资源的请求，可以来自本地计算机的缓存或局域网中的远程缓存。 |
| Refresh | 8 | 通过使用服务器或非本地缓存来满足请求。 |

## 另见

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
