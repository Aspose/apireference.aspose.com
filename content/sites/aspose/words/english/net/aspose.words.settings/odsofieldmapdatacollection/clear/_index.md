---
title: OdsoFieldMapDataCollection.Clear
linktitle: Clear
articleTitle: Clear
second_title: Aspose.Words for .NET
description: Effortlessly clear your OdsoFieldMapDataCollection with our Clear method, ensuring a fresh start by removing all elements quickly and efficiently.
type: docs
weight: 50
url: /net/aspose.words.settings/odsofieldmapdatacollection/clear/
---
## OdsoFieldMapDataCollection.Clear method

Removes all elements from this collection.

```csharp
public void Clear()
```

## Examples

Shows how to access the collection of data that maps data source columns to merge fields.

```csharp
Document doc = new Document(MyDir + "Odso data.docx");

// This collection defines how a mail merge will map columns from a data source
// to predefined MERGEFIELD, ADDRESSBLOCK and GREETINGLINE fields.
OdsoFieldMapDataCollection dataCollection = doc.MailMergeSettings.Odso.FieldMapDatas;
Assert.That(dataCollection.Count, Is.EqualTo(30));

using (IEnumerator<OdsoFieldMapData> enumerator = dataCollection.GetEnumerator())
{
    int index = 0;
    while (enumerator.MoveNext())
    {
        Console.WriteLine($"Field map data index {index++}, type \"{enumerator.Current.Type}\":");

        Console.WriteLine(
            enumerator.Current.Type != OdsoFieldMappingType.Null
                ? $"\tColumn \"{enumerator.Current.Name}\", number {enumerator.Current.Column} mapped to merge field \"{enumerator.Current.MappedName}\"."
                : "\tNo valid column to field mapping data present.");
    }
}

// Clone the elements in this collection.
Assert.That(dataCollection[0].Clone(), Is.Not.EqualTo(dataCollection[0]));

// Use the "RemoveAt" method elements individually by index.
dataCollection.RemoveAt(0);

Assert.That(dataCollection.Count, Is.EqualTo(29));

// Use the "Clear" method to clear the entire collection at once.
dataCollection.Clear();

Assert.That(dataCollection.Count, Is.EqualTo(0));
```

### See Also

* class [OdsoFieldMapDataCollection](../)
* namespace [Aspose.Words.Settings](../../../aspose.words.settings/)
* assembly [Aspose.Words](../../../)
