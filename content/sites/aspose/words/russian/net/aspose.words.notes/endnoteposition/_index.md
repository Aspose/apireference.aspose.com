---
title: EndnotePosition Enum
linktitle: EndnotePosition
articleTitle: EndnotePosition
second_title: Aspose.Words для .NET
description: Aspose.Words.Notes.EndnotePosition перечисление. Определяет положение концевой сноски на С#.
type: docs
weight: 4250
url: /ru/net/aspose.words.notes/endnoteposition/
---
## EndnotePosition enumeration

Определяет положение концевой сноски.

```csharp
public enum EndnotePosition
```

### Ценности

| Имя | Ценность | Описание |
| --- | --- | --- |
| EndOfSection | `0` | Сноски выводятся в конце раздела. |
| EndOfDocument | `3` | Сноски выводятся в конце документа. |

## Примеры

Показывает, как выбрать другое место, где документ будет собираться и отображать его концевые сноски.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Сноска — это способ прикрепить к тексту ссылку или комментарий.
 // это не мешает потоку основного текста.
// Вставка концевой сноски добавляет небольшой надстрочный символ ссылки
// в основном тексте, куда мы вставляем сноску.
// Каждая сноска также создает запись в конце документа, состоящую из символа
// который соответствует ссылочному символу в основном тексте.
// Текст ссылки, который мы передаем методу "InsertEndnote" компоновщика документов.
builder.Write("Hello world!");
builder.InsertFootnote(FootnoteType.Endnote, "Endnote contents.");
builder.InsertBreak(BreakType.SectionBreakNewPage);
builder.Write("This is the second section.");

// Мы можем использовать свойство «Позиция», чтобы определить, где в документе будут размещены все концевые сноски.
// Если мы установим значение свойства «Позиция» на «EndnotePosition.EndOfDocument»,
// каждая сноска будет отображаться в коллекции в конце документа. Это значение по умолчанию.
// Если мы установим значение свойства «Позиция» на «EndnotePosition.EndOfSection»,
// каждая сноска будет отображаться в коллекции в конце раздела, текст которого содержит ссылочный знак концевой сноски.
doc.EndnoteOptions.Position = endnotePosition;

doc.Save(ArtifactsDir + "InlineStory.PositionEndnote.docx");
```

### Смотрите также

* class [EndnoteOptions](../endnoteoptions/)
* пространство имен [Aspose.Words.Notes](../../aspose.words.notes/)
* сборка [Aspose.Words](../../)
