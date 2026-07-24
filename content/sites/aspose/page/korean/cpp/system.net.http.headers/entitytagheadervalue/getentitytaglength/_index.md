---
title: "System::Net::Http::Headers::EntityTagHeaderValue::GetEntityTagLength 메서드"
linktitle: "GetEntityTagLength"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::EntityTagHeaderValue::GetEntityTagLength 메서드. 지정된 인덱스부터 전달된 문자열을 C++에서 EntityTagHeaderValue 클래스의 인스턴스로 변환합니다."
type: docs
weight: 800
url: /ko/cpp/system.net.http.headers/entitytagheadervalue/getentitytaglength/
---
## EntityTagHeaderValue::GetEntityTagLength method


지정된 인덱스부터 전달된 문자열을 [EntityTagHeaderValue](../) 클래스의 인스턴스로 변환합니다.

```cpp
static int32_t System::Net::Http::Headers::EntityTagHeaderValue::GetEntityTagLength(String input, int32_t startIndex, System::SharedPtr<EntityTagHeaderValue> &parsedValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | String | 구문 분석할 문자열. |
| startIndex | int32_t | 구문 분석을 위한 시작 위치. |
| parsedValue | System::SharedPtr\<EntityTagHeaderValue\>\& | 구문 분석된 객체가 할당될 인스턴스입니다. |

### ReturnValue

구문 분석된 부분 문자열의 길이이며, 그렇지 않으면 0입니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EntityTagHeaderValue](../)
* Class [EntityTagHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
