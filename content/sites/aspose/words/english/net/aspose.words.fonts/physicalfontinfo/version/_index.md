---
title: PhysicalFontInfo.Version
linktitle: Version
articleTitle: Version
second_title: Aspose.Words for .NET
description: Discover the PhysicalFontInfo Version property, easily access the font's version string for enhanced design consistency and improved typography.
type: docs
weight: 50
url: /net/aspose.words.fonts/physicalfontinfo/version/
---
## PhysicalFontInfo.Version property

Version string of the font.

```csharp
public string Version { get; }
```

## Examples

Shows how to list available fonts.

```csharp
// Configure Aspose.Words to source fonts from a custom folder, and then print every available font.
FontSourceBase[] folderFontSource = { new FolderFontSource(FontsDir, true) };

foreach (PhysicalFontInfo fontInfo in folderFontSource[0].GetAvailableFonts())
{
    Console.WriteLine("FontFamilyName : {0}", fontInfo.FontFamilyName);
    Console.WriteLine("FullFontName  : {0}", fontInfo.FullFontName);
    Console.WriteLine("Version  : {0}", fontInfo.Version);
    Console.WriteLine("FilePath : {0}\n", fontInfo.FilePath);
}
```

### See Also

* class [PhysicalFontInfo](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
