---
title: "System::SmartPtr 클래스"
linktitle: "SmartPtr"
second_title: "C++용 Aspose.Page"
description: "System::SmartPtr 클래스. 힙에 할당되는 타입을 감싸는 포인터 클래스입니다. Object를 상속하는 클래스의 메모리를 관리하는 데 사용합니다. 이 포인터 타입은 침입형 포인터 의미론을 따릅니다. 참조 카운터는 Object 자체에 저장되거나 Object 인스턴스와 밀접하게 연결된 카운터 구조에 저장됩니다. 어떤 경우든 모든 SmartPtr 인스턴스는 생성 방식과 관계없이 단일 소유권 그룹을 형성하며, 이는 std::shared_ptr 클래스와 다릅니다. 원시 포인터를 SmartPtr으로 변환하는 것은 동일한 객체에 대한 공유 참조를 보유한 다른 SmartPtr 인스턴스가 존재하는 경우 안전합니다. SmartPtr 클래스 인스턴스는 두 가지 상태 중 하나일 수 있습니다: 공유 포인터와 약한 포인터. 객체를 살아 있게 유지하려면 공유 참조 카운트가 양수이어야 합니다. 약한 포인터와 공유 포인터 모두 객체에 접근(메서드 호출, 필드 읽기·쓰기 등)할 수 있지만, 약한 포인터는 공유 포인터 참조 카운팅에 참여하지 않습니다. 마지막 ''shared'' SmartPtr 포인터가 파괴될 때 객체가 삭제됩니다. 따라서 객체 생성 또는 소멸 중에 다른 공유 SmartPtr 포인터가 존재하지 않을 때 이런 일이 발생하지 않도록 해야 합니다. 이 문제를 해결하려면 C++ 코드에서는 System::Object::ThisProtector 감시 객체를 사용하거나, C# 코드(번역 중)에서는 CppCTORSelfReference 또는 CppSelfReference 속성을 사용하십시오. 또한 System::WeakPtr 포인터 클래스나 System::SmartPtrMode::Weak 포인터 모드(C++ 코드) 또는 CppWeakPtr 속성(C# 코드)을 사용하여 순환 참조를 끊어야 합니다. 두 개 이상의 객체가 ''shared'' 포인터를 사용해 서로를 참조하면 절대 삭제되지 않습니다. 런타임에 포인터 타입(약한 또는 공유)을 전환해야 하면 System::SmartPtr<T>::set_Mode() 메서드나 System::DynamicWeakPtr 클래스를 사용하십시오. SmartPtr 클래스에는 가상 메서드가 전혀 없습니다. 자체 메모리 관리 전략을 만들 때만 상속해야 합니다. 이 타입은 다른 객체의 삭제를 관리하는 포인터이며, 스택에 할당하고 C++에서는 값이나 const 참조로 함수를 호출할 때 전달해야 합니다."
type: docs
weight: 5500
url: /ko/cpp/system/smartptr/
---
## SmartPtr class


