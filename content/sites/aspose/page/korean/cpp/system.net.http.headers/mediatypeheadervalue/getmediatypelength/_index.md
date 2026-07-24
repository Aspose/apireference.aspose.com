---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength 메서드"
linktitle: "GetMediaTypeLength"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength 메서드. 지정된 인덱스부터 전달된 문자열을 C++에서 MediaTypeHeaderValue 클래스의 인스턴스로 변환합니다."
type: docs
weight: 1000
url: /ko/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


지정된 인덱스부터 전달된 문자열을 [MediaTypeHeaderValue](../) 클래스의 인스턴스로 변환합니다.

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | String | 구문 분석할 문자열. |
| startIndex | int32_t | 구문 분석을 위한 시작 위치. |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | [MediaTypeHeaderValue](../) 클래스의 인스턴스를 생성하는 데 사용되는 대리자. |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | 구문 분석된 객체가 할당될 인스턴스입니다. |

### ReturnValue

구문 분석된 하위 문자열의 길이를 반환하며, 그렇지 않으면 0을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
