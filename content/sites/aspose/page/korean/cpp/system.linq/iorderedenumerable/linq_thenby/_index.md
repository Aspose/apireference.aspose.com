---
title: "System::Linq::IOrderedEnumerable::LINQ_ThenBy 메서드"
linktitle: "LINQ_ThenBy"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Linq::IOrderedEnumerable 클래스의 LINQ_ThenBy 메서드를 사용하는 방법."
type: docs
weight: 300
url: /ko/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


키에 따라 시퀀스의 요소들을 오름차순으로 추가 정렬합니다.

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| 매개변수 | 설명 |
| --- | --- |
| Key | keySelector가 반환하는 키의 타입입니다. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | 각 요소에서 키를 추출하는 함수입니다. |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
