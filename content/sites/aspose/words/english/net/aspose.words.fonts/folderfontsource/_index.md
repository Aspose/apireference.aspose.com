---
title: FolderFontSource Class
linktitle: FolderFontSource
articleTitle: FolderFontSource
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fonts.FolderFontSource class, your solution for managing TrueType fonts efficiently. Enhance your document's typography today!
type: docs
weight: 3280
url: /net/aspose.words.fonts/folderfontsource/
---
## FolderFontSource class

Represents the folder that contains TrueType font files.

To learn more, visit the [Working with Fonts](https://docs.aspose.com/words/net/working-with-fonts/) documentation article.

```csharp
public class FolderFontSource : FontSourceBase
```

## Constructors

| Name | Description |
| --- | --- |
| [FolderFontSource](folderfontsource/#constructor)(*string, bool*) | Ctor. |
| [FolderFontSource](folderfontsource/#constructor_1)(*string, bool, int*) | Ctor. |

## Properties

| Name | Description |
| --- | --- |
| [FolderPath](../../aspose.words.fonts/folderfontsource/folderpath/) { get; } | Path to the folder. |
| [Priority](../../aspose.words.fonts/fontsourcebase/priority/) { get; } | Returns the font source priority. |
| [ScanSubfolders](../../aspose.words.fonts/folderfontsource/scansubfolders/) { get; } | Determines whether or not to scan the subfolders. |
| override [Type](../../aspose.words.fonts/folderfontsource/type/) { get; } | Returns the type of the font source. |
| [WarningCallback](../../aspose.words.fonts/fontsourcebase/warningcallback/) { get; set; } | Called during processing of font source when an issue is detected that might result in formatting fidelity loss. |

## Methods

| Name | Description |
| --- | --- |
| [GetAvailableFonts](../../aspose.words.fonts/fontsourcebase/getavailablefonts/)() | Returns list of fonts available via this source. |

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

* class [FontSourceBase](../fontsourcebase/)
* namespace [Aspose.Words.Fonts](../../aspose.words.fonts/)
* assembly [Aspose.Words](../../)
