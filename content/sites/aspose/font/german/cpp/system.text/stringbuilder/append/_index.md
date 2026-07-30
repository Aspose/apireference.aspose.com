---
title: "System::Text::StringBuilder::Append Methode"
linktitle: "Anhängen"
second_title: "Aspose.Font für C++"
description: "System::Text::StringBuilder::Append Methode. Fügt ein Zeichen dem Builder in C++ hinzu."
type: docs
weight: 300
url: /de/cpp/system.text/stringbuilder/append/
---
## StringBuilder::Append(char_t) method


Fügt ein Zeichen zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| c | char_t | Zeichenwert. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(char_t, int) method


Fügt Zeichen zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| c | char_t | Zeichenwert. |
| count | int | Wie oft soll das einzufügende Zeichen wiederholt werden. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&) method


Fügt ein Zeichenarray zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Hinzu zufügende Zeichen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&, int, int) method


Fügt einen Ausschnitt des Zeichenarrays zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr, int startIndex, int charCount)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | Hinzu zufügende Zeichen. |
| startIndex | int | Startindex des Abschnitts. |
| charCount | int | Slice-Länge. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const SharedPtr\<StringBuilder\>\&) method


Fügt den Inhalt des Builders zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<StringBuilder> &builder)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Builder | const SharedPtr\<StringBuilder\>\& | Builder, aus dem Inhalt hinzugefügt wird. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const SharedPtr\<T\>\&) method


Fügt die String‑Repräsentation des Objekts zum Builder hinzu.

```cpp
template<class T> StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<T> &obj)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [Object](../../../system/object/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const SharedPtr\<T\>\& | [Object](../../../system/object/) zum Serialisieren und Hinzufügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const String\&) method


Fügt einen String zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) zum Hinzufügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(const String\&, int, int) method


Fügt einen String‑Ausschnitt zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str, int startIndex, int charCount)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) zum Hinzufügen. |
| startIndex | int | Startindex des Abschnitts. |
| charCount | int | Slice-Länge. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(double) method


Fügt einen Gleitkommawert zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(double df)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| df | double | Wert zum Serialisieren und Hinzufügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(E) method


Fügt dem Builder die Zeichenkettenrepräsentation des Enum-Werts hinzu.

```cpp
template<class E> std::enable_if<std::is_enum<E>::value, StringBuilder *>::type System::Text::StringBuilder::Append(E e)
```


| Parameter | Beschreibung |
| --- | --- |
| E | [Enum](../../../system/enum/) Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| e | E | Wert zum Serialisieren und Hinzufügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(float) method


Fügt einen Gleitkommawert zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(float f)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| f | float | Wert zum Serialisieren und Hinzufügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(int) method


Fügt einen Ganzzahlwert zum Builder hinzu.

```cpp
StringBuilder * System::Text::StringBuilder::Append(int i)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| i | int | Wert zum Serialisieren und Hinzufügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Append(T) method


Fügt dem Builder einen arithmetischen Wert hinzu.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Append(T value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Arithmetischer Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | T | Wert zum Serialisieren und Hinzufügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
