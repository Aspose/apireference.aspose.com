---
title: "System::Text::StringBuilder::Insert metodo"
linktitle: "Insert"
second_title: "Aspose.Font per C++"
description: "System::Text::StringBuilder::Insert metodo. Inserisce caratteri nella posizione fissa del builder in C++."
type: docs
weight: 1200
url: /it/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


Inserisce caratteri nella posizione fissa del builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui inserire i caratteri. |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) da cui inserire la porzione. |
| startIndex | int | [Array](../../../system/array/) indice iniziale della porzione. |
| charCount | int | [Array](../../../system/array/) lunghezza della porzione. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, char_t) method


Inserisce un carattere nella posizione fissa del builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startIndex | int | Posizione in cui inserire i caratteri. |
| ch | char_t | Carattere da inserire. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


Inserisce una stringa nella posizione fissa del builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startIndex | int | Posizione in cui inserire i caratteri. |
| str | const String\& | [String](../../../system/string/) da inserire. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, T) method


Inserisce un valore nella posizione fissa del builder.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| Parametro | Descrizione |
| --- | --- |
| Parametro | tipo. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startIndex | int | Posizione in cui inserire i caratteri. |
| valore | T | Valore da formattare e inserire. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


Inserisce una stringa ripetuta nella posizione fissa del builder.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int32_t | Posizione in cui inserire i caratteri. |
| value | const String\& | [String](../../../system/string/) da inserire. |
| count | int32_t | Quante volte ripetere la stringa **value**. |

### ReturnValue

Questo puntatore.

## Vedi anche

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
