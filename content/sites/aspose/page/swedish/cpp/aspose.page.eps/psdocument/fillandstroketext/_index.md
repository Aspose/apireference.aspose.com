---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText metod"
linktitle: "FillAndStrokeText"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText metod. Lägger till en textsträng genom att fylla inre delen av glyferna och rita glyfkonturer i C++."
type: docs
weight: 2500
url: /sv/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Lägger till en textsträng genom att fylla inuti teckenformer och rita teckenkonturer.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| text | System::String | Texten att lägga till. |
| avancemang | System::ArrayPtr\<float\> | En array av glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) som kommer att användas för att rita text. Den kan användas med anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Fyllningen som används för att måla glyfernas inre. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Strokén som används för att rita glyfkonturer. |

## Se även

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


Lägger till en textsträng genom att fylla inuti teckenformer och rita teckenkonturer.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| text | System::String | Texten att lägga till. |
| avancemang | System::ArrayPtr\<float\> | En array av glyfbredd. Dess längd måste överensstämma med antalet glyfer i strängen. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) teckensnitt som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Fyllningen som används för att måla glyfernas inre. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Strokén som används för att rita glyfkonturer. |

## Se även

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


Lägger till en textsträng genom att fylla inuti teckenformer och rita teckenkonturer.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| text | System::String | Texten att lägga till. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) som kommer att användas för att rita text. Den kan användas med anpassat teckensnitt som finns i en anpassad mapp. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Fyllningen som används för att måla glyfernas inre. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Strokén som används för att rita glyfkonturer. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Lägger till en textsträng genom att fylla inuti teckenformer och rita teckenkonturer.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| text | System::String | Texten att lägga till. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) teckensnitt som kommer att användas för att rita text. |
| x | float | X-koordinat för textens ursprung. |
| y | float | Y-koordinat för textens ursprung. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Fyllningen som används för att måla glyfernas inre. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Strokén som används för att rita glyfkonturer. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
