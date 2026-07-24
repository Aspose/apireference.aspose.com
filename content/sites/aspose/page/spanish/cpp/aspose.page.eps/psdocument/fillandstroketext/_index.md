---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText método"
linktitle: "FillAndStrokeText"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText método. Agrega una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos en C++."
type: docs
weight: 2500
url: /es/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | System::String | El texto a agregar. |
| avances | System::ArrayPtr\<float\> | Una matriz del ancho de los glifos. Su longitud debe cumplir con el número de glifos en la cadena. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que está ubicada en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | El relleno usado para pintar el interior de los glifos. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | El trazo usado para dibujar los contornos de los glifos. |

## Ver también

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | System::String | El texto a agregar. |
| avances | System::ArrayPtr\<float\> | Una matriz del ancho de los glifos. Su longitud debe cumplir con el número de glifos en la cadena. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) fuente que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | El relleno usado para pintar el interior de los glifos. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | El trazo usado para dibujar los contornos de los glifos. |

## Ver también

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | System::String | El texto a agregar. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) que se utilizará para dibujar texto. Puede usarse con una fuente personalizada que está ubicada en una carpeta personalizada. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | El relleno usado para pintar el interior de los glifos. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | El trazo usado para dibujar los contornos de los glifos. |

## Ver también

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Añade una cadena de texto rellenando el interior de los glifos y dibujando los contornos de los glifos.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| text | System::String | El texto a agregar. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) fuente que se utilizará para dibujar texto. |
| x | float | Coordenada X del origen del texto. |
| y | float | Coordenada Y del origen del texto. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | El relleno usado para pintar el interior de los glifos. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | El trazo usado para dibujar los contornos de los glifos. |

## Ver también

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
