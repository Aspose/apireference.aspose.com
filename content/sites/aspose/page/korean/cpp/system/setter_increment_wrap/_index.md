---
title: "System::setter_increment_wrap 메서드"
linktitle: "setter_increment_wrap"
second_title: "C++용 Aspose.Page"
description: "System::setter_increment_wrap 메서드. 번역기는 setter와 getter가 정의된 클래스의 속성을 대상으로 하는 C#''s 증감 표현식을 C++에서 이 함수 호출로 변환합니다."
type: docs
weight: 37400
url: /ko/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


번역기는 setter와 getter가 정의된 클래스의 속성을 대상으로 하는 C#'s 증감 표현식을 이 함수 호출로 변환합니다.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| 매개변수 | 설명 |
| --- | --- |
| T | 속성의 타입 |
| Host | - 수정될 인스턴스의 클래스 |
| HostGet | - 속성의 getter가 정의된 Host 자체 또는 그 기반 타입 |
| HostSet | - 속성의 setter가 정의된 Host 자체 또는 그 기반 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| host | Host *const | 증가시킬 속성을 가진 객체에 대한 포인터 |
| pGetter | T(HostGet::*)() | 속성의 getter 메서드를 가리키는 함수 포인터 |
| pSetter | void(HostSet::*)(T) | 속성의 setter 메서드를 가리키는 함수 포인터 |

### ReturnValue

속성의 증가된 값

## 또 보기

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


번역기는 setter와 getter가 정의된 클래스의 속성을 대상으로 하는 C#'s 증감 표현식을 이 함수 호출로 변환합니다.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| 매개변수 | 설명 |
| --- | --- |
| T | 속성의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| pGetter | T(*)() | 속성의 getter 자유 함수에 대한 함수 포인터 |
| pSetter | void(*)(T) | 속성의 setter 자유 함수에 대한 함수 포인터 |

### ReturnValue

속성의 증가된 값

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
