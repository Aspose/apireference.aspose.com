---
title: Class XpsGlyphs
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsModel.XpsGlyphs class. Class incapsulating Glyphs element features. This element represents a run of uniformlyformatted text from a single font. It provides information necessary for accurate rendering and supports search and selection features in viewing consumers
type: docs
weight: 3740
url: /net/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class

Class incapsulating Glyphs element features. This element represents a run of uniformly-formatted text from a single font. It provides information necessary for accurate rendering and supports search and selection features in viewing consumers.

```csharp
public sealed class XpsGlyphs : XpsContentElement
```

## Properties

| Name | Description |
| --- | --- |
| [BidiLevel](../../aspose.page.xps.xpsmodel/xpsglyphs/bidilevel/) { get; set; } | Returns/sets the value specifying the Unicode algorithm bidirectional nesting level. Even values imply left-to-right layout, odd values imply right-to-left layout. Right-to-left layout places the run origin at the right side of the first glyph, with positive advance widths (representing advances to the left) placing subsequent glyphs to the left of the previous glyph. |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Returns/sets the path geometry instance limiting the rendered region of the element. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Returns number of child elements. |
| [Fill](../../aspose.page.xps.xpsmodel/xpsglyphs/fill/) { get; set; } | Returns/sets the brush used to fill the shape of the rendered glyphs. |
| [Font](../../aspose.page.xps.xpsmodel/xpsglyphs/font/) { get; } | Returns font resource for the TrueType font used to typeset elements text. |
| [FontRenderingEmSize](../../aspose.page.xps.xpsmodel/xpsglyphs/fontrenderingemsize/) { get; set; } | Returns/sets the font size in drawing surface units, expressed as a float in units of the effective coordinate space. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Returns/sets hyperlink target object. |
| [IsSideways](../../aspose.page.xps.xpsmodel/xpsglyphs/issideways/) { get; set; } | Returns/sets the value indicating that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Provides access to element's children by index *i*. |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Returns/sets the value defining the uniform transparency of the element. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Returns/sets the brush specifying a mask of alpha values that is applied to the element in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [OriginX](../../aspose.page.xps.xpsmodel/xpsglyphs/originx/) { get; set; } | Returns/sets the x coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [OriginY](../../aspose.page.xps.xpsmodel/xpsglyphs/originy/) { get; set; } | Returns/sets the y coordinate of the first glyph in the run, in units of the effective coordinate space. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Returns/sets the affine transformation matrix establishing a new coordinate frame for all attributes of the element and for all child elements (if any). |
| [StyleSimulations](../../aspose.page.xps.xpsmodel/xpsglyphs/stylesimulations/) { get; set; } | Returns/sets the value specifying a style simulation. |
| [UnicodeString](../../aspose.page.xps.xpsmodel/xpsglyphs/unicodestring/) { get; set; } | Returns/sets the string of text rendered by the Glyphs element. The text is specified as Unicode code points. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsglyphs/clone/)() | Clone this glyphs. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementation of IEnumerable interface. |

### See Also

* class [XpsContentElement](../xpscontentelement/)
* namespace [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* assembly [Aspose.Page](../../)


