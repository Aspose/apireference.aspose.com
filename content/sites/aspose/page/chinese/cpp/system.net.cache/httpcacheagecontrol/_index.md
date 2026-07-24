---
title: "System::Net::Cache::HttpCacheAgeControl 枚举"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Cache::HttpCacheAgeControl 枚举。CacheAgeControl 用于在 C++ 中指定对缓存项年龄和新鲜度的偏好。"
type: docs
weight: 300
url: /zh/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl 用于指定关于缓存项年龄和新鲜度的偏好。

```cpp
enum class HttpCacheAgeControl
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| None | 0 | 仅供内部使用。 |
| MinFresh | 1 | 如果在过期前剩余的时间大于或等于此值指定的时间，则可以从缓存中获取内容。 |
| MaxAge | 2 | 内容可以从缓存中获取，直到其年龄超过此值指定的期限。 |
| MaxStale | 4 | 内容可以在缓存过期后继续获取，直至此值指定的时间结束。 |
| MaxAgeAndMinFresh | 3 | MaxAge 和 MinFresh。 |
| MaxAgeAndMaxStale | 6 | MaxAge 和 MaxStale。 |

## 另见

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
