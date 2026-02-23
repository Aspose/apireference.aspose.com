---
title: Aspose::Page::XPS::Presentation::IXpsTextConversionOptions::get_PreserveText method
linktitle: get_PreserveText
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Presentation::IXpsTextConversionOptions::get_PreserveText method. In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such XPS elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.xps.presentation/ixpstextconversionoptions/get_preservetext/
---
## IXpsTextConversionOptions::get_PreserveText method


In [XPS](../../../aspose.page.xps/), some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such [XPS](../../../aspose.page.xps/) elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable.

```cpp
virtual bool Aspose::Page::XPS::Presentation::IXpsTextConversionOptions::get_PreserveText()=0
```

## See Also

* Class [IXpsTextConversionOptions](../)
* Namespace [Aspose::Page::XPS::Presentation](../../)
* Library [Aspose.Page for C++](../../../)
