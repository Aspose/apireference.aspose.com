---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText metodo"
linktitle: "FillAndStrokeText"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText metodo. Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi in C++."
type: docs
weight: 2500
url: /it/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | System::String | Il testo da aggiungere. |
| avanzamenti | System::ArrayPtr\<float\> | Un array della larghezza dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) che verrà usato per disegnare il testo. Può essere usato con un font personalizzato situato in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Il riempimento usato per dipingere l'interno dei glifi. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Il tratto usato per disegnare i contorni dei glifi. |

## Vedi anche

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


Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | System::String | Il testo da aggiungere. |
| avanzamenti | System::ArrayPtr\<float\> | Un array della larghezza dei glifi. La sua lunghezza deve corrispondere al numero di glifi nella stringa. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) font che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Il riempimento usato per dipingere l'interno dei glifi. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Il tratto usato per disegnare i contorni dei glifi. |

## Vedi anche

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


Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | System::String | Il testo da aggiungere. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) che verrà usato per disegnare il testo. Può essere usato con un font personalizzato situato in una cartella personalizzata. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Il riempimento usato per dipingere l'interno dei glifi. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Il tratto usato per disegnare i contorni dei glifi. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| text | System::String | Il testo da aggiungere. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) font che verrà usato per disegnare il testo. |
| x | float | Coordinata X per l'origine del testo. |
| y | float | Coordinata Y per l'origine del testo. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Il riempimento usato per dipingere l'interno dei glifi. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Il tratto usato per disegnare i contorni dei glifi. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
