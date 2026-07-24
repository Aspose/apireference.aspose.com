---
title: "System::Net::Http::Headers::CacheControlHeaderValue 클래스"
linktitle: "CacheControlHeaderValue"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::CacheControlHeaderValue 클래스. ''Cache-Control'' 헤더의 값을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 200
url: /ko/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


'Cache-Control' 헤더의 값을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인수로 전달할 때 이 포인터를 사용하십시오.

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | 새 인스턴스를 생성합니다. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_Extensions](./get_extensions/)() | 캐시 확장 토큰 컬렉션을 반환합니다. |
| [get_MaxAge](./get_maxage/)() | 클라이언트가 응답을 허용하는 기간을 결정하는 최대 연령 값을 초 단위로 가져옵니다. |
| [get_MaxStale](./get_maxstale/)() | 클라이언트가 만료된 응답을 허용할지 여부를 결정하는 값을 가져옵니다. |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | 클라이언트가 만료된 응답을 허용하는 기간을 초 단위로 결정하는 값을 가져옵니다. |
| [get_MinFresh](./get_minfresh/)() | 신선도 수명을 결정하는 값을 가져옵니다. |
| [get_MustRevalidate](./get_mustrevalidate/)() | 서버가 캐시 항목이 오래되었을 때 재검증이 필요한지를 결정하는 값을 가져옵니다. |
| [get_NoCache](./get_nocache/)() | RTTI 정보. |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | ‘Cache-Control’ 헤더의 ‘no-cache’ 지시어에 있는 필드 이름 컬렉션을 가져옵니다. |
| [get_NoStore](./get_nostore/)() | 캐시가 HTTP 요청 또는 응답의 어떤 부분도 저장해서는 안 되는지를 결정하는 값을 가져옵니다. |
| [get_NoTransform](./get_notransform/)() | 캐시 또는 프록시가 엔터티 본문의 어떤 부분도 변경해서는 안 되는지를 결정하는 값을 가져옵니다. |
| [get_OnlyIfCached](./get_onlyifcached/)() | 클라이언트가 캐시된 항목만 사용해야 하는지를 결정하는 값을 가져옵니다. |
| [get_Private](./get_private/)() | HTTP 응답 메시지 또는 그 일부가 단일 사용자용이며 공유 캐시에서 캐시되지 않아야 하는지를 결정하는 값을 가져옵니다. |
| [get_PrivateHeaders](./get_privateheaders/)() | ‘Cache-Control’ 헤더의 ‘private’ 지시어에 있는 필드 이름 컬렉션을 가져옵니다. |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | 공유 사용자 에이전트 캐시에서 캐시 항목이 오래되었을 때 서버가 재검증을 요구하는지를 결정하는 값을 가져옵니다. |
| [get_Public](./get_public/)() | HTTP 응답을 어떤 캐시든지 저장할 수 있는지를 결정하는 값을 가져옵니다. |
| [get_SharedMaxAge](./get_sharedmaxage/)() | 공유 캐시에서 'Cache-Control' 헤더의 'max-age' 지시어 또는 'Expires' 헤더를 무시하고 초 단위의 공유 최대 연령 값을 가져옵니다. |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | 지정된 인덱스부터 전달된 문자열을 [CacheControlHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| static [Parse](./parse/)(String) | 전달된 문자열을 [CacheControlHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | 클라이언트가 응답을 허용하는 기간을 결정하는 초 단위 최대 연령 값을 설정합니다. |
| [set_MaxStale](./set_maxstale/)(bool) | 클라이언트가 만료된 응답을 허용하는지를 결정하는 값을 설정합니다. |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | 클라이언트가 만료된 응답을 허용하는 기간을 결정하는 초 단위 값을 설정합니다. |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | 신선도 수명을 결정하는 값을 설정합니다. |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | 서버가 캐시 항목이 오래되었을 때 재검증이 필요한지를 결정하는 값을 설정합니다. |
| [set_NoCache](./set_nocache/)(bool) | 클라이언트가 캐시된 응답을 허용하는지를 결정하는 값을 설정합니다. |
| [set_NoStore](./set_nostore/)(bool) | 캐시가 HTTP 요청 또는 응답의 어떤 부분도 저장해서는 안 되는지를 결정하는 값을 설정합니다. |
| [set_NoTransform](./set_notransform/)(bool) | 캐시 또는 프록시가 엔터티 본문의 어떤 부분도 변경해서는 안 되는지를 결정하는 값을 설정합니다. |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | 클라이언트가 캐시된 항목만 사용해야 하는지를 결정하는 값을 설정합니다. |
| [set_Private](./set_private/)(bool) | HTTP 응답 메시지 또는 그 일부가 단일 사용자용이며 공유 캐시에서 캐시되지 않아야 하는지를 결정하는 값을 설정합니다. |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | 공유 사용자 에이전트 캐시에서 캐시 항목이 오래되었을 때 서버가 재검증을 요구하는지를 결정하는 값을 설정합니다. |
| [set_Public](./set_public/)(bool) | HTTP 응답을 어떤 캐시든지 저장할 수 있는지를 결정하는 값을 설정합니다. |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | 공유 캐시에서 'Cache-Control' 헤더의 'max-age' 지시문이나 'Expires' 헤더를 대체하는, 초 단위의 공유 최대 수명 값을 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | 전달된 문자열을 [CacheControlHeaderValue](./) 클래스의 인스턴스로 변환하려 시도합니다. |
## 또 보기

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
