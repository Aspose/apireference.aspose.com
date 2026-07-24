---
title: "System::Collections::Generic::IEnumerable::LINQ_Min metod"
linktitle: "LINQ_Min"
second_title: "Aspose.Page för C++"
description: "Hur man använder LINQ_Min metoden i System::Collections::Generic::IEnumerable-klassen i C++."
type: docs
weight: 2100
url: /sv/cpp/system.collections.generic/ienumerable/linq_min/
---
## IEnumerable::LINQ_Min(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<Source, ResultType> &selector)
```

## Se även

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


Anropar en transformfunktion på varje element i en generisk sekvens och returnerar det minsta resulterande värdet.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| Parameter | Beskrivning |
| --- | --- |
| ResultType | Typen av värdet som returneras av selector. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | En transformfunktion att tillämpa på varje element. |

### ReturnValue

Det minsta värdet i sekvensen.

## Se även

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
