---
title: "System::IO::StringWriter 클래스"
linktitle: "StringWriter"
second_title: "C++용 Aspose.Page"
description: "System::IO::StringWriter 클래스. 문자열에 정보를 기록하는 TextWriter를 구현합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 2500
url: /ko/cpp/system.io/stringwriter/
---
## StringWriter class


문자열에 정보를 기록하는 [TextWriter](../textwriter/)를 구현합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class StringWriter : public System::IO::TextWriter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | 현재 사용 중인 인코딩을 반환합니다. |
| virtual [GetStringBuilder](./getstringbuilder/)() | 현재 사용 중인 StringBuilder를 반환합니다. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | 지정된 StringBuilder와 [IFormatProvider](../../system/iformatprovider/)를 사용하여 새로운 [StringWriter](./) 인스턴스를 생성합니다. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | 현재 문화권의 [IFormatProvider](../../system/iformatprovider/)와 지정된 StringBuilder를 사용하여 새로운 [StringWriter](./) 인스턴스를 생성합니다. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | 지정된 [IFormatProvider](../../system/iformatprovider/)를 사용하여 새로운 [StringWriter](./) 인스턴스를 생성합니다. |
| [StringWriter](./stringwriter/)() | 현재 문화권의 [IFormatProvider](../../system/iformatprovider/)를 사용하여 새로운 [StringWriter](./) 인스턴스를 생성합니다. |
| [ToString](./tostring/)() const override | 기본 문자열을 반환합니다. |
| [Write](./write/)(char_t) override | 지정된 문자를 스트림에 씁니다. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 지정된 문자 배열에서 지정된 문자 하위 범위를 스트림에 기록합니다. |
| [Write](./write/)(const String\&) override | 지정된 문자열을 스트림에 씁니다. |
## 또 보기

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
