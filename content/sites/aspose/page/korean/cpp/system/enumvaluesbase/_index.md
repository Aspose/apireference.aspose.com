---
title: "System::EnumValuesBase 클래스"
linktitle: "EnumValuesBase"
second_title: "C++용 Aspose.Page"
description: "System::EnumValuesBase 클래스. C++에서 열거형 타입의 메타 정보를 나타내는 클래스의 기본 클래스입니다."
type: docs
weight: 2400
url: /ko/cpp/system/enumvaluesbase/
---
## EnumValuesBase class


열거형 타입의 메타 정보를 나타내는 클래스를 위한 기본 클래스입니다.

```cpp
class EnumValuesBase
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [GetNames](./getnames/)(const TypeInfo\&) | 지정된 열거형의 상수 이름 배열을 가져옵니다. |
| static [GetUnderlyingType](./getunderlyingtype/)(const TypeInfo\&) | 지정된 열거형의 기본 유형을 반환합니다. |
| static [GetValues](./getvalues/)(const TypeInfo\&) | 지정된 열거형 타입의 모든 값을 포함하는 배열을 반환합니다. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | 지정된 열거형 타입의 열거형 상수 값을 지정된 이름으로 나타내는 객체를 반환합니다. |
| static [ToObject](./toobject/)(const TypeInfo\&, uint64_t) | 지정된 64비트 부호 없는 정수 값을 열거형 멤버로 변환합니다. |
| static [ToObject](./toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | 정수 값을 가진 지정된 객체를 열거형 멤버로 변환합니다. |
## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
