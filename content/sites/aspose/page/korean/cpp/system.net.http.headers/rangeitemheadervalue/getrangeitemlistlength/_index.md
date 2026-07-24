---
title: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength 메서드"
linktitle: "GetRangeItemListLength"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength 메서드. 지정된 위치에서 전달된 문자열을 C++의 RangeItemHeaderValue 클래스 인스턴스 컬렉션으로 변환합니다."
type: docs
weight: 800
url: /ko/cpp/system.net.http.headers/rangeitemheadervalue/getrangeitemlistlength/
---
## RangeItemHeaderValue::GetRangeItemListLength method


지정된 위치부터 전달된 문자열을 RangeItemHeaderValue 클래스 인스턴스들의 컬렉션으로 변환합니다.

```cpp
static int32_t System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength(String input, int32_t startIndex, System::SharedPtr<Collections::Generic::ICollection<System::SharedPtr<RangeItemHeaderValue>>> rangeCollection)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | String | 구문 분석할 문자열. |
| startIndex | int32_t | 구문 분석을 위한 시작 위치. |
| rangeCollection | System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\> | 구문 분석된 컬렉션이 할당될 인스턴스입니다. |

### ReturnValue

구문 분석된 부분 문자열의 길이이며, 그렇지 않으면 0입니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [RangeItemHeaderValue](../)
* Class [RangeItemHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
