---
title: "Aspose::Page::EPS::PsDocument::ExtractText methode"
linktitle: "ExtractText"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::PsDocument::ExtractText methode. Extraheer tekst uit PS-bestand. De tekst kan alleen worden geëxtraheerd als deze is geschreven met Type 42 (TrueType)-lettertype of Type 0-lettertype met Type 42-lettertypen in de Vector Map in C++."
type: docs
weight: 2300
url: /nl/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Extraheer tekst uit een PS-bestand. De tekst kan alleen worden geëxtraheerd als deze is geschreven met een Type 42 (**TrueType**) lettertype of Type 0-lettertype met Type 42-lettertypen in de Vector Map.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| opties | System::SharedPtr\<SaveOptions\> | De opslagopties. |
| startPage | int32_t | De pagina vanaf welke tekst moet worden geëxtraheerd. Deze parameter is nuttig voor documenten met meerdere pagina's. |
| endPage | int32_t | De pagina tot waar tekst moet worden geëxtraheerd. Deze parameter is nuttig voor documenten met meerdere pagina's. |

### ReturnValue

De geëxtraheerde tekst.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
