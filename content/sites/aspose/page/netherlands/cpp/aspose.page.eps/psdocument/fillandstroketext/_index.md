---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText methode"
linktitle: "FillAndStrokeText"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText methode. Voegt een tekststring toe door het interieur van glyphs te vullen en de contouren van glyphs te tekenen in C++."
type: docs
weight: 2500
url: /nl/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Voegt een tekstreeks toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| text | System::String | De tekst om toe te voegen. |
| voortgangen | System::ArrayPtr\<float\> | Een array van glyphs breedte. De lengte moet overeenkomen met het aantal glyphs in de string. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) die zal worden gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X-coördinaat voor de tekstherkomst. |
| y | float | Y-coördinaat voor de tekstherkomst. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | De vulling die wordt gebruikt voor het schilderen van het interieur van glyphs. |
| streep | System::SharedPtr\<System::Drawing::Pen\> | De streep die wordt gebruikt voor het tekenen van glyphs contouren. |

## Zie ook

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


Voegt een tekstreeks toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| text | System::String | De tekst om toe te voegen. |
| voortgangen | System::ArrayPtr\<float\> | Een array van glyphs breedte. De lengte moet overeenkomen met het aantal glyphs in de string. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) lettertype dat zal worden gebruikt om tekst te tekenen. |
| x | float | X-coördinaat voor de tekstherkomst. |
| y | float | Y-coördinaat voor de tekstherkomst. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | De vulling die wordt gebruikt voor het schilderen van het interieur van glyphs. |
| streep | System::SharedPtr\<System::Drawing::Pen\> | De streep die wordt gebruikt voor het tekenen van glyphs contouren. |

## Zie ook

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


Voegt een tekstreeks toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| text | System::String | De tekst om toe te voegen. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) die zal worden gebruikt om tekst te tekenen. Het kan worden gebruikt met een aangepast lettertype dat zich bevindt in een aangepaste map. |
| x | float | X-coördinaat voor de tekstherkomst. |
| y | float | Y-coördinaat voor de tekstherkomst. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | De vulling die wordt gebruikt voor het schilderen van het interieur van glyphs. |
| streep | System::SharedPtr\<System::Drawing::Pen\> | De streep die wordt gebruikt voor het tekenen van glyphs contouren. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Voegt een tekstreeks toe door de binnenkant van glyphs te vullen en de contouren van glyphs te tekenen.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| text | System::String | De tekst om toe te voegen. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) lettertype dat zal worden gebruikt om tekst te tekenen. |
| x | float | X-coördinaat voor de tekstherkomst. |
| y | float | Y-coördinaat voor de tekstherkomst. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | De vulling die wordt gebruikt voor het schilderen van het interieur van glyphs. |
| streep | System::SharedPtr\<System::Drawing::Pen\> | De streep die wordt gebruikt voor het tekenen van glyphs contouren. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
