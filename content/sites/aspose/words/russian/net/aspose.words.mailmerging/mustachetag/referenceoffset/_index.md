---
title: MustacheTag.ReferenceOffset
linktitle: ReferenceOffset
articleTitle: ReferenceOffset
second_title: Aspose.Words для .NET
description: MustacheTag ReferenceOffset свойство. Получает начальную позицию тега отсчитывающуюся от нуля от началаReferenceRun  на С#.
type: docs
weight: 10
url: /ru/net/aspose.words.mailmerging/mustachetag/referenceoffset/
---
## MustacheTag.ReferenceOffset property

Получает начальную позицию тега (отсчитывающуюся от нуля) от начала[`ReferenceRun`](../referencerun/) .

```csharp
public int ReferenceOffset { get; }
```

## Примеры

Показывает, как работать с тегами усов.

```csharp
Document document = new Document(MyDir + "Mail merge mustache tags.docx");
document.MailMerge.UseNonMergeFields = true;

MailMergeRegionInfo hierarchy = document.MailMerge.GetRegionsHierarchy();

foreach (MustacheTag mustacheTag in hierarchy.MustacheTags)
{
    Console.WriteLine(mustacheTag.Text);
    Console.WriteLine(mustacheTag.ReferenceOffset);
    Console.WriteLine(mustacheTag.ReferenceRun);
}

foreach (MailMergeRegionInfo region in hierarchy.Regions)
{
    Console.WriteLine(region.StartMustacheTag.Text);
    Console.WriteLine(region.EndMustacheTag.Text);
}
```

### Смотрите также

* class [MustacheTag](../)
* пространство имен [Aspose.Words.MailMerging](../../../aspose.words.mailmerging/)
* сборка [Aspose.Words](../../../)
