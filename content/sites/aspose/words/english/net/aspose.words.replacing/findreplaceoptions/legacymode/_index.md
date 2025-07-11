---
title: FindReplaceOptions.LegacyMode
linktitle: LegacyMode
articleTitle: LegacyMode
second_title: Aspose.Words for .NET
description: Discover the FindReplaceOptions LegacyMode property to easily toggle the classic find/replace algorithm for enhanced functionality and seamless user experience.
type: docs
weight: 130
url: /net/aspose.words.replacing/findreplaceoptions/legacymode/
---
## FindReplaceOptions.LegacyMode property

Gets or sets a boolean value indicating that old find/replace algorithm is used.

```csharp
public bool LegacyMode { get; set; }
```

## Remarks

Use this flag if you need exactly the same behavior as before advanced find/replace feature was introduced. Note that old algorithm does not support advanced features such as replace with breaks, apply formatting and so on.

## Examples

Shows how to recognize and use substitutions within replacement patterns.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Jason gave money to Paul.");

Regex regex = new Regex(@"([A-z]+) gave money to ([A-z]+)");

FindReplaceOptions options = new FindReplaceOptions();
options.UseSubstitutions = true;

// Using legacy mode does not support many advanced features, so we need to set it to 'false'.
options.LegacyMode = false;

doc.Range.Replace(regex, @"$2 took money from $1", options);

Assert.That("Paul took money from Jason.\f", Is.EqualTo(doc.GetText()));
```

### See Also

* class [FindReplaceOptions](../)
* namespace [Aspose.Words.Replacing](../../../aspose.words.replacing/)
* assembly [Aspose.Words](../../../)
