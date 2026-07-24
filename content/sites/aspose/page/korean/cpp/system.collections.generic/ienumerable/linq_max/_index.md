---
title: "System::Collections::Generic::IEnumerable::LINQ_Max 메서드"
linktitle: "LINQ_Max"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Collections::Generic::IEnumerable 클래스의 LINQ_Max 메서드를 사용하는 방법."
type: docs
weight: 2000
url: /ko/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## 또 보기

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


제네릭 시퀀스의 각 요소에 변환 함수를 적용하고, 결과값 중 최대값을 반환합니다.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| 매개변수 | 설명 |
| --- | --- |
| ResultType | selector에 의해 반환된 값의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | 각 요소에 적용할 변환 함수. |

### ReturnValue

시퀀스에서 최대값.

## 또 보기

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
