---
title: "System::Default 메서드"
linktitle: "Default"
second_title: "C++용 Aspose.Page"
description: "System::Default 메서드. C++에서 예외 유형의 단일 기본 생성 인스턴스에 대한 참조를 반환합니다."
type: docs
weight: 16200
url: /ko/cpp/system/default/
---
## System::Default() method


예외 유형의 단일 기본 생성 인스턴스에 대한 참조를 반환합니다.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| 매개변수 | 설명 |
| --- | --- |
| T | 반환되는 인스턴스의 유형 |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


비예외 유형의 단일 기본 생성 인스턴스에 대한 참조를 반환합니다.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| 매개변수 | 설명 |
| --- | --- |
| T | 반환되는 인스턴스의 유형 |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
