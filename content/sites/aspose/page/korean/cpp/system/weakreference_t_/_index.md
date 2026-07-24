---
title: "System::WeakReference< T > class"
linktitle: "WeakReference< T >"
second_title: "C++용 Aspose.Page"
description: "System::WeakReference< T > class. 객체를 참조하지만 해당 객체가 C++에서 삭제될 수 있도록 허용하는 약한 참조를 나타냅니다."
type: docs
weight: 7700
url: /ko/cpp/system/weakreference_t_/
---
## WeakReference< T > class


객체를 참조하면서도 해당 객체가 삭제될 수 있도록 허용하는 약한 참조를 나타냅니다.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| 매개변수 | 설명 |
| --- | --- |
| T | 참조된 객체의 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | 참조된 객체가 null이 아닌지 확인합니다. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | 참조된 객체를 다른 인스턴스 [WeakReference](../weakreference/) 클래스와 비교합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | 참조된 객체가 null인지 확인합니다. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | 참조된 객체를 다른 인스턴스 [WeakReference](../weakreference/) 클래스와 비교합니다. |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | 현재 [WeakReference](../weakreference/) 객체가 참조하고 있는 객체(대상)를 설정합니다. |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | 현재 [WeakReference](../weakreference/) 객체가 참조하고 있는 객체(대상)를 가져옵니다. |
| [WeakReference](./weakreference/)() | 기본 생성자. |
| [WeakReference](./weakreference/)(std::nullptr_t) | nullptr를 사용한 생성자. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | [WeakReference](../weakreference/) 클래스의 새 인스턴스를 초기화하고, 지정된 객체를 참조합니다. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | [WeakReference](../weakreference/) 클래스의 새 인스턴스를 초기화하고, 지정된 객체를 참조합니다. |

## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
