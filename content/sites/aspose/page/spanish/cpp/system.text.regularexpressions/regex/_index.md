---
title: "Clase System::Text::RegularExpressions::Regex"
linktitle: "Regex"
second_title: "Aspose.Page para C++"
description: "Clase System::Text::RegularExpressions::Regex. Expresión regular que sigue una sintaxis similar a C#. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 800
url: /es/cpp/system.text.regularexpressions/regex/
---
## Regex class


Expresión regular que sigue una sintaxis similar a C#. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Regex : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Escapa caracteres especiales para usar la cadena como parte del patrón. |
| [get_MatchTimeout](./get_matchtimeout/)() | Obtiene el tiempo de espera de coincidencia. |
| [get_Options](./get_options/)() | Obtiene las opciones de la expresión regular. |
| [get_RightToLeft](./get_righttoleft/)() | Comprueba si la coincidencia se realiza en modo de derecha a izquierda. |
| [IsMatch](./ismatch/)(const String\&, int) | Coincide la expresión regular con la cadena. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Comprueba si la cadena coincide con el patrón. |
| [Match](./match/)(const String\&) | Coincide la expresión regular con la cadena. |
| [Match](./match/)(const String\&, int, int) | Coincide la expresión regular con la cadena. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Coincide la cadena y el patrón. |
| [Matches](./matches/)(const String\&, int) | Obtiene todas las coincidencias de la expresión regular en la cadena dada mediante coincidencias repetidas. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Obtiene todas las coincidencias entre la cadena y el patrón. |
| [Regex](./regex/)() | Construye una expresión regular vacía. |
| [Regex](./regex/)(const String\&) | Constructor. |
| [Regex](./regex/)(const String\&, RegexOptions) | Constructor. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Constructor. |
| [Replace](./replace/)(const String\&, const String\&) | Reemplaza todas las coincidencias de la expresión regular en la cadena con la cadena de reemplazo. |
| [Replace](./replace/)(const String\&, const char_t *) | Reemplaza todas las coincidencias de la expresión regular en la cadena con la cadena de reemplazo. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Reemplaza todas las coincidencias de la expresión regular en la cadena con la cadena de reemplazo. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Reemplaza todas las coincidencias de la expresión regular en la cadena con la cadena de reemplazo. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Reemplaza todas las coincidencias en la cadena con cadenas de reemplazo generadas por delegados. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Reemplaza todas las coincidencias en la cadena con cadenas de reemplazo generadas por delegados. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Reemplaza todas las coincidencias en la cadena con cadenas de reemplazo generadas por delegados. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Reemplaza todas las coincidencias en la cadena con cadenas de reemplazo generadas por delegados (función estática). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Reemplaza todas las coincidencias de la expresión regular en la cadena con la cadena de reemplazo. |
| [Replace](./replace/)(const String\&, const String\&, int) | Reemplaza subcadenas en la cadena. No implementado. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Reemplaza subcadenas en la cadena. No implementado. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Reemplaza coincidencias de expresiones regulares. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Reemplaza coincidencias de expresiones regulares. |
| [Split](./split/)(const String\&) | Divide la cadena por coincidencias de expresiones regulares. |
| [Split](./split/)(const String\&, int) | Divide la cadena por coincidencias de expresiones regulares. |
| [Split](./split/)(const String\&, int, int) | Divide una cadena de entrada un número máximo especificado de veces en una matriz de subcadenas, en las posiciones definidas por una expresión regular especificada en el constructor [Regex](./). La búsqueda del patrón de expresión regular comienza en una posición de carácter especificada en la cadena de entrada. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Divide la cadena por expresiones regulares. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Divide la cadena por expresiones regulares. |
| [ToString](./tostring/)() const override | Convierte una expresión regular a cadena. |
| static [Unescape](./unescape/)(const String\&) | Desescapa caracteres especiales en la cadena utilizados como parte del patrón. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Valor de tiempo de espera especial para desactivar la interrupción de coincidencia por tiempo de espera. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
