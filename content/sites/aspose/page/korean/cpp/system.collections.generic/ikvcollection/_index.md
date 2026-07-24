---
title: "System::Collections::Generic::IKVCollection 클래스"
linktitle: "IKVCollection"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::IKVCollection 클래스. 사전과 유사한 컨테이너의 키 또는 값을 포함하는 컨테이너 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++ 함수의 인자로 전달하십시오."
type: docs
weight: 2500
url: /ko/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


사전과 유사한 컨테이너의 키 또는 값을 포함하는 컨테이너 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인자로 전달하십시오.

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) 유형. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const T\&) override | 컨테이너에 항목을 추가합니다. |
| [Clear](./clear/)() override | 컨테이너의 모든 요소를 삭제합니다. |
| [Contains](./contains/)(const T\&) const override | 컨테이너에 항목이 존재하는지 확인합니다. |
| virtual [get_Count](./get_count/)() const | 컨테이너의 요소 개수를 가져옵니다. |
| [get_IsReadOnly](./get_isreadonly/)() const override | 컨테이너가 읽기 전용인지 확인합니다. |
| virtual [GetEnumerator](./getenumerator/)() | RTTI 정보. |
| virtual [idx_get](./idx_get/)(int) const | Getter 함수. |
| [idx_set](./idx_set/)(int, T) override | Setter 함수. |
| [IndexOf](./indexof/)(const T\&) const override | 컨테이너에서 항목의 인덱스를 가져옵니다. |
| [Insert](./insert/)(int, const T\&) override | 지정된 위치에 항목을 삽입합니다. |
| [Remove](./remove/)(const T\&) override | 컨테이너에서 항목을 제거합니다. |
| [RemoveAt](./removeat/)(int) override | 지정된 위치의 항목을 제거합니다. |

## 또 보기

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
