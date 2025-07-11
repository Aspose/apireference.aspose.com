---
title: FolderFontSource.FolderPath
linktitle: FolderPath
articleTitle: FolderPath
second_title: Aspose.Words for .NET
description: Discover the FolderFontSource FolderPath property for easy access to your font folder. Streamline your design workflow today!
type: docs
weight: 20
url: /net/aspose.words.fonts/folderfontsource/folderpath/
---
## FolderFontSource.FolderPath property

Path to the folder.

```csharp
public string FolderPath { get; }
```

## Examples

Shows how to use a local system folder which contains fonts as a font source.

```csharp
// Create a font source from a folder that contains font files.
FolderFontSource folderFontSource = new FolderFontSource(FontsDir, false, 1);

Document doc = new Document();
doc.FontSettings = new FontSettings();
doc.FontSettings.SetFontsSources(new FontSourceBase[] {folderFontSource});

Assert.That(folderFontSource.FolderPath, Is.EqualTo(FontsDir));
Assert.That(folderFontSource.ScanSubfolders, Is.EqualTo(false));
Assert.That(folderFontSource.Type, Is.EqualTo(FontSourceType.FontsFolder));
Assert.That(folderFontSource.Priority, Is.EqualTo(1));
```

### See Also

* class [FolderFontSource](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
