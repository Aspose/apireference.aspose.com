---
title: PsDocument.ExtractText
second_title: Aspose.Page for .NET API Reference
description: PsDocument method. Extract text from PS file. The text can be extracted only if it is written with Type 42 TrueType font or Type 0 font with Type 42 fonts in its Vector Map
type: docs
weight: 230
url: /net/aspose.page.eps/psdocument/extracttext/
---
## PsDocument.ExtractText method

Extract text from PS file. The text can be extracted only if it is written with Type 42 (TrueType) font or Type 0 font with Type 42 fonts in its Vector Map.

```csharp
public string ExtractText(SaveOptions options, int startPage = 0, int endPage = 0)
```

| Parameter | Type | Description |
| --- | --- | --- |
| options | SaveOptions | The save options. |
| startPage | Int32 | The page from which to begin to extract text. This parameter is usefull for multi-paged documents. |
| endPage | Int32 | The page till which to finish to extract text. This parameter is usefull for multi-paged documents. |

### Return Value

The extracted text.

### See Also

* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)


