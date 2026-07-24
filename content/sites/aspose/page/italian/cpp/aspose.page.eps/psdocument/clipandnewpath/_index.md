---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method"
linktitle: "ClipAndNewPath"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method. Aggiunge un clip allo stato grafico corrente e poi scrive l'operatore \\\"newpath\\\". È necessario farlo per evitare la confluenza di questo percorso di clipping con alcuni percorsi successivi, come i glifi delineati con l'operatore \\\"charpath\\\" in C++."
type: docs
weight: 300
url: /it/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


Aggiunge clip allo stato grafico corrente e poi scrive l'operatore "newpath". È necessario farlo per evitare la confluenza di questo percorso di ritaglio con alcuni percorsi successivi, come i glifi delineati con l'operatore "charpath".

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | Il percorso di clipping. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
