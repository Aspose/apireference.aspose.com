---
title: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemLength 메서드"
linktitle: "GetRangeItemLength"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemLength 메서드. 지정된 인덱스에서 전달된 문자열을 C++의 RangeItemHeaderValue 클래스 인스턴스로 변환합니다."
type: docs
weight: 700
url: /ko/cpp/system.net.http.headers/rangeitemheadervalue/getrangeitemlength/
---
## RangeItemHeaderValue::GetRangeItemLength method


지정된 인덱스에서 전달된 문자열을 [RangeItemHeaderValue](../) 클래스의 인스턴스로 변환합니다.

```cpp
static int32_t System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemLength(String input, int32_t startIndex, System::SharedPtr<RangeItemHeaderValue> &parsedValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | String | 구문 분석할 문자열. |
| startIndex | int32_t | 구문 분석을 위한 시작 위치. |
| parsedValue | System::SharedPtr\<RangeItemHeaderValue\>\& | 구문 분석된 객체가 할당될 인스턴스입니다. |

### ReturnValue

구문 분석된 하위 문자열의 길이를 반환하며, 그렇지 않으면 0을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RangeItemHeaderValue](../)
* Class [RangeItemHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
