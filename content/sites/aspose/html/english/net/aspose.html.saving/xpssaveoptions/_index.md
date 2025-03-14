---
title: XpsSaveOptions Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Saving.XpsSaveOptions class. Specific options data class provides few properties to manage conversion result. For example PageSetup specifies page characteristics. Refer to documentation article
type: docs
weight: 4990
url: /net/aspose.html.saving/xpssaveoptions/
---
## XpsSaveOptions class

Specific options data class provides few properties to manage conversion result. For example [`PageSetup`](../../aspose.html.rendering/pagesetup/) specifies page characteristics. Refer to documentation [article](https://docs.aspose.com/html/net/converting-between-formats/html-to-xps/#save-options).

```csharp
public class XpsSaveOptions : XpsRenderingOptions
```

## Public Members
## Constructors

| Name | Description |
| --- | --- |
| [XpsSaveOptions](xpssaveoptions/)() | The default constructor. |

## Public Members
## Properties

| Name | Description |
| --- | --- |
| [BackgroundColor](../../aspose.html.rendering/renderingoptions/backgroundcolor/) { get; set; } | Gets or sets Color which will fill background of every page. Default value is Transparent. |
| [Css](../../aspose.html.rendering/renderingoptions/css/) { get; } | Gets a [`CssOptions`](../../aspose.html.rendering/cssoptions/) object which is used for configuration of css properties processing. |
| virtual [HorizontalResolution](../../aspose.html.rendering/renderingoptions/horizontalresolution/) { get; set; } | Sets or gets horizontal resolution for internal (which are used during filters processing) images, in pixels per inch. By default this property is 300 dpi. |
| [PageSetup](../../aspose.html.rendering/renderingoptions/pagesetup/) { get; } | Gets a page setup object is used for configuration output page-set. |
| virtual [VerticalResolution](../../aspose.html.rendering/renderingoptions/verticalresolution/) { get; set; } | Sets or gets vertical resolution for internal (which are used during filters processing) images, in pixels per inch. By default this property is 300 dpi. |

## Remarks

You can find complete examples and data files on [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation/tree/main/content/tests-net).

## Examples

```csharp
using Aspose.Html;
using Aspose.Html.Converters;
using Aspose.Html.Saving;
using System;
...
	  string documentPath = Path.Combine(OutputDir, "save-options.html");
      string savePath = Path.Combine(OutputDir, "save-options-output.xps");

      // Prepare HTML code and save it to a file
      var code = "<h1> XpsSaveOptions Class</h1>\r\n" +
            "<p>Using XpsSaveOptions Class, you can programmatically apply a wide range of conversion parameters such as BackgroundColor, PageSetup, etc.</p>\r\n";

      File.WriteAllText(documentPath, code);

      // Initialize an HTML Document from the html file
      using var document = new HTMLDocument(documentPath);
       
      // Set up the page-size, margins and change the background color to AntiqueWhite
      var options = new XpsSaveOptions()
      {
        BackgroundColor = Color.AntiqueWhite
      };
      options.PageSetup.AnyPage = new Page(new Aspose.Html.Drawing.Size(Length.FromInches(4.9f), Length.FromInches(3.5f)), new Margin(30, 20, 10, 10));

      // Convert HTML to XPS
      Converter.ConvertHTML(document, options, savePath); 
```

### See Also

* class [XpsRenderingOptions](../../aspose.html.rendering.xps/xpsrenderingoptions/)
* namespace [Aspose.Html.Saving](../../aspose.html.saving/)
* assembly [Aspose.HTML](../../)
