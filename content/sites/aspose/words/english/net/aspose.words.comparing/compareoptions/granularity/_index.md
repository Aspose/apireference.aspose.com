---
title: CompareOptions.Granularity
linktitle: Granularity
articleTitle: Granularity
second_title: Aspose.Words for .NET
description: Discover the CompareOptions Granularity property, track changes by character or word for precise text editing. Enhance your document control today!
type: docs
weight: 40
url: /net/aspose.words.comparing/compareoptions/granularity/
---
## CompareOptions.Granularity property

Specifies whether changes are tracked by character or by word.

```csharp
public Granularity Granularity { get; set; }
```

## Remarks

Default value is WordLevel.

## Examples

Shows to specify a granularity while comparing documents.

```csharp
Document docA = new Document();
DocumentBuilder builderA = new DocumentBuilder(docA);
builderA.Writeln("Alpha Lorem ipsum dolor sit amet, consectetur adipiscing elit");

Document docB = new Document();
DocumentBuilder builderB = new DocumentBuilder(docB);
builderB.Writeln("Lorems ipsum dolor sit amet consectetur - \"adipiscing\" elit");

// Specify whether changes are tracking
// by character ('Granularity.CharLevel'), or by word ('Granularity.WordLevel').
CompareOptions compareOptions = new CompareOptions();
compareOptions.Granularity = granularity;

docA.Compare(docB, "author", DateTime.Now, compareOptions);

// The first document's collection of revision groups contains all the differences between documents.
RevisionGroupCollection groups = docA.Revisions.Groups;
Assert.That(groups.Count, Is.EqualTo(5));
```

### See Also

* enum [Granularity](../../granularity/)
* class [CompareOptions](../)
* namespace [Aspose.Words.Comparing](../../../aspose.words.comparing/)
* assembly [Aspose.Words](../../../)
