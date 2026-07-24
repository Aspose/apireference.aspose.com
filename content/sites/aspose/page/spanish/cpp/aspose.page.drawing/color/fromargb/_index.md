---
title: "Método Aspose::Page::Drawing::Color::FromArgb"
linktitle: "FromArgb"
second_title: "Aspose.Page para C++"
description: "Método Aspose::Page::Drawing::Color::FromArgb. Crea una estructura T:Aspose::Page::Drawing::Color a partir de la estructura T:Aspose::Page::Drawing::Color especificada, pero con el nuevo valor alfa especificado. Aunque este método permite pasar un valor de 32 bits para el valor alfa, el valor está limitado a 8 bits en C++."
type: docs
weight: 100
url: /es/cpp/aspose.page.drawing/color/fromargb/
---
## Color::FromArgb(int32_t, Aspose::Page::Drawing::Color) method


Crea una estructura [T:Aspose::Page::Drawing::Color](../) a partir de la estructura [T:Aspose::Page::Drawing::Color](../) especificada, pero con el nuevo valor alfa especificado. Aunque este método permite pasar un valor de 32 bits para el valor alfa, el valor está limitado a 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, Aspose::Page::Drawing::Color baseColor)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| alpha | int32_t | El valor alfa para el nuevo [T:Aspose::Page::Drawing::Color](../). Los valores válidos son de 0 a 255. |
| baseColor | Aspose::Page::Drawing::Color | El [T:Aspose::Page::Drawing::Color](../) del cual crear el nuevo [T:Aspose::Page::Drawing::Color](../). |

### ReturnValue

El [T:Aspose::Page::Drawing::Color](../) que crea este método.

## Ver también

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t, int32_t) method


Crea una estructura [T:Aspose::Page::Drawing::Color](../) a partir de los cuatro valores de componentes ARGB (alfa, rojo, verde y azul). Aunque este método permite pasar un valor de 32 bits para cada componente, el valor de cada componente está limitado a 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, int32_t red, int32_t green, int32_t blue)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| alpha | int32_t | El componente alfa. Los valores válidos son de 0 a 255. |
| red | int32_t | El componente rojo. Los valores válidos son de 0 a 255. |
| green | int32_t | El componente verde. Los valores válidos son de 0 a 255. |
| azul | int32_t | El componente azul. Los valores válidos son de 0 a 255. |

### ReturnValue

El [T:Aspose::Page::Drawing::Color](../) que crea este método.

## Ver también

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t) method


Crea una estructura [T:Aspose::Page::Drawing::Color](../) a partir de un valor ARGB de 32 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t argb)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| argb | int32_t | Un valor que especifica el valor ARGB de 32 bits. |

### ReturnValue

La estructura [T:Aspose::Page::Drawing::Color](../) que crea este método.

## Ver también

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t) method


Crea una estructura [T:Aspose::Page::Drawing::Color](../) a partir de los valores de color de 8 bits especificados (rojo, verde y azul). El valor alfa es implícitamente 255 (totalmente opaco). Aunque este método permite pasar un valor de 32 bits para cada componente de color, el valor de cada componente está limitado a 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t red, int32_t green, int32_t blue)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| red | int32_t | El valor del componente rojo para el nuevo [T:Aspose::Page::Drawing::Color](../). Los valores válidos son de 0 a 255. |
| green | int32_t | El valor del componente verde para el nuevo [T:Aspose::Page::Drawing::Color](../). Los valores válidos son de 0 a 255. |
| blue | int32_t | El valor del componente azul para el nuevo [T:Aspose::Page::Drawing::Color](../). Los valores válidos son de 0 a 255. |

### ReturnValue

El [T:Aspose::Page::Drawing::Color](../) que crea este método.

## Ver también

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
