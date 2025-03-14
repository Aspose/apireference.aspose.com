---
title: BuiltInDocumentProperties.HeadingPairs
linktitle: HeadingPairs
articleTitle: HeadingPairs
second_title: Aspose.Words for .NET
description: Explore the HeadingPairs property in BuiltInDocumentProperties to easily manage document headings and enhance your document organization.
type: docs
weight: 110
url: /net/aspose.words.properties/builtindocumentproperties/headingpairs/
---
## BuiltInDocumentProperties.HeadingPairs property

Specifies document headings and their names.

```csharp
public object[] HeadingPairs { get; set; }
```

## Remarks

Every heading pair occupies two elements in this array.

The first element of the pair is a String and specifies the heading name. The second element of the pair is an Int32 and specifies the count of document parts for this heading in the [`TitlesOfParts`](../titlesofparts/) property.

The total sum of counts for all heading pairs in this property must be equal to the number of elements in the [`TitlesOfParts`](../titlesofparts/) property.

Aspose.Words does not update this property.

## Examples

Shows the relationship between "HeadingPairs" and "TitlesOfParts" properties.

```csharp
Document doc = new Document(MyDir + "Heading pairs and titles of parts.docx");

// We can find the combined values of these collections via
// "File" -> "Properties" -> "Advanced Properties" -> "Contents" tab.
// The HeadingPairs property is a collection of <string, int> pairs that
// determines how many document parts a heading spans across.
object[] headingPairs = doc.BuiltInDocumentProperties.HeadingPairs;

// The TitlesOfParts property contains the names of parts that belong to the above headings.
string[] titlesOfParts = doc.BuiltInDocumentProperties.TitlesOfParts;

int headingPairsIndex = 0;
int titlesOfPartsIndex = 0;
while (headingPairsIndex < headingPairs.Length)
{
    Console.WriteLine($"Parts for {headingPairs[headingPairsIndex++]}:");
    int partsCount = Convert.ToInt32(headingPairs[headingPairsIndex++]);

    for (int i = 0; i < partsCount; i++)
        Console.WriteLine($"\t\"{titlesOfParts[titlesOfPartsIndex++]}\"");
}
```

### See Also

* class [BuiltInDocumentProperties](../)
* namespace [Aspose.Words.Properties](../../../aspose.words.properties/)
* assembly [Aspose.Words](../../../)
