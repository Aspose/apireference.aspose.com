---
title: FontFamilyDefinition
second_title: Aspose.Drawing for Java API Reference
description: The font family definition.
type: docs
weight: 25
url: /java/com.aspose.drawing/fontfamilydefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontFamilyDefinition
```

The font family definition.
## Constructors

| Constructor | Description |
| --- | --- |
| [FontFamilyDefinition()](#FontFamilyDefinition--) | Initializes a new instance of the [FontFamilyDefinition](../../com.aspose.drawing/fontfamilydefinition) class. |
## Methods

| Method | Description |
| --- | --- |
| [addFontDefinition(int style, FontDefinitionExt fontDef)](#addFontDefinition-int-com.aspose.drawing.FontDefinitionExt-) | Adds the font definition to font family. |
| [getFontDefinition(int style)](#getFontDefinition-int-) | Gets the font definition from family for specific style. |
| [matchesLocalizedFamilyName(String localizedFamilyName)](#matchesLocalizedFamilyName-java.lang.String-) | Matches localized family names in this family. |
| [getFamilyName()](#getFamilyName--) | Gets a family name of this family. |
### FontFamilyDefinition() {#FontFamilyDefinition--}
```
public FontFamilyDefinition()
```


Initializes a new instance of the [FontFamilyDefinition](../../com.aspose.drawing/fontfamilydefinition) class.

### addFontDefinition(int style, FontDefinitionExt fontDef) {#addFontDefinition-int-com.aspose.drawing.FontDefinitionExt-}
```
public final void addFontDefinition(int style, FontDefinitionExt fontDef)
```


Adds the font definition to font family.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | int | The style. |
| fontDef | [FontDefinitionExt](../../com.aspose.drawing/fontdefinitionext) | The font definition. |

### getFontDefinition(int style) {#getFontDefinition-int-}
```
public final FontDefinitionExt getFontDefinition(int style)
```


Gets the font definition from family for specific style.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | int | The style. |

**Returns:**
[FontDefinitionExt](../../com.aspose.drawing/fontdefinitionext) - Returns font definition if exist for specified style, null otherwise.
### matchesLocalizedFamilyName(String localizedFamilyName) {#matchesLocalizedFamilyName-java.lang.String-}
```
public final boolean matchesLocalizedFamilyName(String localizedFamilyName)
```


Matches localized family names in this family.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| localizedFamilyName | java.lang.String | The localized family name. |

**Returns:**
boolean - true if this family includes the localized family name.
### getFamilyName() {#getFamilyName--}
```
public final String getFamilyName()
```


Gets a family name of this family.

**Returns:**
java.lang.String - The family name, or null for an empty family.
