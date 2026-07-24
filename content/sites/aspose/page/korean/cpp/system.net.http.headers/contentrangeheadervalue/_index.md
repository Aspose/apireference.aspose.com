---
title: "System::Net::Http::Headers::ContentRangeHeaderValue 클래스"
linktitle: "ContentRangeHeaderValue"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::ContentRangeHeaderValue 클래스. ''Content-Range'' 헤더의 값을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 400
url: /ko/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


'Content-Range' 헤더의 값을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | 새 인스턴스를 생성합니다. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | 새 인스턴스를 생성합니다. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | 새 인스턴스를 생성합니다. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_From](./get_from/)() | 데이터 전송을 시작해야 하는 위치를 가져옵니다. |
| [get_HasLength](./get_haslength/)() const | 현재 헤더에 대해 길이가 지정되었는지 나타내는 값을 가져옵니다. |
| [get_HasRange](./get_hasrange/)() const | 현재 헤더에 대해 범위가 지정되었는지 나타내는 값을 가져옵니다. |
| [get_Length](./get_length/)() | 엔터티 본문의 길이를 가져옵니다. |
| [get_To](./get_to/)() | 데이터 전송을 중지해야 하는 위치를 가져옵니다. |
| [get_Unit](./get_unit/)() | RTTI 정보. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 지정된 위치부터 전달된 문자열을 [ContentRangeHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| static [Parse](./parse/)(String) | 전달된 문자열을 [ContentRangeHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [set_Unit](./set_unit/)(String) | 범위에 사용되는 단위를 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | 전달된 문자열을 [ContentRangeHeaderValue](./) 클래스의 인스턴스로 변환을 시도합니다. |
## 또 보기

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
