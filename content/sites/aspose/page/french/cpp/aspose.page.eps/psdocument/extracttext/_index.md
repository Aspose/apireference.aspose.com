---
title: "Aspose::Page::EPS::PsDocument::ExtractText method"
linktitle: "ExtractText"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::PsDocument::ExtractText method. Extrait le texte d'un fichier PS. Le texte ne peut être extrait que s'il est écrit avec une police Type 42 (TrueType) ou une police Type 0 contenant des polices Type 42 dans sa carte vectorielle en C++."
type: docs
weight: 2300
url: /fr/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Extrait le texte d'un fichier PS. Le texte ne peut être extrait que s'il est écrit avec une police Type 42 (**TrueType**) ou une police Type 0 contenant des polices Type 42 dans sa carte vectorielle.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| options | System::SharedPtr\<SaveOptions\> | Les options d'enregistrement. |
| startPage | int32_t | La page à partir de laquelle commencer l'extraction du texte. Ce paramètre est utile pour les documents multi-pages. |
| endPage | int32_t | La page jusqu'à laquelle terminer l'extraction du texte. Ce paramètre est utile pour les documents multi-pages. |

### ReturnValue

Le texte extrait.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
