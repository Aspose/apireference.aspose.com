---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding класс"
linktitle: "DocumentBinding"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding класс. Описывает метод связывания. Каждый документ связывается отдельно. DocumentBinding и JobBindAllDocuments являются взаимно исключающимися. Обработка ограничений между ключевыми словами определяется драйвером.  в C++."
type: docs
weight: 600
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Описывает метод связывания. Каждый документ связывается отдельно. [DocumentBinding](./) и [JobBindAllDocuments](../jobbindalldocuments/) являются взаимно исключающимися. Обработка ограничений между ключевыми словами определяется драйвером. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Методы

| Метод | Описание |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
