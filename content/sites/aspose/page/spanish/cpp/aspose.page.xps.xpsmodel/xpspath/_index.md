---
title: "Aspose::Page::XPS::XpsModel::XpsPath clase"
linktitle: "XpsPath"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath clase. Clase que encapsula las características del elemento Path. Este elemento es el único medio para añadir gráficos vectoriales e imágenes a una página fija. Define un único gráfico vectorial que se renderiza en una página en C++."
type: docs
weight: 3000
url: /es/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Clase que encapsula características del elemento Path. Este elemento es el único medio para agregar gráficos vectoriales e imágenes a una página fija. Define un único gráfico vectorial que se renderizará en una página.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() | Clona este trazado. |
| [get_Data](./get_data/)() | Devuelve/establece la geometría del trazado. |
| [get_Fill](./get_fill/)() | Devuelve/establece el pincel usado para pintar la geometría especificada por la propiedad Data del trazado. |
| [get_Stroke](./get_stroke/)() | Devuelve/establece el pincel usado para dibujar el trazo. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | Devuelve/establece la matriz que especifica la longitud de los guiones y espacios del trazo del contorno. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | Devuelve/establece el valor que especifica cómo se dibujan los extremos de cada guión. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | Devuelve/establece el punto de inicio para repetir el patrón de la matriz de guiones. Si se omite este valor, la matriz de guiones se alinea con el origen del trazo. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | Devuelve/establece el valor que define la forma del extremo del último guión en un trazo. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | Devuelve/establece el valor que define la forma del inicio del primer guión en un trazo. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | Devuelve/establece la relación entre la longitud máxima del inglete y la mitad del grosor del trazo. Este valor es significativo solo si el atributo **StrokeLineJoin** especifica **Miter**. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | Devuelve/establece el valor que define la forma del inicio del primer guión en un trazo. |
| [get_StrokeThickness](./get_strokethickness/)() const | Devuelve/establece el grosor de un trazo, en unidades del espacio de coordenadas efectivo (incluye la transformación de renderizado del trazado). El trazo se dibuja sobre el límite de la geometría especificada por la propiedad Data del elemento Path. La mitad del StrokeThickness se extiende fuera de la geometría especificada por la propiedad Data y la otra mitad se extiende dentro de la geometría. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | Devuelve/establece la geometría del trazado. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Devuelve/establece el pincel usado para pintar la geometría especificada por la propiedad Data del trazado. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | Devuelve/establece el pincel usado para dibujar el trazo. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | Devuelve/establece la matriz que especifica la longitud de los guiones y espacios del trazo del contorno. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | Devuelve/establece el valor que especifica cómo se dibujan los extremos de cada guión. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | Devuelve/establece el punto de inicio para repetir el patrón de la matriz de guiones. Si se omite este valor, la matriz de guiones se alinea con el origen del trazo. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | Devuelve/establece el valor que define la forma del extremo del último guión en un trazo. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | Devuelve/establece el valor que define la forma del inicio del primer guión en un trazo. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | Devuelve/establece la relación entre la longitud máxima del inglete y la mitad del grosor del trazo. Este valor es significativo solo si el atributo **StrokeLineJoin** especifica **Miter**. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | Devuelve/establece el valor que define la forma del inicio del primer guión en un trazo. |
| [set_StrokeThickness](./set_strokethickness/)(float) | Devuelve/establece el grosor de un trazo, en unidades del espacio de coordenadas efectivo (incluye la transformación de renderizado del trazado). El trazo se dibuja sobre el límite de la geometría especificada por la propiedad Data del elemento Path. La mitad del StrokeThickness se extiende fuera de la geometría especificada por la propiedad Data y la otra mitad se extiende dentro de la geometría. |
## Ver también

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
