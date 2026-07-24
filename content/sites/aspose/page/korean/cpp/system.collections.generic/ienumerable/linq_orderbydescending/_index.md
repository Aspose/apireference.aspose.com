---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending 메서드"
linktitle: "LINQ_OrderByDescending"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Collections::Generic::IEnumerable 클래스의 LINQ_OrderByDescending 메서드를 사용하는 방법."
type: docs
weight: 2400
url: /ko/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


keySelector가 선택한 키 값을 기준으로 시퀀스의 요소를 내림차순으로 정렬합니다.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| 매개변수 | 설명 |
| --- | --- |
| keySelector | 요소에서 키를 추출하는 함수입니다. |

### ReturnValue

키의 내림차순으로 정렬된 요소들을 가진 IOrderedEnumerable입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
