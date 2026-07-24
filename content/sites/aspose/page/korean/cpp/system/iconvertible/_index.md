---
title: "System::IConvertible 클래스"
linktitle: "IConvertible"
second_title: "C++용 Aspose.Page"
description: "System::IConvertible 클래스. 구현된 참조 또는 값 형식의 값을 동등한 값을 갖는 공용 언어 런타임 타입으로 변환하는 메서드를 정의합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오."
type: docs
weight: 3400
url: /ko/cpp/system/iconvertible/
---
## IConvertible class


구현된 참조 또는 값 형식의 값을 동등한 값을 갖는 공용 언어 런타임 타입으로 변환하는 메서드를 정의합니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class IConvertible : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | 이 인스턴스의 형식 코드를 반환합니다. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 [Boolean](../boolean/) 값으로 변환합니다. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 8비트 uint32_teger 로 변환합니다. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 유니코드 문자로 변환합니다. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 [System::DateTime](../datetime/) 로 변환합니다. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 [System::Decimal](../decimal/) 숫자로 변환합니다. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 배정밀도 부동소수점 숫자로 변환합니다. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 16비트 부호 있는 정수로 변환합니다. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 32비트 부호 있는 정수로 변환합니다. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 64비트 부호 있는 정수로 변환합니다. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 8비트 부호 있는 정수로 변환합니다. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 단정밀도 부동소수점 숫자로 변환합니다. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 [System::String](../string/) 로 변환합니다. |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](../object/tostring/) 메서드와 유사합니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 지정된 System::Type의 동등한 값을 가진 [System::Object](../object/) 로 이 인스턴스의 값을 변환합니다. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 동등한 16비트 uint32_teger 로 변환합니다. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | 이 인스턴스의 값을 지정된 문화별 서식 정보를 사용하여 동등한 32비트 uint32_teger 로 변환합니다. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | 이 인스턴스의 값을 지정된 문화별 서식 정보를 사용하여 동등한 64비트 uint32_teger 로 변환합니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
