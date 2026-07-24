---
title: "System::Array::LastIndexOf-metod"
linktitle: "LastIndexOf"
second_title: "Aspose.Page för C++"
description: "System::Array::LastIndexOf-metod. Bestämmer indexet för den sista förekomsten av det angivna objektet i ett intervall av objekt i arrayen som specificeras av startindexet och antalet element i intervallet i C++."
type: docs
weight: 5500
url: /sv/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Bestämmer indexet för den sista förekomsten av det angivna objektet i ett intervall av objekt i arrayen som anges av startindexet och antalet element i intervallet.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Parameter | Beskrivning |
| --- | --- |
| ArrayType | Typ av element i målarrayen |
| ValueType | typ av objektet att söka efter i arrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) att söka det angivna objektet i |
| value | const ValueType\& | Objektets index som ska bestämmas |
| startIndex | int | Index där sökningen startas |
| count | int | Antal element i intervallet att söka i |

### ReturnValue

Index för den sista förekomsten av det angivna objektet om objektet hittas, annars -1

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Bestämmer indexet för den sista förekomsten av det angivna objektet i arrayen.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| Parameter | Beskrivning |
| --- | --- |
| ArrayType | Typ av element i målarrayen |
| ValueType | typ av objektet att söka efter i arrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) att söka det angivna objektet i |
| value | const ValueType\& | Objektets index som ska bestämmas |

### ReturnValue

Index för den sista förekomsten av det angivna objektet om objektet hittas, annars -1

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Bestämmer indexet för den sista förekomsten av det angivna objektet i arrayen med start från det angivna indexet.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| Parameter | Beskrivning |
| --- | --- |
| ArrayType | Typ av element i målarrayen |
| ValueType | typ av objektet att söka efter i arrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) att söka det angivna objektet i |
| value | const ValueType\& | Objektets index som ska bestämmas |
| startIndex | int | Index där sökningen startas |

### ReturnValue

Index för den sista förekomsten av det angivna objektet om objektet hittas, annars -1

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
