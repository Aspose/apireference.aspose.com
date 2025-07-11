---
title: FontSettings.SetFontsSources
linktitle: SetFontsSources
articleTitle: SetFontsSources
second_title: Aspose.Words for .NET
description: Discover how the SetFontsSources method in Aspose.Words enhances document rendering by specifying TrueType font sources for optimal results.
type: docs
weight: 100
url: /net/aspose.words.fonts/fontsettings/setfontssources/
---
## SetFontsSources(*FontSourceBase[]*) {#setfontssources}

Sets the sources where Aspose.Words looks for TrueType fonts when rendering documents or embedding fonts.

```csharp
public void SetFontsSources(FontSourceBase[] sources)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sources | FontSourceBase[] | An array of sources that contain TrueType fonts. |

## Remarks

By default, Aspose.Words looks for fonts installed to the system.

Setting this property resets the cache of all previously loaded fonts.

## Examples

Shows how to add a font source to our existing font sources.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Name = "Arial";
builder.Writeln("Hello world!");
builder.Font.Name = "Amethysta";
builder.Writeln("The quick brown fox jumps over the lazy dog.");
builder.Font.Name = "Junction Light";
builder.Writeln("The quick brown fox jumps over the lazy dog.");

FontSourceBase[] originalFontSources = FontSettings.DefaultInstance.GetFontsSources();

Assert.That(originalFontSources.Length, Is.EqualTo(1));

Assert.That(originalFontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arial"), Is.True);

// The default font source is missing two of the fonts that we are using in our document.
// When we save this document, Aspose.Words will apply fallback fonts to all text formatted with inaccessible fonts.
Assert.That(originalFontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Amethysta"), Is.False);
Assert.That(originalFontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Junction Light"), Is.False);

// Create a font source from a folder that contains fonts.
FolderFontSource folderFontSource = new FolderFontSource(FontsDir, true);

// Apply a new array of font sources that contains the original font sources, as well as our custom fonts.
FontSourceBase[] updatedFontSources = {originalFontSources[0], folderFontSource};
FontSettings.DefaultInstance.SetFontsSources(updatedFontSources);

// Verify that Aspose.Words has access to all required fonts before we render the document to PDF.
updatedFontSources = FontSettings.DefaultInstance.GetFontsSources();

Assert.That(updatedFontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arial"), Is.True);
Assert.That(updatedFontSources[1].GetAvailableFonts().Any(f => f.FullFontName == "Amethysta"), Is.True);
Assert.That(updatedFontSources[1].GetAvailableFonts().Any(f => f.FullFontName == "Junction Light"), Is.True);

doc.Save(ArtifactsDir + "FontSettings.AddFontSource.pdf");

// Restore the original font sources.
FontSettings.DefaultInstance.SetFontsSources(originalFontSources);
```

### See Also

* class [FontSourceBase](../../fontsourcebase/)
* class [FontSettings](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)

---

## SetFontsSources(*FontSourceBase[], Stream*) {#setfontssources_1}

Sets the sources where Aspose.Words looks for TrueType fonts and additionally loads previously saved font search cache.

```csharp
public void SetFontsSources(FontSourceBase[] sources, Stream cacheInputStream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sources | FontSourceBase[] | An array of sources that contain TrueType fonts. |
| cacheInputStream | Stream | Input stream with saved font search cache. |

## Remarks

Loading previously saved font search cache will speed up the font cache initialization process. It is especially useful when access to font sources is complicated (e.g. when fonts are loaded via network).

When saving and loading font search cache, fonts in the provided sources are identified via cache key. For the fonts in the [`SystemFontSource`](../../systemfontsource/) and [`FolderFontSource`](../../folderfontsource/) cache key is the path to the font file. For [`MemoryFontSource`](../../memoryfontsource/) and [`StreamFontSource`](../../streamfontsource/) cache key is defined in the [`CacheKey`](../../memoryfontsource/cachekey/) and [`CacheKey`](../../streamfontsource/cachekey/) properties respectively. For the [`FileFontSource`](../../filefontsource/) cache key is either [`CacheKey`](../../filefontsource/cachekey/) property or a file path if the [`CacheKey`](../../filefontsource/cachekey/) is `null`.

It is highly recommended to provide the same font sources when loading cache as at the time the cache was saved. Any changes in the font sources (e.g. adding new fonts, moving font files or changing the cache key) may lead to the inaccurate font resolving by Aspose.Words.

## Examples

Shows how to speed up the font cache initialization process.

```csharp
public void LoadFontSearchCache()
{
    const string cacheKey1 = "Arvo";
    const string cacheKey2 = "Arvo-Bold";
    FontSettings parsedFonts = new FontSettings();
    FontSettings loadedCache = new FontSettings();

    parsedFonts.SetFontsSources(new FontSourceBase[]
    {
        new FileFontSource(FontsDir + "Arvo-Regular.ttf", 0, cacheKey1),
        new FileFontSource(FontsDir + "Arvo-Bold.ttf", 0, cacheKey2)
    });

    using (MemoryStream cacheStream = new MemoryStream())
    {
        parsedFonts.SaveSearchCache(cacheStream);
        loadedCache.SetFontsSources(new FontSourceBase[]
        {
            new SearchCacheStream(cacheKey1),
            new MemoryFontSource(File.ReadAllBytes(FontsDir + "Arvo-Bold.ttf"), 0, cacheKey2)
        }, cacheStream);
    }

    Assert.That(loadedCache.GetFontsSources().Length, Is.EqualTo(parsedFonts.GetFontsSources().Length));
}

/// <summary>
/// Load the font data only when required instead of storing it in the memory
/// for the entire lifetime of the "FontSettings" object.
/// </summary>
private class SearchCacheStream : StreamFontSource
{
    public SearchCacheStream(string cacheKey):base(0, cacheKey)
    {
    }

    public override Stream OpenFontDataStream()
    {
        return File.OpenRead(FontsDir + "Arvo-Regular.ttf");
    }
}
```

### See Also

* class [FontSourceBase](../../fontsourcebase/)
* class [FontSettings](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
