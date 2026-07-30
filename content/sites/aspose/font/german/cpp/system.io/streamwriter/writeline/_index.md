---
title: "System::IO::StreamWriter::WriteLine Methode"
linktitle: "WriteLine"
second_title: "Aspose.Font für C++"
description: "System::IO::StreamWriter::WriteLine Methode. Schreibt Zeilenabschlusszeichen in den Stream in C++."
type: docs
weight: 1100
url: /de/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


Schreibt Zeilenabschlusszeichen in den Stream.

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## Siehe auch

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


Schreibt alle Zeichen aus dem angegebenen Array, gefolgt von den Zeilenabschlusszeichen, in den Stream.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | Das Array, das die zu schreibenden Zeichen enthält |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


Schreibt den angegebenen Teilbereich von UTF-16-Zeichen aus dem angegebenen Zeichenarray, gefolgt von den Zeilenabschlusszeichen, in den Stream.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | Das Array, das die zu schreibenden Zeichen enthält |
| Index | int32_t | Ein 0-basierter Index des Elements im **buffer**, an dem der zu schreibende Teilbereich beginnt |
| count | int32_t | Die Anzahl der Zeichen im zu schreibenden Teilbereich; -1 gibt an, dass der Teilbereich dort endet, wo das **buffer**-Array endet |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const char_t *) method


Schreibt die angegebene C‑Zeichenkette, gefolgt von den Zeilenabschlusszeichen, in den Stream.

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const char_t * | Der zu schreibende C‑String |

## Siehe auch

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


Schreibt die Zeichenkettenrepräsentation des angegebenen Objekts, gefolgt von den Zeilenabschlusszeichen, in den Stream.

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | Das zu schreibende Objekt |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const String\&) method


Schreibt die angegebene Zeichenkette, gefolgt von den Zeilenabschlusszeichen, in den Stream.

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Die zu schreibende Zeichenkette |

## Siehe auch

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


Schreibt die Zeichenkettenrepräsentation des angegebenen Objekts, gefolgt von den Zeilenabschlusszeichen, in den Stream.

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Objekts |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | Das zu schreibende Objekt |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
