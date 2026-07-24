---
title: "System::Collections::Generic::IEnumerable::LINQ_Select method"
linktitle: "LINQ_Select"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Collections::Generic::IEnumerable 클래스의 LINQ_Select 메서드를 사용하는 방법."
type: docs
weight: 2600
url: /ko/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<Source, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, Result> &selector)
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


요소의 인덱스를 포함하여 시퀀스의 각 요소를 새로운 형태로 변환합니다.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| 매개변수 | 설명 |
| --- | --- |
| ResultType | **selector**가 반환하는 값의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | 변환 함수. |

### ReturnValue

[IEnumerable](../)은 **selector** 함수에 의해 반환된 요소를 포함합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


시퀀스의 요소를 변환합니다.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| 매개변수 | 설명 |
| --- | --- |
| ResultType | **selector**가 반환하는 값의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | 변환 함수. |

### ReturnValue

[IEnumerable](../)은 **selector** 함수에 의해 반환된 요소를 포함합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
