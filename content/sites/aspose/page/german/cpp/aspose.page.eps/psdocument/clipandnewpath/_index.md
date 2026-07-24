---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method"
linktitle: "ClipAndNewPath"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method. Fügt dem aktuellen Grafikzustand einen Clip hinzu und schreibt dann den Operator \\\"newpath\\\". Dies ist notwendig, um die Konvergenz dieses Clipping-Pfads und einiger nachfolgender Pfade, wie z. B. Glyphen, die mit dem Operator \\\"charpath\\\" umrandet sind, in C++ zu vermeiden."
type: docs
weight: 300
url: /de/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


Fügt dem aktuellen Grafikzustand einen Clip hinzu und schreibt dann den Operator "newpath". Dies ist notwendig, um die Konvergenz dieses Clipping‑Pfads und einiger nachfolgender Pfade, wie z. B. Glyphen, die mit dem Operator "charpath" umrissen werden, zu vermeiden.

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | Der Clipping-Pfad. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
