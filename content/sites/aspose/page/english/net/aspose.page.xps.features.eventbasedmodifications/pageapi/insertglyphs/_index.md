---
title: PageAPI.InsertGlyphs
second_title: Aspose.Page for .NET API Reference
description: PageAPI method. Inserts new glyphs to the page at index position
type: docs
weight: 300
url: /net/aspose.page.xps.features.eventbasedmodifications/pageapi/insertglyphs/
---
## InsertGlyphs(int, string, float, FontStyle, float, float, string) {#insertglyphs_1}

Inserts new glyphs to the page at *index* position.

```csharp
public XpsGlyphs InsertGlyphs(int index, string fontFamily, float fontSize, FontStyle fontStyle, 
    float originX, float originY, string unicodeString)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | Position at which new glyphs should be inserted. |
| fontFamily | String | Font family. |
| fontSize | Single | Font size. |
| fontStyle | FontStyle | Font style. |
| originX | Single | Glyphs origin X coordinate. |
| originY | Single | Glyphs origin Y coordinate. |
| unicodeString | String | String to be printed. |

### Return Value

Inserted glyphs.

### See Also

* class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* class [PageAPI](../)
* namespace [Aspose.Page.XPS.Features.EventBasedModifications](../../pageapi/)
* assembly [Aspose.Page](../../../)

---

## InsertGlyphs(int, XpsFont, float, float, float, string) {#insertglyphs}

Inserts new glyphs to the page at *index* position.

```csharp
public XpsGlyphs InsertGlyphs(int index, XpsFont font, float fontSize, float originX, 
    float originY, string unicodeString)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | Position at which new glyphs should be inserted. |
| font | XpsFont | Font resource. |
| fontSize | Single | Font size. |
| originX | Single | Glyphs origin X coordinate. |
| originY | Single | Glyphs origin Y coordinate. |
| unicodeString | String | String to be printed. |

### Return Value

Inserted glyphs.

### See Also

* class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* class [PageAPI](../)
* namespace [Aspose.Page.XPS.Features.EventBasedModifications](../../pageapi/)
* assembly [Aspose.Page](../../../)


