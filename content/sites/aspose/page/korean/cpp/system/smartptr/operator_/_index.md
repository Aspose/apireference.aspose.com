---
title: "System::SmartPtr::operator* 메서드"
linktitle: "operator*"
second_title: "C++용 Aspose.Page"
description: "System::SmartPtr::operator* 메서드. 가리키는 객체에 대한 참조를 반환합니다. C++에서 포인터가 null이 아님을 보장합니다."
type: docs
weight: 2500
url: /ko/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


가리키는 객체에 대한 참조를 가져옵니다. 포인터가 null이 아님을 단언합니다.

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

가리키는 객체에 대한 참조.

## 또 보기

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::SmartPtr::operator< 메서드
링크제목: operator<
second_title: Aspose.Page for C++
description: 'System::SmartPtr::operator< 메서드. C++에서 SmartPtr 클래스에 대한 less-compare 의미를 제공합니다.'
type: docs
weight: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


[SmartPtr](../) 클래스에 대한 less-compare 의미를 제공합니다.

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| 매개변수 | 설명 |
| --- | --- |
| Y | 현재 포인터와 비교할 포인터의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | SmartPtr\\<Y\\> const\\& | 현재 포인터와 비교할 포인터. |

### ReturnValue

[SmartPtr](../)가 참조하는 객체가 x보다 '작은' 경우 true, 그렇지 않으면 false.

## 또 보기

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator<(Y *) const method


[SmartPtr](../) 클래스에 대한 less-compare 의미를 제공합니다.

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| 매개변수 | 설명 |
| --- | --- |
| Y | 현재 포인터와 비교할 포인터의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| p | Y * | 현재 포인터와 비교할 포인터. |

### ReturnValue

객체가 [SmartPtr](../)에 의해 참조되고 p보다 'less'인 경우 True이며, 그렇지 않으면 False.

## 또 보기

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
