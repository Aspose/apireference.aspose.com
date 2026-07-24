---
title: "System::Collections::Generic::BaseKVCollection 클래스"
linktitle: "BaseKVCollection"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::BaseKVCollection 클래스. 키 또는 값 컬렉션을 위한 공통 코드를 포함합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++ 함수에 인수로 전달하십시오."
type: docs
weight: 700
url: /ko/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


키 또는 값 컬렉션을 위한 공통 코드를 포함합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수에 인수로 전달하십시오.

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| 매개변수 | 설명 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 유형. |
| KV | 키 또는 값 유형, 인터페이스가 사용되는 경우에 따라. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | 컬렉션을 생성합니다. |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | 데이터를 기존 배열 요소에 복사합니다. |
| [get_Count](./get_count/)() const override | 요소 수를 가져옵니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 컴파일을 가능하게 하지만, 이 구조체는 데이터를 소유하지 않으므로 실제로는 아무 작업도 수행하지 않습니다. |

## 또 보기

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
