---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath metod"
linktitle: "ClipAndNewPath"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath metod. Lägger till en klippning i det aktuella grafikstillståndet och skriver sedan \\\"newpath\\\"-operatorn. Detta är nödvändigt för att undvika sammansmältning av detta klippningsspår med vissa efterföljande spår, såsom tecken som avgränsas med \\\"charpath\\\"-operatorn i C++."
type: docs
weight: 300
url: /sv/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


Lägger till klippning i aktuell grafikstatus och skriver sedan \"newpath\"-operatorn. Detta är nödvändigt för att undvika sammansmältning av denna klippningsbana med vissa efterföljande banor såsom glyfer som kontureras med \"charpath\"-operatorn.

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | Klippningsbanan. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
