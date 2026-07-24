---
title: "Metodo Aspose::Page::EPS::PsDocument::ExtractText"
linktitle: "ExtractText"
second_title: "Aspose.Page per C++"
description: "Metodo Aspose::Page::EPS::PsDocument::ExtractText. Estrae il testo dal file PS. Il testo può essere estratto solo se è scritto con font Type 42 (TrueType) o font Type 0 con font Type 42 nella sua Mappa Vettoriale in C++."
type: docs
weight: 2300
url: /it/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Estrai il testo dal file PS. Il testo può essere estratto solo se è scritto con il font Type 42 (**TrueType**) o con il font Type 0 con font Type 42 nella sua Mappa Vettoriale.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | System::SharedPtr\<SaveOptions\> | Le opzioni di salvataggio. |
| startPage | int32_t | La pagina da cui iniziare a estrarre il testo. Questo parametro è utile per documenti multipagina. |
| endPage | int32_t | La pagina fino a cui terminare l'estrazione del testo. Questo parametro è utile per documenti multipagina. |

### ReturnValue

Il testo estratto.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
