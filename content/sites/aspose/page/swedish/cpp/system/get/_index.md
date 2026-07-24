---
title: "System::Get metod"
linktitle: "Hämta"
second_title: "Aspose.Page för C++"
description: "System::Get metod. Funktion för att hämta N:te elementet i en tuple. Överlagring för basobjekt i C++."
type: docs
weight: 20700
url: /sv/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Funktion för att hämta N:te elementet i en tuple. Överlagring för basobjekt.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parameter | Beskrivning |
| --- | --- |
| N | elementindex. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| objekt | const SharedPtr\<Object\>\& | objekt att inspektera. |

### ReturnValue

värde av N:te tuple-element kastat till objekt.

## Se även

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Funktion för att hämta N:te elementet i en tuple. Överlagring för delade pekare.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parameter | Beskrivning |
| --- | --- |
| N | elementindex. |
| T | typ av inspekterat objekt. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| objekt | const SharedPtr\<T\>\& | objekt att inspektera. |

### ReturnValue

värde av N:te tuple-element.

## Se även

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


Funktion för att hämta N:te elementet i en tuple. Överlagring för objekt med Deconstruct-metod.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parameter | Beskrivning |
| --- | --- |
| N | elementindex. |
| T | typ av inspekterat objekt. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| objekt | const T\& | objekt att inspektera. |

### ReturnValue

värde av N:te tuple-element.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Hämtar N:te elementet i värdetuple.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parameter | Beskrivning |
| --- | --- |
| N | elementindex. |
| Argument | tuple-element. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| tuple | const ValueTuple\<Args...\>\& | tuple för att hämta element från. |

### ReturnValue

värde av N:te tuple-element.

## Se även

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
