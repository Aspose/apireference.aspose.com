---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText méthode"
linktitle: "FillAndStrokeText"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText méthode. Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes en C++."
type: docs
weight: 2500
url: /fr/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Ajoute une chaîne de texte en remplissant l'interrior des glyphes et en dessinant les contours des glyphes.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| text | System::String | Le texte à ajouter. |
| avances | System::ArrayPtr\<float\> | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Le remplissage utilisé pour peindre l'intérieur des glyphes. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Le trait utilisé pour dessiner les contours des glyphes. |

## Voir aussi

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


Ajoute une chaîne de texte en remplissant l'interrior des glyphes et en dessinant les contours des glyphes.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| text | System::String | Le texte à ajouter. |
| avances | System::ArrayPtr\<float\> | Un tableau de largeurs de glyphes. Sa longueur doit correspondre au nombre de glyphes dans la chaîne. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) police qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Le remplissage utilisé pour peindre l'intérieur des glyphes. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Le trait utilisé pour dessiner les contours des glyphes. |

## Voir aussi

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


Ajoute une chaîne de texte en remplissant l'interrior des glyphes et en dessinant les contours des glyphes.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| text | System::String | Le texte à ajouter. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) qui sera utilisé pour dessiner le texte. Il peut être utilisé avec une police personnalisée située dans un dossier personnalisé. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Le remplissage utilisé pour peindre l'intérieur des glyphes. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Le trait utilisé pour dessiner les contours des glyphes. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


Ajoute une chaîne de texte en remplissant l'interrior des glyphes et en dessinant les contours des glyphes.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| text | System::String | Le texte à ajouter. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) police qui sera utilisée pour dessiner le texte. |
| x | float | Coordonnée X de l'origine du texte. |
| y | float | Coordonnée Y de l'origine du texte. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | Le remplissage utilisé pour peindre l'intérieur des glyphes. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | Le trait utilisé pour dessiner les contours des glyphes. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
