---
title: "System::Collections::Generic::_net_binnary_search 메서드"
linktitle: "_net_binnary_search"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::_net_binnary_search 메서드. 랜덤 액세스 컨테이너에서 이진 검색을 구현합니다. 스마트 포인터에 대한 특수화입니다. C++에서 System::Object::CompareTo 메서드를 사용합니다."
type: docs
weight: 4900
url: /ko/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


랜덤 액세스 컨테이너에서 이진 검색을 구현합니다. 스마트 포인터에 대한 특수화입니다. System::Object::CompareTo 메서드를 사용합니다.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| 매개변수 | 설명 |
| --- | --- |
| containerT | 두 개의 템플릿 인수를 갖는 STL 스타일 컨테이너 템플릿 타입: 요소 타입과 할당자 타입. |
| T | 요소 타입. |
| Allocator | Allocator 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 컨테이너 | const containterT\<T, Allocator\>\& | 검색할 컨테이너. |
| index | int | 검색 범위 시작 인덱스. |
| count | int | 검색 범위 길이. |
| value | T | 찾을 값. |

### ReturnValue

찾은 경우, 다음 요소의 인덱스; 그렇지 않으면 검색이 중단된 인덱스의 보수.

## 또 보기

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


무작위 접근 컨테이너에서 이진 검색을 구현합니다. 값 타입에 대한 특수화. CompareTo 메서드를 사용합니다.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| 매개변수 | 설명 |
| --- | --- |
| containerT | 두 개의 템플릿 인수를 갖는 STL 스타일 컨테이너 템플릿 타입: 요소 타입과 할당자 타입. |
| T | 요소 타입. |
| Allocator | Allocator 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 컨테이너 | const containterT\<T, Allocator\>\& | 검색할 컨테이너. |
| index | int | 검색 범위 시작 인덱스. |
| count | int | 검색 범위 길이. |
| value | T | 찾을 값. |

### ReturnValue

찾은 경우, 다음 요소의 인덱스; 그렇지 않으면 검색이 중단된 인덱스의 보수.

## 또 보기

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


무작위 접근 컨테이너에서 이진 검색을 구현합니다. 스칼라 타입에 대한 특수화. greater 및 less 연산자를 사용해 요소를 비교합니다.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| 매개변수 | 설명 |
| --- | --- |
| containerT | 두 개의 템플릿 인수를 갖는 STL 스타일 컨테이너 템플릿 타입: 요소 타입과 할당자 타입. |
| T | 요소 타입. |
| Allocator | Allocator 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 컨테이너 | const containterT\<T, Allocator\>\& | 검색할 컨테이너. |
| index | int | 검색 범위 시작 인덱스. |
| count | int | 검색 범위 길이. |
| value | T | 찾을 값. |

### ReturnValue

찾은 경우, 다음 요소의 인덱스; 그렇지 않으면 검색이 중단된 인덱스의 보수.

## 또 보기

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


무작위 접근 컨테이너에서 이진 검색을 구현합니다.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| 매개변수 | 설명 |
| --- | --- |
| containerT | 두 개의 템플릿 인수를 갖는 STL 스타일 컨테이너 템플릿 타입: 요소 타입과 할당자 타입. |
| T | 요소 타입. |
| Allocator | Allocator 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 컨테이너 | const containterT\<T, Allocator\>\& | 검색할 컨테이너. |
| index | int | 검색 범위 시작 인덱스. |
| count | int | 검색 범위 길이. |
| value | T | 찾을 값. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) 객체. |

### ReturnValue

찾은 경우, 다음 요소의 인덱스; 그렇지 않으면 검색이 중단된 인덱스의 보수.

## 또 보기

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
