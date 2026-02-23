---
title: Aspose::Page::EPS::PsDocument::ClipAndNewPath method
linktitle: ClipAndNewPath
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::PsDocument::ClipAndNewPath method. Adds clip to current graphics state and than writes "newpath" operator. It is necessary to do to escape of confluence of this clipping path and some subsequent pathes such as glyphs outlined with "charpath" operator in C++.'
type: docs
weight: 300
url: /cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


Adds clip to current graphics state and than writes "newpath" operator. It is necessary to do to escape of confluence of this clipping path and some subsequent pathes such as glyphs outlined with "charpath" operator.

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| Parameter | Type | Description |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | The clipping path. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
