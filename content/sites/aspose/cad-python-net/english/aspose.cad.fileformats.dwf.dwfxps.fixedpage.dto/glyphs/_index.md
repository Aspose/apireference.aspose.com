---
title: Glyphs class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/
is_root: false
---

## Glyphs class

The glyphs.
The Glyphs element represents a run of uniformly-formatted text from a single font.
It provides information necessary for accurate rendering and supports search
and selection features in viewing consumers.



The Glyphs type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/__init__/#) | Initializes a new instance of the [`Glyphs`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs) class. |


### Properties
| Property | Description |
| :- | :- |
| [glyphs_render_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/glyphs_render_transform) | Gets or sets the glyphs render transform.<br/>Establishes a new coordinate frame for the glyph run specified by the Glyphs element.<br/>The render transform affects clip, opacity mask, fill, x origin, y origin, the actual shape of individual glyphs, and the advance widths.<br/>The render transform also affects the font size and values specified in the Indices attribute. |
| [glyphs_clip](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/glyphs_clip) | Gets or sets the glyphs clip.<br/>Limits the rendered region of the element.<br/>Only portions of the Glyphs element that fall within the clip region<br/>(even partially clipped characters) produce marks on the page. |
| [glyphs_opacity_mask](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/glyphs_opacity_mask) | Gets or sets the glyphs opacity mask.<br/>Specifies a mask of alpha values that is applied to the glyphs in the same fashion as the Opacity attribute,<br/>but allowing different alpha values for different areas of the element. |
| [glyphs_fill](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/glyphs_fill) | Gets or sets the glyphs fill.<br/>Describes the brush used to fill the shape of the rendered glyphs. |
| [bidi_level](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/bidi_level) | Gets or sets the BIDI level.<br/>Specifies the Unicode algorithm bidirectional nesting level.<br/>Even values imply left-to-right layout, odd values imply right-to-left layout.<br/>Right-to-left layout places the run origin at the right side of the first glyph,<br/>with positive advance widths (representing advances to the left)<br/>placing subsequent glyphs to the left of the  previous glyph.Valid values range  from 0 to 61, inclusive. |
| [caret_stops](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/caret_stops) | Gets or sets the caret stops.<br/>Identifies the positions within the sequence of Unicode characters at which a text-selection tool can place a text-editing caret.<br/>Potential caret-stop positions are identified by their indices into the UTF-16 code units represented by the UnicodeString attribute value.<br/>When this attribute is missing, the text in the UnicodeString attribute  value MUST be interpreted<br/>as  having a caret stop between every  Unicode UTF-16 code unit and at  the beginning and end of the text.<br/>The value SHOULD indicate that  the caret cannot stop in front of most combining marks or in front  of the second UTF-16 code unit of  UTF-16 surrogate pairs. |
| [device_font_name](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/device_font_name) | Gets or sets the device font name.<br/>Uniquely identifies a specific device font.<br/>The identifier is typically defined by a hardware vendor or font vendor. |
| [fill](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/fill) | Gets or sets the fill. |
| [font_rendering_em_size](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/font_rendering_em_size) | Gets or sets the font rendering EM size.<br/>Specifies the font size in drawing surface units,<br/>expressed as a float in units of the effective coordinate space.<br/>A value of 0 results in no visible text. |
| [font_uri](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/font_uri) | Gets or sets the font uri.<br/>The URI of the physical font from which all glyphs in the run are drawn.The URI MUST reference a font contained in the package.<br/>If the physical font referenced is a TrueType Collection (containing multiple font faces),<br/>the fragment portion of the URI is a 0-based index indicating which font face of the TrueType Collection should be used. |
| [origin_x](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/origin_x) | Gets or sets the origin x.<br/>Specifies the x coordinate of the first glyph in the run, in units of the effective coordinate space.<br/>The glyph is placed so that the leading edge of its advance vector and its baseline intersect<br/>with the point defined by the OriginX and OriginY attributes. |
| [origin_y](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/origin_y) | Gets or sets the origin y.<br/>Specifies the y coordinate of the first glyph in the run, in units of the effective coordinate space.<br/>The glyph is placed so that the leading edge of its advance vector and its baseline intersect<br/>with the point defined by the OriginX and OriginY attributes. |
| [is_sideways](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/is_sideways) | Gets or sets a value indicating whether is sideways.<br/>Indicates that a glyph is turned on its side,<br/>with the origin being defined as the top center of the unturned glyph. |
| [indices](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/indices) | Gets or sets the indices.<br/>Specifies a series of glyph indices and their attributes used for rendering the glyph run.<br/>If the UnicodeString attribute of the Glyphs element is not specified<br/>or contains an empty value (“” or “{ }”), and if the Indices attribute is not specified or  contains no glyph indices,<br/>then a consumer MUST instantiate an error condition. |
| [unicode_string](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/unicode_string) | Gets or sets the unicode string.<br/>Contains the string of text rendered by the Glyphs element.<br/>The text is specified as Unicode code points.<br/>If the UnicodeString attribute of the Glyphs element is not specified<br/>or contains an empty value (“” or “{ }”), and if the Indices attribute is not specified<br/>or contains no glyph indices, then a consumer MUST instantiate an error condition. |
| [style_simulations](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/style_simulations) | Gets or sets the style simulations.<br/>Specifies a style simulation.<br/>Valid values are None, ItalicSimulation, BoldSimulation, and BoldItalicSimulation. |
| [render_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/render_transform) | Gets or sets the render transform.<br/>Establishes a new coordinate frame for the glyph run specified by the Glyphs element.<br/>The render transform affects clip, opacity mask, fill, x origin, y origin, the actual shape of individual glyphs,<br/>and the advance widths. The render transform also affects the font size and values specified in the Indices attribute. |
| [clip](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/clip) | Gets or sets the clip.<br/>Limits the rendered region of the element.<br/>Only portions of the Glyphs element that fall within<br/>the clip region (even partially clipped characters) produce marks on the page. |
| [opacity](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/opacity) | Gets or sets the opacity.<br/>Defines the uniform transparency of the glyph element.<br/>Values range from 0 (fully transparent) to 1 (fully opaque),<br/>inclusive.Values outside of this range are invalid. |
| [opacity_mask](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/opacity_mask) | Gets or sets the opacity mask.<br/>Specifies a mask of alpha values that is applied to the glyphs in the same fashion as the Opacity attribute,<br/>but allowing different alpha values for different areas of the element. |
| [name](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/name) | Gets or sets the name.<br/>Contains a string value that identifies the current element as a named,<br/>addressable point in the document for the purpose of hyperlinking. |
| [fixed_page_navigate_uri](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/fixed_page_navigate_uri) | Gets or sets the fixed page navigate uri.<br/>Associates a hyperlink URI with the element.<br/>May be a relative reference or a URI that addresses a resource<br/>that is internal to or external to the package. |
| [language](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs/language) | Gets or sets the language.<br/>Specifies the default language used for the current element and for any child or descendant elements.<br/>The language is specified according to RFC 3066. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
* class [`Glyphs`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/glyphs)
