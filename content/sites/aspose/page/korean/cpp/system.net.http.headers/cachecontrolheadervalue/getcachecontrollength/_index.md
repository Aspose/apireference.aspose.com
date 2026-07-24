---
title: "System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength method"
linktitle: "GetCacheControlLength"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength 메서드. 지정된 인덱스부터 전달된 문자열을 C++에서 CacheControlHeaderValue 클래스의 인스턴스로 변환합니다."
type: docs
weight: 3400
url: /ko/cpp/system.net.http.headers/cachecontrolheadervalue/getcachecontrollength/
---
## CacheControlHeaderValue::GetCacheControlLength method


지정된 인덱스부터 전달된 문자열을 [CacheControlHeaderValue](../) 클래스의 인스턴스로 변환합니다.

```cpp
static int32_t System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength(String input, int32_t startIndex, System::SharedPtr<CacheControlHeaderValue> storeValue, System::SharedPtr<CacheControlHeaderValue> &parsedValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | String | 구문 분석할 문자열. |
| startIndex | int32_t | 구문 분석을 위한 시작 위치. |
| storeValue | System::SharedPtr\<CacheControlHeaderValue\> | 구문 분석된 객체에 추가되어야 하는 값입니다. |
| parsedValue | System::SharedPtr\<CacheControlHeaderValue\>\& | 구문 분석된 객체가 할당될 인스턴스입니다. |

### ReturnValue

구문 분석된 부분 문자열의 길이이며, 그렇지 않으면 0입니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CacheControlHeaderValue](../)
* Class [CacheControlHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
