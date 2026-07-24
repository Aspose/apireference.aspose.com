---
title: "Aspose::Page::EPS::PsDocument::FillText метод"
linktitle: "FillText"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::PsDocument::FillText метод. Добавляет строку текста, заполняя внутреннюю часть глифов в C++."
type: docs
weight: 3100
url: /ru/cpp/aspose.page.eps/psdocument/filltext/
---
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


Добавляет строку текста, заполняя внутреннюю часть глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| инкременты | System::ArrayPtr\<float\> | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) который будет использоваться для рисования текста. Он может использоваться с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


Добавляет строку текста, заполняя внутреннюю часть глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| инкременты | System::ArrayPtr\<float\> | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) который будет использоваться для рисования текста. Он может использоваться с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fill | System::SharedPtr\<System::Drawing::Brush\> | Заливка, используемая для отрисовки глифов. |
## Примечания



///
## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) method


Добавляет строку текста, заполняя внутреннюю часть глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| инкременты | System::ArrayPtr\<float\> | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| font | System::SharedPtr\<System::Drawing::Font\> | Шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


Добавляет строку текста, заполняя внутреннюю часть глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| инкременты | System::ArrayPtr\<float\> | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) шрифт, который будет использоваться для рисования текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fill | System::SharedPtr\<System::Drawing::Brush\> | Заливка, используемая для отрисовки глифов. |

## См. также

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


Добавляет строку текста, заполняя внутреннюю часть глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) который будет использоваться для рисования текста. Он может использоваться с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


Добавляет строку текста, заполняя внутреннюю часть глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) который будет использоваться для рисования текста. Он может использоваться с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fill | System::SharedPtr\<System::Drawing::Brush\> | Заливка, используемая для отрисовки глифов. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) method


Добавляет строку текста, заполняя внутреннюю часть глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) шрифт, который будет использоваться для рисования текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


Добавляет строку текста, заполняя внутреннюю часть глифов.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| text | System::String | Текст для добавления. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) шрифт, который будет использоваться для рисования текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fill | System::SharedPtr\<System::Drawing::Brush\> | Заливка, используемая для отрисовки глифов. |

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
