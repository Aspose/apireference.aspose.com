---
title: "Aspose::Page::EPS::PsDocument::ExtractText-Methode"
linktitle: "ExtractText"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::PsDocument::ExtractText-Methode. Extrahiert Text aus einer PS-Datei. Der Text kann nur extrahiert werden, wenn er mit einer Type 42 (TrueType)-Schrift oder einer Type 0-Schrift mit Type 42-Schriften in ihrer Vektor‑Karte in C++ geschrieben wurde."
type: docs
weight: 2300
url: /de/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Extrahiert Text aus einer PS‑Datei. Der Text kann nur extrahiert werden, wenn er mit einer Type‑42‑Schriftart (**TrueType**) oder einer Type‑0‑Schriftart mit Type‑42‑Schriften in ihrer Vektor‑Karte geschrieben wurde.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Optionen | System::SharedPtr\<SaveOptions\> | Die Speicheroptionen. |
| startPage | int32_t | Die Seite, ab der der Text extrahiert werden soll. Dieser Parameter ist nützlich für mehrseitige Dokumente. |
| endPage | int32_t | Die Seite, bis zu der der Text extrahiert werden soll. Dieser Parameter ist nützlich für mehrseitige Dokumente. |

### ReturnValue

Der extrahierte Text.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
