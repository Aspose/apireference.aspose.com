---
title: Class TextSearchOptions
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Text.TextSearchOptions class. Represents text search options
type: docs
weight: 11230
url: /net/aspose.pdf.text/textsearchoptions/
---
## TextSearchOptions class

Represents text search options

```csharp
public sealed class TextSearchOptions : TextOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [TextSearchOptions](textsearchoptions/#constructor_2)(bool) | Initializes new instance of the `TextSearchOptions` object. Specifies regular expression usage mode. |
| [TextSearchOptions](textsearchoptions/#constructor)(Rectangle) | Initializes new instance of the `TextSearchOptions` object. Specifies rectangle that delimits the searched text. |
| [TextSearchOptions](textsearchoptions/#constructor_1)(Rectangle, bool) | Initializes new instance of the `TextSearchOptions` object. Specifies rectangle that delimits the searched text and regular expression usage mode. |

## Properties

| Name | Description |
| --- | --- |
| [IgnoreResourceFontErrors](../../aspose.pdf.text/textsearchoptions/ignoreresourcefonterrors/) { get; set; } | Gets or sets indication that errors related to absence of font will be ignored by text (fragment) absorber. true - means that errors of absence of font will be ignored. Text segments that refer to incorrect resources will be skipped during processing. false (default) - absence of font error will terminate processing by throwing exception. |
| [IgnoreShadowText](../../aspose.pdf.text/textsearchoptions/ignoreshadowtext/) { get; set; } | Gets or sets indication that text fragments representing shadow of normal text will be ignored during search. true - means that shadow text will not be found (try this if text search returns duplicated fragments on the close positions) false - means that shadow text will be found as well as normal text (default value) |
| [IsRegularExpressionUsed](../../aspose.pdf.text/textsearchoptions/isregularexpressionused/) { get; set; } | Gets or sets indication that regular expression is used. |
| [LimitToPageBounds](../../aspose.pdf.text/textsearchoptions/limittopagebounds/) { get; set; } | Gets or sets indication that text is searched within the page bounds. |
| [LogTextExtractionErrors](../../aspose.pdf.text/textsearchoptions/logtextextractionerrors/) { get; set; } | Gets or sets indication that text extraction (decoding) errors will be logged in the text (fragment) absorber. true - means that text extraction (decoding) errors will be loged. It may decrease performance. false (default) - no error loging. |
| [Rectangle](../../aspose.pdf.text/textsearchoptions/rectangle/) { get; set; } | Gets or sets rectangle that bounds the searched text. |
| [SearchForTextRelatedGraphics](../../aspose.pdf.text/textsearchoptions/searchfortextrelatedgraphics/) { get; set; } | Gets or sets value that permits searching for text related graphics (underlining, background etc.) during text search. true - searching for text related graphics will be performed (default value). false - graphic elements that may present in source document will be ignored. Set this in case of performance issues or no need to handle underlining, background, or clipping. |
| [SearchInAnnotations](../../aspose.pdf.text/textsearchoptions/searchinannotations/) { get; set; } | Gets or sets value that permits searching for text in Annotations. true - text will be searched in Annotations. false - text in Annotations won't be parsed by TextFragmentAbsorber. |
| [StoredGraphicElementsMaxCount](../../aspose.pdf.text/textsearchoptions/storedgraphicelementsmaxcount/) { get; set; } | Gets or sets value that limits searching for text related graphics (underlining, background etc.) on a page for the speciefied number of elements. The default is 250. Set lesser value in the case of performance problems, try larger value in the case some graphic elements wasn't found. |
| [UseFontEngineEncoding](../../aspose.pdf.text/textsearchoptions/usefontengineencoding/) { get; set; } | Gets or sets indication that text will be searched using font engine encoding. true - means that font engine encoding will be used (try this if text search fails because of imperfect encoding in the document) false - means that document font encoding will be used (default value) |

### See Also

* class [TextOptions](../textoptions/)
* namespace [Aspose.Pdf.Text](../../aspose.pdf.text/)
* assembly [Aspose.PDF](../../)


