---
title: "System::operator!= methode"
linktitle: "operator!="
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de operator!= methode van de klasse in C++."
type: docs
weight: 25800
url: /nl/cpp/system/operator!=/
---
## System::operator!=(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator!=(ArraySegment<T> a, ArraySegment<T> b)
```

## Zie ook

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator!=(Chars &left, const String &right)
```


| Parameter | Beschrijving |
| --- | --- |
| Chars | [String](../string/) lettertype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| left | Chars\& | [String](../string/) literal om te vergelijken. |
| right | const String\& | [String](../string/) om te vergelijken. |

### ReturnValue

false als de strings overeenkomen, true anders.

## Zie ook

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator!=(const SharedPtr<Object> &left, const String &right)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) om naar string te converteren en te vergelijken. |
| right | const String\& | [String](../string/) om te vergelijken. |

### ReturnValue

false als de stringrepresentatie van het object gelijk is aan de string, true anders.

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


Bepaalt of de URI's die door het huidige en opgegeven object worden vertegenwoordigd niet gelijk zijn.

```cpp
bool System::operator!=(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Het eerste [Uri](../uri/) object om te vergelijken |
| uri2 | const SharedPtr\<Uri\>\& | Het tweede [Uri](../uri/) object om te vergelijken |

### ReturnValue

True als de URI's niet gelijk zijn, anders - false

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


Niet-gelijk vergelijkt twee smart pointers.

```cpp
template<class X,class Y> bool System::operator!=(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| Parameter | Beschrijving |
| --- | --- |
| X | Pointee-type van de eerste pointer. |
| Y | Pointee-type van de tweede pointer. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | Eerste pointer om te vergelijken. |
| y | const SmartPtr\<Y\>\& | Tweede pointer om te vergelijken. |

### ReturnValue

Onwaar als pointers overeenkomen, anders waar.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const Y *) method


Ongelijkheid vergelijking smart pointer tegen eenvoudige (C) pointer.

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const SmartPtr<X> &x, const Y *y)
```


| Parameter | Beschrijving |
| --- | --- |
| X | type van smart pointer. |
| Y | type van eenvoudige pointer. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | smart pointer om te vergelijken (links). |
| y | const Y * | pointer om te vergelijken (rechts). |

### ReturnValue

Onwaar als pointers overeenkomen, anders waar.

## Zie ook

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const T1\&, const Nullable\<T2\>\&) method


Bepaalt of de opgegeven waarde niet gelijk is aan de waarde die wordt vertegenwoordigd door het opgegeven [Nullable](../nullable/) object door [operator!=()](./) op deze waarden toe te passen.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator!=(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het type van de eerste vergelijkingswaarde |
| T2 | Het onderliggende type van het [Nullable](../nullable/) object dat de tweede vergelijkingswaarde vertegenwoordigt |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| enkele | const T1\& | Een constante referentie naar de waarde die als eerste vergelijkingswaarde moet worden gebruikt. |
| other | const Nullable\<T2\>\& | Een constante referentie naar het [Nullable](../nullable/) object waarvan de vertegenwoordigde waarde als tweede vergelijkingswaarde moet worden gebruikt. |

### ReturnValue

Waar als de vergelijkingswaarden niet gelijk zijn, anders - onwaar

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const X *, const SmartPtr\<Y\>\&) method


Gelijkheidsvergelijking smart pointer tegen eenvoudige (C) pointer.

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const X *x, const SmartPtr<Y> &y)
```


| Parameter | Beschrijving |
| --- | --- |
| X | type van eenvoudige pointer. |
| Y | type van smart pointer. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | const X * | pointer om te vergelijken (rechts). |
| y | const SmartPtr\<Y\>\& | smart pointer om te vergelijken (links). |

### ReturnValue

Onwaar als pointers overeenkomen, anders waar.

## Zie ook

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(SmartPtr\<X\> const\&, std::nullptr_t) method


Controleert of smart pointer niet null is.

```cpp
template<class X> bool System::operator!=(SmartPtr<X> const &x, std::nullptr_t)
```


| Parameter | Beschrijving |
| --- | --- |
| X | Pointee type van pointer. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | SmartPtr\<X\> const\& | Pointer om te controleren. |

### ReturnValue

Onwaar als pointer null is, anders waar.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator!=(std::nullptr_t, const DateTimeOffset &)
```

## Zie ook

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const Nullable\<T\>\&) method


Bepaalt of het opgegeven [Nullable](../nullable/) object een waarde vertegenwoordigt die niet gelijk is aan null.

```cpp
template<typename T> bool System::operator!=(std::nullptr_t, const Nullable<T> &other)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | std::nullptr_t | Een constante referentie naar een [Nullable](../nullable/) object om te testen |

### ReturnValue

True als het opgegeven object een niet‑null waarde vertegenwoordigt, false anders

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const String\&) method


Controleert of de string null is.

```cpp
bool System::operator!=(std::nullptr_t, const String &str)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | std::nullptr_t | [String](../string/) om te controleren. |

### ReturnValue

false als de string null is, true anders.

## Zie ook

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, DateTime) method




```cpp
bool System::operator!=(std::nullptr_t, DateTime)
```

## Zie ook

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, SmartPtr\<X\> const\&) method


Controleert of smart pointer niet null is.

```cpp
template<class X> bool System::operator!=(std::nullptr_t, SmartPtr<X> const &x)
```


| Parameter | Beschrijving |
| --- | --- |
| X | Pointee type van pointer. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | std::nullptr_t | Pointer om te controleren. |

### ReturnValue

Onwaar als pointer null is, anders waar.

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator!=(std::nullptr_t, TimeSpan)
```

## Zie ook

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator!=(T &left, const String &right)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [String](../string/) pointertype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| left | T\& | [String](../string/) pointer om te vergelijken. |
| right | const String\& | [String](../string/) om te vergelijken. |

### ReturnValue

false als de strings overeenkomen, true anders.

## Zie ook

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
