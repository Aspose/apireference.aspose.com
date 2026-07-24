---
title: "Clase System::Drawing::FontFamily"
linktitle: "FontFamily"
second_title: "Aspose.Page para C++"
description: "Clase System::Drawing::FontFamily. Representa un grupo de tipografías que comparten un diseño básico similar. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 900
url: /es/cpp/system.drawing/fontfamily/
---
## FontFamily class


Representa un grupo de tipografías que comparten un diseño básico similar. Los objetos de esta clase solo deben ser asignados usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class FontFamily : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() | Devuelve una copia del objeto [FontFamily](./) actual. |
| [Dispose](./dispose/)() | Libera todos los recursos del sistema operativo adquiridos por el objeto actual. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina si el objeto actual y el especificado son idénticos. |
| [FontFamily](./fontfamily/)(const String\&) | Construye una nueva instancia de la clase [FontFamily](./) que representa una familia tipográfica con el nombre especificado. |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | Construye una nueva instancia de [FontFamily](./) en la FontCollection especificada con el nombre especificado. |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | Construye una nueva instancia de [FontFamily](./) a partir de la familia tipográfica genérica especificada. |
| static [get_Families](./get_families/)() | Devuelve una matriz que contiene todos los objetos [FontFamily](./) asociados al contexto gráfico actual. |
| static [get_GenericMonospace](./get_genericmonospace/)() | Devuelve un objeto [FontFamily](./) que representa una familia tipográfica genérica monoespaciada. |
| static [get_GenericSansSerif](./get_genericsansserif/)() | Devuelve un objeto [FontFamily](./) que representa una familia tipográfica genérica sans serif. |
| static [get_GenericSerif](./get_genericserif/)() | Devuelve un objeto [FontFamily](./) que representa una familia tipográfica genérica con serif. |
| [get_Name](./get_name/)() const | Devuelve el nombre de la familia tipográfica representada por el objeto actual. |
| [GetCellAscent](./getcellascent/)(FontStyle) | Devuelve la ascensión de celda de la familia tipográfica representada por el objeto actual para el estilo de fuente especificado. |
| [GetCellDescent](./getcelldescent/)(FontStyle) | Devuelve la caída de celda de la familia tipográfica representada por el objeto actual para el estilo de fuente especificado. |
| [GetEmHeight](./getemheight/)(FontStyle) | Devuelve la altura del cuadrado em en unidades de diseño de fuente para el estilo especificado. |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | Devuelve el interlineado de la familia tipográfica representada por el objeto actual para el estilo de fuente especificado. |
| [GetName](./getname/)(int) const | Devuelve el nombre de la familia tipográfica representada por el objeto actual. |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | Determina si el estilo de fuente especificado está disponible. |
| virtual [~FontFamily](./~fontfamily/)() | Destructor. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
