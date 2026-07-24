---
title: "System::Drawing::Drawing2D::ColorBlend class"
linktitle: "ColorBlend"
second_title: "Aspose.Page para C++"
description: "System::Drawing::Drawing2D::ColorBlend class. Contiene matrices de colores y posiciones utilizadas para interpolar la mezcla de colores en un degradado multicolor. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 300
url: /es/cpp/system.drawing.drawing2d/colorblend/
---
## ColorBlend class


Contiene matrices de colores y posiciones utilizadas para interpolar la mezcla de colores en un degradado multicolor. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class ColorBlend : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [ColorBlend](./colorblend/)() | Construye una nueva instancia de la clase [ColorBlend](./). |
| [ColorBlend](./colorblend/)(int) | Construye una nueva instancia de la clase [Blend](../blend/). |
| [get_Colors](./get_colors/)() | Devuelve una matriz de colores para usar en las posiciones correspondientes a lo largo de un degradado. |
| [get_Positions](./get_positions/)() | Devuelve la matriz de posiciones de mezcla a lo largo de un degradado. |
| [set_Colors](./set_colors/)(const ArrayPtr\<Color\>\&) | Establece una matriz de colores para usar en las posiciones correspondientes a lo largo de un degradado. |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | Establece la matriz de posiciones de mezcla a lo largo de un degradado. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
