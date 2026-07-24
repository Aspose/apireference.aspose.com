---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions classe"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions classe. Classe per le opzioni di salvataggio XPS‑come‑PDF in C++."
type: docs
weight: 300
url: /it/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Classe per le opzioni di salvataggio XPS-come-PDF.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Specifica la dimensione di una porzione di pagine da passare da nodo a nodo. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | La raccolta di gestori di eventi che esegue modifiche a una pagina [XPS](../../aspose.page.xps/) appena prima del salvataggio. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Ottiene i dettagli di crittografia. Se non impostato, non verrà eseguita alcuna crittografia. |
| [get_ImageCompression](./get_imagecompression/)() const | Specifica il tipo di compressione da utilizzare per tutte le immagini nel documento. Il valore predefinito è [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Specifica fino a quale livello l’indice del documento deve essere espanso quando il file PDF viene aperto in un visualizzatore. 1 - vengono mostrati solo gli elementi di primo livello, 2 - vengono mostrati gli elementi di primo e secondo livello, e così via. Il valore predefinito è 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Specifica l’altezza dell’albero dell’indice del documento da salvare. 0 - l’albero dell’indice non verrà convertito, 1 - verranno convertiti solo gli elementi di primo livello, e così via. Il valore predefinito è 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Ottiene/imposta l’array dei numeri di pagina da convertire. |
| [get_PreserveText](./get_preservetext/)() override | Nell'[XPS](../../aspose.page.xps/), alcuni elementi di testo possono contenere riferimenti a forme di glifo alternative che non corrispondono a nessun codice carattere nel font. Se questa opzione è impostata su true, il testo di tali elementi [XPS](../../aspose.page.xps/) viene convertito in forme grafiche. Quindi il testo stesso appare trasparente sopra. Questo rende il testo di tali elementi selezionabile. Tuttavia l’effetto collaterale è che il file di output può diventare molto più grande dell’originale. Se questa opzione è impostata su false, i caratteri che dovrebbero essere visualizzati come forme alternative vengono sostituiti con altri caratteri che vengono mappati alle forme di glifo alternative. Pertanto il testo, sebbene ancora selezionabile, verrà modificato e probabilmente diventerà leleggibile. Il valore predefinito è false. |
| [get_TextCompression](./get_textcompression/)() const | Specifica a quale livello dell’indice del documento visualizzare gli oggetti [ApsBookmark](../). 0 - non visualizzati. 1 al primo livello e così via. Il valore predefinito è 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Crea una nuova istanza delle opzioni. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Specifica la dimensione di una porzione di pagine da passare da nodo a nodo. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Imposta i dettagli di crittografia. Se non impostato, non verrà eseguita alcuna crittografia. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Specifica il tipo di compressione da utilizzare per tutte le immagini nel documento. Il valore predefinito è [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Specifica fino a quale livello l’indice del documento deve essere espanso quando il file PDF viene aperto in un visualizzatore. 1 - vengono mostrati solo gli elementi di primo livello, 2 - vengono mostrati gli elementi di primo e secondo livello, e così via. Il valore predefinito è 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Specifica l’altezza dell’albero dell’indice del documento da salvare. 0 - l’albero dell’indice non verrà convertito, 1 - verranno convertiti solo gli elementi di primo livello, e così via. Il valore predefinito è 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Ottiene/imposta l’array dei numeri di pagina da convertire. |
| [set_PreserveText](./set_preservetext/)(bool) override | Nell'[XPS](../../aspose.page.xps/), alcuni elementi di testo possono contenere riferimenti a forme di glifo alternative che non corrispondono a nessun codice carattere nel font. Se questa opzione è impostata su true, il testo di tali elementi [XPS](../../aspose.page.xps/) viene convertito in forme grafiche. Quindi il testo stesso appare trasparente sopra. Questo rende il testo di tali elementi selezionabile. Tuttavia l’effetto collaterale è che il file di output può diventare molto più grande dell’originale. Se questa opzione è impostata su false, i caratteri che dovrebbero essere visualizzati come forme alternative vengono sostituiti con altri caratteri che vengono mappati alle forme di glifo alternative. Pertanto il testo, sebbene ancora selezionabile, verrà modificato e probabilmente diventerà leleggibile. Il valore predefinito è false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Specifica a quale livello dell’indice del documento visualizzare gli oggetti [ApsBookmark](../). 0 - non visualizzati. 1 al primo livello e così via. Il valore predefinito è 0. |
## Vedi anche

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
