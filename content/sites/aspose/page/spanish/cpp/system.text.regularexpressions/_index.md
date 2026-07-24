---
title: "Espacio de nombres System::Text::RegularExpressions"
linktitle: "System::Text::RegularExpressions"
second_title: "Aspose.Page para C++"
description: "Cómo usar el espacio de nombres System::Text::RegularExpressions en C++."
type: docs
weight: 6400
url: /es/cpp/system.text.regularexpressions/
---



## Clases

| Clase | Descripción |
| --- | --- |
| [Capture](./capture/) | Resultado de la coincidencia de una subexpresión única. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [CaptureCollection](./capturecollection/) | Lista de capturas realizadas por un único grupo de captura. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [Group](./group/) | Resultado de la coincidencia realizada por un único grupo de captura. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use este puntero para pasarlo a funciones como argumento. |
| [GroupCollection](./groupcollection/) | Lista de grupos de captura en una única coincidencia. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use este puntero para pasarlo a funciones como argumento. |
| [GroupCollectionPtr](./groupcollectionptr/) | Puntero a colección de [Group](./group/). Este tipo es un puntero para gestionar la eliminación de otros objetos. Debe asignarse en la pila y pasarse a funciones ya sea por valor o por referencia constante. |
| [Match](./match/) | Coincidencia [Single](../system/single/) de expresión regular sobre una cadena. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use este puntero para pasarlo a funciones como argumento. |
| [MatchCollection](./matchcollection/) | Colección de coincidencias realizadas al aplicar repetidamente la expresión regular a una cadena. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use este puntero para pasarlo a funciones como argumento. |
| [Regex](./regex/) | Expresión regular que sigue una sintaxis similar a C#. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use este puntero para pasarlo a funciones como argumento. |
## Enums

| Enumeración | Descripción |
| --- | --- |
| [RegexOptions](./regexoptions/) | Opciones de [Regex](./regex/). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [CaptureCollectionPtr](./capturecollectionptr/) | Puntero a la colección de capturas. |
| [CapturePtr](./captureptr/) | Puntero a un objeto de captura única. |
| [GroupPtr](./groupptr/) | Puntero a un grupo. |
| [MatchCollectionPtr](./matchcollectionptr/) | Puntero a la colección de [Match](./match/). |
| [MatchEvaluator](./matchevaluator/) | Tipo de delegado para evaluar la coincidencia. |
| [MatchPtr](./matchptr/) | Puntero a [Match](./match/). |
| [RegexPtr](./regexptr/) | Puntero a [Regex](./regex/). |
| [UStringPtr](./ustringptr/) | UnicodeString compartido para evitar copias. |
