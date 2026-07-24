---
title: "System::Net::Cache::HttpCacheAgeControl enum"
linktitle: "HttpCacheAgeControl"
second_title: "C++용 Aspose.Page"
description: "System::Net::Cache::HttpCacheAgeControl enum. CacheAgeControl은 C++에서 캐시된 항목의 연령 및 신선도에 대한 선호도를 지정하는 데 사용됩니다."
type: docs
weight: 300
url: /ko/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl은 캐시된 항목의 연령 및 신선도에 대한 선호도를 지정하는 데 사용됩니다.

```cpp
enum class HttpCacheAgeControl
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | 0 | 내부 전용입니다. |
| MinFresh | 1 | 만료까지 남은 시간이 이 값으로 지정된 시간보다 크거나 같으면 캐시에서 콘텐츠를 가져올 수 있습니다. |
| MaxAge | 2 | 콘텐츠는 이 값으로 지정된 기간보다 오래될 때까지 캐시에서 가져올 수 있습니다. |
| MaxStale | 4 | 콘텐츠가 만료된 후에도 이 값으로 지정된 시간이 경과할 때까지 캐시에서 가져올 수 있습니다. |
| MaxAgeAndMinFresh | 3 | MaxAge와 MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge와 MaxStale. |

## 또 보기

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
