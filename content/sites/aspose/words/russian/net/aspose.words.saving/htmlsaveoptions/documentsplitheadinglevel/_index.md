---
title: HtmlSaveOptions.DocumentSplitHeadingLevel
linktitle: DocumentSplitHeadingLevel
articleTitle: DocumentSplitHeadingLevel
second_title: Aspose.Words для .NET
description: HtmlSaveOptions DocumentSplitHeadingLevel свойство. Указывает максимальный уровень заголовков по которому можно разделить документ. Значение по умолчанию2  на С#.
type: docs
weight: 90
url: /ru/net/aspose.words.saving/htmlsaveoptions/documentsplitheadinglevel/
---
## HtmlSaveOptions.DocumentSplitHeadingLevel property

Указывает максимальный уровень заголовков, по которому можно разделить документ. Значение по умолчанию:`2` .

```csharp
public int DocumentSplitHeadingLevel { get; set; }
```

## Примечания

Когда[`DocumentSplitCriteria`](../documentsplitcriteria/) включаетHeadingParagraph и этому свойству присвоено значение от 1 до 9, документ будет разбит на абзацы, отформатированные с использованием .**Заголовок 1** ,**Заголовок 2** ,**Заголовок 3**и т. д. стили до указанного уровня заголовка.

По умолчанию только**Заголовок 1** и**Заголовок 2** абзацы приводят к разделению документа. Установка этого свойства в ноль приведет к тому, что документ вообще не будет разбит на абзацы заголовков.

## Примеры

Показывает, как разделить выходной HTML-документ по заголовкам на несколько частей.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Каждый абзац, который мы форматируем с использованием стиля «Заголовок», может служить заголовком.
// Каждый заголовок также может иметь уровень заголовка, определяемый номером его стиля заголовка.
// Заголовки ниже относятся к уровням 1–3.
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 1"];
builder.Writeln("Heading #1");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 2"];
builder.Writeln("Heading #2");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 3"];
builder.Writeln("Heading #3");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 1"];
builder.Writeln("Heading #4");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 2"];
builder.Writeln("Heading #5");
builder.ParagraphFormat.Style = builder.Document.Styles["Heading 3"];
builder.Writeln("Heading #6");

// Создайте объект HtmlSaveOptions и установите критерий разделения на «HeadingParagraph».
// Эти критерии разделят документ по абзацам со стилями «Заголовок» на несколько более мелких документов,
// и сохраняем каждый документ в отдельном HTML-файле в локальной файловой системе.
// Мы также установим максимальный уровень заголовка, который разбивает документ на 2.
// При сохранении документа он будет разделен по заголовкам уровней 1 и 2, но не по заголовкам с 3 по 9.
HtmlSaveOptions options = new HtmlSaveOptions
{
    DocumentSplitCriteria = DocumentSplitCriteria.HeadingParagraph,
    DocumentSplitHeadingLevel = 2
};

// В нашем документе четыре заголовка уровней 1–2. Один из этих заголовков не будет
// точка разделения, поскольку она находится в начале документа.
// Операция сохранения разделит наш документ на три места, на четыре меньших документа.
doc.Save(ArtifactsDir + "HtmlSaveOptions.HeadingLevels.html", options);

doc = new Document(ArtifactsDir + "HtmlSaveOptions.HeadingLevels.html");

Assert.AreEqual("Heading #1", doc.GetText().Trim());

doc = new Document(ArtifactsDir + "HtmlSaveOptions.HeadingLevels-01.html");

Assert.AreEqual("Heading #2\r" +
                "Heading #3", doc.GetText().Trim());

doc = new Document(ArtifactsDir + "HtmlSaveOptions.HeadingLevels-02.html");

Assert.AreEqual("Heading #4", doc.GetText().Trim());

doc = new Document(ArtifactsDir + "HtmlSaveOptions.HeadingLevels-03.html");

Assert.AreEqual("Heading #5\r" +
                "Heading #6", doc.GetText().Trim());
```

### Смотрите также

* class [HtmlSaveOptions](../)
* пространство имен [Aspose.Words.Saving](../../../aspose.words.saving/)
* сборка [Aspose.Words](../../../)
