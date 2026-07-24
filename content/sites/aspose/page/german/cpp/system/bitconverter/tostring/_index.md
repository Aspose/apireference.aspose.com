---
title: "System::BitConverter::ToString‑Methode"
linktitle: "ToString"
second_title: "Aspose.Page für C++"
description: "System::BitConverter::ToString‑Methode. Konvertiert alle Werte des angegebenen Byte‑Arrays in deren hexadezimale Zeichenkettenrepräsentation. Groß‑/Kleinschreibung der Buchstaben in der hexadezimalen Notation und das zwischen benachbarten Bytes eingefügte Trennzeichen werden über die entsprechenden Argumente in C++ festgelegt."
type: docs
weight: 1200
url: /de/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


Konvertiert alle Werte des angegebenen Byte‑Arrays in ihre hexadezimale String‑Darstellung. Groß‑/Kleinschreibung der Buchstaben in der hexadezimalen Notation und das zwischen benachbarten Bytes eingefügte Trennzeichen werden über die entsprechenden Argumente festgelegt.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/), das Bytes zum Konvertieren enthält |
| Großbuchstaben | bool | Gibt die Schreibweise der Buchstaben an, die in der resultierenden hexadezimalen Darstellung verwendet werden soll |
| Trennzeichen | const String\& | Eine Zeichenkette, die als Trennzeichen zwischen jedem Paar benachbarter Bytes in der resultierenden Zeichenkette eingefügt wird |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


Konvertiert Werte des angegebenen Byte‑Arrays in ihre hexadezimale String‑Darstellung, beginnend am angegebenen Index.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/), das Bytes zum Konvertieren enthält |
| startIndex | int | Index im angegebenen Array, an dem die Konvertierung beginnen soll |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


Konvertiert einen Wertebereich des angegebenen Byte‑Arrays in seine hexadezimale String‑Darstellung.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/), das Bytes zum Konvertieren enthält |
| startIndex | int | Index im angegebenen Array, an dem der Bereich der zu konvertierenden Byte‑Array‑Elemente beginnt |
| Länge | int | Die Länge des Bereichs der zu konvertierenden Byte‑Array‑Elemente |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
