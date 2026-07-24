---
title: "System::Collections::ObjectModel::KeyedCollection 클래스"
linktitle: "KeyedCollection"
second_title: "C++용 Aspose.Page"
description: "System::Collections::ObjectModel::KeyedCollection 클래스. 내장된 키를 가진 요소들의 추상 컬렉션입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 200
url: /ko/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


내장된 키를 가진 요소들의 추상 컬렉션입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용해 함수 인수로 전달하십시오.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| 매개변수 | 설명 |
| --- | --- |
| TKey | 키 유형. |
| TItem | 값 형식. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const TItem\&) override | 컨테이너 끝에 항목을 추가합니다. |
| [Contains](./contains/)(TKey) | 키가 컨테이너에 존재하는지 확인합니다. |
| [get_Comparer](./get_comparer/)() | 비교자를 가져옵니다. |
| [idx_get](./idx_get/)(TKey) | 특정 인덱스의 항목을 가져옵니다. |
| [Remove](./remove/)(TKey) | 키를 컨테이너에서 제거합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 특정 템플릿 인자를 공유 포인터 대신 약한 포인터로 취급하도록 만듭니다 (해당되는 경우). |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Lookup 사전 생성 임계값, 기본값. |

## 또 보기

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
