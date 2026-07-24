---
title: "System::Collections::ObjectModel::ReadOnlyCollection 클래스"
linktitle: "ReadOnlyCollection"
second_title: "C++용 Aspose.Page"
description: "System::Collections::ObjectModel::ReadOnlyCollection 클래스. 특정 컨테이너를 래핑하여 읽기 전용 모드로 접근합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 300
url: /ko/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


특정 컨테이너를 래핑하여 읽기 전용 모드로 접근합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | 컨테이너에 특정 항목이 포함되어 있는지 확인합니다. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | 컨테이너 요소를 기존 배열 요소에 복사합니다. |
| [get_Count](./get_count/)() const override | 컨테이너 요소의 개수를 가져옵니다. |
| [get_IsReadOnly](./get_isreadonly/)() const override | 컬렉션이 읽기 전용인지 확인합니다. |
| [GetEnumerator](./getenumerator/)() override | 컬렉션 열거자를 가져옵니다. |
| [idx_get](./idx_get/)(int) const override | 특정 위치의 항목을 가져옵니다. |
| [IndexOf](./indexof/)(const T\&) const override | 컬렉션에서 특정 항목을 찾습니다. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | 특정 컬렉션 주위에 읽기 전용 컬렉션을 래핑합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 읽기 전용 컬렉션은 데이터를 래핑하고 아무 것도 저장하지 않으므로 아무 작업도 수행하지 않습니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | 구현된 인터페이스. |
| [IEnumeratorPtr](./ienumeratorptr/) | 동일한 요소들의 컨테이너. |
| [ValueType](./valuetype/) | 값 형식. |

## 또 보기

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
