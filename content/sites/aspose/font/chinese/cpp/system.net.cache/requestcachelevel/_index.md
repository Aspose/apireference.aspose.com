---
title: "System::Net::Cache::RequestCacheLevel 枚举"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Cache::RequestCacheLevel 枚举。该枚举描述了适用于任何 C++ 中的 WebRequest 的缓存设置。"
type: docs
weight: 500
url: /zh/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


该枚举描述了适用于任何 [WebRequest](../../system.net/webrequest/) 的缓存设置。

```cpp
enum class RequestCacheLevel
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 默认 | 0 | 满足对资源的请求，方式可以是使用资源的缓存副本或向服务器发送请求获取资源。 |
| BypassCache | 1 | 通过使用服务器来满足请求。不会从缓存中获取任何条目。 |
| CacheOnly | 2 | 仅从缓存满足对资源的请求。当资源不在客户端缓存中时，将抛出 [WebException](../../system.net/webexception/)。 |
| CacheIfAvailable | 3 | 如果资源可用，则从缓存满足对资源的请求；否则向服务器发送请求。 |
| Revalidate | 4 | 如果客户端时间戳与服务器上资源的时间戳相同，则使用资源的本地副本。否则，从服务器下载资源。 |
| Reload | 5 | 资源始终从服务器下载。 |
| NoCacheNoStore | 6 | 永不通过使用缓存中的资源来满足请求，也不缓存资源。 |

## 另见

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