힙에 할당되는 타입을 감싸는 포인터 클래스입니다. [Object](../object/)를 상속하는 클래스의 메모리를 관리하는 데 사용합니다. 이 포인터 타입은 침입형 포인터 의미론을 따릅니다. 참조 카운터는 [Object](../object/) 자체에 저장되거나 [Object](../object/) 인스턴스와 밀접하게 연결된 카운터 구조에 저장됩니다. 어떤 경우든 모든 [SmartPtr](./) 인스턴스는 생성 방식과 관계없이 단일 소유권 그룹을 형성하며, 이는 std::shared_ptr 클래스와 다릅니다. 원시 포인터를 [SmartPtr](./)으로 변환하는 것은 동일한 객체에 대한 공유 참조를 보유한 다른 [SmartPtr](./) 인스턴스가 존재하는 경우 안전합니다. [SmartPtr](./) 클래스 인스턴스는 두 가지 상태 중 하나일 수 있습니다: 공유 포인터와 약한 포인터. 객체를 살아 있게 유지하려면 공유 참조 카운트가 양수이어야 합니다. 약한 포인터와 공유 포인터 모두 객체에 접근(메서드 호출, 필드 읽기·쓰기 등)할 수 있지만, 약한 포인터는 공유 포인터 참조 카운팅에 참여하지 않습니다. [Object](../object/)는 마지막 'shared' [SmartPtr](./) 포인터가 파괴될 때 삭제됩니다. 따라서 객체 생성 또는 소멸 중에 다른 공유 [SmartPtr](./) 포인터가 존재하지 않을 때 이런 일이 발생하지 않도록 해야 합니다. 이 문제를 해결하려면 C++ 코드에서는 System::Object::ThisProtector 감시 객체를 사용하거나, C# 코드(번역 중)에서는 CppCTORSelfReference 또는 CppSelfReference 속성을 사용하십시오. 또한 [System::WeakPtr](../weakptr/) 포인터 클래스나 [System::SmartPtrMode::Weak](../smartptrmode/) 포인터 모드(C++ 코드) 또는 CppWeakPtr 속성(C# 코드)을 사용하여 순환 참조를 끊어야 합니다. 두 개 이상의 객체가 'shared' 포인터를 사용해 서로를 참조하면 절대 삭제되지 않습니다. 런타임에 포인터 타입(약한 또는 공유)을 전환해야 하면 [System::SmartPtr<T>::set_Mode()](./set_mode/) 메서드나 [System::DynamicWeakPtr](../dynamicweakptr/) 클래스를 사용하십시오. [SmartPtr](./) 클래스에는 가상 메서드가 전혀 없습니다. 자체 메모리 관리 전략을 만들 때만 상속해야 합니다. 이 타입은 다른 객체의 삭제를 관리하는 포인터이며, 스택에 할당하고 C++에서는 값이나 const 참조로 함수를 호출할 때 전달해야 합니다.

```cpp
template<class T>class SmartPtr
```


