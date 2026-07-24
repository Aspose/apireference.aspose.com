---
title: "System::Get Methode"
linktitle: "Abrufen"
second_title: "Aspose.Page für C++"
description: "System::Get Methode. Funktion, um das N-te Element eines Tupels zu erhalten. Überladung für Basisobjekt in C++."
type: docs
weight: 20700
url: /de/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Funktion, um das N-te Element eines Tupels zu erhalten. Überladung für Basisobjekt.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parameter | Beschreibung |
| --- | --- |
| N | Elementindex. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Objekt | const SharedPtr\<Object\>\& | Objekt zum Inspizieren. |

### ReturnValue

Wert des N-ten Tupel-Elements, in Objekt umgewandelt.

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Funktion, um das N-te Element eines Tupels zu erhalten. Überladung für Shared-Pointer.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parameter | Beschreibung |
| --- | --- |
| N | Elementindex. |
| T | Typ des inspizierten Objekts. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Objekt | const SharedPtr\<T\>\& | Objekt zum Inspizieren. |

### ReturnValue

Wert des N-ten Tupel-Elements.

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


Funktion, um das N-te Element eines Tupels zu erhalten. Überladung für Objekte mit Deconstruct-Methode.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parameter | Beschreibung |
| --- | --- |
| N | Elementindex. |
| T | Typ des inspizierten Objekts. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Objekt | const T\& | Objekt zum Inspizieren. |

### ReturnValue

Wert des N-ten Tupel-Elements.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Gibt das N-te Element des Wertetupels zurück.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parameter | Beschreibung |
| --- | --- |
| N | Elementindex. |
| Argumente | Tuple-Elemente. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Tuple | const ValueTuple\<Args...\>\& | Tuple, um ein Element daraus zu erhalten. |

### ReturnValue

Wert des N-ten Tupel-Elements.

## Siehe auch

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
