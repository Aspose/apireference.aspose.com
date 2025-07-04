---
title: FindReplaceOptions.IgnoreFieldCodes
linktitle: IgnoreFieldCodes
articleTitle: IgnoreFieldCodes
second_title: Aspose.Words for .NET
description: Discover the FindReplaceOptions IgnoreFieldCodes property to easily manage text in field codes. Control visibility with a simple boolean setting!
type: docs
weight: 70
url: /net/aspose.words.replacing/findreplaceoptions/ignorefieldcodes/
---
## FindReplaceOptions.IgnoreFieldCodes property

Gets or sets a boolean value indicating either to ignore text inside field codes. The default value is `false`.

```csharp
public bool IgnoreFieldCodes { get; set; }
```

## Remarks

This option affects only field codes (it does not ignore nodes between FieldSeparator and FieldEnd).

To ignore whole field, please use corresponding option [`IgnoreFields`](../ignorefields/).

## Examples

Shows how to ignore text inside field codes.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertField("INCLUDETEXT", "Test IT!");

FindReplaceOptions options = new FindReplaceOptions {IgnoreFieldCodes = ignoreFieldCodes};

// Replace 'T' in document ignoring text inside field code or not.
doc.Range.Replace(new Regex("T"), "*", options);
Console.WriteLine(doc.GetText());

Assert.That(doc.GetText().Trim(), Is.EqualTo(ignoreFieldCodes
        ? "\u0013INCLUDETEXT\u0014*est I*!\u0015"
        : "\u0013INCLUDE*EX*\u0014*est I*!\u0015"));
```

### See Also

* class [FindReplaceOptions](../)
* namespace [Aspose.Words.Replacing](../../../aspose.words.replacing/)
* assembly [Aspose.Words](../../../)
