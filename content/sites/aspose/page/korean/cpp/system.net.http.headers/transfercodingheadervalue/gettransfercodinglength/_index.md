---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength 메서드"
linktitle: "GetTransferCodingLength"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength 메서드. 지정된 인덱스에서 전달된 문자열을 C++의 TransferCodingHeaderValue 클래스 인스턴스로 변환합니다."
type: docs
weight: 700
url: /ko/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


지정된 인덱스에서 전달된 문자열을 [TransferCodingHeaderValue](../) 클래스의 인스턴스로 변환합니다.

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | String | 구문 분석할 문자열. |
| startIndex | int32_t | 구문 분석을 위한 시작 위치. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | 구문 분석된 객체가 할당될 인스턴스입니다. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | [TransferCodingHeaderValue](../) 클래스의 인스턴스를 생성하는 데 사용되는 대리자. |

### ReturnValue

구문 분석된 하위 문자열의 길이를 반환하며, 그렇지 않으면 0을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
