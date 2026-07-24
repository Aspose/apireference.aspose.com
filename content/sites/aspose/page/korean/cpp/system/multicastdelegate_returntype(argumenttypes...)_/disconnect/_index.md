---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect 메서드"
linktitle: "disconnect"
second_title: "C++용 Aspose.Page"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect 메서드. 지정된 대리자를 C++의 대리자 컬렉션에서 제거합니다."
type: docs
weight: 500
url: /ko/cpp/system/multicastdelegate_returntype(argumenttypes...)_/disconnect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(Callback) method


지정된 대리자를 대리자 컬렉션에서 제거합니다.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(Callback callback)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | Callback | 컬렉션에서 제거할 대리자 |

### ReturnValue

self에 대한 참조

## 또 보기

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, ClassType *) method


지정된 객체의 지정된 비정적 메서드를 대리자 컬렉션에서 제거합니다.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, ClassType *obj)
```


| 매개변수 | 설명 |
| --- | --- |
| MemberType | 대리자 컬렉션에서 제거될 비정적 메서드의 타입 |
| ClassType | 대리자 컬렉션에서 제거될 객체 메서드의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 멤버 | MemberType ClassType::* | 지정된 객체의 비정적 메서드에 대한 포인터 |
| obj | ClassType * | 대리자 컬렉션에서 제거될 객체 멤버 메서드에 대한 포인터 |

### ReturnValue

self에 대한 참조

## 또 보기

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


지정된 객체의 지정된 비정적 메서드를 대리자 컬렉션에서 제거합니다.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| MemberType | 대리자 컬렉션에서 제거될 비정적 메서드의 타입 |
| ClassType | 대리자 컬렉션에서 제거될 객체 메서드의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 멤버 | MemberType ClassType::* | 지정된 객체의 비정적 메서드에 대한 포인터 |
| obj | const SharedPtr\<ClassType\>\& | 대리자 컬렉션에서 제거될 객체 멤버 메서드에 대한 공유 포인터 |

### ReturnValue

self에 대한 참조

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate\&) method


지정된 MulticastDelegate 객체를 대리자 컬렉션에서 제거합니다.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::disconnect(MulticastDelegate &other)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | MulticastDelegate\& | 대리자 컬렉션에서 제거할 MulticastDelegate 클래스의 인스턴스 |

### ReturnValue

self에 대한 참조

## 또 보기

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
