---
title: DefaultFontSubstitutionRule.DefaultFontName
linktitle: DefaultFontName
articleTitle: DefaultFontName
second_title: Aspose.Words for .NET
description: Discover how to easily manage the DefaultFontSubstitutionRule and customize your default font name for enhanced design flexibility.
type: docs
weight: 10
url: /net/aspose.words.fonts/defaultfontsubstitutionrule/defaultfontname/
---
## DefaultFontSubstitutionRule.DefaultFontName property

Gets or sets the default font name.

```csharp
public string DefaultFontName { get; set; }
```

## Remarks

The default value is 'Times New Roman'.

## Examples

Shows how to set the default font substitution rule.

```csharp
Document doc = new Document();
FontSettings fontSettings = new FontSettings();
doc.FontSettings = fontSettings;

// Get the default substitution rule within FontSettings.
// This rule will substitute all missing fonts with "Times New Roman".
DefaultFontSubstitutionRule defaultFontSubstitutionRule =
    fontSettings.SubstitutionSettings.DefaultFontSubstitution;
Assert.True(defaultFontSubstitutionRule.Enabled);
Assert.AreEqual("Times New Roman", defaultFontSubstitutionRule.DefaultFontName);

// Set the default font substitute to "Courier New".
defaultFontSubstitutionRule.DefaultFontName = "Courier New";

// Using a document builder, add some text in a font that we do not have to see the substitution take place,
// and then render the result in a PDF.
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Name = "Missing Font";
builder.Writeln("Line written in a missing font, which will be substituted with Courier New.");

doc.Save(ArtifactsDir + "FontSettings.DefaultFontSubstitutionRule.pdf");
```

Shows how to specify a default font.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Name = "Arial";
builder.Writeln("Hello world!");
builder.Font.Name = "Arvo";
builder.Writeln("The quick brown fox jumps over the lazy dog.");

FontSourceBase[] fontSources = FontSettings.DefaultInstance.GetFontsSources();

// The font sources that the document uses contain the font "Arial", but not "Arvo".
Assert.AreEqual(1, fontSources.Length);
Assert.True(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arial"));
Assert.False(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arvo"));

// Set the "DefaultFontName" property to "Courier New" to,
// while rendering the document, apply that font in all cases when another font is not available. 
FontSettings.DefaultInstance.SubstitutionSettings.DefaultFontSubstitution.DefaultFontName = "Courier New";

Assert.True(fontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Courier New"));

// Aspose.Words will now use the default font in place of any missing fonts during any rendering calls.
doc.Save(ArtifactsDir + "FontSettings.DefaultFontName.pdf");
```

### See Also

* class [DefaultFontSubstitutionRule](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
