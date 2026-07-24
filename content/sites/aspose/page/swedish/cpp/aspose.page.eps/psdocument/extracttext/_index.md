---
title: "Aspose::Page::EPS::PsDocument::ExtractText-metod"
linktitle: "ExtractText"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::PsDocument::ExtractText-metod. Extraherar text från PS-fil. Texten kan endast extraheras om den är skriven med Type 42 (TrueType)-teckensnitt eller Type 0-teckensnitt med Type 42-teckensnitt i dess Vector-Map i C++."
type: docs
weight: 2300
url: /sv/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Extrahera text från PS-fil. Texten kan endast extraheras om den är skriven med Type 42 (**TrueType**)-teckensnitt eller Type 0-teckensnitt med Type 42-teckensnitt i dess vektorkarta.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| alternativ | System::SharedPtr\<SaveOptions\> | Sparalternativen. |
| startPage | int32_t | Sidan från vilken texten ska börja extraheras. Denna parameter är användbar för dokument med flera sidor. |
| endPage | int32_t | Sidan tills vilken texten ska slutföras. Denna parameter är användbar för dokument med flera sidor. |

### ReturnValue

Den extraherade texten.

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
