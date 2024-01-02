---
title: Class FixedPage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.FixedPage class. The fixed page. The FixedPage element contains the contents of a page and is the root element of a FixedPage part. The fixed page contains the elements that together form the basis for all markings rendered on the page Paths Glyphs and the optional Canvas grouping element
type: docs
weight: 9210
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/
---
## FixedPage class

The fixed page. The FixedPage element contains the contents of a page and is the root element of a FixedPage part. The fixed page contains the elements that together form the basis for all markings rendered on the page: Paths, Glyphs, and the optional Canvas grouping element.

```csharp
public class FixedPage
```

## Constructors

| Name | Description |
| --- | --- |
| [FixedPage](fixedpage/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [BleedBox](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/bleedbox/) { get; set; } | Gets or sets the bleed box. Specifies the union of the ContentBox and the bounding box of all graphical content intended to appear on the final printed and trimmed page. Contains a list of four coordinate values (BleedOriginX, BleedOriginY, BleedWidth, BleedHeight), expressed as comma-separated real numbers.If omitted, the default value is (0,0, Width, Height). |
| [ContentBox](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/contentbox/) { get; set; } | Gets or sets the content box. Specifies the area of the page containing image content that is to be fit within the image area when printing or viewing.Contains a list of four coordinate values(ContentOriginX, ContentOriginY, ContentWidth, ContentHeight), expressed as comma-separated real numbers.Specifying a value is RECOMMENDED. If omitted, the default value is (0,0,Width,Height). |
| [FixedPageResources](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/fixedpageresources/) { get; set; } | Gets or sets the fixed page resources. Fixed page markup supports the use of resources. A resource is a reusable property value that is expressed in markup, identified by a key, and stored in a resource dictionary. In general, any property value that can be expressed using property element syntax can be held in a resource dictionary. |
| [Height](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/height/) { get; set; } | Gets or sets the height. Height of the page, expressed as a real number in units of the effective coordinate space. |
| [Items](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/items/) { get; set; } | Gets or sets the elements array. The fixed page contains the elements that together form the basis for all markings rendered on the page: Paths, Glyphs, and the optional Canvas grouping element. |
| [Language](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/language/) { get; set; } | Gets or sets the language. Specifies the default language used for the current element and for any child or descendant elements. The language is specified according to RFC 3066. |
| [Name](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/name/) { get; set; } | Gets or sets the name. Contains a string value that identifies the current element as a named, addressable point in the document for the purpose of hyperlinking. |
| [Width](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/fixedpage/width/) { get; set; } | Gets or sets the width. Width of the page, expressed as a real number in units of the effective coordinate space. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


