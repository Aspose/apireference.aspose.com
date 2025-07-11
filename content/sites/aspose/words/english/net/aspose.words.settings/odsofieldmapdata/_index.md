---
title: OdsoFieldMapData Class
linktitle: OdsoFieldMapData
articleTitle: OdsoFieldMapData
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.OdsoFieldMapData class for seamless mapping of external data columns to predefined document merge fields, enhancing your document automation.
type: docs
weight: 6730
url: /net/aspose.words.settings/odsofieldmapdata/
---
## OdsoFieldMapData class

Specifies how a column in the external data source shall be mapped to the predefined merge fields within the document.

To learn more, visit the [Mail Merge and Reporting](https://docs.aspose.com/words/net/mail-merge-and-reporting/) documentation article.

```csharp
public class OdsoFieldMapData
```

## Constructors

| Name | Description |
| --- | --- |
| [OdsoFieldMapData](odsofieldmapdata/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Column](../../aspose.words.settings/odsofieldmapdata/column/) { get; set; } | Specifies the zero-based index of the column within an external data source which shall be mapped to the local name of a specific MERGEFIELD field. The default value is 0. |
| [MappedName](../../aspose.words.settings/odsofieldmapdata/mappedname/) { get; set; } | Specifies the predefined merge field name which shall be mapped to the column number specified by the [`Column`](./column/) property within this field mapping. The default value is an empty string. |
| [Name](../../aspose.words.settings/odsofieldmapdata/name/) { get; set; } | Specifies the column name within an external data source for the column whose index is specified by the [`Column`](./column/) property. The default value is an empty string. |
| [Type](../../aspose.words.settings/odsofieldmapdata/type/) { get; set; } | Specifies if a given mail merge field has been mapped to a column in the given external data source or not. The default value is Default. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.words.settings/odsofieldmapdata/clone/)() | Returns a deep clone of this object. |

## Remarks

Microsoft Word provides some predefined merge field names that it allows to insert into a document as MERGEFIELD or use in the ADDRESSBLOCK or GREETINGLINE fields. The information specified in `OdsoFieldMapData` allows to map one column in the external data source to a single predefined merge field.

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

* namespace [Aspose.Words.Settings](../../aspose.words.settings/)
* assembly [Aspose.Words](../../)
