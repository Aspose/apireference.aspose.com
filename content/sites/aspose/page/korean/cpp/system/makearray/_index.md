---
title: "System::MakeArray 메서드"
linktitle: "배열생성"
second_title: "C++용 Aspose.Page"
description: "System::MakeArray 메서드. 지정된 인수를 생성자에 전달하여 새로운 Array 객체를 생성하는 팩터리 함수입니다(C++)."
type: docs
weight: 24000
url: /ko/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


지정된 인수를 생성자에 전달하여 새로운 [Array](../array/) 객체를 생성하는 팩터리 함수입니다.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 함수가 생성하는 [Array](../array/) 객체의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| args | Args\&&... | 생성 중인 [Array](../array/) 객체의 생성자에 전달되는 인수 |

### ReturnValue

구성된 [Array](../array/) 객체를 가리키는 스마트 포인터

## 또 보기

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


지정된 인수를 생성자에 전달하여 새로운 [Array](../array/) 객체를 생성하는 팩터리 함수입니다.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 함수가 생성하는 [Array](../array/) 객체의 요소 유형 |
| Integral | 배열 크기의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| size | Integral | 생성 중인 배열의 크기. |
| args | Args\&&... | 생성 중인 [Array](../array/) 객체의 생성자에 전달되는 인수 |

### ReturnValue

구성된 [Array](../array/) 객체를 가리키는 스마트 포인터

## 또 보기

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


지정된 초기화 리스트의 요소들로 새 [Array](../array/) 객체를 채우고, 해당 [Array](../array/) 객체를 가리키는 스마트 포인터를 반환하는 팩터리 함수입니다.

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 함수가 생성하는 [Array](../array/) 객체의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| init | std::initializer_list\<T\> | 배열을 채우기 위해 요소를 포함하는 초기화 리스트 |

### ReturnValue

구성된 [Array](../array/) 객체를 가리키는 스마트 포인터

## 또 보기

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
