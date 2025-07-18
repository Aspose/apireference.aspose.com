---
title: Class HtmlLoadOptions
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.HtmlLoadOptions class. Represents options for loading/importing html file into pdf document
type: docs
weight: 5660
url: /net/aspose.pdf/htmlloadoptions/
---
## HtmlLoadOptions class

Represents options for loading/importing html file into pdf document.

```csharp
public sealed class HtmlLoadOptions : LoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [HtmlLoadOptions](htmlloadoptions/#constructor)() | Creates load options for converting html into pdf document with empty base path. |
| [HtmlLoadOptions](htmlloadoptions/#constructor_1)(string) | Creates load options for converting html into pdf document with defined base path. |

## Properties

| Name | Description |
| --- | --- |
| [BasePath](../../aspose.pdf/htmlloadoptions/basepath/) { get; } | The base path/url for the html file. |
| [DisableFontLicenseVerifications](../../aspose.pdf/loadoptions/disablefontlicenseverifications/) { get; set; } | Gets or sets flag to disable any license restrictions for all fonts while loading the file. When `true`, allows to execute operations with font that are prohibited by a license of this font, for example allows to embed a font into a PDF document even if license rules disable embedding for this font. By default `false`. |
| [HtmlMediaType](../../aspose.pdf/htmlloadoptions/htmlmediatype/) { get; set; } | Gets or sets possible media types used during rendering. |
| [InputEncoding](../../aspose.pdf/htmlloadoptions/inputencoding/) { get; set; } | Gets or sets the attribute specifying the encoding used for this document at the time of the parsing. If this attribute is null the encoding will determine from document character set atribute. |
| [IsEmbedFonts](../../aspose.pdf/htmlloadoptions/isembedfonts/) { get; set; } | Gets or sets fonts embedding to result document |
| [IsPriorityCssPageRule](../../aspose.pdf/htmlloadoptions/isprioritycsspagerule/) { get; set; } | Gets or sets the flag that specifies that @page rules defined in css will override values defined in PageInfo. |
| [IsRenderToSinglePage](../../aspose.pdf/htmlloadoptions/isrendertosinglepage/) { get; set; } | Gets or sets rendering all document to single page |
| [LoadFormat](../../aspose.pdf/loadoptions/loadformat/) { get; } | Represents file format which [`LoadOptions`](../loadoptions/) describes. |
| [PageInfo](../../aspose.pdf/htmlloadoptions/pageinfo/) { get; set; } | Gets or sets document page info |
| [PageLayoutOption](../../aspose.pdf/htmlloadoptions/pagelayoutoption/) { get; set; } | Gets or sets layout option. |
| [WarningHandler](../../aspose.pdf/loadoptions/warninghandler/) { get; set; } | Callback to handle any warnings generated. The WarningHandler returns ReturnAction enum item specifying either Continue or Abort. Continue is the default action and the Load operation continues, however the user may also return Abort in which case the Load operation should cease. |

## Fields

| Name | Description |
| --- | --- |
| [CustomLoaderOfExternalResources](../../aspose.pdf/htmlloadoptions/customloaderofexternalresources/) | Sometimes it's necessary to avoid usage of internal loader of external resources(like images or CSSes) and supply custom method that will get requested resources from somewhere. For example, during usage of Aspose.PDF in cloude direct access to referenced files impossible: in such case some custome code put into special method should be used, and delegate that refers that method should be assygned to this attribute. |
| [ExternalResourcesCredentials](../../aspose.pdf/htmlloadoptions/externalresourcescredentials/) | If loading of external data referenced in HTML requirs credentials, You can put them into this parameter - they will be used during loading of external resources |

## Examples

The following example shows how to convert HTML file to PDF file

```csharp
[C#]
	// The path to the documents directory.
	string dataDir = @"YOUR_DATA_DIRECTORY";

	// The path to your HTML File.
	string htmlFile = Path.Combine(dataDir, "HTML-to-PDF.html");

	// The path to output PDF File.
	string pdfFile = Path.Combine(dataDir, "HTML-to-PDF.pdf");

	// Initialize HtmlLoadOptions	
	HtmlLoadOptions htmlLoadOptions = new HtmlLoadOptions();
		
	using (Document pdfDocument = new Document(htmlFile, htmlLoadOptions))
	{ 
		// Save PDF file
		pdfDocument.Save(pdfFile);
	}
```

```csharp
[VB.NET]

    ' The path to the documents directory.
    Dim dataDir As String = "YOUR_DATA_DIRECTORY"

    ' The path to your HTML File.
    Dim htmlFile = Path.Combine(dataDir, "HTML-to-PDF.html")

    ' The path to output PDF File.
    Dim pdfFile = Path.Combine(dataDir, "HTML-to-PDF.pdf")
 
    ' Initialize HtmlLoadOptions    
    Dim htmlLoadOptions As HtmlLoadOptions = New HtmlLoadOptions()
 
    Using pdfDocument As Document = New Document(htmlFile, htmlLoadOptions)
 
        ' Save PDF file
        pdfDocument.Save(pdfFile)
    End Using
```

### See Also

* class [LoadOptions](../loadoptions/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


