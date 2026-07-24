---
title: "System::Char::IsSurrogatePair método"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page para C++"
description: "System::Char::IsSurrogatePair método. Determina si los dos caracteres especificados forman un par sustituto UTF-16 en C++."
type: docs
weight: 1700
url: /es/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Determina si los dos caracteres especificados forman un par sustituto UTF-16.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| highSurrogate | char_t | Un carácter que se prueba para ser un sustituto alto |
| lowSurrogate | char_t | Un carácter que se prueba para ser un sustituto bajo |

### ReturnValue

Verdadero si los caracteres especificados forman un par sustituto, de lo contrario - falso

## Ver también

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Determina si dos caracteres consecutivos en el búfer de caracteres especificado forman un par sustituto.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| str | const String\& | Una cadena |
| índice | int | Un índice basado en cero en el búfer especificado en el que comienza la secuencia de caracteres a probar |

### ReturnValue

Verdadero si los caracteres especificados forman un par sustituto, de lo contrario - falso

## Ver también

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
