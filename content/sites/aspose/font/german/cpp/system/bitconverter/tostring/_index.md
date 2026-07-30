---
title: "System::BitConverter::ToString Methode"
linktitle: "ToString"
second_title: "Aspose.Font für C++"
description: "System::BitConverter::ToString-Methode. Konvertiert alle Werte des angegebenen Byte-Arrays in deren hexadezimale Zeichenkettenrepräsentation. Der zu verwendende Buchstabenfall in der hexadezimalen Notation und das zwischen benachbarten Bytes eingefügte Trennzeichen werden über die entsprechenden Argumente in C++ festgelegt."
type: docs
weight: 1200
url: /de/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


Konvertiert alle Werte des angegebenen Byte-Arrays in deren hexadezimale Zeichenkettenrepräsentation. Groß-/Kleinschreibung der Buchstaben in der hexadezimalen Notation und das zwischen benachbarten Bytes eingefügte Trennzeichen werden über die entsprechenden Argumente festgelegt.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) das Bytes zum Konvertieren enthält |
| Großschreibung | bool | Gibt den zu verwendenden Buchstabenfall in der resultierenden hexadezimalen Darstellung an. |
| Trennzeichen | const String\& | Eine Zeichenkette, die als Trennzeichen zwischen jedem Paar benachbarter Bytes in der resultierenden Zeichenkette eingefügt wird. |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


Konvertiert Werte des angegebenen Byte-Arrays in deren hexadezimale Zeichenkettenrepräsentation, beginnend am angegebenen Index.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) das Bytes zum Konvertieren enthält |
| startIndex | int | Index im angegebenen Array, an dem die Konvertierung beginnen soll. |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


Konvertiert einen Wertebereich des angegebenen Byte-Arrays in deren hexadezimale Zeichenkettenrepräsentation.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) das Bytes zum Konvertieren enthält |
| startIndex | int | Index im angegebenen Array, an dem der Bereich der zu konvertierenden Byte-Array-Elemente beginnt. |
| Länge | int | Die Länge des Bereichs der zu konvertierenden Byte-Array-Elemente. |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
