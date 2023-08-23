---
title: Class Glyphs
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.Glyphs class. The glyphs. The Glyphs element represents a run of uniformlyformatted text from a single font. It provides information necessary for accurate rendering and supports search and selection features in viewing consumers
type: docs
weight: 9180
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/
---
## Glyphs class

The glyphs. The Glyphs element represents a run of uniformly-formatted text from a single font. It provides information necessary for accurate rendering and supports search and selection features in viewing consumers.

```csharp
public class Glyphs
```

## Constructors

| Name | Description |
| --- | --- |
| [Glyphs](glyphs/)() | Initializes a new instance of the `Glyphs` class. |

## Properties

| Name | Description |
| --- | --- |
| [BidiLevel](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/bidilevel/) { get; set; } | Gets or sets the BIDI level. Specifies the Unicode algorithm bidirectional nesting level. Even values imply left-to-right layout, odd values imply right-to-left layout. Right-to-left layout places the run origin at the right side of the first glyph, with positive advance widths (representing advances to the left) placing subsequent glyphs to the left of the previous glyph.Valid values range from 0 to 61, inclusive. |
| [CaretStops](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/caretstops/) { get; set; } | Gets or sets the caret stops. Identifies the positions within the sequence of Unicode characters at which a text-selection tool can place a text-editing caret. Potential caret-stop positions are identified by their indices into the UTF-16 code units represented by the UnicodeString attribute value. When this attribute is missing, the text in the UnicodeString attribute value MUST be interpreted as having a caret stop between every Unicode UTF-16 code unit and at the beginning and end of the text. The value SHOULD indicate that the caret cannot stop in front of most combining marks or in front of the second UTF-16 code unit of UTF-16 surrogate pairs. |
| [Clip](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/clip/) { get; set; } | Gets or sets the clip. Limits the rendered region of the element. Only portions of the Glyphs element that fall within the clip region (even partially clipped characters) produce marks on the page. |
| [DeviceFontName](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/devicefontname/) { get; set; } | Gets or sets the device font name. Uniquely identifies a specific device font. The identifier is typically defined by a hardware vendor or font vendor. |
| [Fill](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/fill/) { get; set; } | Gets or sets the fill. |
| [FixedPageNavigateUri](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/fixedpagenavigateuri/) { get; set; } | Gets or sets the fixed page navigate uri. Associates a hyperlink URI with the element. May be a relative reference or a URI that addresses a resource that is internal to or external to the package. |
| [FontRenderingEmSize](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/fontrenderingemsize/) { get; set; } | Gets or sets the font rendering EM size. Specifies the font size in drawing surface units, expressed as a float in units of the effective coordinate space. A value of 0 results in no visible text. |
| [FontUri](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/fonturi/) { get; set; } | Gets or sets the font uri. The URI of the physical font from which all glyphs in the run are drawn.The URI MUST reference a font contained in the package. If the physical font referenced is a TrueType Collection (containing multiple font faces), the fragment portion of the URI is a 0-based index indicating which font face of the TrueType Collection should be used. |
| [GlyphsClip](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/glyphsclip/) { get; set; } | Gets or sets the glyphs clip. Limits the rendered region of the element. Only portions of the Glyphs element that fall within the clip region (even partially clipped characters) produce marks on the page. |
| [GlyphsFill](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/glyphsfill/) { get; set; } | Gets or sets the glyphs fill. Describes the brush used to fill the shape of the rendered glyphs. |
| [GlyphsOpacityMask](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/glyphsopacitymask/) { get; set; } | Gets or sets the glyphs opacity mask. Specifies a mask of alpha values that is applied to the glyphs in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [GlyphsRenderTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/glyphsrendertransform/) { get; set; } | Gets or sets the glyphs render transform. Establishes a new coordinate frame for the glyph run specified by the Glyphs element. The render transform affects clip, opacity mask, fill, x origin, y origin, the actual shape of individual glyphs, and the advance widths. The render transform also affects the font size and values specified in the Indices attribute. |
| [Indices](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/indices/) { get; set; } | Gets or sets the indices. Specifies a series of glyph indices and their attributes used for rendering the glyph run. If the UnicodeString attribute of the Glyphs element is not specified or contains an empty value (“” or “{ }”), and if the Indices attribute is not specified or contains no glyph indices, then a consumer MUST instantiate an error condition. |
| [IsSideways](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/issideways/) { get; set; } | Gets or sets a value indicating whether is sideways. Indicates that a glyph is turned on its side, with the origin being defined as the top center of the unturned glyph. |
| [Language](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/language/) { get; set; } | Gets or sets the language. Specifies the default language used for the current element and for any child or descendant elements. The language is specified according to RFC 3066. |
| [Name](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/name/) { get; set; } | Gets or sets the name. Contains a string value that identifies the current element as a named, addressable point in the document for the purpose of hyperlinking. |
| [Opacity](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/opacity/) { get; set; } | Gets or sets the opacity. Defines the uniform transparency of the glyph element. Values range from 0 (fully transparent) to 1 (fully opaque), inclusive.Values outside of this range are invalid. |
| [OpacityMask](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/opacitymask/) { get; set; } | Gets or sets the opacity mask. Specifies a mask of alpha values that is applied to the glyphs in the same fashion as the Opacity attribute, but allowing different alpha values for different areas of the element. |
| [OriginX](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/originx/) { get; set; } | Gets or sets the origin x. Specifies the x coordinate of the first glyph in the run, in units of the effective coordinate space. The glyph is placed so that the leading edge of its advance vector and its baseline intersect with the point defined by the OriginX and OriginY attributes. |
| [OriginY](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/originy/) { get; set; } | Gets or sets the origin y. Specifies the y coordinate of the first glyph in the run, in units of the effective coordinate space. The glyph is placed so that the leading edge of its advance vector and its baseline intersect with the point defined by the OriginX and OriginY attributes. |
| [RenderTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/rendertransform/) { get; set; } | Gets or sets the render transform. Establishes a new coordinate frame for the glyph run specified by the Glyphs element. The render transform affects clip, opacity mask, fill, x origin, y origin, the actual shape of individual glyphs, and the advance widths. The render transform also affects the font size and values specified in the Indices attribute. |
| [StyleSimulations](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/stylesimulations/) { get; set; } | Gets or sets the style simulations. Specifies a style simulation. Valid values are None, ItalicSimulation, BoldSimulation, and BoldItalicSimulation. |
| [UnicodeString](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/unicodestring/) { get; set; } | Gets or sets the unicode string. Contains the string of text rendered by the Glyphs element. The text is specified as Unicode code points. If the UnicodeString attribute of the Glyphs element is not specified or contains an empty value (“” or “{ }”), and if the Indices attribute is not specified or contains no glyph indices, then a consumer MUST instantiate an error condition. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


