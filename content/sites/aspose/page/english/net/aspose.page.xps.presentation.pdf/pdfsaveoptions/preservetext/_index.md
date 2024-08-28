---
title: PdfSaveOptions.PreserveText
second_title: Aspose.Page for .NET API Reference
description: PdfSaveOptions property. In XPS some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true the text from such XPS elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text although still selectable will be modified and likely become unreadable. Default is false
type: docs
weight: 90
url: /net/aspose.page.xps.presentation.pdf/pdfsaveoptions/preservetext/
---
## PdfSaveOptions.PreserveText property

In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such XPS elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. Default is false.

```csharp
public bool PreserveText { get; set; }
```

### See Also

* class [PdfSaveOptions](../)
* namespace [Aspose.Page.XPS.Presentation.Pdf](../../pdfsaveoptions/)
* assembly [Aspose.Page](../../../)


