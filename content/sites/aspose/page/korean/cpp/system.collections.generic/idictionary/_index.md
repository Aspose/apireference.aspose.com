---
title: "System::Collections::Generic::IDictionary 클래스"
linktitle: "IDictionary"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::IDictionary 클래스. 사전과 유사한 컨테이너를 위한 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2100
url: /ko/cpp/system.collections.generic/idictionary/
---
## IDictionary class


사전과 유사한 컨테이너를 위한 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| 매개변수 | 설명 |
| --- | --- |
| TKey | 키 유형. |
| TValue | 값 형식. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | 컨테이너에 키-값 쌍을 추가합니다. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | 컨테이너에 키가 포함되어 있는지 확인합니다. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | 사전 내용을 기존 배열 요소에 복사합니다. |
| virtual [get_Count](./get_count/)() const | get_Count 멤버 함수를 공개합니다. |
| [get_IsFixedSize](./get_isfixedsize/)() const | 컬렉션 크기가 고정되어 있는지 확인합니다. |
| [get_IsSynchronized](./get_issynchronized/)() const | 컨테이너가 스레드 안전한지 확인합니다. |
| virtual [get_Keys](./get_keys/)() const | 키 컬렉션에 접근합니다. |
| virtual [get_Values](./get_values/)() const | 값 컬렉션에 접근합니다. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | 값을 찾으면 반환하고, 그렇지 않으면 **Value()**를 반환합니다. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | 값을 찾으면 반환하고, 그렇지 않으면 **defaultValue**를 반환합니다. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | 값을 찾으면 반환하고, 그렇지 않으면 **null**을 반환합니다. 이는 참조 형식에만 의미가 있습니다. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | Getter 함수. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | Setter 함수. |
| virtual [Remove](./remove/)(const TKey\&) | 키를 컨테이너에서 제거합니다. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | 값을 찾아서 발견되면 반환합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | RTTI 정보. |
| [KeyValuePairType](./keyvaluepairtype/) | 키-값 쌍 유형. |

## 또 보기

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
