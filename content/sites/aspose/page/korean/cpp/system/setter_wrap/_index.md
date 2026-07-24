---
title: "System::setter_wrap 메서드"
linktitle: "setter_wrap"
second_title: "C++용 Aspose.Page"
description: "System::setter_wrap 메서드. C++에서 타입 변환을 포함한 인스턴스 setter 함수에 대한 오버로드."
type: docs
weight: 38200
url: /ko/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


타입 변환을 포함한 인스턴스 setter 함수에 대한 오버로드.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 값 형식. |
| T2 | setter 함수가 기대하는 타입. |
| Host | 인스턴스 유형. |
| HostSet | - 호스트 자체 또는 해당 기본 유형, 속성의 setter가 정의된 위치. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| host | Host *const | [Object](../object/)에 대한 setter 함수를 호출하기 위해. |
| pSetter | void(HostSet::*)(T2) | setter 함수 참조. |
| value | T | 설정할 값. |

### ReturnValue

값 설정.

## 또 보기

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


형 변환이 있는 정적 setter 함수에 대한 오버로드.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 값 형식. |
| T2 | setter 함수가 기대하는 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| pSetter | void(*)(T2) | 정적 setter 함수 참조. |
| value | T | 설정할 값. |

### ReturnValue

값 설정.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
