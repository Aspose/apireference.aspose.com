---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength method"
linktitle: "GetNameValueListLength"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength 메서드. 지정된 인덱스부터 전달된 문자열을 NameValueHeaderValue 클래스 인스턴스들의 컬렉션으로 변환하고, C++에서 파싱된 부분 문자열의 길이를 반환합니다."
type: docs
weight: 1000
url: /ko/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelistlength/
---
## NameValueHeaderValue::GetNameValueListLength method


지정된 인덱스부터 전달된 문자열을 NameValueHeaderValue-class 인스턴스들의 컬렉션으로 변환하고, 파싱된 부분 문자열의 길이를 반환합니다.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength(String input, int32_t startIndex, char16_t delimiter, System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> nameValueCollection)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | String | 분석할 문자열입니다. |
| startIndex | int32_t | 분석을 위한 시작 위치입니다. |
| 구분자 | char16_t | 지정된 문자열에서 항목을 구분하는 데 사용되는 문자열입니다. |
| nameValueCollection | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | 파싱된 컬렉션이 할당될 출력 매개변수입니다. |

### ReturnValue

파싱된 부분 문자열의 길이입니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
