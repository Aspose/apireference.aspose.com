---
title: "System::Text::RegularExpressions::Regex::Split método"
linktitle: "Dividir"
second_title: "Aspose.Page para C++"
description: "System::Text::RegularExpressions::Regex::Split método. Divide la cadena por coincidencias de expresiones regulares en C++."
type: docs
weight: 900
url: /es/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Divide la cadena por coincidencias de expresiones regulares.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) para dividir. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


Divide la cadena por coincidencias de expresiones regulares.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) para dividir. |
| count | int | Límite de número de subcadenas. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


Divide una cadena de entrada un número máximo especificado de veces en una matriz de subcadenas, en las posiciones definidas por una expresión regular especificada en el constructor [Regex](../). La búsqueda del patrón de expresión regular comienza en una posición de carácter especificada en la cadena de entrada.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| entrada | const String\& | La cadena a dividir. |
| count | int | El número máximo de veces que puede ocurrir la división. |
| startat | int | La posición de carácter en la cadena de entrada donde comenzará la búsqueda. |

### ReturnValue

Una matriz de cadenas.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Divide la cadena por expresiones regulares.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| entrada | const String\& | Cadena de entrada. |
| patrón | const String\& | Patrón de expresión regular. |
| count | int | [Match](../../match/) límite de número. |
| opciones | RegexOptions | Opciones de coincidencia. |
| matchTimeout | TimeSpan | Tiempo de espera. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Divide la cadena por expresiones regulares.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| entrada | const String\& | Cadena de entrada. |
| patrón | const String\& | Patrón de expresión regular. |
| opciones | RegexOptions | Opciones de coincidencia. |
| matchTimeout | TimeSpan | Tiempo de espera. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
