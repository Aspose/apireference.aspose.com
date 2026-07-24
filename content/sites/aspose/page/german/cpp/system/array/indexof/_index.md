---
title: "System::Array::IndexOf Methode"
linktitle: "IndexOf"
second_title: "Aspose.Page für C++"
description: "System::Array::IndexOf Methode. Bestimmt den Index des ersten Auftretens des angegebenen Elements im Array in C++."
type: docs
weight: 2900
url: /de/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


Bestimmt den Index des ersten Vorkommens des angegebenen Elements im Array.

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| item | const T\& | Index des Elements, dessen Index ermittelt werden soll |

### ReturnValue

Index des ersten Vorkommens des angegebenen Elements, falls das Element gefunden wird, sonst -1

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Bestimmt den Index des ersten Vorkommens des angegebenen Elements im Array.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| Parameter | Beschreibung |
| --- | --- |
| ArrayType | Typ der Elemente im Zielarray |
| ValueType | Typ des zu suchenden Elements im Array |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) zum Suchen des angegebenen Elements |
| Wert | const ValueType\& | Index des Elements, dessen Index ermittelt werden soll |

### ReturnValue

Index des ersten Vorkommens des angegebenen Elements, falls das Element gefunden wird, sonst -1

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Bestimmt den Index des ersten Vorkommens des angegebenen Elements im Array, beginnend ab dem angegebenen Index.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
```


| Parameter | Beschreibung |
| --- | --- |
| ArrayType | Typ der Elemente im Zielarray |
| ValueType | Typ des zu suchenden Elements im Array |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) zum Suchen des angegebenen Elements |
| Wert | const ValueType\& | Index des Elements, dessen Index ermittelt werden soll |
| startIndex | int | Index, an dem die Suche gestartet wird |

### ReturnValue

Index des ersten Vorkommens des angegebenen Elements, falls das Element gefunden wird, sonst -1

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Bestimmt den Index des ersten Vorkommens des angegebenen Elements in einem durch den Startindex und die Anzahl der Elemente im Bereich definierten Bereich des Arrays.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Parameter | Beschreibung |
| --- | --- |
| ArrayType | Typ der Elemente im Zielarray |
| ValueType | Typ des zu suchenden Elements im Array |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) zum Suchen des angegebenen Elements |
| Wert | const ValueType\& | Index des Elements, dessen Index ermittelt werden soll |
| startIndex | int | Index, an dem die Suche gestartet wird |
| count | int | Anzahl der Elemente des zu durchsuchenden Bereichs |

### ReturnValue

Index des ersten Vorkommens des angegebenen Elements, falls das Element gefunden wird, sonst -1

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
