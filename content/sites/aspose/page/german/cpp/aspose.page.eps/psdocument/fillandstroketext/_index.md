---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText Methode"
linktitle: "FillAndStrokeText"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText Methode. Fügt eine Textzeichenfolge hinzu, indem der Innenbereich der Glyphen gefüllt und die Konturen der Glyphen in C++ gezeichnet werden."
type: docs
weight: 2500
url: /de/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| text | System::String | Der Text, der hinzugefügt werden soll. |
| Vorschübe | System::ArrayPtr\<float\> | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) die zum Zeichnen von Text verwendet wird. Sie kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X-Koordinate für den Textursprung. |
| y | float | Y-Koordinate für den Textursprung. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Die Füllung, die zum Malen des Glypheninneren verwendet wird. |
| Strich | System::SharedPtr\<System::Drawing::Pen\> | Der Strich, der zum Zeichnen der Glyphenkonturen verwendet wird. |

## Siehe auch

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


Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| text | System::String | Der Text, der hinzugefügt werden soll. |
| Vorschübe | System::ArrayPtr\<float\> | Ein Array von Glyphenbreiten. Seine Länge muss mit der Anzahl der Glyphen im String übereinstimmen. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) Schriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X-Koordinate für den Textursprung. |
| y | float | Y-Koordinate für den Textursprung. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Die Füllung, die zum Malen des Glypheninneren verwendet wird. |
| Strich | System::SharedPtr\<System::Drawing::Pen\> | Der Strich, der zum Zeichnen der Glyphenkonturen verwendet wird. |

## Siehe auch

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


Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| text | System::String | Der Text, der hinzugefügt werden soll. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) die zum Zeichnen von Text verwendet wird. Sie kann mit einer benutzerdefinierten Schriftart verwendet werden, die sich in einem benutzerdefinierten Ordner befindet. |
| x | float | X-Koordinate für den Textursprung. |
| y | float | Y-Koordinate für den Textursprung. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Die Füllung, die zum Malen des Glypheninneren verwendet wird. |
| Strich | System::SharedPtr\<System::Drawing::Pen\> | Der Strich, der zum Zeichnen der Glyphenkonturen verwendet wird. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Fügt eine Textzeichenfolge hinzu, indem der Innenbereich von Glyphen gefüllt und die Konturen der Glyphen gezeichnet werden.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| text | System::String | Der Text, der hinzugefügt werden soll. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) Schriftart, die zum Zeichnen von Text verwendet wird. |
| x | float | X-Koordinate für den Textursprung. |
| y | float | Y-Koordinate für den Textursprung. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Die Füllung, die zum Malen des Glypheninneren verwendet wird. |
| Strich | System::SharedPtr\<System::Drawing::Pen\> | Der Strich, der zum Zeichnen der Glyphenkonturen verwendet wird. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
