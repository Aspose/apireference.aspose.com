---
title: "System::IDisposable 클래스"
linktitle: "IDisposable"
second_title: "C++용 Aspose.Page"
description: "System::IDisposable 클래스. 현재 객체가 소유한 리소스를 해제하는 메서드를 정의합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 3600
url: /ko/cpp/system/idisposable/
---
## IDisposable class


현재 객체가 소유한 리소스를 해제하는 메서드를 정의합니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하는 데 사용하십시오.

```cpp
class IDisposable : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Dispose](./dispose/)() | 아무 작업도 수행하지 않습니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
