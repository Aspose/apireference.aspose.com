---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method"
linktitle: "ClipAndNewPath"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method. Ajoute un clip à l'état graphique actuel puis écrit l'opérateur \\\"newpath\\\". Il est nécessaire de le faire pour éviter la confluence de ce chemin de découpe avec certains chemins ultérieurs tels que les glyphes tracés avec l'opérateur \\\"charpath\\\" en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


Ajoute un clip à l'état graphique actuel puis écrit l'opérateur "newpath". Il est nécessaire de le faire pour éviter la confluence de ce chemin de découpage et de certains chemins ultérieurs tels que les glyphes tracés avec l'opérateur "charpath".

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | Le chemin de découpe. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
