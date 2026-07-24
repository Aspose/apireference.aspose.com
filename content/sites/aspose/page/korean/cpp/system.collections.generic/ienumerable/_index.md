---
title: "System::Collections::Generic::IEnumerable class"
linktitle: "IEnumerable"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::IEnumerable 클래스. C++에서 포함된 요소에 대한 열거자를 제공하는 객체의 인터페이스."
type: docs
weight: 2200
url: /ko/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


포함된 요소에 대한 열거자를 제공하는 객체의 인터페이스입니다.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [begin](./begin/)() | 컬렉션의 첫 번째 요소(있는 경우)를 가리키는 반복자를 가져옵니다. 이 반복자는 [GetEnumerator()](./getenumerator/)가 T의 복사 객체를 반환하기 때문에 참조된 객체를 변경하는 데 사용할 수 없습니다. |
| [begin](./begin/)() const | 컬렉션의 const 한정 인스턴스에서 첫 번째 요소(있는 경우)를 가리키는 반복자를 가져옵니다. |
| [cbegin](./cbegin/)() const | 컬렉션의 첫 번째 const 한정 요소(있는 경우)를 가리키는 반복자를 가져옵니다. |
| [cend](./cend/)() const | 컬렉션의 마지막 const 한정 요소(있는 경우) 바로 뒤를 가리키는 반복자를 가져옵니다. |
| [end](./end/)() | 컬렉션의 마지막 요소(있는 경우) 바로 뒤를 가리키는 반복자를 가져옵니다. 이 반복자는 [GetEnumerator()](./getenumerator/)가 T의 복사 객체를 반환하기 때문에 참조된 객체를 변경하는 데 사용할 수 없습니다. |
| [end](./end/)() const | 컬렉션의 const 한정 인스턴스에서 마지막 요소(있는 경우) 바로 뒤를 가리키는 반복자를 가져옵니다. |
| virtual [GetEnumerator](./getenumerator/)() | 열거자를 가져옵니다. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | 시퀀스에 누산 함수를 적용합니다. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | 시퀀스의 모든 요소가 조건을 만족하는지 확인합니다. |
| [LINQ_Any](./linq_any/)() | 시퀀스에 요소가 하나라도 포함되어 있는지 확인합니다. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | 시퀀스에 요소가 존재하거나 조건을 만족하는지 확인합니다. |
| [LINQ_Cast](./linq_cast/)() | 요소를 지정된 타입으로 캐스팅합니다. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | 두 시퀀스를 연결합니다. |
| [LINQ_Contains](./linq_contains/)(T) | 시퀀스에 지정된 값이 포함되어 있는지 확인합니다. |
| [LINQ_Count](./linq_count/)() | 시퀀스의 요소 개수를 반환합니다(직접 계산을 통해). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | 시퀀스에서 지정된 조건을 만족하는 요소 개수를 반환합니다. |
| [LINQ_ElementAt](./linq_elementat/)(int) | 시퀀스에서 지정된 인덱스에 있는 요소를 반환합니다. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | 시퀀스에서 지정된 인덱스에 있는 요소를 반환합니다. |
| [LINQ_First](./linq_first/)() | 시퀀스의 첫 번째 요소를 반환합니다. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | 시퀀스에서 지정된 조건을 만족하는 첫 번째 요소를 반환합니다. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | 시퀀스의 첫 번째 요소를 반환하거나, 시퀀스가 비어 있으면 기본값을 반환합니다. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | 시퀀스에서 조건을 만족하는 첫 번째 요소를 반환하거나, 해당 요소가 없으면 기본값을 반환합니다. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | 시퀀스의 요소들을 그룹화합니다. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_Last](./linq_last/)() | 시퀀스의 마지막 요소를 반환합니다. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | 시퀀스의 마지막 요소를 반환하거나, 시퀀스가 비어 있는 경우 기본값을 반환합니다. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | 제네릭 시퀀스의 각 요소에 변환 함수를 적용하고, 결과값 중 최대값을 반환합니다. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | 제네릭 시퀀스의 각 요소에 변환 함수를 적용하고, 결과값 중 최소값을 반환합니다. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | 지정된 유형을 기준으로 시퀀스의 요소를 필터링합니다. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | keySelector가 선택한 키 값을 기준으로 시퀀스의 요소를 오름차순으로 정렬합니다. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | keySelector가 선택한 키 값을 기준으로 시퀀스의 요소를 내림차순으로 정렬합니다. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | 시퀀스의 요소 순서를 반전시킵니다. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | 시퀀스의 요소를 변환합니다. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | 요소의 인덱스를 포함하여 시퀀스의 각 요소를 새로운 형태로 변환합니다. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | 시퀀스의 각 요소를 투영하고, 결과 시퀀스를 하나의 시퀀스로 결합합니다. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | 시퀀스 시작부터 지정된 개수만큼 연속된 요소를 반환합니다. |
| [LINQ_ToArray](./linq_toarray/)() | 시퀀스로부터 배열을 생성합니다. |
| [LINQ_ToList](./linq_tolist/)() | 시퀀스로부터 [List<T>](../list/)을 생성합니다. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | 지정된 프레디케이트를 기준으로 시퀀스를 필터링합니다. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [const_iterator](./const_iterator/) | 상수 반복자 타입. |
| [IEnumeratorType](./ienumeratortype/) | RTTI 정보. |
| [iterator](./iterator/) | 반복자 타입. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | 내부 반복자 기본 타입. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | 내부 반복자 요소 타입. |

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
