---
title: "System::Object 클래스"
linktitle: "Object"
second_title: "C++용 Aspose.Page"
description: "System::Object 클래스. C#에서 System.Object 클래스가 제공하는 메서드를 사용할 수 있게 해주는 기본 클래스입니다. 변환된 환경에서 사용되는 모든 비트리비얼 클래스는 C++에서 이를 상속해야 합니다."
type: docs
weight: 4800
url: /ko/cpp/system/object/
---
## Object class


C#에서 [System.Object](./) 클래스가 제공하는 메서드를 사용할 수 있게 해주는 기본 클래스입니다. 변환된 환경에서 사용되는 모든 비트리비얼 클래스는 이를 상속해야 합니다.

```cpp
class Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | C# [Object.Equals](./equals/) 의미론을 사용하여 객체를 비교합니다. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | C# 스타일로 참조형 객체를 비교합니다. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | C# 스타일로 값형 객체를 비교합니다. |
| static [Equals](./equals/)(float const\&, float const\&) | IEC 60559:1989에 따르면 NaN은 어떤 값과도, NaN 자체와도 같지 않지만, C#-style 부동소수점 비교를 에뮬레이트하여 두 NaN을 동일하게 간주합니다. |
| static [Equals](./equals/)(double const\&, double const\&) | IEC 60559:1989에 따르면 NaN은 어떤 값과도, NaN 자체와도 같지 않지만, C#-style 부동소수점 비교를 에뮬레이트하여 두 NaN을 동일하게 간주합니다. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | 내부 용도 전용. |
| [GetCounter](./getcounter/)() | 객체와 연결된 참조 카운터 데이터 구조를 가져옵니다. |
| virtual [GetHashCode](./gethashcode/)() const | C# [Object.GetHashCode()](./gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| virtual [GetType](./gettype/)() const | 객체의 실제 유형을 가져옵니다. C# [System.Object.GetType()](./gettype/) 호출과 유사합니다. |
| virtual [Is](./is/)(const TypeInfo\&) const | 객체가 targetType으로 설명된 유형의 인스턴스를 나타내는지 확인합니다. C# 'is' 연산자와 유사합니다. |
| [Lock](./lock/)() | C# lock() 문 잠금을 구현합니다. 직접 호출하거나 [LockContext](../lockcontext/) 센트리 객체를 사용하십시오. |
| virtual [MemberwiseClone](./memberwiseclone/)() const | C# [Object.MemberwiseClone()](./memberwiseclone/) 메서드와 유사합니다. 사용자 정의 유형의 복제를 가능하게 합니다. |
| [Object](./object/)() | 객체를 생성합니다. 모든 내부 데이터 구조를 초기화합니다. |
| [Object](./object/)(Object const\&) | 복사 생성자. 실제로는 아무것도 복사하지 않고, 새로운 객체를 초기화하고 서브클래스 복사 생성을 가능하게 합니다. |
| [operator=](./operator=/)(Object const\&) | 대입 연산자. 실제로는 아무것도 복사하지 않고, 새로운 객체를 초기화하고 서브클래스 복사 생성을 가능하게 합니다. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | 객체를 참조로 비교합니다. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | 객체를 참조로 비교합니다. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | Reference는 값 형식 객체를 nullptr와 비교합니다. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | 문자열과 nullptr 경우에 대한 [Object::ReferenceEquals](./referenceequals/) 특수화. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | 문자열들의 경우에 대한 [Object::ReferenceEquals](./referenceequals/) 특수화. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | 지정된 값만큼 공유 참조 카운트를 감소시킵니다. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |
| [SharedCount](./sharedcount/)() const | 공유 참조 카운터의 현재 값을 가져옵니다. |
| [SharedRefAdded](./sharedrefadded/)() | 공유 참조 카운트를 증가시킵니다. 직접 호출해서는 안 되며, 대신 스마트 포인터나 ThisProtector를 사용하십시오. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | 공유 참조 카운트를 감소시키고 반환합니다. 직접 호출해서는 안 되며, 대신 스마트 포인터나 ThisProtector를 사용하십시오. |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](./tostring/) 메서드의 유사체입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [Type](./type/)() | C# typeof([System.Object](./)) 구문을 구현합니다. |
| [Unlock](./unlock/)() | C# lock() 문장의 잠금 해제를 구현합니다. 직접 호출하거나 [LockContext](../lockcontext/) 감시 객체를 사용하십시오. |
| [WeakRefAdded](./weakrefadded/)() | 약한 참조 카운트를 증가시킵니다. 직접 호출해서는 안 되며, 대신 스마트 포인터나 ThisProtector를 사용하십시오. |
| [WeakRefRemoved](./weakrefremoved/)() | 약한 참조 카운트를 감소시킵니다. 직접 호출해서는 안 되며, 대신 스마트 포인터나 ThisProtector를 사용하십시오. |
| virtual [~Object](./~object/)() | 객체를 파괴합니다. 모든 내부 데이터 구조를 해제합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ptr](./ptr/) | 스마트 포인터 타입에 대한 별칭입니다. |
## 비고


C# [System.Object](./) 클래스에서 제공되는 메서드와 함께, 번역된 코드 환경에 특화된 일부 개념에 대한 지원도 제공합니다. 여기에는 스마트 포인터 클래스([System::SmartPtr](../smartptr/), [System::WeakPtr](../weakptr/), [System::DynamicWeakPtr](../dynamicweakptr/))에서 사용되는 참조 카운팅 및 메모리 관리, 디버그 등과 관련된 기타 서비스가 포함됩니다.

각 [Object](./)에는 두 개의 참조 카운터가 있습니다: 공유 참조 카운터와 약한 참조 카운터. 약한 참조 카운터는 항상 [Object](./) 자체가 아닌 분리된 데이터 구조에 저장되어 약한 포인터가 참조된 객체보다 오래 살아남을 수 있게 합니다. 스마트 참조 카운터는 ENABLE_EXTERNAL_REFCOUNT 매크로 상태에 따라 객체 자체에 저장되거나 동일한 분리 구조에 저장됩니다. 기본적으로 디버그 빌드에서는 활성화되고 릴리스 빌드에서는 비활성화됩니다. 스마트 포인터 카운터가 객체 자체에 저장되는 경우, 약한 포인터가 존재할 때만 분리된 데이터 구조가 생성됩니다. 그렇지 않으면 객체 자체와 함께 생성됩니다.

모든 스마트 포인터는 이 두 개의 참조 카운터를 사용하며 동일하고 유일한 소유권 그룹에 기여합니다.

[Object](./) 서브클래스가 스택에 생성된 경우, 해당 객체에 대한 스마트 포인터를 생성할 수 없으며, 그렇지 않으면 스택 삭제 문제가 발생합니다.

이 타입은 값 타입으로 스택에 할당하거나 [System::MakeObject()](../makeobject/) 함수를 사용해 힙에 할당할 수 있습니다. 객체가 할당된 후에는 이 두 사용 사례를 혼합해서는 안 됩니다: 스택에 할당된 객체에 대한 [SmartPtr](../smartptr/) 포인터를 갖는 것은 엄격히 금지됩니다.
## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
