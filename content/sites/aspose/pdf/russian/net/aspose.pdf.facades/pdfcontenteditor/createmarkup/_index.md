---
title: CreateMarkup
second_title: Aspose.PDF для справочника API .NET
description: Создает аннотацию разметки в документе PDF.
type: docs
weight: 200
url: /ru/net/aspose.pdf.facades/pdfcontenteditor/createmarkup/
---
## PdfContentEditor.CreateMarkup method

Создает аннотацию разметки в документе PDF.

```csharp
public void CreateMarkup(Rectangle rect, string contents, int type, int page, Color clr)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| rect | Rectangle | Прямоугольник, определяющий расположение аннотации на странице. |
| contents | String | Содержание аннотации. |
| type | Int32 | Тип аннотации разметки. Может быть 0 (выделено), 1 (подчеркнуто), 2 (зачеркнуто), 3 (волнисто). |
| page | Int32 | Номер исходной страницы, на которой будет создана аннотация. |
| clr | Color | Цвет разметки. |

### Примеры

```csharp
PdfContentEditor editor = new PdfContentEditor();
editor.BindPdf("example.pdf");
editor.CreateMarkup(new System.Drawing.Rectangle(0, 0, 100, 100),
    "Welcome to Aspose", 0, 1, System.Drawing.Color.Red);
editor.Save("example_out.pdf");
```

### Смотрите также

* class [PdfContentEditor](../../pdfcontenteditor)
* пространство имен [Aspose.Pdf.Facades](../../pdfcontenteditor)
* сборка [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
