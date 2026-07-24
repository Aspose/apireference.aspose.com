---
title: "System::Net::Http::Headers::ViaHeaderValue 클래스"
linktitle: "ViaHeaderValue"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::ViaHeaderValue 클래스. ''Via'' 헤더의 값을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2600
url: /ko/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


‘Via’ 헤더의 값을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_Comment](./get_comment/)() | ‘Via’ 헤더 값에서 주석을 반환합니다. |
| [get_ProtocolName](./get_protocolname/)() | RTTI 정보. |
| [get_ProtocolVersion](./get_protocolversion/)() | ‘Via’ 헤더 값에서 프로토콜 버전을 반환합니다. |
| [get_ReceivedBy](./get_receivedby/)() | 요청 또는 응답을 수신한 호스트와 포트를 반환합니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 지정된 인덱스부터 전달된 문자열을 [ViaHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| static [Parse](./parse/)(String) | 전달된 문자열을 [ViaHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | 전달된 문자열을 [ViaHeaderValue](./) 클래스의 인스턴스로 변환을 시도합니다. |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | 새 인스턴스를 생성합니다. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | 새 인스턴스를 생성합니다. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
