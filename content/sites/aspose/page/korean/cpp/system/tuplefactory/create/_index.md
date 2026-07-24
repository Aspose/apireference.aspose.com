---
title: "System::TupleFactory::Create 메서드"
linktitle: "생성"
second_title: "C++용 Aspose.Page"
description: "System::TupleFactory::Create 메서드. C++에서 새로운 튜플 객체를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system/tuplefactory/create/
---
## TupleFactory::Create(Args...) method


새로운 튜플 객체를 생성합니다.

```cpp
template<typename ...> static SharedPtr<Tuple<Args...>> System::TupleFactory::Create(Args... args)
```

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TupleFactory::Create(T1, T2, T3, T4, T5, T6, T7, TRest) method


새로운 8-튜플을 생성합니다. 8번째 요소는 [Tuple](../../tuple/) 내부에 저장됩니다.

```cpp
template<typename T1,typename T2,typename T3,typename T4,typename T5,typename T6,typename T7,typename TRest> static SharedPtr<Tuple<T1, T2, T3, T4, T5, T6, T7, SharedPtr<Tuple<TRest>>>> System::TupleFactory::Create(T1 item1, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7, TRest rest)
```

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
