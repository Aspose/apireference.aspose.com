---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class. Descrive il foglio banner da emettere per un documento specifico. Il foglio banner deve essere emesso con la dimensione predefinita PageMediaSize e utilizzando il tipo predefinito PageMediaType. Il foglio banner deve inoltre essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione (come DocumentDuplex, DocumentStaple o DocumentBinding) non deve includere il foglio banner. Il foglio banner può o non può essere isolato dal resto del lavoro. Ciò significa che eventuali opzioni di finitura o elaborazione del lavoro possono includere il foglio banner del documento. Il foglio banner dovrebbe comparire come prima pagina del documento.  in C++."
type: docs
weight: 400
url: /it/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


Descrive il foglio banner da emettere per un documento specifico. Il foglio banner deve essere emesso con la [PageMediaSize](../pagemediasize/) predefinita e utilizzando il [PageMediaType](../pagemediatype/) predefinito. Il foglio banner deve inoltre essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione (come [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), o [DocumentBinding](../documentbinding/)) non deve includere il foglio banner. Il foglio banner può o non può essere isolato dal resto del lavoro. Ciò significa che eventuali opzioni di finitura o elaborazione del lavoro possono includere il foglio banner del documento. Il foglio banner dovrebbe comparire come prima pagina del documento. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
