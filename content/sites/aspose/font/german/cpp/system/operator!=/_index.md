---
title: "Methode System::operator!="
linktitle: "operator!="
second_title: "Aspose.Font für C++"
description: "Wie man die operator!=‑Methode der Klasse in C++ verwendet."
type: docs
weight: 25900
url: /de/cpp/system/operator!=/
---
## System::operator!=(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator!=(ArraySegment<T> a, ArraySegment<T> b)
```

## Siehe auch

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator!=(Chars &left, const String &right)
```


| Parameter | Beschreibung |
| --- | --- |
| Chars | [String](../string/) Literaltyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| left | Chars\& | [String](../string/) Literal zum Vergleichen. |
| right | const String\& | [String](../string/) zum Vergleichen. |

### ReturnValue

false, wenn Zeichenketten übereinstimmen, sonst true.

## Siehe auch

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator!=(const SharedPtr<Object> &left, const String &right)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) zum Konvertieren in eine Zeichenkette und zum Vergleichen. |
| right | const String\& | [String](../string/) zum Vergleichen. |

### ReturnValue

false, wenn die Zeichenkettenrepräsentation des Objekts der Zeichenkette entspricht, sonst true.

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


Bestimmt, ob die von den aktuellen und angegebenen Objekten dargestellten URIs nicht gleich sind.

```cpp
bool System::operator!=(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Das erste [Uri](../uri/) Objekt zum Vergleichen |
| uri2 | const SharedPtr\<Uri\>\& | Das zweite [Uri](../uri/) Objekt zum Vergleichen |

### ReturnValue

True, wenn URIs nicht gleich sind, sonst - false

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


Vergleicht zwei Smart-Pointer auf Ungleichheit.

```cpp
template<class X,class Y> bool System::operator!=(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| Parameter | Beschreibung |
| --- | --- |
| X | Pointee-Typ des ersten Zeigers. |
| Y | Pointee-Typ des zweiten Zeigers. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | Erster Zeiger zum Vergleichen. |
| y | const SmartPtr\<Y\>\& | Zweiter Zeiger zum Vergleichen. |

### ReturnValue

False, wenn Zeiger übereinstimmen, sonst true.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const Y *) method


Ungleichheitsvergleich eines Smart-Pointers mit einem einfachen (C)-Zeiger.

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const SmartPtr<X> &x, const Y *y)
```


| Parameter | Beschreibung |
| --- | --- |
| X | Typ des Smart-Pointers. |
| Y | Typ des einfachen Zeigers. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | Smart-Pointer zum Vergleichen (links). |
| y | const Y * | Zeiger zum Vergleichen (rechts). |

### ReturnValue

False, wenn Zeiger übereinstimmen, sonst true.

## Siehe auch

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const T1\&, const Nullable\<T2\>\&) method


Bestimmt, ob der angegebene Wert nicht gleich dem von dem angegebenen [Nullable](../nullable/) Objekt dargestellten Wert ist, indem [operator!=()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator!=(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Typ des ersten Vergleichswerts |
| T2 | Der zugrunde liegende Typ des [Nullable](../nullable/) Objekts, das den zweiten Vergleichswert darstellt |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| einige | const T1\& | Eine konstante Referenz auf den Wert, der als erster Vergleichswert verwendet werden soll |
| other | const Nullable\<T2\>\& | Eine konstante Referenz auf das [Nullable](../nullable/) Objekt, dessen dargestellter Wert als zweiter Vergleichswert verwendet werden soll |

### ReturnValue

Wahr, wenn die Vergleichswerte nicht gleich sind, sonst - falsch

## Siehe auch

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(const X *, const SmartPtr\<Y\>\&) method


Gleichheitsvergleich eines Smart Pointers gegenüber einem einfachen (C) Pointer.

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const X *x, const SmartPtr<Y> &y)
```


| Parameter | Beschreibung |
| --- | --- |
| X | Typ des einfachen Zeigers. |
| Y | Typ des Smart-Pointers. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | const X * | Zeiger zum Vergleichen (rechts). |
| y | const SmartPtr\<Y\>\& | Smart-Pointer zum Vergleichen (links). |

### ReturnValue

False, wenn Zeiger übereinstimmen, sonst true.

## Siehe auch

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(SmartPtr\<X\> const\&, std::nullptr_t) method


Prüft, ob der Smart Pointer nicht null ist.

```cpp
template<class X> bool System::operator!=(SmartPtr<X> const &x, std::nullptr_t)
```


| Parameter | Beschreibung |
| --- | --- |
| X | Typ des Zeigers. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | SmartPtr\<X\> const\& | Zeiger zum Prüfen. |

### ReturnValue

Falsch, wenn der Zeiger null ist, sonst wahr.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator!=(std::nullptr_t, const DateTimeOffset &)
```

## Siehe auch

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, const Nullable\<T\>\&) method


Bestimmt, ob das angegebene [Nullable](../nullable/) Objekt einen Wert darstellt, der nicht gleich null ist.

```cpp
template<typename T> bool System::operator!=(std::nullptr_t, const Nullable<T> &other)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | std::nullptr_t | Eine konstante Referenz auf ein [Nullable](../nullable/) Objekt zum Testen |

### ReturnValue

Wahr, wenn das angegebene Objekt einen Nicht-Null-Wert darstellt, sonst falsch

## Siehe auch

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, const String\&) method


Prüft, ob die Zeichenkette null ist.

```cpp
bool System::operator!=(std::nullptr_t, const String &str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | std::nullptr_t | [String](../string/) zum Prüfen. |

### ReturnValue

falsch, wenn die Zeichenkette null ist, sonst wahr.

## Siehe auch

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, DateTime) method




```cpp
bool System::operator!=(std::nullptr_t, DateTime)
```

## Siehe auch

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, SmartPtr\<X\> const\&) method


Prüft, ob der Smart Pointer nicht null ist.

```cpp
template<class X> bool System::operator!=(std::nullptr_t, SmartPtr<X> const &x)
```


| Parameter | Beschreibung |
| --- | --- |
| X | Typ des Zeigers. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | std::nullptr_t | Zeiger zum Prüfen. |

### ReturnValue

Falsch, wenn der Zeiger null ist, sonst wahr.

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator!=(std::nullptr_t, TimeSpan)
```

## Siehe auch

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator!=(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator!=(T &left, const String &right)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [String](../string/) Zeigertyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| left | T\& | [String](../string/) Zeiger zum Vergleichen. |
| right | const String\& | [String](../string/) zum Vergleichen. |

### ReturnValue

false, wenn Zeichenketten übereinstimmen, sonst true.

## Siehe auch

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
