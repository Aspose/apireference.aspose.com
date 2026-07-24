---
title: "System::SmartPtr::SmartPtr 생성자"
linktitle: "SmartPtr"
second_title: "C++용 Aspose.Page"
description: "System::SmartPtr::SmartPtr 생성자. 새로운 다른 타입의 배열을 생성하여 참조된 배열의 타입을 변환합니다. C#에서 배열 타입 캐스팅이 가능하지만 C++에서는 지원되지 않을 때 유용합니다."
type: docs
weight: 100
url: /ko/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


다른 타입의 새 배열을 생성하여 참조된 배열의 타입을 변환합니다. C#에서 지원하지만 C++에서는 지원되지 않는 배열 타입 캐스트가 있을 때 유용합니다.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 매개변수 | 설명 |
| --- | --- |
| Y | 원본 배열의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | 다른 요소 타입을 가진 복사본을 만들기 위한 배열에 대한 포인터. |
| mode | SmartPtrMode | 포인터 모드. |

## 또 보기

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


ptr의 초기값과 소유권 정보를 공유하는 [SmartPtr](../)을 생성하지만, 관련 없고 관리되지 않는 포인터 p를 보유합니다.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | 소유권을 공유하기 위한 또 다른 스마트 포인터. |
| p | Pointee_ * | 관리할 객체에 대한 포인터. |
| mode | SmartPtrMode | 포인터 모드. |

## 또 보기

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


복사하여 [SmartPtr](../) 객체를 생성합니다. 두 포인터는 이후 동일한 객체를 가리킵니다. 허용되는 경우 타입 변환을 수행합니다.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 매개변수 | 설명 |
| --- | --- |
| Q | x가 가리키는 객체의 타입입니다. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | 복사할 포인터. |
| mode | SmartPtrMode | 포인터 모드. |

## 또 보기

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


복사하여 [SmartPtr](../) 객체를 생성합니다. 두 포인터는 이후 동일한 객체를 가리킵니다.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ptr | const SmartPtr_\& | 복사할 포인터. |
| mode | SmartPtrMode | 포인터 모드. |

## 또 보기

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


빈 배열을 초기화합니다. 일부 C# 코드 구조를 변환하는 데 사용됩니다.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| 매개변수 | 설명 |
| --- | --- |
| Y | EmptyArrayInitializer 타입의 자리표시자. |

## 또 보기

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


지정된 객체를 가리키는 [SmartPtr](../)을 생성하거나, 원시 포인터를 [SmartPtr](../)으로 변환합니다.

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 객체 | Pointee_ * | Pointee. |
| mode | SmartPtrMode | 포인터 모드. |

## 또 보기

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


이동으로 [SmartPtr](../) 객체를 생성합니다. 두 포인터가 동일한 모드인 경우 실제로 두 포인터를 교환합니다. 호출 후 x는 사용할 수 없게 될 수 있습니다.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | SmartPtr_\&& | 이동할 포인터. |
| mode | SmartPtrMode | 포인터 모드. |

## 또 보기

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


필요한 모드의 [SmartPtr](../) 객체를 생성합니다.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| mode | SmartPtrMode | 포인터 모드. |

## 또 보기

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


필요한 모드의 널 포인터 [SmartPtr](../) 객체를 생성합니다.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| mode | std::nullptr_t | 포인터 모드. |

## 또 보기

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
