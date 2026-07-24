---
title: "System::Net::Cache::HttpRequestCacheLevel enum"
linktitle: "HttpRequestCacheLevel"
second_title: "C++용 Aspose.Page"
description: "System::Net::Cache::HttpRequestCacheLevel enum. 이 열거형은 C++에서 HTTP에 대한 캐시 설정을 설명합니다."
type: docs
weight: 400
url: /ko/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


이 열거형은 HTTP에 대한 캐시 설정을 설명합니다.

```cpp
enum class HttpRequestCacheLevel
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Default | 0 | 리소스에 대한 요청을 리소스의 캐시된 복사본을 사용하거나 서버에 리소스 요청을 전송하여 만족시킵니다. |
| BypassCache | 1 | 서버를 사용하여 요청을 만족시킵니다. |
| CacheOnly | 2 | 항상 클라이언트 캐시를 사용하여 리소스를 가져옵니다. |
| CacheIfAvailable | 3 | 리소스가 캐시에서 사용 가능하면 캐시에서 요청을 만족시키고, 그렇지 않으면 서버에 요청을 보냅니다. |
| 재검증 | 4 | 클라이언트 타임스탬프가 서버의 리소스 타임스탬프와 동일하면 로컬 복사본을 사용합니다. 그렇지 않으면 서버에서 리소스를 다운로드합니다. |
| 새로 고침 | 5 | 리소스는 항상 서버에서 다운로드됩니다. |
| NoCacheNoStore | 6 | 캐시의 리소스를 사용하여 요청을 절대 만족시키지 않으며, 리소스를 캐시하지도 않습니다. |
| CacheOrNextCacheOnly | 7 | 로컬 컴퓨터의 캐시 또는 LAN상의 원격 캐시 중 하나에서 리소스에 대한 요청을 만족시�니다. |
| Refresh | 8 | 서버를 사용하거나 로컬 캐시가 아닌 다른 캐시를 사용하여 요청을 만족시킵니다. |

## 또 보기

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
