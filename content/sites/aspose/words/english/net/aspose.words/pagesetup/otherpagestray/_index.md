---
title: PageSetup.OtherPagesTray
linktitle: OtherPagesTray
articleTitle: OtherPagesTray
second_title: Aspose.Words for .NET
description: Discover the PageSetup OtherPagesTray property to easily customize paper tray settings for your printer. Optimize printing efficiency for every section!
type: docs
weight: 300
url: /net/aspose.words/pagesetup/otherpagestray/
---
## PageSetup.OtherPagesTray property

Gets or sets the paper tray (bin) to be used for all but the first page of a section. The value is implementation (printer) specific.

```csharp
public int OtherPagesTray { get; set; }
```

## Examples

Shows how to get all the sections in a document to use the default paper tray of the selected printer.

```csharp
Document doc = new Document();

// Find the default printer that we will use for printing this document.
// You can define a specific printer using the "PrinterName" property of the PrinterSettings object.
PrinterSettings settings = new PrinterSettings();

// The paper tray value stored in documents is printer specific.
// This means the code below resets all page tray values to use the current printers default tray.
// You can enumerate PrinterSettings.PaperSources to find the other valid paper tray values of the selected printer.
foreach (Section section in doc.Sections.OfType<Section>())
{
    section.PageSetup.FirstPageTray = settings.DefaultPageSettings.PaperSource.RawKind;
    section.PageSetup.OtherPagesTray = settings.DefaultPageSettings.PaperSource.RawKind;
}
```

Shows how to set up printing using different printer trays for different paper sizes.

```csharp
Document doc = new Document();

// Find the default printer that we will use for printing this document.
// You can define a specific printer using the "PrinterName" property of the PrinterSettings object.
PrinterSettings settings = new PrinterSettings();

// This is the tray we will use for pages in the "A4" paper size.
int printerTrayForA4 = settings.PaperSources[0].RawKind;

// This is the tray we will use for pages in the "Letter" paper size.
int printerTrayForLetter = settings.PaperSources[1].RawKind;

// Modify the PageSettings object of this section to get Microsoft Word to instruct the printer
// to use one of the trays we identified above, depending on this section's paper size.
foreach (Section section in doc.Sections.OfType<Section>())
{
    if (section.PageSetup.PaperSize == Aspose.Words.PaperSize.Letter)
    {
        section.PageSetup.FirstPageTray = printerTrayForLetter;
        section.PageSetup.OtherPagesTray = printerTrayForLetter;
    }
    else if (section.PageSetup.PaperSize == Aspose.Words.PaperSize.A4)
    {
        section.PageSetup.FirstPageTray = printerTrayForA4;
        section.PageSetup.OtherPagesTray = printerTrayForA4;
    }
}
```

### See Also

* class [PageSetup](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
