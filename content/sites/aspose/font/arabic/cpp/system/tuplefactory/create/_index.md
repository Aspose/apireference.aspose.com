---
title: "System::TupleFactory::Create method"
linktitle: "Create"
second_title: "Aspose.Font لـ C++"
description: "System::TupleFactory::Create method. ينشئ كائن Tuple جديد في C++."
type: docs
weight: 100
url: /ar/cpp/system/tuplefactory/create/
---
## TupleFactory::Create(Args...) method


ينشئ كائن tuple جديد.

```cpp
template<typename ...> static SharedPtr<Tuple<Args...>> System::TupleFactory::Create(Args... args)
```

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TupleFactory::Create(T1, T2, T3, T4, T5, T6, T7, TRest) method


ينشئ 8-توبل جديد. يتم تخزين العنصر الثامن داخل [Tuple](../../tuple/).

```cpp
template<typename T1,typename T2,typename T3,typename T4,typename T5,typename T6,typename T7,typename TRest> static SharedPtr<Tuple<T1, T2, T3, T4, T5, T6, T7, SharedPtr<Tuple<TRest>>>> System::TupleFactory::Create(T1 item1, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7, TRest rest)
```

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
