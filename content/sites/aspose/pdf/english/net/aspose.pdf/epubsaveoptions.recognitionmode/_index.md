---
title: Enum EpubSaveOptions.RecognitionMode
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.EpubSaveOptionsRecognitionMode enum. When PDF file that usually has fixed layout is being converted the conversion engine tries to perform grouping and multilevel analysis to restore the original document authors intent and produce result in flow layout. This property tunes that conversion for this or that desirable method of recognition of content
type: docs
weight: 4190
url: /net/aspose.pdf/epubsaveoptions.recognitionmode/
---
## EpubSaveOptions.RecognitionMode enumeration

When PDF file (that usually has fixed layout) is being converted, the conversion engine tries to perform grouping and multi-level analysis to restore the original document author's intent and produce result in flow layout. This property tunes that conversion for this or that desirable method of recognition of content.

```csharp
public enum RecognitionMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Flow | `0` | Full recognition mode, the engine tries to perform grouping and multi-level analysis to restore the original document author's intent and produce xhtml in flow layout. |
| PdfFlow | `1` | The main idea of this conversion is based on saving "natural" order of content rendering that is formed during processing of pdf documents. In the general cases pdf documents keep top-down, left-right rendering order (see attachment directions.png). This assumption allows to create a single-path algorithm that will transform Aps elements that have positions (fixed-layout) into flow formats like HTML,EPUB,DOC. This mode will be especially useful for converting from PDF(APS) into EPUB, because the EPUB format was developed for e-readers like the Kindle or smart-phones. The size of screen those devices usually is less than the size of screen of ordinary PC. Therefore the content of EPUB documents is better to save in the flow format, for correct rendering on screens with different sizes. In this mode every column will be added to the end of previous column this allows to keep the logical structure of transformed document during "pagination" in EPUB readers. This achievement allows correctly render scientific or magazine articles. |
| Fixed | `2` | This mode is fast and good for maximally preserving the original look pages, but unfortunately many EPUB readeres don't support xhtml with fixed layout |

### See Also

* class [EpubSaveOptions](../epubsaveoptions/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


