---
title: Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText method
linktitle: set_PreserveText
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText method. In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such XPS elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. Default is false in C++.'
type: docs
weight: 1700
url: /cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/set_preservetext/
---
## PdfSaveOptions::set_PreserveText method


In [XPS](../../../aspose.page.xps/), some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such [XPS](../../../aspose.page.xps/) elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. Default is false.

```cpp
void Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText(bool value) override
```

## See Also

* Class [PdfSaveOptions](../)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../../)
* Library [Aspose.Page for C++](../../../)
