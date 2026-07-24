---
title: "System::Get methode"
linktitle: "Haal op"
second_title: "Aspose.Page voor C++"
description: "System::Get methode. Functie om het N-de element van een gegeven tuple op te halen. Overload voor basisobject in C++."
type: docs
weight: 20700
url: /nl/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Functie om het N-de element van een gegeven tuple op te halen. Overload voor basisobject.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parameter | Beschrijving |
| --- | --- |
| N | elementindex. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| object | const SharedPtr\<Object\>\& | object om te inspecteren. |

### ReturnValue

waarde van N‑de tuple‑element gecast naar object.

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Functie om het N‑de element van een gegeven tuple op te halen. Overload voor gedeelde pointers.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parameter | Beschrijving |
| --- | --- |
| N | elementindex. |
| T | type van het geïnspecteerde object. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | object om te inspecteren. |

### ReturnValue

waarde van N‑de tuple‑element.

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


Functie om het N‑de element van een gegeven tuple op te halen. Overload voor objecten met de Deconstruct‑methode.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parameter | Beschrijving |
| --- | --- |
| N | elementindex. |
| T | type van het geïnspecteerde object. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| object | const T\& | object om te inspecteren. |

### ReturnValue

waarde van N‑de tuple‑element.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Haalt het N‑de element van een value‑tuple op.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parameter | Beschrijving |
| --- | --- |
| N | elementindex. |
| Argumenten | tuple‑elementen. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tuple | const ValueTuple\<Args...\>\& | tuple waaruit het element moet worden gehaald. |

### ReturnValue

waarde van N‑de tuple‑element.

## Zie ook

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
