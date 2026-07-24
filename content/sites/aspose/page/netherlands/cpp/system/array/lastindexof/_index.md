---
title: "System::Array::LastIndexOf methode"
linktitle: "LastIndexOf"
second_title: "Aspose.Page voor C++"
description: "System::Array::LastIndexOf methode. Bepaalt de index van de laatste voorkoming van het opgegeven item in een bereik van items van de array, gespecificeerd door de startindex en het aantal elementen in het bereik in C++."
type: docs
weight: 5500
url: /nl/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Bepaalt de index van de laatste voorkoming van het opgegeven item in een bereik van items van de array, gespecificeerd door de startindex en het aantal elementen in het bereik.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Parameter | Beschrijving |
| --- | --- |
| ArrayType | Type van elementen in de doelarray |
| ValueType | type van het item om te zoeken in de array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) om het opgegeven item te zoeken in |
| value | const ValueType\& | Itemindex die moet worden bepaald |
| startIndex | int | Index waarop de zoekopdracht wordt gestart |
| count | int | Aantal elementen van het bereik waarin gezocht moet worden |

### ReturnValue

Index van de laatste voorkoming van het opgegeven item als het item wordt gevonden, anders -1

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Bepaalt de index van de laatste voorkoming van het opgegeven item in de array.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| Parameter | Beschrijving |
| --- | --- |
| ArrayType | Type van elementen in de doelarray |
| ValueType | type van het item om te zoeken in de array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) om het opgegeven item te zoeken in |
| value | const ValueType\& | Itemindex die moet worden bepaald |

### ReturnValue

Index van de laatste voorkoming van het opgegeven item als het item wordt gevonden, anders -1

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Bepaalt de index van de laatste voorkoming van het opgegeven item in de array, beginnend vanaf de opgegeven index.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| Parameter | Beschrijving |
| --- | --- |
| ArrayType | Type van elementen in de doelarray |
| ValueType | type van het item om te zoeken in de array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) om het opgegeven item te zoeken in |
| value | const ValueType\& | Itemindex die moet worden bepaald |
| startIndex | int | Index waarop de zoekopdracht wordt gestart |

### ReturnValue

Index van de laatste voorkoming van het opgegeven item als het item wordt gevonden, anders -1

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
