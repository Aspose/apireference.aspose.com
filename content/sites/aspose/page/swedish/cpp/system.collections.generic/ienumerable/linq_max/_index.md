---
title: "System::Collections::Generic::IEnumerable::LINQ_Max metod"
linktitle: "LINQ_Max"
second_title: "Aspose.Page för C++"
description: "Hur man använder LINQ_Max-metoden i System::Collections::Generic::IEnumerable-klassen i C++."
type: docs
weight: 2000
url: /sv/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## Se även

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


Anropar en transformfunktion på varje element i en generisk sekvens och returnerar det maximala resulterande värdet.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Parameter | Beskrivning |
| --- | --- |
| ResultType | Typen av värdet som returneras av selector. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | En transformfunktion att tillämpa på varje element. |

### ReturnValue

Det maximala värdet i sekvensen.

## Se även

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
