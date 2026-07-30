---
title: "Metodo System::Object::ReferenceEquals"
linktitle: "ReferenceEquals"
second_title: "Aspose.Font per C++"
description: "Metodo System::Object::ReferenceEquals. Specializzazione di Object::ReferenceEquals per il caso di stringa e nullptr in C++."
type: docs
weight: 1200
url: /it/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


Specializzazione di [Object::ReferenceEquals](./) per il caso di stringa e nullptr.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | String const\& | [String](../../string/) da confrontare con nullptr. |

### ReturnValue

vero se la stringa è null, falso altrimenti.

## Vedi anche

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


Specializzazione di [Object::ReferenceEquals](./) per il caso di stringhe.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str1 | String const\& | Prima stringa da confrontare. |
| str2 | String const\& | Seconda stringa da confrontare. |

### ReturnValue

vero se le stringhe corrispondono, falso altrimenti.

## Vedi anche

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


Confronta gli oggetti per riferimento.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| objA | ptr const\& | Primo puntatore da confrontare. |
| objB | ptr const\& | Secondo puntatore da confrontare. |

### ReturnValue

Vero se i puntatori corrispondono e falso altrimenti.

## Vedi anche

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Confronta per riferimento un oggetto di tipo valore con nullptr.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di oggetto da confrontare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| objA | T const\& | Primo oggetto da confrontare. |

### ReturnValue

Restituisce sempre false poiché i tipi valore non possono essere annullati.

## Vedi anche

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


Confronta gli oggetti per riferimento.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di oggetti da confrontare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| objA | T const\& | Primo oggetto da confrontare. |
| objB | T const\& | Secondo oggetto da confrontare. |

### ReturnValue

Vero se gli indirizzi degli oggetti corrispondono e falso altrimenti.

## Vedi anche

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
