---
title: "System::TupleFactory::Create विधि"
linktitle: "बनाएँ"
second_title: "Aspose.Page C++ के लिए"
description: "System::TupleFactory::Create विधि. C++ में एक नया ट्यूपल ऑब्जेक्ट बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system/tuplefactory/create/
---
## TupleFactory::Create(Args...) method


एक नया ट्यूपल ऑब्जेक्ट बनाता है।

```cpp
template<typename ...> static SharedPtr<Tuple<Args...>> System::TupleFactory::Create(Args... args)
```

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TupleFactory::Create(T1, T2, T3, T4, T5, T6, T7, TRest) method


एक नया 8-ट्यूपल बनाता है। 8वां तत्व [Tuple](../../tuple/) के भीतर संग्रहीत किया जाता है।

```cpp
template<typename T1,typename T2,typename T3,typename T4,typename T5,typename T6,typename T7,typename TRest> static SharedPtr<Tuple<T1, T2, T3, T4, T5, T6, T7, SharedPtr<Tuple<TRest>>>> System::TupleFactory::Create(T1 item1, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7, TRest rest)
```

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Tuple](../../tuple/)
* Class [TupleFactory](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
