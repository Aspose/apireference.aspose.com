---
title: "Метод Aspose::Page::Drawing::Color::FromArgb"
linktitle: "FromArgb"
second_title: "Aspose.Page для C++"
description: "Метод Aspose::Page::Drawing::Color::FromArgb. Создаёт структуру T:Aspose::Page::Drawing::Color из указанной структуры T:Aspose::Page::Drawing::Color, но с новым заданным альфа‑значением. Хотя этот метод позволяет передать 32‑битное значение для альфа‑компоненты, в C++ значение ограничивается 8 битами."
type: docs
weight: 100
url: /ru/cpp/aspose.page.drawing/color/fromargb/
---
## Color::FromArgb(int32_t, Aspose::Page::Drawing::Color) method


Создаёт структуру [T:Aspose::Page::Drawing::Color](../) из указанной структуры [T:Aspose::Page::Drawing::Color](../), но с новым указанным значением альфа. Хотя этот метод позволяет передавать 32‑битное значение для альфа‑компонента, значение ограничено 8 битами.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, Aspose::Page::Drawing::Color baseColor)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| alpha | int32_t | Альфа‑значение для нового [T:Aspose::Page::Drawing::Color](../). Допустимые значения от 0 до 255. |
| baseColor | Aspose::Page::Drawing::Color | [T:Aspose::Page::Drawing::Color](../), из которого создаётся новый [T:Aspose::Page::Drawing::Color](../). |

### ReturnValue

Объект [T:Aspose::Page::Drawing::Color](../), который создаёт этот метод.

## См. также

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t, int32_t) method


Создаёт структуру [T:Aspose::Page::Drawing::Color](../) из четырёх значений компонентов ARGB (альфа, красный, зелёный и синий). Хотя этот метод позволяет передавать 32‑битное значение для каждого компонента, значение каждого компонента ограничено 8 битами.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, int32_t red, int32_t green, int32_t blue)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| alpha | int32_t | Альфа‑компонент. Допустимые значения от 0 до 255. |
| red | int32_t | Красный компонент. Допустимые значения от 0 до 255. |
| green | int32_t | Зелёный компонент. Допустимые значения от 0 до 255. |
| синий | int32_t | Синий компонент. Допустимые значения от 0 до 255. |

### ReturnValue

Объект [T:Aspose::Page::Drawing::Color](../), который создаёт этот метод.

## См. также

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t) method


Создаёт структуру [T:Aspose::Page::Drawing::Color](../) из 32‑битного значения ARGB.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t argb)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| argb | int32_t | Значение, задающее 32‑битное ARGB‑значение. |

### ReturnValue

Структура [T:Aspose::Page::Drawing::Color](../), создаваемая этим методом.

## См. также

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t) method


Создаёт структуру [T:Aspose::Page::Drawing::Color](../) из указанных 8‑битных значений цветов (красный, зелёный и синий). Значение альфа подразумевается как 255 (полностью непрозрачное). Хотя этот метод позволяет передавать 32‑битное значение для каждого цветового компонента, значение каждого компонента ограничено 8 битами.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t red, int32_t green, int32_t blue)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| red | int32_t | Значение красного компонента для нового [T:Aspose::Page::Drawing::Color](../). Допустимые значения от 0 до 255. |
| green | int32_t | Значение зелёного компонента для нового [T:Aspose::Page::Drawing::Color](../). Допустимые значения от 0 до 255. |
| blue | int32_t | Значение синего компонента для нового [T:Aspose::Page::Drawing::Color](../). Допустимые значения от 0 до 255. |

### ReturnValue

Объект [T:Aspose::Page::Drawing::Color](../), который создаёт этот метод.

## См. также

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
