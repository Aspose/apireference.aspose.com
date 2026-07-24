---
title: "System::SmartPtr::operator= 메서드"
linktitle: "operator="
second_title: "C++용 Aspose.Page"
description: "System::SmartPtr::operator= 메서드. SmartPtr 객체를 복사 할당합니다. C++에서 필요한 형 변환을 수행합니다."
type: docs
weight: 2800
url: /ko/cpp/system/smartptr/operator=/
---
## SmartPtr::operator=(const SmartPtr\<Q\>\&) method


[SmartPtr](../) 객체를 복사 할당합니다. 필요한 형 변환을 수행합니다.

```cpp
template<typename Q> SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr<Q> &x)
```


| 매개변수 | 설명 |
| --- | --- |
| Q | x가 가리키는 객체의 타입입니다. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | 복사 할당할 포인터. |

### ReturnValue

이 객체에 대한 참조.

## 또 보기

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(const SmartPtr_\&) method


[SmartPtr](../) 객체를 복사 할당합니다.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(const SmartPtr_ &x)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const SmartPtr_\& | 복사 할당할 포인터. |

### ReturnValue

이 객체에 대한 참조.

## 또 보기

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(Pointee_ *) method


원시 포인터를 [SmartPtr](../) 객체에 할당합니다.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(Pointee_ *p)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| p | Pointee_ * | 할당할 포인터 값. |

### ReturnValue

이 객체에 대한 참조.

## 또 보기

* Typedef [SmartPtr_](../smartptr_/)
* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(SmartPtr_\&&) method


[SmartPtr](../) 객체를 이동 할당합니다. x는 사용할 수 없게 됩니다.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(SmartPtr_ &&x) noexcept
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | SmartPtr_\&& | 이동 할당할 포인터. |

### ReturnValue

이 객체에 대한 참조.

## 또 보기

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator=(std::nullptr_t) method


포인터 값을 nullptr로 설정합니다.

```cpp
SmartPtr_ & System::SmartPtr<T>::operator=(std::nullptr_t)
```


### ReturnValue

이 객체에 대한 참조.

## 또 보기

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
