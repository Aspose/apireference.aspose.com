---
title: "класс Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page для C++"
description: "класс Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions. Класс для параметров сохранения XPS как PDF в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Класс параметров сохранения XPS как PDF.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Указывает размер части страниц, передаваемых от узла к узлу. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Коллекция обработчиков событий, выполняющих модификации страницы [XPS](../../aspose.page.xps/) непосредственно перед её сохранением. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Получает детали шифрования. Если не задано, шифрование не будет выполнено. |
| [get_ImageCompression](./get_imagecompression/)() const | Указывает тип сжатия, используемый для всех изображений в документе. По умолчанию — [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Указывает, до какого уровня следует раскрывать структуру документа при открытии PDF-файла в просмотрщике. 1 — отображаются только элементы первого уровня, 2 — только элементы первого и второго уровней и т.д. По умолчанию 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Указывает глубину сохраняемого дерева структуры документа. 0 — дерево структуры не будет преобразовано, 1 — будут преобразованы только элементы первого уровня и т.д. По умолчанию 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Получает/устанавливает массив номеров страниц для конвертации. |
| [get_PreserveText](./get_preservetext/)() override | В [XPS](../../aspose.page.xps/) некоторые текстовые элементы могут содержать ссылки на альтернативные формы глифов, которые не соответствуют ни одному коду символа в шрифте. Если этот флаг установлен в true, текст из таких элементов [XPS](../../aspose.page.xps/) преобразуется в графические фигуры. Затем сам текст отображается прозрачным поверх них. Это делает текст таких элементов выделяемым. Однако побочный эффект — полученный файл может быть значительно больше оригинала. Если флаг установлен в false, символы, которые должны отображаться как альтернативные формы, заменяются другими символами, которые сопоставляются с альтернативными глифами. Таким образом, текст, хотя и остаётся выделяемым, будет изменён и, вероятно, станет нечитаемым. По умолчанию false. |
| [get_TextCompression](./get_textcompression/)() const | Указывает, на каком уровне структуры документа отображать объекты [ApsBookmark](../). 0 — не отображать. 1 — на первом уровне и т.д. По умолчанию 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Создаёт новый экземпляр параметров. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Указывает размер части страниц, передаваемых от узла к узлу. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Устанавливает детали шифрования. Если не задано, шифрование не будет выполнено. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Указывает тип сжатия, используемый для всех изображений в документе. По умолчанию — [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Указывает, до какого уровня следует раскрывать структуру документа при открытии PDF-файла в просмотрщике. 1 — отображаются только элементы первого уровня, 2 — только элементы первого и второго уровней и т.д. По умолчанию 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Указывает глубину сохраняемого дерева структуры документа. 0 — дерево структуры не будет преобразовано, 1 — будут преобразованы только элементы первого уровня и т.д. По умолчанию 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Получает/устанавливает массив номеров страниц для конвертации. |
| [set_PreserveText](./set_preservetext/)(bool) override | В [XPS](../../aspose.page.xps/) некоторые текстовые элементы могут содержать ссылки на альтернативные формы глифов, которые не соответствуют ни одному коду символа в шрифте. Если этот флаг установлен в true, текст из таких элементов [XPS](../../aspose.page.xps/) преобразуется в графические фигуры. Затем сам текст отображается прозрачным поверх них. Это делает текст таких элементов выделяемым. Однако побочный эффект — полученный файл может быть значительно больше оригинала. Если флаг установлен в false, символы, которые должны отображаться как альтернативные формы, заменяются другими символами, которые сопоставляются с альтернативными глифами. Таким образом, текст, хотя и остаётся выделяемым, будет изменён и, вероятно, станет нечитаемым. По умолчанию false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Указывает, на каком уровне структуры документа отображать объекты [ApsBookmark](../). 0 — не отображать. 1 — на первом уровне и т.д. По умолчанию 0. |
## См. также

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
