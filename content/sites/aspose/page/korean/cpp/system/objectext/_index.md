---
title: "System::ObjectExt 클래스"
linktitle: "ObjectExt"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt 클래스. 비-Object C++ 타입(문자열, 숫자 등)에 대해 호출되는 C# Object 메서드를 에뮬레이트하는 정적 메서드를 제공합니다. 이는 인스턴스 서비스를 제공하지 않는 정적 타입이며, C++에서 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 4900
url: /ko/cpp/system/objectext/
---
## ObjectExt class


[Object](../object/) 메서드를 에뮬레이트하는 정적 메서드를 제공합니다(비-Object C++ 타입인 문자열, 숫자 등에 대해 호출됩니다). 이는 인스턴스 서비스를 제공하지 않는 정적 타입이며, 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다.

```cpp
class ObjectExt : public System::ObjectType
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | 배열 기본값을 변환합니다(이는 C#에서는 암시적으로 수행되지만 C++에서는 수행되지 않는 것으로 보입니다). |
| static [Box](./box/)(const T\&) | 값 타입을 [Object](../object/) 로 변환하기 위해 박싱합니다. 열거형 타입에 대한 구현입니다. |
| static [Box](./box/)(const T\&) | 값 타입을 [Object](../object/) 로 변환하기 위해 박싱합니다. 비열거형 타입에 대한 구현입니다. |
| static [Box](./box/)(const T\&) | [Nullable](../nullable/) 타입을 [Object](../object/) 로 변환하기 위해 박싱합니다. |
| static [Box](./box/)(const String\&) | 문자열 값을 박싱합니다. |
| static [BoxEnum](./boxenum/)(T) | 열거형 타입을 [Object](../object/) 로 전파되도록 박싱합니다. |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | null이 아닌 타입에 대한 '??' 연산자 변환 구현입니다. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | null 허용 타입에 대한 '??' 연산자 변환 구현입니다. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | null이 아닌 타입에 대한 '??' 연산자 변환 구현입니다. RT2가 RT1으로 변환 가능한 경우에 대한 오버로드입니다. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | C++에서 모든 타입에 대해 작동하는 C# [Object.Equals](../object/equals/) 호출에 대한 대체 구현입니다. 스마트 포인터 타입에 대한 오버로드입니다. |
| static [Equals](./equals/)(T, const T2\&) | C++에서 모든 타입에 대해 작동하는 C# [Object.Equals](../object/equals/) 호출에 대한 대체 구현입니다. 구조체 타입에 대한 오버로드입니다. |
| static [Equals](./equals/)(const T\&, const T2\&) | C++에서 모든 타입에 대해 작동하는 C# [Object.Equals](../object/equals/) 호출에 대한 대체 구현입니다. 스칼라 타입에 대한 오버로드입니다. |
| static [Equals](./equals/)(const char_t(&), String) | C++에서 모든 타입에 대해 작동하는 C# [Object.Equals](../object/equals/) 호출에 대한 대체 구현입니다. 문자열 리터럴을 문자열 비교와 함께 처리하는 오버로드입니다. |
| static [Equals](./equals/)(const float\&, const float\&) | IEC 60559:1989에 따르면 NaN은 어떤 값과도, NaN 자체와도 같지 않지만, C#-style 부동소수점 비교를 에뮬레이트하여 두 NaN을 동일하게 간주합니다. |
| static [Equals](./equals/)(const double\&, const double\&) | IEC 60559:1989에 따르면 NaN은 어떤 값과도, NaN 자체와도 같지 않지만, C#-style 부동소수점 비교를 에뮬레이트하여 두 NaN을 동일하게 간주합니다. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | [GetHashCode()](./gethashcode/) 호출을 구현합니다; [Object](../object/) 하위 클래스와 관련 없는 타입 모두에서 작동합니다. |
| static [Is](./is/)(const T\&) | 'is' 연산자 변환을 구현합니다. 박싱 가능한(값) 타입에 대한 특수화이며, 정확히 말하면 그 타입들입니다. |
| static [Is](./is/)(const U\&) | 'is' 연산자 변환을 구현합니다. 'final' 클래스를 위해 최적화된 포인터 타입에 대한 특수화입니다. |
| static [Is](./is/)(const U\&) | 'is' 연산자 변환을 구현합니다. 포인터 타입에 대한 특수화입니다. |
| static [Is](./is/)(const Object\&) | 'is' 연산자 변환을 구현합니다. 값 타입에 대한 특수화입니다. |
| static [Is](./is/)(const Object\&) | 'is' 연산자 변환을 구현합니다. 변환 불가능한 유형에 대한 특수화. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 'is' 연산자 변환을 구현합니다. 포인터 타입에 대한 특수화입니다. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | 'is' 연산자 변환을 구현합니다. 예외 래퍼 유형에 대한 특수화. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 'is' 연산자 변환을 구현합니다. nullable 유형에 대한 특수화. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 'is' 연산자 변환을 구현합니다. == 연산자가 정의된 boxable 유형에 대한 특수화. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 'is' 연산자 변환을 구현합니다. == 연산자가 정의되지 않은 boxable 유형에 대한 특수화. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | 'is' 연산자 변환을 구현합니다. 인터페이스에 박싱된 값 유형에 대한 특수화. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 'is' 연산자 변환을 구현합니다. enum 유형에 대한 특수화. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | 'is' 연산자 변환을 구현합니다. enum 유형과 약한 포인터에 대한 특수화. |
| static [Is](./is/)(const Nullable\<U\>\&) | 'is' 연산자 변환을 구현합니다. [Nullable](../nullable/) 유형에 대한 특수화. |
| static [Is](./is/)(const char16_t *) | 'is' 연산자 변환을 구현합니다. 문자열 리터럴에 대한 특수화. |
| static [Is](./is/)(int32_t) | 'is' 연산자 변환을 구현합니다. 정수 리터럴에 대한 특수화. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | 객체가 박싱된 값인지 확인합니다. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/)을 알 수 없는 유형으로 변환하며, 스마트 포인터 유형과 박싱된 값 상황을 모두 처리합니다. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/)을 알 수 없는 유형으로 변환하며, 스마트 포인터 유형과 박싱된 값 상황을 모두 처리합니다. |
| static [ToString](./tostring/)(const char_t *) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [ToString](./tostring/)(const T\&) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [ToString](./tostring/)(const T\&) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [ToString](./tostring/)(T\&) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [ToString](./tostring/)(T\&) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [ToString](./tostring/)(T\&&) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [ToString](./tostring/)(T\&) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [ToString](./tostring/)(const T\&) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [ToString](./tostring/)(T\&&) | C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/)으로 변환한 후 값 유형을 언박싱합니다. enum 유형에 대한 구현. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/)으로 변환한 후 값 유형을 언박싱합니다. enum이 아니고 nullable도 아닌 유형에 대한 구현. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/)으로 변환한 후 값 유형을 언박싱합니다. enum이 아니고 nullable도 아닌 유형에 대한 구현. |
| static [Unbox](./unbox/)(E) | enum 유형을 정수로 언박싱합니다. |
| static [Unbox](./unbox/)(E) | enum 유형을 변환합니다. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | 문자열 값을 언박싱합니다. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | 박싱된 값에서 문자열을 언박싱합니다. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | 객체를 nullable 유형으로 언박싱합니다. |
| static [UnknownIsNull](./unknownisnull/)(T) | 알 수 없는 유형 객체가 nullptr인지 확인합니다. 스칼라가 아닌 유형에 대한 오버로드. |
| static [UnknownIsNull](./unknownisnull/)(T) | 알 수 없는 유형 객체가 nullptr인지 확인합니다. 스칼라 유형에 대한 오버로드. |
| static [UnknownToObject](./unknowntoobject/)(T) | 알 수 없는 유형을 [Object](../object/)으로 변환하며, 스마트 포인터 유형과 값 유형 상황을 모두 처리합니다. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | 알 수 없는 유형을 [Object](../object/)으로 변환하며, 스마트 포인터 유형과 값 유형 상황을 모두 처리합니다. |
## 또 보기

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
