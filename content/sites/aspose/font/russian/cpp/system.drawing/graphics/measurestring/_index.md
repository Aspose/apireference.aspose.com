---
title: "Метод System::Drawing::Graphics::MeasureString"
linktitle: "MeasureString"
second_title: "Aspose.Font для C++"
description: "Метод System::Drawing::Graphics::MeasureString. Возвращает размер указанной строки при отрисовке её в указанном шрифте и указанном формате в C++."
type: docs
weight: 6500
url: /ru/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


Возвращает размер указанной строки при отрисовке заданным шрифтом в указанном формате.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | String const\& | Строка, размер которой нужно вычислить |
| шрифт | System::SharedPtr\<Font\> const\& | Шрифт, используемый для отрисовки строки |
| width | int | Максимальная ширина строки |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Указывает формат строки |

### ReturnValue

Объект [SizeF](../../sizef/) представляет размер строки в единицах измерения, указанных свойством PageUnit текущего объекта Graphics.

## См. также

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Возвращает размер указанной строки при отрисовке заданным шрифтом в указанном формате.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | String const\& | Строка, размер которой нужно вычислить |
| шрифт | System::SharedPtr\<Font\> const\& | Шрифт, используемый для отрисовки строки |
| origin | PointF const\& | Указывает расположение верхнего левого угла строки |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Указывает формат строки |

### ReturnValue

Объект [SizeF](../../sizef/) представляет размер строки в единицах измерения, указанных свойством PageUnit текущего объекта Graphics.

## См. также

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


НЕ РЕАЛИЗОВАНО.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## См. также

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Возвращает размер указанной строки при отрисовке заданным шрифтом в указанном формате.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| str | String const\& | Строка, размер которой нужно вычислить |
| шрифт | System::SharedPtr\<Font\> const\& | Шрифт, используемый для отрисовки строки |
| layoutArea | SizeF const\& | Максимальная область размещения строки |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Указывает формат строки |

### ReturnValue

Объект [SizeF](../../sizef/) представляет размер строки в единицах измерения, указанных свойством PageUnit текущего объекта Graphics.

## См. также

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
