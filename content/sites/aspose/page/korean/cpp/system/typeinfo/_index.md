---
title: "System::TypeInfo 클래스"
linktitle: "TypeInfo"
second_title: "C++용 Aspose.Page"
description: "System::TypeInfo 클래스. 특정 타입을 나타내며 C++에서 해당 타입에 대한 정보를 제공합니다."
type: docs
weight: 6600
url: /ko/cpp/system/typeinfo/
---
## TypeInfo class


특정 타입을 나타내며 해당에 대한 정보를 제공합니다.

```cpp
class TypeInfo
```

## Nested classes

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | 지정된 특성을 타입의 특성 목록에 추가합니다. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | 타입 T에 대한 기본 생성자를 설정합니다. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | 클래스 인스턴스를 생성하는 펑터를 사용하여 기본 생성자를 설정합니다. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | 지정된 멤버를 타입의 멤버 목록에 추가합니다. |
| static [BoxedValueType](./boxedvaluetype/)() | 여러 Boxed* 클래스가 공유할 수 있도록 [BoxedValue](./boxedvalue/) 타입에 대한 고유한 [TypeInfo](./) 구조를 제공합니다. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | 구현되지 않음. 현재 객체가 나타내는 타입이 선언된 어셈블리에 대한 포인터를 반환합니다. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | 구현되지 않음. 현재 객체가 나타내는 타입의 어셈블리 이름을 포함한 전체 자격 이름을 반환합니다. |
| [get_BaseType](./get_basetype/)() const | 기본 타입 디스크립터를 반환합니다. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | 현재 Type 객체에 아직 특정 타입으로 대체되지 않은 타입 매개변수가 있는지 여부를 나타내는 값을 가져옵니다. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | 지정된 이름을 가진 멤버 목록을 가져옵니다. |
| [get_FullName](./get_fullname/)() const | 현재 객체가 나타내는 형식의 전체 한정 이름(단, 어셈블리 이름 제외)을 반환합니다. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | 이 형식에 대한 제네릭 형식 인수 배열을 가져옵니다. |
| [get_IsAbstract](./get_isabstract/)() const | 형식이 추상이며 반드시 재정의되어야 하는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsArray](./get_isarray/)() const | 형식이 배열인지 여부를 나타내는 값을 가져옵니다. |
| [get_IsClass](./get_isclass/)() const | 형식이 클래스 또는 대리자인지 여부를 나타내는 값을 가져옵니다(즉, 값 형식이나 인터페이스가 아님). |
| [get_IsEnum](./get_isenum/)() const | 현재 형식이 열거형을 나타내는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | 현재 형식이 다른 제네릭 형식을 구성할 수 있는 제네릭 형식 정의를 나타내는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsInterface](./get_isinterface/)() const | 형식이 인터페이스인지 여부를 나타내는 값을 가져옵니다(즉, 클래스나 값 형식이 아님). |
| [get_IsSealed](./get_issealed/)() const | 형식이 sealed(밀봉)로 선언되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsValueType](./get_isvaluetype/)() const | 형식이 값 형식인지 여부를 나타내는 값을 가져옵니다. |
| [get_IsVisible](./get_isvisible/)() const | 형식이 어셈블리 외부 코드에서 접근할 수 있는지 여부를 나타내는 값을 가져옵니다. |
| [get_Name](./get_name/)() const | 현재 객체가 나타내는 형식의 이름을 반환합니다. |
| [get_Namespace](./get_namespace/)() const | 형식의 네임스페이스를 가져옵니다. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | 지정된 배열의 형식과 일치하는 매개변수를 가진 public 인스턴스 생성자를 검색합니다. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | 지정된 BindingFlags를 사용하여 현재 형식에 정의된 생성자를 검색합니다. |
| [GetConstructors](./getconstructors/)() const | 현재 형식에 정의된 모든 public 생성자를 반환합니다. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | 지정된 유형을 가진 사용자 정의 특성을 검색하고 현재 객체가 나타내는 형식에 적용된 것을 찾습니다. |
| [GetCustomAttributes](./getcustomattributes/)() const | 형식에 적용된 모든 사용자 정의 특성을 나타내는 객체를 포함하는 배열을 반환합니다. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | 형식에 적용된 특정 특성을 나타내는 객체를 포함하는 배열을 반환합니다. |
| [GetElementType](./getelementtype/)() const | 구현되지 않음. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | 지정된 바인딩 제약 조건을 사용하여 지정된 필드를 검색합니다. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | 지정된 바인딩 제약 조건을 사용하여 현재 형식에 정의된 필드를 검색합니다. |
| [GetGenericArguments](./getgenericarguments/)() const | 이 형식에 대한 제네릭 형식 인수 배열을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const | 이 인스턴스와 연결된 해시 코드를 반환합니다. |
| [GetInterfaces](./getinterfaces/)() const | 현재 형식이 구현하거나 상속한 모든 인터페이스를 가져옵니다. |
| [GetMember](./getmember/)(const String\&) const | 지정된 이름을 가진 멤버 목록을 가져옵니다. |
| [GetMethod](./getmethod/)(const String\&) const | 지정된 이름을 가진 메서드를 가져옵니다. |
| [GetProperties](./getproperties/)() const | 현재 형식의 모든 public 속성을 반환합니다. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | 지정된 바인딩 제약 조건을 사용하여 현재 Type의 속성을 검색합니다. |
| [GetTemplParamType](./gettemplparamtype/)() const | 템플릿 매개변수 유형 설명자를 가져옵니다. |
| [Hash](./hash/)() const | 현재 객체가 나타내는 유형과 연결된 해시 값을 반환합니다. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | 지정된 유형의 인스턴스를 현재 유형의 변수에 할당할 수 있는지 여부를 결정합니다. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | 구현되지 않음. 지정된 유형 또는 해당 파생 유형의 하나 이상의 특성이 이 멤버에 적용되는지 여부를 나타냅니다. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | 지정된 객체가 현재 유형의 인스턴스인지 여부를 결정합니다. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | 현재 객체가 나타내는 유형이 지정된 클래스의 하위 클래스인지 여부를 결정합니다. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | 현재 [TypeInfo](./) 객체와 지정된 객체가 같지 않은지 여부를 결정합니다. |
| [operator!=](./operator!=/)(std::nullptr_t) const | 현재 [TypeInfo](./) 객체가 null 객체가 아닌지, 즉 어떤 유형을 나타내는지 여부를 결정합니다. |
| [operator==](./operator==/)(const TypeInfo\&) const | 현재 [TypeInfo](./) 객체와 지정된 객체가 같은지 여부를 결정합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | 현재 [TypeInfo](./) 객체가 null 객체인지, 즉 어떤 유형도 나타내지 않는지 여부를 결정합니다. |
| [reset](./reset/)() | [TypeInfo](./)을 null로 설정합니다. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Type이 값 유형인지 여부를 나타내는 값을 설정합니다. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | 기본 유형 설명자를 설정합니다. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | 템플릿 매개변수 유형 설명자를 설정합니다. |
| static [StringHash](./stringhash/)(const char_t *) | 지정된 문자열에 대한 해시를 계산합니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 유형 이름을 포함하는 문자열을 반환합니다. |
| static [Type](./type/)() | [TypeInfo](./) 클래스를 나타내는 [TypeInfo](./) 객체를 반환합니다. |
| [TypeInfo](./typeinfo/)() | 기본 생성자(유형이 설정되지 않음). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | null 객체 생성자(유형이 설정되지 않음). |
| [TypeInfo](./typeinfo/)(const char_t *) | 생성자. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | 생성자. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | 생성자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [EmptyType](./emptytype/) | [TypeInfo](./)의 빈 목록을 나타내는 상수. |
| static [EmptyTypes](./emptytypes/) | [TypeInfo](./)의 빈 목록을 나타내는 상수. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | 유형을 생성하는 함수 포인터. |
## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
