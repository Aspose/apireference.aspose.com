---
title: "System::GetHashCode 메서드"
linktitle: "해시코드_가져오기"
second_title: "C++용 Aspose.Page"
description: "System::GetHashCode 메서드. std::thread::id에 대한 특수화; C++에서 지정된 스레드 객체에 대한 해시 코드를 반환합니다."
type: docs
weight: 21200
url: /ko/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


std::thread::id에 대한 특수화; 지정된 스레드 객체에 대한 해시 코드를 반환합니다.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


지정된 스칼라 값에 대한 해시 코드를 반환합니다.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 함수가 해시 코드를 생성하는 값의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | 해시 코드를 생성할 값 |

### ReturnValue

지정된 값에 대해 생성된 해시 코드

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


지정된 객체에 대한 해시 코드를 반환합니다.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 함수가 해시 코드를 생성하는 객체의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | 해시 코드를 생성할 객체를 가리키는 [SmartPtr](../smartptr/) |

### ReturnValue

지정된 객체에 대해 생성된 해시 코드

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


예외인 지정된 객체에 대한 해시 코드를 반환합니다.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 함수가 해시 코드를 생성하는 객체의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | 해시 코드를 생성할 객체를 포함하는 [Exception](../exception/) 래퍼 |

### ReturnValue

지정된 객체에 대해 생성된 해시 코드

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


스마트 포인터도 예외도 아닌 지정된 객체에 대한 해시 코드를 반환합니다.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 함수가 해시 코드를 생성하는 객체의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | 해시 코드를 생성할 객체에 대한 const 참조 |

### ReturnValue

지정된 객체에 대해 생성된 해시 코드

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
