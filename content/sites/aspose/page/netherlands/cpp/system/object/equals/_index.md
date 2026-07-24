---
title: "System::Object::Equals methode"
linktitle: "Gelijk"
second_title: "Aspose.Page voor C++"
description: "System::Object::Equals methode. Vergelijkt objecten met behulp van C# Object.Equals-semantiek in C++."
type: docs
weight: 300
url: /nl/cpp/system/object/equals/
---
## Object::Equals(ptr) method


Vergelijkt objecten met behulp van C# [Object.Equals](./)-semantiek.

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | ptr | [Object](../) om te vergelijken met de huidige. |

### ReturnValue

True als objecten als gelijk worden beschouwd en false anders.

## Zie ook

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(double const\&, double const\&) method


Emuleert C#-stijl zwevendekommagetallen vergelijking waarbij twee NaN's als gelijk worden beschouwd, hoewel volgens IEC 60559:1989 NaN niet gelijk is aan enige waarde, inclusief NaN.

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| objA | double const\& | LHS zwevendekommagetal. |
| objB | double const\& | RHS zwevendekommagetal. |

### ReturnValue

Waar als **objA** en **objB** beide NaN of gelijk zijn, onwaar anders.

## Zie ook

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(float const\&, float const\&) method


Emuleert C#-stijl zwevendekommagetallen vergelijking waarbij twee NaN's als gelijk worden beschouwd, hoewel volgens IEC 60559:1989 NaN niet gelijk is aan enige waarde, inclusief NaN.

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| objA | float const\& | LHS zwevendekommagetal. |
| objB | float const\& | RHS zwevendekommagetal. |

### ReturnValue

Waar als **objA** en **objB** beide NaN of gelijk zijn, onwaar anders.

## Zie ook

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Vergelijkt referentietype-objecten in C#-stijl.

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Type van het eerste object om te vergelijken. |
| T2 | Type van het tweede object om te vergelijken. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| objA | T1 const\& | Eerste object om te vergelijken. |
| objB | T2 const\& | Tweede object om te vergelijken. |

### ReturnValue

Waar als objecten overeenkomen op referentie of semantisch (door een [Object.Equals](./)-achtige vergelijking), onwaar anders.

## Zie ook

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Vergelijkt waardetype-objecten in C#-stijl.

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Type van het eerste object om te vergelijken. |
| T2 | Type van het tweede object om te vergelijken. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| objA | T1 const\& | Eerste object om te vergelijken. |
| objB | T2 const\& | Tweede object om te vergelijken. |

### ReturnValue

Waar als objecten als gelijk worden beschouwd door de beschikbare gelijkheidsoperator, onwaar anders.

## Zie ook

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
