---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate 메서드"
linktitle: "Delegate"
second_title: "C++용 Aspose.Page"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate 메서드. 기본 생성자. C++에서 아무 것도 가리키지 않는 delegate 객체를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


기본 생성자. 아무 것도 가리키지 않는 delegate 객체를 생성합니다.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## 또 보기

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## 또 보기

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


이동 복사 생성자. 지정된 delegate가 가리키는 엔티티의 소유권을 가져옵니다.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| o | Delegate\&& | 포인터가 가리키는 엔터티를 이동할 Delegate 객체 |

## 또 보기

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


생성자. 지정된 함수 객체로부터 delegate를 생성합니다.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 생성자가 인수로 받아들이는 함수 객체의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| functor_tag | int | 더미 정수 값; 이 인수는 모호성을 해결하는 데 사용됩니다 |
| functor | T\& | 새로 생성된 delegate가 가리키게 될 함수 객체 |

## 또 보기

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


이동 생성자. 지정된 함수 객체로부터 delegate를 생성합니다.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 생성자가 인수로 받아들이는 함수 객체의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| functor_tag | long | 더미 정수 값; 이 인수는 모호성을 해결하는 데 사용됩니다 |
| functor | T\&& | 새로 생성된 delegate가 가리키게 될 함수 객체 |

## 또 보기

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


생성자. 지정된 객체의 지정된 비정적 메서드를 가리키는 delegate를 생성합니다.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| 매개변수 | 설명 |
| --- | --- |
| MemberType | 생성자가 인수로 받아들이는 비정적 메서드의 유형 |
| ClassType | 생성자가 인수로 받아들이는 객체의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 멤버 | MemberType ClassType::* | 새로 생성된 대리자가 가리키게 될 비정적 메서드에 대한 포인터 |
| obj | ClassType * | 새로 생성된 대리자가 가리키게 될 객체 멤버 메서드에 대한 포인터 |

## 또 보기

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


생성자. 지정된 객체의 지정된 비정적 메서드를 가리키는 delegate를 생성합니다.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| MemberType | 생성자가 인수로 받아들이는 비정적 메서드의 유형 |
| ClassType | 생성자가 인수로 받아들이는 객체의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 멤버 | MemberType MemberClass::* | 새로 생성된 대리자가 가리키게 될 비정적 메서드에 대한 포인터 |
| obj | const SharedPtr\<ClassType\>\& | 새로 생성된 대리자가 가리키게 될 객체 멤버 메서드에 대한 공유 포인터 |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


std::function 함수 객체를 가리키는 delegate 객체를 생성합니다.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| 매개변수 | 설명 |
| --- | --- |
| R | 생성자가 인수로 받아들이는 함수 객체의 반환 유형 |
| 인수 | 생성자가 인수로 받아들이는 함수 객체의 인자 목록 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | 새로 생성된 대리자 객체가 가리키게 될 함수 객체 |

## 또 보기

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


생성자. std::bind()에 의해 생성된 함수 객체 포인터로부터 delegate를 생성합니다.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| 매개변수 | 설명 |
| --- | --- |
| 그 | 생성자가 인수로 받아들이는 std::bind()에 의해 생성된 함수 객체의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 함수 | T | 새로 생성된 Delegate 인스턴스가 가리키게 될 "bind expression"(std::bind()에 의해 생성된 함수 포인터)에 대한 포인터 |

## 또 보기

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


생성자. 지정된 자유 함수 또는 정적 메서드 포인터로부터 delegate 객체를 생성합니다.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| 매개변수 | 설명 |
| --- | --- |
| 그 | 생성자가 인수로 받아들이는 함수 또는 정적 메서드 포인터의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 함수 | T | 새로 생성된 Delegate 인스턴스가 가리키게 될 함수 또는 정적 메서드에 대한 포인터 |

## 또 보기

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
