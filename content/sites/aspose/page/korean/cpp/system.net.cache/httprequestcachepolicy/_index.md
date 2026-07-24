---
title: "System::Net::Cache::HttpRequestCachePolicy 클래스"
linktitle: "HttpRequestCachePolicy"
second_title: "C++용 Aspose.Page"
description: "System::Net::Cache::HttpRequestCachePolicy 클래스. RFC2616 HTTP 캐싱 의미를 표현하는 HTTP 캐시 정책입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


RFC2616 HTTP 캐싱 의미를 표현하는 HTTP 캐시 정책입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | 캐시에 저장된 리소스를 재검증해야 하는 시간을 가져옵니다. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | UTC 형식으로 캐시에 저장된 리소스를 재검증해야 하는 시간을 가져옵니다. 내부 전용입니다. |
| [get_Level](./get_level/)() const | RTTI 정보. |
| [get_MaxAge](./get_maxage/)() const | 리소스에 허용되는 최대 수명을 가져옵니다. |
| [get_MaxStale](./get_maxstale/)() const | 리소스에 허용되는 최대 오래됨(staleness) 값을 가져옵니다. |
| [get_MinFresh](./get_minfresh/)() const | 리소스에 허용되는 최소 수명을 가져옵니다. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | 새 인스턴스를 생성합니다. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | 새 인스턴스를 생성합니다. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | 새 인스턴스를 생성합니다. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | 새 인스턴스를 생성합니다. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | 새 인스턴스를 생성합니다. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | 새 인스턴스를 생성합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
