---
title: Aspose::Page::EPS::PsDocument::ExtractText method
linktitle: ExtractText
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::PsDocument::ExtractText method. Extract text from PS file. The text can be extracted only if it is written with Type 42 (TrueType) font or Type 0 font with Type 42 fonts in its Vector Map in C++.'
type: docs
weight: 2300
url: /cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Extract text from PS file. The text can be extracted only if it is written with Type 42 ([TrueType](../../../aspose.truetype/)) font or Type 0 font with Type 42 fonts in its Vector Map.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parameter | Type | Description |
| --- | --- | --- |
| options | System::SharedPtr\<SaveOptions\> | The save options. |
| startPage | int32_t | The page from which to begin to extract text. This parameter is usefull for multi-paged documents. |
| endPage | int32_t | The page till which to finish to extract text. This parameter is usefull for multi-paged documents. |

### ReturnValue

The extracted text.

## See Also

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
