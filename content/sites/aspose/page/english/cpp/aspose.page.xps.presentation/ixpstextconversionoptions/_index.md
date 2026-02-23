---
title: Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class
linktitle: IXpsTextConversionOptions
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class. Defines options for conversion of XPS to other formats in C++.'
type: docs
weight: 300
url: /cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


Defines options for conversion of [XPS](../../aspose.page.xps/) to other formats.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | In [XPS](../../aspose.page.xps/), some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such [XPS](../../aspose.page.xps/) elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | In [XPS](../../aspose.page.xps/), some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such [XPS](../../aspose.page.xps/) elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
