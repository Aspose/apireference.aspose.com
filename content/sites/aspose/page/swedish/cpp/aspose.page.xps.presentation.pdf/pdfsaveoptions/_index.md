---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions klass"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions klass. Klass för XPS-som-PDF sparalternativ i C++."
type: docs
weight: 300
url: /sv/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Klass för XPS-som-PDF sparalternativ.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Anger storleken på en del av sidorna som ska överföras från nod till nod. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Samlingen av händelsehanterare som utför modifieringar av en [XPS](../../aspose.page.xps/)‑sida precis innan den sparas. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Hämtar krypteringsdetaljer. Om den inte är angiven utförs ingen kryptering. |
| [get_ImageCompression](./get_imagecompression/)() const | Anger kompressionstyp som ska användas för alla bilder i dokumentet. Standard är [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Anger upp till vilken nivå dokumentets innehållsförteckning ska expandera när PDF-filen öppnas i en visare. 1 – endast objekt på första nivån visas, 2 – endast objekt på första och andra nivån visas, och så vidare. Standard är 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Anger höjden på dokumentets innehållsförteckningsträd som ska sparas. 0 – trädstrukturen konverteras inte, 1 – endast objekt på första nivån konverteras, och så vidare. Standard är 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Hämtar/ställer in arrayen med sidnummer som ska konverteras. |
| [get_PreserveText](./get_preservetext/)() override | I [XPS](../../aspose.page.xps/) kan vissa textelement innehålla referenser till alternativa glyfformer som inte motsvarar någon teckenkod i teckensnittet. Om denna flagga är satt till true konverteras texten från sådana [XPS](../../aspose.page.xps/)‑element till grafiska former. Därefter visas själva texten transparent ovanpå. Detta gör att texten i sådana element kan väljas. Nackdelen är att utdatafilen kan bli mycket större än originalet. Om flaggan är satt till false ersätts tecknen som ska visas som alternativa former med andra tecken som mappas till de alternativa glyfformerna. Därmed blir texten, även om den fortfarande kan väljas, modifierad och sannolikt oläslig. Standard är false. |
| [get_TextCompression](./get_textcompression/)() const | Anger på vilken nivå i dokumentets innehållsförteckning [ApsBookmark](../)‑objekt ska visas. 0 – visas inte. 1 på första nivån och så vidare. Standard är 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Skapar en ny instans av alternativ. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Anger storleken på en del av sidorna som ska överföras från nod till nod. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Ställer in krypteringsdetaljer. Om den inte anges utförs ingen kryptering. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Anger kompressionstyp som ska användas för alla bilder i dokumentet. Standard är [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Anger upp till vilken nivå dokumentets innehållsförteckning ska expandera när PDF-filen öppnas i en visare. 1 – endast objekt på första nivån visas, 2 – endast objekt på första och andra nivån visas, och så vidare. Standard är 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Anger höjden på dokumentets innehållsförteckningsträd som ska sparas. 0 – trädstrukturen konverteras inte, 1 – endast objekt på första nivån konverteras, och så vidare. Standard är 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Hämtar/ställer in arrayen med sidnummer som ska konverteras. |
| [set_PreserveText](./set_preservetext/)(bool) override | I [XPS](../../aspose.page.xps/) kan vissa textelement innehålla referenser till alternativa glyfformer som inte motsvarar någon teckenkod i teckensnittet. Om denna flagga är satt till true konverteras texten från sådana [XPS](../../aspose.page.xps/)‑element till grafiska former. Därefter visas själva texten transparent ovanpå. Detta gör att texten i sådana element kan väljas. Nackdelen är att utdatafilen kan bli mycket större än originalet. Om flaggan är satt till false ersätts tecknen som ska visas som alternativa former med andra tecken som mappas till de alternativa glyfformerna. Därmed blir texten, även om den fortfarande kan väljas, modifierad och sannolikt oläslig. Standard är false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Anger på vilken nivå i dokumentets innehållsförteckning [ApsBookmark](../)‑objekt ska visas. 0 – visas inte. 1 på första nivån och så vidare. Standard är 0. |
## Se även

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
