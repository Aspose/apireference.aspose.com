---
title: ParagraphFormat.TabStops
linktitle: TabStops
articleTitle: TabStops
second_title: Aspose.Words для .NET
description: ParagraphFormat TabStops свойство. Получает коллекцию пользовательских позиций табуляции определенных для этого объекта на С#.
type: docs
weight: 390
url: /ru/net/aspose.words/paragraphformat/tabstops/
---
## ParagraphFormat.TabStops property

Получает коллекцию пользовательских позиций табуляции, определенных для этого объекта.

```csharp
public TabStopCollection TabStops { get; }
```

## Примеры

Показывает, как изменить положение правой позиции табуляции в абзацах, связанных с содержанием.

```csharp
Document doc = new Document(MyDir + "Table of contents.docx");

// Перебираем все абзацы со стилями на основе результатов оглавления; это любой стиль между TOC и TOC9.
foreach (Paragraph para in doc.GetChildNodes(NodeType.Paragraph, true).OfType<Paragraph>())
    if (para.ParagraphFormat.Style.StyleIdentifier >= StyleIdentifier.Toc1 &&
        para.ParagraphFormat.Style.StyleIdentifier <= StyleIdentifier.Toc9)
    {
        // Получаем первую вкладку, используемую в этом абзаце. Это должна быть вкладка, используемая для выравнивания номеров страниц.
        TabStop tab = para.ParagraphFormat.TabStops[0];

        // Заменяем первую табуляцию по умолчанию, остановку на пользовательскую позицию табуляции.
        para.ParagraphFormat.TabStops.RemoveByPosition(tab.Position);
        para.ParagraphFormat.TabStops.Add(tab.Position - 50, tab.Alignment, tab.Leader);
    }

doc.Save(ArtifactsDir + "Styles.ChangeTocsTabStops.docx");
```

### Смотрите также

* class [TabStopCollection](../../tabstopcollection/)
* class [ParagraphFormat](../)
* пространство имен [Aspose.Words](../../../aspose.words/)
* сборка [Aspose.Words](../../../)
