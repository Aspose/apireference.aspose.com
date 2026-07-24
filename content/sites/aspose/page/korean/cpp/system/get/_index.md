---
title: "System::Get 메서드"
linktitle: "가져오기"
second_title: "C++용 Aspose.Page"
description: "System::Get 메서드. 주어진 튜플의 N번째 요소를 가져오는 함수입니다. C++에서 기본 객체에 대한 오버로드."
type: docs
weight: 20700
url: /ko/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


주어진 튜플의 N번째 요소를 가져오는 함수입니다. 기본 객체에 대한 오버로드.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| 매개변수 | 설명 |
| --- | --- |
| N | 요소 인덱스. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 객체 | const SharedPtr\<Object\>\& | 검사할 객체. |

### ReturnValue

N번째 튜플 요소의 값을 객체로 캐스팅한 값.

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


주어진 튜플의 N번째 요소를 가져오는 함수입니다. 공유 포인터에 대한 오버로드.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| 매개변수 | 설명 |
| --- | --- |
| N | 요소 인덱스. |
| T | 검사된 객체의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 객체 | const SharedPtr\<T\>\& | 검사할 객체. |

### ReturnValue

N번째 튜플 요소의 값.

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


주어진 튜플의 N번째 요소를 가져오는 함수입니다. Deconstruct 메서드가 있는 객체에 대한 오버로드.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| 매개변수 | 설명 |
| --- | --- |
| N | 요소 인덱스. |
| T | 검사된 객체의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 객체 | const T\& | 검사할 객체. |

### ReturnValue

N번째 튜플 요소의 값.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


값 튜플의 N번째 요소를 가져옵니다.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| 매개변수 | 설명 |
| --- | --- |
| N | 요소 인덱스. |
| 인수 | 튜플 요소들. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 튜플 | const ValueTuple\<Args...\>\& | 요소를 가져올 튜플. |

### ReturnValue

N번째 튜플 요소의 값.

## 또 보기

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
