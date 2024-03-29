---
title: IMailMergeCallback Interface
linktitle: IMailMergeCallback
articleTitle: IMailMergeCallback
second_title: Aspose.Words för .NET
description: Aspose.Words.MailMerging.IMailMergeCallback gränssnitt. Implementera detta gränssnitt om du vill få meddelanden medan epostsammanslagning utförs i C#.
type: docs
weight: 3800
url: /sv/net/aspose.words.mailmerging/imailmergecallback/
---
## IMailMergeCallback interface

Implementera detta gränssnitt om du vill få meddelanden medan e-postsammanslagning utförs.

```csharp
public interface IMailMergeCallback
```

## Metoder

| namn | Beskrivning |
| --- | --- |
| [TagsReplaced](../../aspose.words.mailmerging/imailmergecallback/tagsreplaced/)() | Anropas när "mustasch"-texttaggar ersätts med MERGEFIELD-fält. |

## Exempel

Visar hur man definierar anpassad logik för hantering av händelser under sammanslagning.

```csharp
public void Callback()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    // Infoga två sammanslagningstaggar som refererar till två kolumner i en datakälla.
    builder.Write("{{FirstName}}");
    builder.Write("{{LastName}}");

    // Skapa en datakälla som bara innehåller en av kolumnerna som våra sammanslagningstaggar refererar till.
    DataTable table = new DataTable("Test");
    table.Columns.Add("FirstName");
    table.Rows.Add("John");
    table.Rows.Add("Jane");

    // Konfigurera vår kopplingsfil för att använda alternativa kopplingstaggar.
    doc.MailMerge.UseNonMergeFields = true;

    // Se sedan till att e-postsammanslagningen kommer att konvertera taggar, som vår "LastName"-tagg,
    // till MERGEFIELDs i sammanslagningsdokumenten.
    doc.MailMerge.PreserveUnusedTags = false;

    MailMergeTagReplacementCounter counter = new MailMergeTagReplacementCounter();
    doc.MailMerge.MailMergeCallback = counter;
    doc.MailMerge.Execute(table);

    Assert.AreEqual(1, counter.TagsReplacedCount);
}

/// <summary>
/// Räknar antalet gånger en kopplingskoppling ersätter kopplingsetiketter som den inte kunde fylla med data med MERGEFIELDs.
/// </summary>
private class MailMergeTagReplacementCounter : IMailMergeCallback
{
    public void TagsReplaced()
    {
        TagsReplacedCount++;
    }

    public int TagsReplacedCount { get; private set; }
}
```

### Se även

* namnutrymme [Aspose.Words.MailMerging](../../aspose.words.mailmerging/)
* hopsättning [Aspose.Words](../../)
