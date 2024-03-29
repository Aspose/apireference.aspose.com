---
title: AppendText
second_title: Aspose.PDF для справочника API .NET
description: Добавляет текстовый фрагмент к странице Pdf
type: docs
weight: 30
url: /ru/net/aspose.pdf.text/textbuilder/appendtext/
---
## AppendText(TextFragment) {#appendtext}

Добавляет текстовый фрагмент к странице Pdf

```csharp
public void AppendText(TextFragment textFragment)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| textFragment | TextFragment | Текстовый фрагмент объекта. |

### Примеры

Пример демонстрирует, как создать объект текстового фрагмента, настроить его текстовые сегменты и добавить его на страницу Pdf.

```csharp
Document doc = new Document(inFile);
Page page = (Page)doc.Pages[1];

// создаем фрагмент текста
TextFragment tf = new TextFragment("main text");
tf.Position = new Position(100, 600);

// устанавливаем свойства текста
tf.TextState.FontSize = 5;
tf.TextState.Font = FontRepository.FindFont("TimesNewRoman");
tf.TextState.BackgroundColor = Color.LightGray;
tf.TextState.ForegroundColor = Color.Red;

// добавляем еще один сегмент в коллекцию Segments фрагмента текста
TextSegment segment2 = new TextSegment();
segment2.Text = "another segment";

tf.Segments.Add(segment2);

// создаем объект TextBuilder
TextBuilder builder = new TextBuilder(page);

// добавляем фрагмент текста на страницу Pdf
builder.AppendText(tf);

//сохраняем документ
doc.Save(outFile);
```

### Смотрите также

* class [TextFragment](../../textfragment)
* class [TextBuilder](../../textbuilder)
* пространство имен [Aspose.Pdf.Text](../../textbuilder)
* сборка [Aspose.PDF](../../../)

---

## AppendText(List&lt;TextFragment&gt;) {#appendtext_1}

Добавляет список текстовых фрагментов на страницу Pdf.

```csharp
public void AppendText(List<TextFragment> textFragments)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| textFragments | List`1 | Сбор текстовых фрагментов |

### Смотрите также

* class [TextFragment](../../textfragment)
* class [TextBuilder](../../textbuilder)
* пространство имен [Aspose.Pdf.Text](../../textbuilder)
* сборка [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