| 매개변수 | 설명 |
| --- | --- |
| T | 가리키는 객체의 타입. [System::Object](../object/)이거나 그 하위 클래스여야 합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [begin](./begin/)() | 기본 컬렉션의 [begin()](./begin/) 메서드에 대한 접근자입니다. [SmartPtr_](./smartptr_/)이 [begin()](./begin/) 메서드를 가진 특수화 타입인 경우에만 컴파일됩니다. |
| [begin](./begin/)() const | 기본 컬렉션의 [begin()](./begin/) 메서드에 대한 접근자입니다. [SmartPtr_](./smartptr_/)이 [begin()](./begin/) 메서드를 가진 특수화 타입인 경우에만 컴파일됩니다. |
| [Cast](./cast/)() const | 포인터를 해당 타입 자체로 캐스팅합니다. |
| [Cast](./cast/)() const | static_cast를 사용해 포인터를 기본 타입으로 캐스팅합니다. |
| [Cast](./cast/)() const | dynamic_cast를 사용해 포인터를 파생 타입으로 캐스팅합니다. |
| [Cast](./cast/)() const | dynamic_cast를 사용해 포인터를 파생 타입으로 캐스팅합니다. |
| [cbegin](./cbegin/)() const | 기본 컬렉션의 [cbegin()](./cbegin/) 메서드에 대한 접근자입니다. [SmartPtr_](./smartptr_/)이 [cbegin()](./cbegin/) 메서드를 가진 특수화 타입인 경우에만 컴파일됩니다. |
| [cend](./cend/)() const | 기본 컬렉션의 [cend()](./cend/) 메서드에 대한 접근자입니다. [SmartPtr_](./smartptr_/)이 [cend()](./cend/) 메서드를 가진 특수화 타입인 경우에만 컴파일됩니다. |
| [const_pointer_cast](./const_pointer_cast/)() const | const_cast를 사용해 가리키는 객체를 다른 타입으로 캐스팅합니다. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | dynamic_cast를 사용해 가리키는 객체를 다른 타입으로 캐스팅합니다. |
| [end](./end/)() | 기본 컬렉션의 [end()](./end/) 메서드에 대한 접근자입니다. [SmartPtr_](./smartptr_/)이 [end()](./end/) 메서드를 가진 특수화 타입인 경우에만 컴파일됩니다. |
| [end](./end/)() const | 기본 컬렉션의 [end()](./end/) 메서드에 대한 접근자입니다. [SmartPtr_](./smartptr_/)이 [end()](./end/) 메서드를 가진 특수화 타입인 경우에만 컴파일됩니다. |
| [get](./get/)() const | 가리키는 객체를 가져옵니다. |
| [get_Mode](./get_mode/)() const | 포인터 모드를 가져옵니다. |
| [get_shared](./get_shared/)() const | 포인터가 가리키는 객체를 가져오지만, 포인터가 공유 모드에 있음을 단언합니다. |
| [get_shared_count](./get_shared_count/)() const | 참조된 객체에 존재하는 공유 포인터의 수를 현재 포인터를 포함하여 가져옵니다. 현재 포인터가 공유 모드에 있음을 단언합니다. |
| [GetHashCode](./gethashcode/)() const | 가리키는 객체에서 [GetHashCode()](./gethashcode/)를 호출합니다. |
| [GetObjectNotNull](./getobjectnotnull/)() const | 현재 참조된 객체를 가져옵니다(있는 경우) 또는 예외를 발생시킵니다. |
| [GetObjectOrNull](./getobjectornull/)() const | 가리키는 객체를 가져옵니다(있는 경우) 또는 nullptr를 반환합니다. [get()](./get/)와 동일합니다. |
| [GetObjectOwner](./getobjectowner/)() const | 참조된 객체를 가져옵니다. |
| [GetPointer](./getpointer/)() const | 가리키는 객체를 가져옵니다(있는 경우) 또는 nullptr를 반환합니다. [get()](./get/)와 동일합니다. |
| [Is](./is/)(const System::TypeInfo\&) const | 가리키는 객체가 특정 타입 또는 그 하위 타입인지 확인합니다. C#의 'is' 의미론을 따릅니다. |
| [IsAliasingPtr](./isaliasingptr/)() const | 포인터가 소유된 객체가 아닌 다른 객체(별칭 생성자를 통해 생성된)를 가리키는지 확인합니다. |
| [IsShared](./isshared/)() const | 포인터가 공유 모드에 있는지 확인합니다. |
| [IsWeak](./isweak/)() const | 포인터가 약한(weak) 모드에 있는지 확인합니다. |
| explicit [operator bool](./operatorbool/)() const | 포인터가 null이 아닌지 확인합니다. |
| [operator!](./operator!/)() const | 포인터가 null인지 확인합니다. |
| [operator*](./operator_/)() const | 가리키는 객체에 대한 참조를 가져옵니다. 포인터가 null이 아님을 단언합니다. |
| [operator->](./operator-_/)() const | 참조된 객체의 멤버에 접근할 수 있게 합니다. |
| [operator<](./operator_/)(Y *) const | [SmartPtr](./) 클래스에 대해 less-compare 의미론을 제공합니다. |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | [SmartPtr](./) 클래스에 대해 less-compare 의미론을 제공합니다. |
| [operator=](./operator=/)(SmartPtr_\&&) | [SmartPtr](./) 객체를 이동 할당합니다. x는 사용 불가능해집니다. |
| [operator=](./operator=/)(const SmartPtr_\&) | [SmartPtr](./) 객체를 복사 할당합니다. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | [SmartPtr](./) 객체를 복사 할당합니다. 필요한 타입 변환을 수행합니다. |
| [operator=](./operator=/)(Pointee_ *) | 원시 포인터를 [SmartPtr](./) 객체에 할당합니다. |
| [operator=](./operator=/)(std::nullptr_t) | 포인터 값을 nullptr로 설정합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | 포인터가 nullptr를 가리키는지 확인합니다. |
| [operator[]](./operator[]/)(IdxType) const | 배열 요소에 대한 접근자입니다. [SmartPtr_](./smartptr_/)가 [System::Array](../array/)의 특수화인 경우에만 컴파일됩니다. |
| [RemoveAliasing](./removealiasing/)() const | 포인터에서 별칭(별칭 생성자를 통해 생성된)을 제거하고, 포인터가 가리키는 동일한 객체를 관리(공유인 경우)하거나 추적(약한 경우)하도록 보장합니다. |
| [reset](./reset/)(Pointee_ *) | 가리키는 객체를 설정합니다. |
| [reset](./reset/)() | 포인터가 nullptr를 가리키게 합니다. |
| [set_Mode](./set_mode/)(SmartPtrMode) | 포인터 모드를 설정합니다. 참조된 객체의 참조 카운트를 변경할 수 있습니다. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | 포인터가 가리키는 객체(있는 경우)에서 SetTemplateWeakPtr() 메서드를 호출합니다. |
| [SmartPtr](./smartptr/)(SmartPtrMode) | 필요한 모드의 [SmartPtr](./) 객체를 생성합니다. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | 필요한 모드의 널 포인터 [SmartPtr](./) 객체를 생성합니다. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | 지정된 객체를 가리키는 [SmartPtr](./)을 생성하거나, 원시 포인터를 [SmartPtr](./)으로 변환합니다. |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | [SmartPtr](./) 객체를 복사 생성합니다. 이후 두 포인터는 동일한 객체를 가리킵니다. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | [SmartPtr](./) 객체를 복사 생성합니다. 이후 두 포인터는 동일한 객체를 가리킵니다. 허용되는 경우 타입 변환을 수행합니다. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | [SmartPtr](./) 객체를 이동 생성합니다. 실제로 두 포인터가 동일한 모드인 경우 포인터를 교환합니다. 호출 후 x는 사용할 수 없게 될 수 있습니다. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | 다른 타입의 새 배열을 생성하여 참조된 배열의 타입을 변환합니다. C#에서 지원하지만 C++에서는 지원되지 않는 배열 타입 캐스트가 있을 때 유용합니다. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | 빈 배열을 초기화합니다. 일부 C# 코드 구조를 변환하는 데 사용됩니다. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | ptr의 초기값과 소유권 정보를 공유하지만, 관련 없고 관리되지 않는 포인터 p를 보유하는 [SmartPtr](./)을 생성합니다. |
| [static_pointer_cast](./static_pointer_cast/)() const | 가리키는 객체에 static_cast를 사용하여 포인터를 다른 타입으로 캐스팅합니다. |
| [ToObjectPtr](./toobjectptr/)() const | 모든 포인터 타입을 [Object](../object/)에 대한 포인터로 변환합니다. [Pointee_](./pointee_/) 타입이 완전할 필요는 없습니다. |
| static [Type](./type/)() | [Pointee_](./pointee_) 타입에 대한 [System::TypeInfo](../typeinfo/) 객체를 얻는 바로가기입니다. |
| [~SmartPtr](./~smartptr/)() | [SmartPtr](./) 객체를 파괴합니다. 필요하면 가리키는 객체의 참조 카운터를 감소시키고 객체를 삭제합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ArrayType](./arraytype/) | [System::Array](../array/)의 특수화인 경우 [Pointee_](./pointee_/)와 동일하고, 그렇지 않으면 void입니다. |
| [Pointee_](./pointee_/) | 가리키는 타입. |
| [SmartPtr_](./smartptr_/) | 특수화된 스마트 포인터 타입입니다. |
| [ValueType](./valuetype/) | 가리키는 배열의 저장 타입입니다. T가 [System::Array](../array/)의 특수화인 경우에만 의미가 있습니다. |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
