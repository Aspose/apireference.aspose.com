---
title: "System::Guid class"
linktitle: "Guid"
second_title: "C++용 Aspose.Page"
description: "System::Guid 클래스. 전역 고유 식별자(Global Unique Identifier)를 나타냅니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. C++에서 이 유형의 객체를 관리하기 위해 System::SmartPtr 클래스를 사용하지 마십시오."
type: docs
weight: 3000
url: /ko/cpp/system/guid/
---
## Guid class


전역 고유 식별자(Global Unique Identifier)를 나타냅니다. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 유형의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 사용하지 마십시오.

```cpp
class Guid
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | 현재 객체와 지정된 객체가 나타내는 GUID를 산술적으로 비교합니다. |
| [Equals](./equals/)(const Guid\&) const | 현재 객체와 지정된 객체가 나타내는 GUID가 동일한지 판단합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [Guid](./guid/)() | 모든 값이 0인 GUID를 나타내는 객체를 생성합니다. |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | 부호 없는 8비트 정수 값 배열로 지정된 GUID를 나타내는 객체를 생성합니다. |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | 부호 없는 8비트 정수 값 배열 뷰로 지정된 GUID를 나타내는 객체를 생성합니다. |
| [Guid](./guid/)(const String\&) | 문자열로 지정된 GUID를 나타내는 객체를 생성합니다. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | 지정된 GUID 구성 요소를 사용하여 [Guid](./) 클래스의 인스턴스를 생성합니다. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | 지정된 GUID 구성 요소를 사용하여 [Guid](./) 클래스의 인스턴스를 생성합니다. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | 지정된 부호 없는 정수와 바이트를 사용하여 [Guid](./) 클래스의 인스턴스를 생성합니다. |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | 지정된 부호 없는 정수와 바이트를 사용하여 [Guid](./) 클래스의 인스턴스를 생성합니다. |
| [Guid](./guid/)(const Guid\&) | 지정된 객체와 동일한 GUID를 나타내는 객체를 생성합니다. |
| static [NewGuid](./newguid/)() | 새 GUID를 생성하고 이를 나타내는 [Guid](./) 객체를 반환합니다. |
| [operator!=](./operator!=/)(const Guid\&) const | 현재 객체와 지정된 객체가 나타내는 GUID가 동일하지 않은지 판단합니다. |
| [operator=](./operator=/)(const Guid\&) | 지정된 [Guid](./) 객체가 나타내는 GUID 값을 현재 객체에 할당합니다. |
| [operator==](./operator==/)(const Guid\&) const | 현재 객체와 지정된 객체가 나타내는 GUID가 동일한지 판단합니다. |
| static [Parse](./parse/)(const String\&) | GUID의 지정된 문자열 표현을 동등한 [Guid](./) 객체로 변환합니다. |
| [ToByteArray](./tobytearray/)() const | 현재 객체가 나타내는 GUID를 바이트 배열로 변환합니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 GUID를 문자열 표현으로 변환합니다. |
| [ToString](./tostring/)(const String\&) const | 지정된 문자열 형식을 사용하여 현재 객체가 나타내는 GUID를 문자열 표현으로 변환합니다. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | 지정된 문자열 형식과 문화권을 사용하여 현재 객체가 나타내는 GUID를 문자열 표현으로 변환합니다. |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | 지정된 문자열을 [Guid](./) 객체로 변환을 시도합니다. |
| [~Guid](./~guid/)() | 소멸자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | 값이 0인 GUID를 나타냅니다. |
## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
