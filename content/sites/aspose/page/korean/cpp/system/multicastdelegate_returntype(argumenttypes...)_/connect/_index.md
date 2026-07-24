---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect 메서드"
linktitle: "연결"
second_title: "C++용 Aspose.Page"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect 메서드. 지정된 delegate를 C++에서 컬렉션에 추가합니다."
type: docs
weight: 400
url: /ko/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


지정된 대리자를 컬렉션에 추가합니다.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | Callback | 컬렉션에 추가할 대리자 |

### ReturnValue

self에 대한 참조

## 또 보기

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


지정된 객체의 지정된 비정적 메서드를 대리자 컬렉션에 추가합니다.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| 매개변수 | 설명 |
| --- | --- |
| MemberType | delegate 컬렉션에 추가될 비정적 메서드의 타입 |
| ClassType | delegate에 추가될 객체 메서드의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 멤버 | MemberType ClassType::* | 지정된 객체의 비정적 메서드에 대한 포인터 |
| obj | ClassType * | delegate 컬렉션에 추가될 객체 멤버 메서드에 대한 포인터 |

### ReturnValue

self에 대한 참조

## 또 보기

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


지정된 객체의 지정된 비정적 메서드를 대리자 컬렉션에 추가합니다.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| MemberType | delegate 컬렉션에 추가될 비정적 메서드의 타입 |
| ClassType | delegate 컬렉션에 추가될 객체 메서드의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 멤버 | MemberType ClassType::* | 지정된 객체의 비정적 메서드에 대한 포인터 |
| obj | const SharedPtr\<ClassType\>\& | delegate 컬렉션에 추가될 객체 멤버 메서드에 대한 공유 포인터 |

### ReturnValue

self에 대한 참조

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


지정된 MulticastDelegate 객체를 대리자 컬렉션에 추가합니다.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | MulticastDelegate\& | delegate 컬렉션에 추가할 MulticastDelegate 클래스의 인스턴스 |

### ReturnValue

self에 대한 참조

## 또 보기

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


지정된 함수 객체를 delegate 컬렉션에 추가합니다. 함수 객체는 컬렉션에 추가되기 전에 [Callback](../callback/) delegate 타입으로 변환됩니다.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| 매개변수 | 설명 |
| --- | --- |
| R | 컬렉션에 추가될 함수 객체의 반환 타입 |
| 인수 | 컬렉션에 추가될 함수 객체의 인자 목록 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | 컬렉션에 추가될 함수 객체 |

### ReturnValue

self에 대한 참조

## 또 보기

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
