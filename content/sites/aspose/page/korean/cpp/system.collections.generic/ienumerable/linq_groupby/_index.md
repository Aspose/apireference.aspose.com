---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy 메서드"
linktitle: "LINQ_GroupBy"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Collections::Generic::IEnumerable 클래스의 LINQ_GroupBy 메서드를 사용하는 방법."
type: docs
weight: 1700
url: /ko/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


시퀀스의 요소들을 그룹화합니다.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| 매개변수 | 설명 |
| --- | --- |
| Key | keyPredicate에 의해 반환되는 키의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | 각 요소에 대한 키를 추출하는 함수. |

### ReturnValue

객체 시퀀스와 키를 포함하는 [IEnumerable](../)

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
