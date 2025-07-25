---
title: FontFallbackSettings.LoadNotoFallbackSettings
linktitle: LoadNotoFallbackSettings
articleTitle: LoadNotoFallbackSettings
second_title: Aspose.Words for .NET
description: Discover how to enhance your typography with the FontFallbackSettings LoadNotoFallbackSettings method, using Google Noto fonts for seamless text display.
type: docs
weight: 40
url: /net/aspose.words.fonts/fontfallbacksettings/loadnotofallbacksettings/
---
## FontFallbackSettings.LoadNotoFallbackSettings method

Loads predefined fallback settings which uses Google Noto fonts.

```csharp
public void LoadNotoFallbackSettings()
```

## Examples

Shows how to add predefined font fallback settings for Google Noto fonts.

```csharp
FontSettings fontSettings = new FontSettings();

// These are free fonts licensed under the SIL Open Font License.
// We can download the fonts here:
// https://www.google.com/get/noto/#sans-lgc
fontSettings.SetFontsFolder(FontsDir + "Noto", false);

// Note that the predefined settings only use Sans-style Noto fonts with regular weight.
// Some of the Noto fonts use advanced typography features.
// Fonts featuring advanced typography may not be rendered correctly as Aspose.Words currently do not support them.
fontSettings.FallbackSettings.LoadNotoFallbackSettings();
fontSettings.SubstitutionSettings.FontInfoSubstitution.Enabled = false;
fontSettings.SubstitutionSettings.DefaultFontSubstitution.DefaultFontName = "Noto Sans";

Document doc = new Document();
doc.FontSettings = fontSettings;
```

Shows how to load pre-defined fallback font settings.

```csharp
Document doc = new Document();

FontSettings fontSettings = new FontSettings();
doc.FontSettings = fontSettings;
FontFallbackSettings fontFallbackSettings = fontSettings.FallbackSettings;

// Save the default fallback font scheme to an XML document.
// For example, one of the elements has a value of "0C00-0C7F" for Range and a corresponding "Vani" value for FallbackFonts.
// This means that if the font some text is using does not have symbols for the 0x0C00-0x0C7F Unicode block,
// the fallback scheme will use symbols from the "Vani" font substitute.
fontFallbackSettings.Save(ArtifactsDir + "FontSettings.FallbackSettings.Default.xml");

// Below are two pre-defined font fallback schemes we can choose from.
// 1 -  Use the default Microsoft Office scheme, which is the same one as the default:
fontFallbackSettings.LoadMsOfficeFallbackSettings();
fontFallbackSettings.Save(ArtifactsDir + "FontSettings.FallbackSettings.LoadMsOfficeFallbackSettings.xml");

// 2 -  Use the scheme built from Google Noto fonts:
fontFallbackSettings.LoadNotoFallbackSettings();
fontFallbackSettings.Save(ArtifactsDir + "FontSettings.FallbackSettings.LoadNotoFallbackSettings.xml");
```

### See Also

* class [FontFallbackSettings](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
