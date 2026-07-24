---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText метод"
linktitle: "FillAndStrokeText"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText метод. Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов в C++."
type: docs
weight: 2500
url: /ru/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| инкременты | System::ArrayPtr\<float\> | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) который будет использоваться для рисования текста. Он может использоваться с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Заливка, используемая для покраски внутренней части глифов. |
| обводка | System::SharedPtr\<System::Drawing::Pen\> | Обводка, используемая для рисования контуров глифов. |

## См. также

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


Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| инкременты | System::ArrayPtr\<float\> | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) шрифт, который будет использоваться для рисования текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Заливка, используемая для покраски внутренней части глифов. |
| обводка | System::SharedPtr\<System::Drawing::Pen\> | Обводка, используемая для рисования контуров глифов. |

## См. также

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


Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) который будет использоваться для рисования текста. Он может использоваться с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Заливка, используемая для покраски внутренней части глифов. |
| обводка | System::SharedPtr\<System::Drawing::Pen\> | Обводка, используемая для рисования контуров глифов. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) шрифт, который будет использоваться для рисования текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Заливка, используемая для покраски внутренней части глифов. |
| обводка | System::SharedPtr\<System::Drawing::Pen\> | Обводка, используемая для рисования контуров глифов. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
