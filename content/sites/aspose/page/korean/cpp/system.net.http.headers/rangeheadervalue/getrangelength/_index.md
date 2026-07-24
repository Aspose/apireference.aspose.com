---
title: "System::Net::Http::Headers::RangeHeaderValue::GetRangeLength 메서드"
linktitle: "GetRangeLength"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::RangeHeaderValue::GetRangeLength 메서드. 지정된 인덱스에서 전달된 문자열을 C++에서 RangeHeaderValue 클래스의 인스턴스로 변환합니다."
type: docs
weight: 800
url: /ko/cpp/system.net.http.headers/rangeheadervalue/getrangelength/
---
## RangeHeaderValue::GetRangeLength method


지정된 인덱스에서 전달된 문자열을 [RangeHeaderValue](../) 클래스의 인스턴스로 변환합니다.

```cpp
static int32_t System::Net::Http::Headers::RangeHeaderValue::GetRangeLength(String input, int32_t startIndex, System::SharedPtr<Object> &parsedValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | String | 구문 분석할 문자열. |
| startIndex | int32_t | 구문 분석을 위한 시작 위치. |
| parsedValue | System::SharedPtr\<Object\>\& | 구문 분석된 객체가 할당될 인스턴스입니다. |

### ReturnValue

구문 분석된 하위 문자열의 길이를 반환하며, 그렇지 않으면 0을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RangeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
