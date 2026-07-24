---
title: "Método System::String::LastIndexOf"
linktitle: "LastIndexOf"
second_title: "Aspose.Page para C++"
description: "Método System::String::LastIndexOf. Búsqueda hacia atrás de un carácter en C++."
type: docs
weight: 2400
url: /es/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


Búsqueda inversa de carácter.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | char_t | Carácter a buscar. |

### ReturnValue

Índice de la posición del último carácter o -1 si no se encuentra.

## Ver también

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


Búsqueda inversa de carácter.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | char_t | Carácter a buscar. |
| startIndex | int32_t | Índice donde comenzar la búsqueda. |

### ReturnValue

Índice de la posición del último carácter desde startIndex o -1 si no se encuentra.

## Ver también

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


Búsqueda inversa de carácter.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | char_t | Carácter a buscar. |
| startIndex | int32_t | Índice donde comenzar la búsqueda. |
| count | int32_t | Número de caracteres a examinar |

### ReturnValue

Índice de la posición del último carácter desde startIndex o -1 si no se encuentra.

## Ver también

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


Búsqueda inversa de subcadena.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| str | const String\& | Subcadena a buscar. |
| startIndex | int | Posición en la cadena origen donde comenzar la búsqueda. |
| comparison_type | System::StringComparison | modo [Comparison](../../comparison/). |

### ReturnValue

Índice de la última subcadena encontrada o -1 si no se encuentra. Para una cadena de búsqueda vacía, siempre devuelve la longitud de la cadena.

## Ver también

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


Búsqueda inversa de subcadena.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| str | const String\& | Subcadena a buscar. |
| startIndex | int | Posición en la cadena origen donde comenzar la búsqueda. |

### ReturnValue

Índice de la última subcadena encontrada o -1 si no se encuentra. Para una cadena de búsqueda vacía, siempre devuelve la longitud de la cadena.

## Ver también

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


Búsqueda inversa de subcadena.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| str | const String\& | Subcadena a buscar. |
| comparison_type | System::StringComparison | modo [Comparison](../../comparison/). |

### ReturnValue

Índice de la última subcadena encontrada o -1 si no se encuentra. Para una cadena de búsqueda vacía, siempre devuelve la longitud de la cadena.

## Ver también

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


Búsqueda inversa de subcadena.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | const String\& | Subcadena a buscar. |
| startIndex | int | Posición en la cadena origen donde comenzar la búsqueda. |
| count | int | Número de caracteres a examinar. |
| comparisonType | StringComparison | modo [Comparison](../../comparison/). |

### ReturnValue

Índice de la última subcadena encontrada o -1 si no se encuentra. Para una cadena de búsqueda vacía, siempre devuelve startIndex+count.

## Ver también

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
