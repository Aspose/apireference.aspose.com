---
title: FixedPage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/
is_root: false
---

## FixedPage class

The fixed page.
The FixedPage element contains the contents of a page and is the root element of a FixedPage part.
The fixed page contains the elements that together form the basis for all markings rendered on the page: Paths, Glyphs,
and the optional Canvas grouping element.



The FixedPage type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/__init__/#) | Constructs a new instance of FixedPage |


### Properties
| Property | Description |
| :- | :- |
| [fixed_page_resources](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/fixed_page_resources) | Gets or sets the fixed page resources.<br/>Fixed page markup supports the use of resources.<br/>A resource is a reusable property value that is expressed in markup, identified by a key, and stored in a resource dictionary.<br/>In general, any property value that can be expressed using property element syntax can be held in a resource dictionary. |
| [items](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/items) | Gets or sets the elements array.<br/>The fixed page contains the elements that together form the basis for all markings rendered on the page: Paths, Glyphs,<br/>and the optional Canvas grouping element. |
| [width](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/width) | Gets or sets the width.<br/>Width of the page, expressed as a real number<br/>in units of the effective coordinate space. |
| [height](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/height) | Gets or sets the height.<br/>Height of the page, expressed as a real number<br/>in units of the effective coordinate space. |
| [content_box](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/content_box) | Gets or sets the content box.<br/>Specifies the area of the page containing image content that is to be fit within the image area<br/>when printing or viewing.Contains a list of four coordinate values(ContentOriginX, ContentOriginY,  ContentWidth, ContentHeight),<br/>expressed as  comma-separated real numbers.Specifying a value is RECOMMENDED. If omitted, the default  value is (0,0,Width,Height). |
| [bleed_box](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/bleed_box) | Gets or sets the bleed box.<br/>Specifies the union of the ContentBox and the bounding box of all graphical content intended to appear on the final printed<br/>and trimmed page. Contains a list of four coordinate values (BleedOriginX, BleedOriginY, BleedWidth, BleedHeight),<br/>expressed as comma-separated real numbers.If omitted, the default value is (0,0, Width, Height). |
| [language](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/language) | Gets or sets the language.<br/>Specifies the default language used for the current element and for any child or descendant elements.<br/>The language is specified according to RFC 3066. |
| [name](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/name) | Gets or sets the name.<br/>Contains a string value that identifies the current element as a named,<br/>addressable point in the document for the purpose of hyperlinking. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
