---
title: StreamFontSource.CacheKey
linktitle: CacheKey
articleTitle: CacheKey
second_title: Aspose.Words for .NET
description: Discover the StreamFontSource CacheKey property, optimize your font management with efficient caching for faster load times and enhanced performance.
type: docs
weight: 10
url: /net/aspose.words.fonts/streamfontsource/cachekey/
---
## StreamFontSource.CacheKey property

The key of this source in the cache.

```csharp
public string CacheKey { get; }
```

## Remarks

This key is used to identify cache item when saving/loading font search cache with [`SaveSearchCache`](../../fontsettings/savesearchcache/) and [`SetFontsSources`](../../fontsettings/setfontssources/) methods.

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

* class [StreamFontSource](../)
* namespace [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* assembly [Aspose.Words](../../../)
