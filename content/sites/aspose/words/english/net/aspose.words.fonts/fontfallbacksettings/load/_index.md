---
title: FontFallbackSettings.Load
linktitle: Load
articleTitle: Load
second_title: Aspose.Words for .NET
description: Effortlessly load and manage font fallback settings from XML files with the FontFallbackSettings Load method for seamless typography integration.
type: docs
weight: 20
url: /net/aspose.words.fonts/fontfallbacksettings/load/
---
## Load(*string*) {#load_1}

Loads font fallback settings from XML file.

```csharp
public void Load(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | Input file name. |

## Examples

Shows how to load and save font fallback settings to/from an XML document in the local file system.

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

// Load an XML document that defines a set of font fallback settings.
FontSettings fontSettings = new FontSettings();
fontSettings.FallbackSettings.Load(MyDir + "Font fallback rules.xml");

doc.FontSettings = fontSettings;
doc.Save(ArtifactsDir + "FontSettings.LoadFontFallbackSettingsFromFile.pdf");

// Save our document's current font fallback settings as an XML document.
doc.FontSettings.FallbackSettings.Save(ArtifactsDir + "FallbackSettings.xml");
```

### See Also

* class [FontFallbackSettings](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)

---

## Load(*Stream*) {#load}

Loads fallback settings from XML stream.

```csharp
public void Load(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Input stream. |

## Examples

Shows how to load and save font fallback settings to/from a stream.

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

// Load an XML document that defines a set of font fallback settings.
using (FileStream fontFallbackStream = new FileStream(MyDir + "Font fallback rules.xml", FileMode.Open))
{
    FontSettings fontSettings = new FontSettings();
    fontSettings.FallbackSettings.Load(fontFallbackStream);

    doc.FontSettings = fontSettings;
}

doc.Save(ArtifactsDir + "FontSettings.LoadFontFallbackSettingsFromStream.pdf");

// Use a stream to save our document's current font fallback settings as an XML document.
using (FileStream fontFallbackStream =
    new FileStream(ArtifactsDir + "FallbackSettings.xml", FileMode.Create))
{
    doc.FontSettings.FallbackSettings.Save(fontFallbackStream);
}
```

### See Also

* class [FontFallbackSettings](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
