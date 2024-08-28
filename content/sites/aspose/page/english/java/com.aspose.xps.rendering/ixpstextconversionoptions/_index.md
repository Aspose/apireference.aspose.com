---
title: IXpsTextConversionOptions
second_title: Aspose.Page for Java API Reference
description: Defines options for conversion of XPS to other formats.
type: docs
weight: 19
url: /java/com.aspose.xps.rendering/ixpstextconversionoptions/
---```
public interface IXpsTextConversionOptions
```

Defines options for conversion of XPS to other formats.
## Methods

| Method | Description |
| --- | --- |
| [preserveText()](#preserveText--) | In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. |
| [preserveText(boolean value)](#preserveText-boolean-) | In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. |
### preserveText() {#preserveText--}
```
public abstract boolean preserveText()
```


In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such XPS elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable.

**Returns:**
boolean - The flag value.
### preserveText(boolean value) {#preserveText-boolean-}
```
public abstract void preserveText(boolean value)
```


In XPS, some text elements may contain references to alternate glyph forms that do not correspond to any character code in the font. If this flag is set to true, the text from such XPS elements is converted to graphic shapes. Then the text itself appears transparent on top. This leaves the text of such elements selectable. But the side effect is that the output file may be much larger than the original. If this flag is set to false, the characters that should be displayed as alternate forms are replaced with some other characters that become mapped to the alternate glyph forms. Therefore the text, although still selectable, will be modified and likely become unreadable.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The flag value. |

