---
title: HtmlSaveOptions.MetafileFormat
linktitle: MetafileFormat
articleTitle: MetafileFormat
second_title: Aspose.Words для .NET
description: HtmlSaveOptions MetafileFormat свойство. Указывает в каком формате метафайлы сохраняются при экспорте в HTML MHTML или EPUB. Значение по умолчаниюPng  что означает что метафайлы преобразуются в растровые изображения PNG на С#.
type: docs
weight: 380
url: /ru/net/aspose.words.saving/htmlsaveoptions/metafileformat/
---
## HtmlSaveOptions.MetafileFormat property

Указывает, в каком формате метафайлы сохраняются при экспорте в HTML, MHTML или EPUB. Значение по умолчанию:Png , что означает, что метафайлы преобразуются в растровые изображения PNG.

```csharp
public HtmlMetafileFormat MetafileFormat { get; set; }
```

## Примечания

Метафайлы не отображаются в HTML-браузерах изначально. По умолчанию Aspose.Words преобразует изображения WMF и EMF в файлы PNG при экспорте в HTML. Другие варианты — преобразовать метафайлы в изображения SVG или экспортировать их в исходное состояние без преобразования.

Некоторые преобразования изображений, в частности обрезка изображений, не будут применяться к изображениям метафайлов, если они экспортируются в HTML без преобразования.

## Примеры

Показывает, как конвертировать объекты SVG в другой формат при сохранении HTML-документов.

```csharp
string html = 
    @"<html>
        <svg xmlns='http://www.w3.org/2000/svg' width='500' height='40' viewBox='0 0 500 40'>
            <text x='0' y='35' font-family='Verdana' font-size='35'>Hello world!</text>
        </svg>
    </html>";

// Используйте «ConvertSvgToEmf», чтобы вернуть прежнее поведение
// где все изображения SVG, загруженные из документа HTML, были преобразованы в EMF.
// Теперь изображения SVG загружаются без конвертации
// если версия MS Word, указанная в параметрах загрузки, изначально поддерживает изображения SVG.
HtmlLoadOptions loadOptions = new HtmlLoadOptions { ConvertSvgToEmf = true };

Document doc = new Document(new MemoryStream(Encoding.UTF8.GetBytes(html)), loadOptions);

// Этот документ содержит файл <svg> элемент в виде текста.
// Когда мы сохраняем документ в HTML, мы можем передать объект SaveOptions
// чтобы определить, как операция сохранения обрабатывает этот объект.
// Установка свойства «MetafileFormat» в «HtmlMetafileFormat.Png», чтобы преобразовать его в изображение PNG.
// Установка для свойства «MetafileFormat» значения «HtmlMetafileFormat.Svg» сохраняет его как объект SVG.
// Установка свойства «MetafileFormat» в «HtmlMetafileFormat.EmfOrWmf», чтобы преобразовать его в метафайл.
HtmlSaveOptions options = new HtmlSaveOptions { MetafileFormat = htmlMetafileFormat };

doc.Save(ArtifactsDir + "HtmlSaveOptions.MetafileFormat.html", options);

string outDocContents = File.ReadAllText(ArtifactsDir + "HtmlSaveOptions.MetafileFormat.html");

switch (htmlMetafileFormat)
{
    case HtmlMetafileFormat.Png:
        Assert.True(outDocContents.Contains(
            "<p style=\"margin-top:0pt; margin-bottom:0pt\">" +
                "<img src=\"HtmlSaveOptions.MetafileFormat.001.png\" width=\"500\" height=\"40\" alt=\"\" " +
                "style=\"-aw-left-pos:0pt; -aw-rel-hpos:column; -aw-rel-vpos:paragraph; -aw-top-pos:0pt; -aw-wrap-type:inline\" />" +
            "</p>"));
        break;
    case HtmlMetafileFormat.Svg:
        Assert.True(outDocContents.Contains(
            "<span style=\"-aw-left-pos:0pt; -aw-rel-hpos:column; -aw-rel-vpos:paragraph; -aw-top-pos:0pt; -aw-wrap-type:inline\">" +
            "<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" version=\"1.1\" width=\"499\" height= \"40\">"));
        break;
    case HtmlMetafileFormat.EmfOrWmf:
        Assert.True(outDocContents.Contains(
            "<p style=\"margin-top:0pt; margin-bottom:0pt\">" +
                "<img src=\"HtmlSaveOptions.MetafileFormat.001.emf\" width=\"500\" height=\"40\" alt=\"\" " +
                "style=\"-aw-left-pos:0pt; -aw-rel-hpos:column; -aw-rel-vpos:paragraph; -aw-top-pos:0pt; -aw-wrap-type:inline\" />" +
            "</p>"));
        break;
}
```

### Смотрите также

* property [ImageResolution](../imageresolution/)
* property [ScaleImageToShapeSize](../scaleimagetoshapesize/)
* enum [HtmlMetafileFormat](../../htmlmetafileformat/)
* class [HtmlSaveOptions](../)
* пространство имен [Aspose.Words.Saving](../../../aspose.words.saving/)
* сборка [Aspose.Words](../../../)
