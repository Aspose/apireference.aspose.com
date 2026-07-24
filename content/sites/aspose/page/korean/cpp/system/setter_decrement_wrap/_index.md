---
title: "System::setter_decrement_wrap 메서드"
linktitle: "setter_decrement_wrap"
second_title: "C++용 Aspose.Page"
description: "System::setter_decrement_wrap 메서드. 번역기는 C#''s 전위 감소 연산식을, setter와 getter가 정의된 인스턴스의 프로퍼티를 대상으로, C++에서 const getter에 대한 오버로드인 이 함수 호출로 변환합니다."
type: docs
weight: 37100
url: /ko/cpp/system/setter_decrement_wrap/
---
## System::setter_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


번역기는 C#'s 전위 감소 연산식을, setter와 getter가 정의된 인스턴스의 프로퍼티를 대상으로, const getter에 대한 오버로드인 이 함수 호출로 변환합니다.

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| 매개변수 | 설명 |
| --- | --- |
| T | 속성의 타입입니다. |
| Host | - 수정될 인스턴스의 클래스 |
| HostConstGet | - 속성의 getter가 정의된 Host 자체 또는 그 기반 타입 |
| HostSet | - 속성의 setter가 정의된 Host 자체 또는 그 기반 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| host | Host *const | getter와 setter를 호출할 인스턴스. |
| pGetter | T(HostConstGet::*)() const | 속성의 getter 함수를 가리키는 함수 포인터 |
| pSetter | void(HostSet::*)(T) | 속성의 setter 함수에 대한 함수 포인터 |

### ReturnValue

증가하기 전 속성의 값

## 또 보기

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


번역기는 C#'s 전위 감소 연산식을, setter와 getter가 정의된 인스턴스의 프로퍼티를 대상으로, non-const getter에 대한 오버로드인 이 함수 호출로 변환합니다.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| 매개변수 | 설명 |
| --- | --- |
| T | 속성의 타입입니다. |
| Host | - 수정될 인스턴스의 클래스 |
| HostGet | - 속성의 getter가 정의된 Host 자체 또는 그 기반 타입 |
| HostSet | - 속성의 setter가 정의된 Host 자체 또는 그 기반 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| host | Host *const | getter와 setter를 호출할 인스턴스. |
| pGetter | T(HostGet::*)() | 속성의 getter 함수를 가리키는 함수 포인터 |
| pSetter | void(HostSet::*)(T) | 속성의 setter 함수에 대한 함수 포인터 |

### ReturnValue

증가하기 전 속성의 값

## 또 보기

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_decrement_wrap(T(*)(), void(*)(T)) method


번역기는 C#'s 전위 감소 연산식을, setter와 getter가 정의된 클래스의 프로퍼티를 대상으로, 이 함수 호출로 변환합니다.

```cpp
template<typename T> T System::setter_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| 매개변수 | 설명 |
| --- | --- |
| T | 속성의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| pGetter | T(*)() | 속성의 getter 자유 함수에 대한 함수 포인터 |
| pSetter | void(*)(T) | 속성의 setter 자유 함수에 대한 함수 포인터 |

### ReturnValue

증가하기 전 속성의 값

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
