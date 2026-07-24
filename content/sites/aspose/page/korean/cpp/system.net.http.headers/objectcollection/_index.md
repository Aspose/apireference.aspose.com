---
title: "System::Net::Http::Headers::ObjectCollection class"
linktitle: "ObjectCollection"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::ObjectCollection 클래스. C++에서 객체들의 컬렉션을 나타냅니다."
type: docs
weight: 1600
url: /ko/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


객체들의 컬렉션을 나타냅니다.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 객체 유형입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | RTTI 정보. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | 새 인스턴스를 생성합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |

## 또 보기

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
