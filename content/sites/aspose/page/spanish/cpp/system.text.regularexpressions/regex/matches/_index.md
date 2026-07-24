---
title: "System::Text::RegularExpressions::Regex::Matches método"
linktitle: "Coincidencias"
second_title: "Aspose.Page para C++"
description: "System::Text::RegularExpressions::Regex::Matches método. Obtiene todas las coincidencias de la expresión regular en la cadena dada al coincidir repetidamente en C++."
type: docs
weight: 700
url: /es/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Obtiene todas las coincidencias de la expresión regular en la cadena dada mediante coincidencias repetidas.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| entrada | const String\& | Cadena de entrada. |
| startat | int | Índice donde comenzar la coincidencia. |

### ReturnValue

Colección de todas las coincidencias encontradas.

## Ver también

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Obtiene todas las coincidencias entre la cadena y el patrón.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| entrada | const String\& | Cadena de entrada. |
| patrón | const String\& | Patrón de expresión regular. |
| opciones | RegexOptions | Opciones de coincidencia. |
| matchTimeout | TimeSpan | Tiempo de espera. |
| startat | int | [Match](../../match/) posición inicial. |
| longitud | int | Número de caracteres a examinar (0 deshabilita el límite). |

### ReturnValue

Todas las coincidencias encontradas al coincidir repetidamente.

## Ver también

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
