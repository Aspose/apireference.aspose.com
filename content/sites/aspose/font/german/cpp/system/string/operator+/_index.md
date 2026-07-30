---
title: "System::String::operator+ Methode"
linktitle: "operator+"
second_title: "Aspose.Font für C++"
description: "System::String::operator+ Methode. Fügt ein Zeichen am Ende des Strings in C++ hinzu."
type: docs
weight: 2800
url: /de/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Fügt ein Zeichen am Ende des Strings hinzu.

```cpp
String System::String::operator+(char_t x) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | char_t | Zeichen zum Hinzufügen. |

### ReturnValue

[String](../) concatenation result.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | [String](../) zum Hinzufügen am Ende des aktuellen. |

### ReturnValue

Verkettete Zeichenkette.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parameter | Beschreibung |
| --- | --- |
| T | Eine der Formen: String-Literal oder Zeiger auf Zeichenkette. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg | const T\& | Entität, die an den aktuellen String angehängt werden soll. |

### ReturnValue

Verkettete Zeichenkette.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


Fügt die Zeichenkettenrepräsentation des Referenztyp-Objekts am Ende der Zeichenkette hinzu.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Beschreibung |
| --- | --- |
| T | Zeigertyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) zum Konvertieren in einen String mittels Aufruf von [ToString()](../tostring/) und zum Hinzufügen zum aktuellen String. |

### ReturnValue

[String](../) concatenation result.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


Fügt die Zeichenkettenrepräsentation des Werttyp-Objekts an das Ende der Zeichenkette hinzu.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Beschreibung |
| --- | --- |
| T | Werttyp, auf dem [ToString()](../tostring/) aufgerufen wird. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) zum Konvertieren in einen String mittels Aufruf von [ToString()](../tostring/) und zum Hinzufügen zum aktuellen String. |

### ReturnValue

[String](../) concatenation result.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(double) const method


Fügt die Zeichenkettenrepräsentation des Gleitkommawerts am Ende der Zeichenkette hinzu.

```cpp
String System::String::operator+(double d) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| d | double | Wert, der in einen String konvertiert und hinzugefügt werden soll. |

### ReturnValue

[String](../) concatenation result.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int) const method


Fügt die Zeichenkettenrepräsentation des ganzzahligen Werts am Ende der Zeichenkette hinzu.

```cpp
String System::String::operator+(int i) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| i | int | Ganzzahlwert, der in einen String konvertiert und hinzugefügt werden soll. |

### ReturnValue

[String](../) concatenation result.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int64_t) const method


Fügt die Zeichenkettenrepräsentation des ganzzahligen Werts am Ende der Zeichenkette hinzu.

```cpp
String System::String::operator+(int64_t v) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | int64_t | Wert, der in einen String konvertiert und zum Hinzufügen hinzugefügt werden soll. |

### ReturnValue

[String](../) concatenation result.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(T) const method


Fügt die Zeichenkettenrepräsentation des booleschen Werts am Ende der Zeichenkette hinzu.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parameter | Beschreibung |
| --- | --- |
| T | Wertetyp zum Konkatenieren mit dem String. Muss bool sein |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) Wert, der in einen String konvertiert und hinzugefügt werden soll. |

### ReturnValue

[String](../) concatenation result.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(uint32_t) const method


Fügt die Zeichenkettenrepräsentation des vorzeichenlosen Ganzzahlwerts am Ende der Zeichenkette hinzu.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| i | uint32_t | Wert, der in einen String konvertiert und hinzugefügt werden soll. |

### ReturnValue

[String](../) concatenation result.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
