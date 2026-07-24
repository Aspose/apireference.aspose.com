---
title: "System::SmartPtr::Cast 메서드"
linktitle: "Cast"
second_title: "C++용 Aspose.Page"
description: "System::SmartPtr::Cast 메서드. C++에서 포인터를 자체 타입으로 변환합니다."
type: docs
weight: 400
url: /ko/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


포인터를 해당 타입 자체로 캐스팅합니다.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| 매개변수 | 설명 |
| --- | --- |
| Y | 가리키는 객체의 대상 타입. |
| Check | 변환이 불가능한 경우 예외를 발생시키는 플래그. |

### ReturnValue

항상 공유 모드인 변경된 타입의 포인터.

## 또 보기

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


static_cast를 사용해 포인터를 기본 타입으로 캐스팅합니다.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| 매개변수 | 설명 |
| --- | --- |
| Y | 가리키는 객체의 대상 타입. |
| Check | 변환이 불가능한 경우 예외를 발생시키는 플래그. |

### ReturnValue

항상 공유 모드인 변경된 타입의 포인터.

## 또 보기

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


dynamic_cast를 사용해 포인터를 파생 타입으로 캐스팅합니다.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| 매개변수 | 설명 |
| --- | --- |
| Y | 가리키는 객체의 대상 타입. |
| Check | 변환이 불가능한 경우 예외를 발생시키는 플래그. |

### ReturnValue

항상 공유 모드인 변경된 타입의 포인터. 변환이 불가능하면 InvalidCastException을 발생시킵니다.

## 또 보기

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


dynamic_cast를 사용해 포인터를 파생 타입으로 캐스팅합니다.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| 매개변수 | 설명 |
| --- | --- |
| Y | 가리키는 객체의 대상 타입. |
| Check | 변환이 불가능한 경우 예외를 발생시키는 플래그. |

### ReturnValue

항상 공유 모드인 변경된 타입의 포인터. 변환이 불가능하면 nullptr를 반환합니다.

## 또 보기

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
