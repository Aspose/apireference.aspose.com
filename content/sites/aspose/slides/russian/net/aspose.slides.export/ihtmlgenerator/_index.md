---
title: IHtmlGenerator
second_title: Справочник по API Aspose.Slides для .NET
description: Генератор HTML.
type: docs
weight: 3640
url: /ru/net/aspose.slides.export/ihtmlgenerator/
---
## IHtmlGenerator interface

Генератор HTML.

```csharp
public interface IHtmlGenerator
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [NextSlideIndex](../../aspose.slides.export/ihtmlgenerator/nextslideindex) { get; } | Возвращает индекс слайда, который будет рендериться после текущего слайда или -1, если в данный момент рендерится последний слайд. Только для чтенияInt32. |
| [PreviousSlideIndex](../../aspose.slides.export/ihtmlgenerator/previousslideindex) { get; } | Возвращает индекс ранее отрендеренного слайда или -1, если отрисовывается первый слайд. Только для чтенияInt32. |
| [SlideImageSize](../../aspose.slides.export/ihtmlgenerator/slideimagesize) { get; } | Возвращает размер изображения слайда. Только для чтенияSizeF. |
| [SlideImageSizeUnit](../../aspose.slides.export/ihtmlgenerator/slideimagesizeunit) { get; } | Возвращает единицу измерения, в которой указан размер изображения слайда. Только для чтения[`SvgCoordinateUnit`](../svgcoordinateunit). |
| [SlideImageSizeUnitCode](../../aspose.slides.export/ihtmlgenerator/slideimagesizeunitcode) { get; } | Возвращает css-код единицы, в которой указан размер изображения слайда. Только чтениеString. |
| [SlideIndex](../../aspose.slides.export/ihtmlgenerator/slideindex) { get; } | Возвращает индекс отображаемого в данный момент слайда. Только для чтенияInt32. |

## Методы

| Имя | Описание |
| --- | --- |
| [AddAttributeValue](../../aspose.slides.export/ihtmlgenerator/addattributevalue#addattributevalue)(char[]) | Заключает значение атрибута в кавычки и добавляет его в html-файл. |
| [AddAttributeValue](../../aspose.slides.export/ihtmlgenerator/addattributevalue#addattributevalue_2)(string) | Заключает значение атрибута в кавычки и добавляет его в html-файл. |
| [AddAttributeValue](../../aspose.slides.export/ihtmlgenerator/addattributevalue#addattributevalue_1)(char[], int, int) | Заключает значение атрибута в кавычки и добавляет его в html-файл. |
| [AddHtml](../../aspose.slides.export/ihtmlgenerator/addhtml#addhtml)(char[]) | Добавляет форматированный HTML-текст. |
| [AddHtml](../../aspose.slides.export/ihtmlgenerator/addhtml#addhtml_2)(string) | Добавляет форматированный HTML-текст. |
| [AddHtml](../../aspose.slides.export/ihtmlgenerator/addhtml#addhtml_1)(char[], int, int) | Добавляет форматированный HTML-текст. |
| [AddText](../../aspose.slides.export/ihtmlgenerator/addtext#addtext)(char[]) | Добавляет простой текст в html-файлы, заменяя специальные символы html-объектами. Разрывы строк и пробелы не заменяются. |
| [AddText](../../aspose.slides.export/ihtmlgenerator/addtext#addtext_2)(string) | Добавляет простой текст в html-файлы, заменяя специальные символы html-объектами. Разрывы строк и пробелы не заменяются. |
| [AddText](../../aspose.slides.export/ihtmlgenerator/addtext#addtext_1)(char[], int, int) | Добавляет простой текст в html-файлы, заменяя специальные символы html-объектами. Разрывы строк и пробелы не заменяются. |

### Смотрите также

* пространство имен [Aspose.Slides.Export](../../aspose.slides.export)
* сборка [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
