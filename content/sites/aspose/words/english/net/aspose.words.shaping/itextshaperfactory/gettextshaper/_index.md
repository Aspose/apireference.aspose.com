---
title: ITextShaperFactory.GetTextShaper
linktitle: GetTextShaper
articleTitle: GetTextShaper
second_title: Aspose.Words for .NET
description: Discover the ITextShaperFactory GetTextShaper method to create a custom text shaper for your specific font needs, enhancing your text rendering experience.
type: docs
weight: 10
url: /net/aspose.words.shaping/itextshaperfactory/gettextshaper/
---
## GetTextShaper(*string, int*) {#gettextshaper_1}

Returns new instance of a text shaper for the font specified by *fontPath* and *faceIndex*.

```csharp
public ITextShaper GetTextShaper(string fontPath, int faceIndex)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fontPath | String | An absolute path to the font file. |
| faceIndex | Int32 | An index of the font face in the TrueType font collection, or 0 if specified font file is not TrueType font collection. |

### See Also

* interface [ITextShaper](../../itextshaper/)
* interface [ITextShaperFactory](../)
* namespace [Aspose.Words.Shaping](../../../aspose.words.shaping/)
* assembly [Aspose.Words](../../../)

---

## GetTextShaper(*string, byte[], int*) {#gettextshaper}

Returns new instance of a text shaper for the font represented by *fontBlob* and *faceIndex*.

```csharp
public ITextShaper GetTextShaper(string fontId, byte[] fontBlob, int faceIndex)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fontId | String | A unique identifier that can be uniquely associated with the provided font *fontBlob*. |
| fontBlob | Byte[] | Byte array with the font data. |
| faceIndex | Int32 | An index of the font face in the TrueType font collection, or 0 if *fontBlob* is not TrueType font collection. |

### See Also

* interface [ITextShaper](../../itextshaper/)
* interface [ITextShaperFactory](../)
* namespace [Aspose.Words.Shaping](../../../aspose.words.shaping/)
* assembly [Aspose.Words](../../../)
