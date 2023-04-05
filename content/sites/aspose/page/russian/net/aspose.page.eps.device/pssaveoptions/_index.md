---
title: Class PsSaveOptions
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.EPS.Device.PsSaveOptions сорт. Этот класс содержит параметры необходимые для управления процессом преобразования документа в файл PostScript PS или Encapsulated PostScript EPS.
type: docs
weight: 80
url: /ru/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

Этот класс содержит параметры, необходимые для управления процессом преобразования документа в файл PostScript (PS) или Encapsulated PostScript (EPS).

```csharp
public class PsSaveOptions : SaveOptions
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | Инициализирует новый экземпляр`PsSaveOptions` класс со значениями по умолчанию для флагов!:SuppressErrors (правда) и!:Debug (ложь). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | Инициализирует новый экземпляр`PsSaveOptions` класс со значениями по умолчанию для флага!:Debug (ложь). |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Указывает дополнительные папки, в которых конвертер должен найти шрифты для входного документа. Папка по умолчанию — стандартная папка шрифтов, в которой ОС находит шрифты для внутренних нужд. |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | Цвет фона. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Указывает, должна ли отладочная информация выводиться в стандартный поток вывода или нет. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | Указывает, следует ли встраивать используемые шрифты в документ PS. |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | Тип шрифта для встраивания шрифтов в документ PS. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Возвращает список подавленных ошибок преобразования.!:SuppressErrors верно. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Категория «Качество» указывает уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению самого низкого качества, а 100 — к самому высокому. |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | Поля страницы. |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | Размер страницы. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | Формат сохранения результирующего файла. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Указывает, должны ли подавляться ошибки. Если истинные подавленные ошибки добавляются[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. Если false, первая ошибка приведет к завершению программы. |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | Указывает, является ли фон прозрачным. |

### Смотрите также

* class [SaveOptions](../../aspose.page/saveoptions/)
* пространство имен [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* сборка [Aspose.Page](../../)


