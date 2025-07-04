---
title: Document.FontSettings
linktitle: FontSettings
articleTitle: FontSettings
second_title: Aspose.Words for .NET
description: Discover how to customize document font settings effortlessly. Enhance your documents with tailored font options for improved readability and style.
type: docs
weight: 150
url: /net/aspose.words/document/fontsettings/
---
## Document.FontSettings property

Gets or sets document font settings.

```csharp
public FontSettings FontSettings { get; set; }
```

## Remarks

This property allows to specify font settings per document. If set to `null`, default static font settings [`DefaultInstance`](../../../aspose.words.fonts/fontsettings/defaultinstance/) will be used.

The default value is `null`.

## Examples

Shows how set font substitution rules.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Name = "Arial";
builder.Writeln("Hello world!");
builder.Font.Name = "Amethysta";
builder.Writeln("The quick brown fox jumps over the lazy dog.");

FontSourceBase[] fontSources = FontSettings.DefaultInstance.GetFontsSources();

// The default font sources contain the first font that the document uses.
Assert.That(fontSources.Length, Is.EqualTo(1));
Assert.That(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arial"), Is.True);

// The second font, "Amethysta", is unavailable.
Assert.That(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Amethysta"), Is.False);

// We can configure a font substitution table which determines
// which fonts Aspose.Words will use as substitutes for unavailable fonts.
// Set two substitution fonts for "Amethysta": "Arvo", and "Courier New".
// If the first substitute is unavailable, Aspose.Words attempts to use the second substitute, and so on.
doc.FontSettings = new FontSettings();
doc.FontSettings.SubstitutionSettings.TableSubstitution.SetSubstitutes(
    "Amethysta", new[] {"Arvo", "Courier New"});

// "Amethysta" is unavailable, and the substitution rule states that the first font to use as a substitute is "Arvo".
Assert.That(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arvo"), Is.False);

// "Arvo" is also unavailable, but "Courier New" is.
Assert.That(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Courier New"), Is.True);

// The output document will display the text that uses the "Amethysta" font formatted with "Courier New".
doc.Save(ArtifactsDir + "FontSettings.TableSubstitution.pdf");
```

### See Also

* class [FontSettings](../../../aspose.words.fonts/fontsettings/)
* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
