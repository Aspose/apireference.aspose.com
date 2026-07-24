---
title: "System::TupleFactory::Create μέθοδος"
linktitle: "Δημιουργία"
second_title: "Aspose.Page για C++"
description: "System::TupleFactory::Create μέθοδος. Δημιουργεί ένα νέο αντικείμενο πλειάδας σε C++."
type: docs
weight: 100
url: /el/cpp/system/tuplefactory/create/
---
## TupleFactory::Create(Args...) method


Δημιουργεί ένα νέο αντικείμενο tuple.

```cpp
template<typename ...> static SharedPtr<Tuple<Args...>> System::TupleFactory::Create(Args... args)
```

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TupleFactory::Create(T1, T2, T3, T4, T5, T6, T7, TRest) method


Δημιουργεί μια νέα 8-πλειάδα. Το 8ο στοιχείο αποθηκεύεται μέσα στο [Tuple](../../tuple/).

```cpp
template<typename T1,typename T2,typename T3,typename T4,typename T5,typename T6,typename T7,typename TRest> static SharedPtr<Tuple<T1, T2, T3, T4, T5, T6, T7, SharedPtr<Tuple<TRest>>>> System::TupleFactory::Create(T1 item1, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7, TRest rest)
```

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
