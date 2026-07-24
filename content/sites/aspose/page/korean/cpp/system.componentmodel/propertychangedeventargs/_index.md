---
title: "System::ComponentModel::PropertyChangedEventArgs class"
linktitle: "PropertyChangedEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::PropertyChangedEventArgs 클래스. PropertyChanged 이벤트의 인수입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++ 함수의 인수로 전달하십시오."
type: docs
weight: 1200
url: /ko/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


PropertyChanged 이벤트의 인수입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | RTTI 정보. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | PropertyChanged 이벤트 인수를 초기화합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## 또 보기

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
