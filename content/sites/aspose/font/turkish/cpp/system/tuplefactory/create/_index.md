---
title: "System::TupleFactory::Create method"
linktitle: "Create"
second_title: "Aspose.Font için C++"
description: "System::TupleFactory::Create method. C++'ta yeni bir tuple nesnesi oluşturur."
type: docs
weight: 100
url: /tr/cpp/system/tuplefactory/create/
---
## TupleFactory::Create(Args...) method


Yeni bir tuple nesnesi oluşturur.

```cpp
template<typename ...> static SharedPtr<Tuple<Args...>> System::TupleFactory::Create(Args... args)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TupleFactory::Create(T1, T2, T3, T4, T5, T6, T7, TRest) method


Yeni bir 8-tuple oluşturur. 8. eleman [Tuple](../../tuple/) içinde depolanır.

```cpp
template<typename T1,typename T2,typename T3,typename T4,typename T5,typename T6,typename T7,typename TRest> static SharedPtr<Tuple<T1, T2, T3, T4, T5, T6, T7, SharedPtr<Tuple<TRest>>>> System::TupleFactory::Create(T1 item1, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7, TRest rest)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
