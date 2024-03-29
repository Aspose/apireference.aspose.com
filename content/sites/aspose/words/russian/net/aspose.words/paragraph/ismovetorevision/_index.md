---
title: Paragraph.IsMoveToRevision
linktitle: IsMoveToRevision
articleTitle: IsMoveToRevision
second_title: Aspose.Words для .NET
description: Paragraph IsMoveToRevision свойство. Возвращаетистинный если этот объект был перемещен вставлен в Microsoft Word при включенном отслеживании изменений на С#.
type: docs
weight: 140
url: /ru/net/aspose.words/paragraph/ismovetorevision/
---
## Paragraph.IsMoveToRevision property

Возвращает`истинный` если этот объект был перемещен (вставлен) в Microsoft Word при включенном отслеживании изменений.

```csharp
public bool IsMoveToRevision { get; }
```

## Примеры

Показывает, как проверить, является ли абзац измененной версией.

```csharp
Document doc = new Document(MyDir + "Revisions.docx");

// Этот документ содержит редакции «Переместить», которые появляются, когда мы выделяем текст курсором,
// а затем перетащите его, чтобы переместить в другое место
// при отслеживании изменений в Microsoft Word через «Просмотр» -> gt; "Отслеживать изменения".
Assert.AreEqual(6, doc.Revisions.Count(r => r.RevisionType == RevisionType.Moving));

ParagraphCollection paragraphs = doc.FirstSection.Body.Paragraphs;

 // Перемещение ревизий состоит из пар ревизий «Переместить из» и «Переместить в».
// Эти поправки представляют собой потенциальные изменения в документе, которые мы можем принять или отклонить.
// Прежде чем мы примем/отклоним редакцию перемещения, документ
// должен отслеживать пункты отправления и прибытия текста.
// Второй и четвертый абзацы определяют одну такую ревизию и, следовательно, оба имеют одинаковое содержание.
Assert.AreEqual(paragraphs[1].GetText(), paragraphs[3].GetText());

// Редакция «Переместить из» — это абзац, из которого мы перетащили текст.
// Если мы примем редакцию, этот абзац исчезнет,
// а другой останется и больше не будет ревизией.
Assert.True(paragraphs[1].IsMoveFromRevision);

// Редакция «Переместить в» — это абзац, в который мы перетащили текст.
// Если мы отклоним ревизию, этот абзац исчезнет, а другой останется.
Assert.True(paragraphs[3].IsMoveToRevision);
```

### Смотрите также

* class [Paragraph](../)
* пространство имен [Aspose.Words](../../../aspose.words/)
* сборка [Aspose.Words](../../../)
