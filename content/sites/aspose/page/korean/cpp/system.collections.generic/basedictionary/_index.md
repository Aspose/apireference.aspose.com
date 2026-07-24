---
title: "System::Collections::Generic::BaseDictionary 클래스"
linktitle: "BaseDictionary"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::BaseDictionary 클래스. 다양한 사전 유사 데이터 구조(예: Dictionary, SortedDictionary)를 위한 공통 코드를 구현합니다. 직접 사용해서는 안 되며, 컨테이너를 정의할 때 상속용으로만 사용하십시오. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 500
url: /ko/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


다양한 사전 유사 데이터 구조(예: [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/))를 위한 공통 코드를 구현합니다. 직접 사용해서는 안 되며, 컨테이너를 정의할 때 상속용으로만 사용하십시오. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 해당 포인터를 사용하십시오.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| 매개변수 | 설명 |
| --- | --- |
| Map | 기본 맵 타입입니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | C++ 전용. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | 키-값 쌍을 사전에 추가합니다. |
| [BaseDictionary](./basedictionary/)() | 빈 데이터 구조를 생성합니다. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | 기본 맵 생성자에 인수를 전달하기 위한 포워딩 생성자입니다. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | 복사 생성자입니다. |
| [BaseDictionary](./basedictionary/)(BaseType *) | 복사 생성자입니다. |
| [begin](./begin/)() const | 컨테이너의 키-값 요소에 대한 KVPair 래퍼 iterator를 반환합니다. C# 스타일로 구현되어 있으며, iterator는 get_Key()와 get_Value() 인터페이스를 가진 KVPair 객체를 반환해야 합니다. 컨테이너가 비어 있는 경우 반환된 iterator는 [end()](../ienumerable/end/)와 동일합니다. |
| [cbegin](./cbegin/)() const | 컨테이너의 첫 번째 요소에 대한 iterator를 반환합니다. STL 스타일로 구현되었습니다. 컨테이너가 비어 있는 경우 반환된 iterator는 [end()](../ienumerable/end/)와 동일합니다. |
| [cend](./cend/)() const | 컨테이너의 마지막 요소 다음에 위치한 요소에 대한 iterator를 반환합니다. STL 스타일로 구현되었습니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [Clear](./clear/)() override | 모든 요소를 삭제합니다. |
| [ContainsKey](./containskey/)(const key_t\&) const override | 키가 사전에 존재하는지 확인합니다. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | 값이 사전에 존재하는지 확인합니다. 값 비교에 operator ==를 사용합니다. |
| [data](./data/)() | 기본 데이터 저장소 접근자입니다. |
| [data](./data/)() const | 기본 데이터 저장소 접근자입니다. |
| [end](./end/)() const | 컨테이너의 마지막 요소 다음에 있는 키-값 요소에 대한 KVPair 래퍼의 반복자를 반환합니다. C# 스타일로 구현되었으며 - 반복자는 get_Key() 및 get_Value() 인터페이스를 가진 KVPair 객체를 반환해야 합니다. 이 요소는 자리 표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [get_Count](./get_count/)() const override | 요소 개수를 가져옵니다. |
| virtual [GetEnumerator](./getenumerator/)() | 열거자 인스턴스를 생성합니다. 서브클래스에서 구현되어야 합니다. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | 값을 찾으면 반환하고, 그렇지 않으면 **Value()**를 반환합니다. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | 값을 찾으면 반환하고, 그렇지 않으면 **defaultValue**를 반환합니다. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | 값을 찾으면 반환하고, 그렇지 않으면 **null**을 반환합니다. 참조 타입에만 의미가 있습니다. |
| [idx_get](./idx_get/)(const key_t\&) const override | 키 기반 getter 함수. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | 키 기반 setter 함수. 요소를 변경하거나 생성합니다. |
| virtual [operator[]](./operator[]/)(const key_t\&) | 접근자 함수. |
| [Remove](./remove/)(const key_t\&) override | 사전에서 특정 키를 제거합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | 키가 있는 값을 찾아서 발견되면 반환합니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | 구현된 인터페이스. |
| [const_iterator](./const_iterator/) | 상수 반복자 타입. |
| [iterator](./iterator/) | 반복자 타입. |
| [KeyCollection](./keycollection/) | 기본 저장소 유형에 맞는 올바른 할당자를 사용하도록 확인합니다. |
| [KVPair](./kvpair/) | 키-값 쌍 타입. |
| [map_t](./map_t/) | 내부 맵 타입. |
| [ValueCollection](./valuecollection/) | 값들의 컬렉션. |

## 또 보기

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
