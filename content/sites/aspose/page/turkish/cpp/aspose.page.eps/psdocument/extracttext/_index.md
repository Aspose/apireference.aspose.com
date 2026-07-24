---
title: "Aspose::Page::EPS::PsDocument::ExtractText yöntemi"
linktitle: "ExtractText"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::PsDocument::ExtractText yöntemi. PS dosyasından metin çıkarır. Metin yalnızca Type 42 (TrueType) yazı tipiyle veya Type 0 yazı tipinde Vector Map içinde Type 42 yazı tipleriyle yazılmışsa çıkarılabilir C++'ta."
type: docs
weight: 2300
url: /tr/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


Bir PS dosyasından metin çıkarır. Metin yalnızca Type 42 (**TrueType**) yazı tipiyle ya da Vector Map içinde Type 42 yazı tipleri bulunan Type 0 yazı tipiyle yazılmışsa çıkarılabilir.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| seçenekler | System::SharedPtr\<SaveOptions\> | Kaydetme seçenekleri. |
| startPage | int32_t | Metin çıkarmaya başlanacak sayfa. Bu parametre çok sayfalı belgeler için faydalıdır. |
| endPage | int32_t | Metin çıkarmayı bitirecek sayfa. Bu parametre çok sayfalı belgeler için faydalıdır. |

### ReturnValue

Çıkarılan metin.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
