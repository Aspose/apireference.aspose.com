---
title: Class MhtLoadOptions
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.MhtLoadOptions class. Represents options for loading/importing of .mhtfile into pdf document
type: docs
weight: 7110
url: /net/aspose.pdf/mhtloadoptions/
---
## MhtLoadOptions class

Represents options for loading/importing of .mht-file into pdf document.

```csharp
public sealed class MhtLoadOptions : LoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [MhtLoadOptions](mhtloadoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [DisableFontLicenseVerifications](../../aspose.pdf/loadoptions/disablefontlicenseverifications/) { get; set; } | Gets or sets flag to disable any license restrictions for all fonts while loading the file. When `true`, allows to execute operations with font that are prohibited by a license of this font, for example allows to embed a font into a PDF document even if license rules disable embedding for this font. By default `false`. |
| [LoadFormat](../../aspose.pdf/loadoptions/loadformat/) { get; } | Represents file format which [`LoadOptions`](../loadoptions/) describes. |
| [PageInfo](../../aspose.pdf/mhtloadoptions/pageinfo/) { get; } | Gets or sets document page info |
| [WarningHandler](../../aspose.pdf/loadoptions/warninghandler/) { get; set; } | Callback to handle any warnings generated. The WarningHandler returns ReturnAction enum item specifying either Continue or Abort. Continue is the default action and the Load operation continues, however the user may also return Abort in which case the Load operation should cease. |

## Examples

The following example shows how to convert MHT file to PDF file

```csharp
[C#]
	// The path to the documents directory.
	string dataDir = @"YOUR_DATA_DIRECTORY";

	// The path to your MHT File.
	string mhtFile = Path.Combine(dataDir, "MHT-to-PDF.mht");

	// The path to output PDF File.
	string pdfFile = Path.Combine(dataDir, "MHT-to-PDF.pdf");

	// Initialize MhtLoadOptions	
	MhtLoadOptions mhtLoadOptions = new MhtLoadOptions();
		
	using (Document pdfDocument = new Document(mhtFile, mhtLoadOptions))
	{
	 
		// Save PDF file
		pdfDocument.Save(pdfFile);
	}
```

```csharp
[VB.NET]

    ' The path to the documents directory.
    Dim dataDir As String = "YOUR_DATA_DIRECTORY"

    ' The path to your MHT File.
    Dim mhtFile = Path.Combine(dataDir, "MHT-to-PDF.mht")

    ' The path to output PDF File.
    Dim pdfFile = Path.Combine(dataDir, "MHT-to-PDF.pdf")
 
    ' Initialize MhtLoadOptions
    Dim mhtLoadOptions As MhtLoadOptions = New MhtLoadOptions()
 
    Using pdfDocument As Document = New Document(mhtFile, mhtLoadOptions)
 
        ' Save PDF file
        pdfDocument.Save(pdfFile)
    End Using
```
	
### See Also

* class [LoadOptions](../loadoptions/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


