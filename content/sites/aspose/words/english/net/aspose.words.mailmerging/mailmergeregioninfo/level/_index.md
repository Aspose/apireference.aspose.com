---
title: MailMergeRegionInfo.Level
linktitle: Level
articleTitle: Level
second_title: Aspose.Words for .NET
description: Discover the MailMergeRegionInfo Level property that reveals the nesting level of your regions, enhancing your document automation and efficiency.
type: docs
weight: 40
url: /net/aspose.words.mailmerging/mailmergeregioninfo/level/
---
## MailMergeRegionInfo.Level property

Returns the nesting level for the region.

```csharp
public int Level { get; }
```

## Examples

Shows how to verify mail merge regions.

```csharp
Document doc = new Document(MyDir + "Mail merge regions.docx");

// Returns a full hierarchy of merge regions that contain MERGEFIELDs available in the document.
MailMergeRegionInfo regionInfo = doc.MailMerge.GetRegionsHierarchy();

// Get top regions in the document.
IList<MailMergeRegionInfo> topRegions = regionInfo.Regions;

Assert.That(topRegions.Count, Is.EqualTo(2));
Assert.That(topRegions[0].Name, Is.EqualTo("Region1"));
Assert.That(topRegions[1].Name, Is.EqualTo("Region2"));
Assert.That(topRegions[0].Level, Is.EqualTo(1));
Assert.That(topRegions[1].Level, Is.EqualTo(1));

// Get nested region in first top region.
IList<MailMergeRegionInfo> nestedRegions = topRegions[0].Regions;

Assert.That(nestedRegions.Count, Is.EqualTo(2));
Assert.That(nestedRegions[0].Name, Is.EqualTo("NestedRegion1"));
Assert.That(nestedRegions[1].Name, Is.EqualTo("NestedRegion2"));
Assert.That(nestedRegions[0].Level, Is.EqualTo(2));
Assert.That(nestedRegions[1].Level, Is.EqualTo(2));
Assert.That(nestedRegions[1].MustacheTags.Count, Is.EqualTo(0));

// Get list of fields inside the first top region.
IList<Field> fieldList = topRegions[0].Fields;

Assert.That(fieldList.Count, Is.EqualTo(4));

FieldMergeField startFieldMergeField = nestedRegions[0].StartField;

Assert.That(startFieldMergeField.FieldName, Is.EqualTo("TableStart:NestedRegion1"));

FieldMergeField endFieldMergeField = nestedRegions[0].EndField;

Assert.That(endFieldMergeField.FieldName, Is.EqualTo("TableEnd:NestedRegion1"));
```

### See Also

* class [MailMergeRegionInfo](../)
* namespace [Aspose.Words.MailMerging](../../../aspose.words.mailmerging/)
* assembly [Aspose.Words](../../../)
