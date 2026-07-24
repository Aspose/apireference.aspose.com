---
title: "System::Object::Equals method"
linktitle: "Uguale"
second_title: "Aspose.Page per C++"
description: "System::Object::Equals method. Confronta gli oggetti usando la semantica C# Object.Equals in C++."
type: docs
weight: 300
url: /it/cpp/system/object/equals/
---
## Object::Equals(ptr) method


Confronta gli oggetti usando la semantica C# [Object.Equals](./).

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | ptr | [Object](../) per confrontare quello corrente. |

### ReturnValue

True se gli oggetti sono considerati uguali e false altrimenti.

## Vedi anche

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(double const\&, double const\&) method


Emula il confronto in virgola mobile in stile C# dove due NaN sono considerati uguali anche se, secondo IEC 60559:1989, NaN non è uguale a nessun valore, incluso NaN.

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| objA | double const\& | Valore in virgola mobile LHS. |
| objB | double const\& | Valore in virgola mobile RHS. |

### ReturnValue

Vero se **objA** e **objB** sono entrambi NaN o uguali, falso altrimenti.

## Vedi anche

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(float const\&, float const\&) method


Emula il confronto in virgola mobile in stile C# dove due NaN sono considerati uguali anche se, secondo IEC 60559:1989, NaN non è uguale a nessun valore, incluso NaN.

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| objA | float const\& | Valore in virgola mobile LHS. |
| objB | float const\& | Valore in virgola mobile RHS. |

### ReturnValue

Vero se **objA** e **objB** sono entrambi NaN o uguali, falso altrimenti.

## Vedi anche

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Confronta gli oggetti di tipo riferimento in stile C#.

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Tipo del primo oggetto da confrontare. |
| T2 | Tipo del secondo oggetto da confrontare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| objA | T1 const\& | Primo oggetto da confrontare. |
| objB | T2 const\& | Secondo oggetto da confrontare. |

### ReturnValue

Vero se gli oggetti corrispondono sia per riferimento sia semanticamente (con un confronto simile a [Object.Equals](./)), falso altrimenti.

## Vedi anche

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Confronta gli oggetti di tipo valore in stile C#.

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Tipo del primo oggetto da confrontare. |
| T2 | Tipo del secondo oggetto da confrontare. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| objA | T1 const\& | Primo oggetto da confrontare. |
| objB | T2 const\& | Secondo oggetto da confrontare. |

### ReturnValue

Vero se gli oggetti sono considerati uguali dall'operatore di uguaglianza disponibile, falso altrimenti.

## Vedi anche

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
