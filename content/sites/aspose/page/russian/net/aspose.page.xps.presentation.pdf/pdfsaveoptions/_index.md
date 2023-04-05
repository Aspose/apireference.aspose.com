---
title: Class PdfSaveOptions
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.Presentation.Pdf.PdfSaveOptions сорт. Класс для параметров сохранения XPSasPDF.
type: docs
weight: 440
url: /ru/net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class

Класс для параметров сохранения XPS-as-PDF.

```csharp
public class PdfSaveOptions : SaveOptions
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | Создает новый экземпляр options. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Указывает дополнительные папки, в которых конвертер должен найти шрифты для входного документа. Папка по умолчанию — стандартная папка шрифтов, в которой ОС находит шрифты для внутренних нужд. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Указывает, должна ли отладочная информация выводиться в стандартный поток вывода или нет. |
| [EncryptionDetails](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/encryptiondetails/) { get; set; } | Получает или задает сведения о шифровании. Если не установлено, то шифрование выполняться не будет. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Возвращает список подавленных ошибок преобразования.!:SuppressErrors верно. |
| [ImageCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/imagecompression/) { get; set; } | Определяет тип сжатия, который будет использоваться для всех изображений в документе. Значение по умолчанию:Auto . |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Категория «Качество» указывает уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению самого низкого качества, а 100 — к самому высокому. |
| [OutlineTreeExpansionLevel](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeexpansionlevel/) { get; set; } | Указывает, до какого уровня должна быть расширена структура документа при открытии PDF-файла в программе просмотра. так далее. По умолчанию 1. |
| [OutlineTreeHeight](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/outlinetreeheight/) { get; set; } | Определяет высоту дерева структуры документа для сохранения. 0 - дерево структуры не будет преобразовано, 1 - будут преобразованы только элементы структуры первого уровня, и т. д. По умолчанию 10. |
| [PageNumbers](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/pagenumbers/) { get; set; } | Получает/задает массив номеров страниц для преобразования. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Указывает, должны ли подавляться ошибки. Если истинные подавленные ошибки добавляются[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Если false, первая ошибка приведет к завершению программы. |
| [TextCompression](../../aspose.page.xps.presentation.pdf/pdfsaveoptions/textcompression/) { get; set; } | Указывает тип сжатия, который будет использоваться для всех потоков контента, кроме изображений. По умолчанию:Flate . |

### Смотрите также

* class [SaveOptions](../../aspose.page/saveoptions/)
* пространство имен [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* сборка [Aspose.Page](../../)


