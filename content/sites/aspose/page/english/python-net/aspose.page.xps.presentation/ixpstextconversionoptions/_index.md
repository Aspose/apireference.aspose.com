---
title: IXpsTextConversionOptions class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 30
url: /python-net/aspose.page.xps.presentation/ixpstextconversionoptions/
---

## IXpsTextConversionOptions class

Defines options for conversion of XPS to other formats.



The IXpsTextConversionOptions type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `preserve_text` | In XPS, some text elements may contain references to alternate glyph forms<br/>            that do not correspond to any character code in the font.<br/>            If this flag is set to true, the text from such XPS elements is converted to graphic shapes.<br/>            Then the text itself appears transparent on top. This leaves the text of such elements selectable.<br/>            But the side effect is that the output file may be much larger than the original.<br/>            If this flag is set to false, the characters that should be displayed as alternate forms<br/>            are replaced with some other characters that become mapped to the alternate glyph forms.<br/>            Therefore the text, although still selectable, will be modified and likely become unreadable. |

### See Also

* module [`aspose.page.xps.presentation`](/page/python-net/aspose.page.xps.presentation/)
* package [`aspose.page`](/page/python-net/)

