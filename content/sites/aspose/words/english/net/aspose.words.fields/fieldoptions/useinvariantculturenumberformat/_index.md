---
title: FieldOptions.UseInvariantCultureNumberFormat
linktitle: UseInvariantCultureNumberFormat
articleTitle: UseInvariantCultureNumberFormat
second_title: Aspose.Words for .NET
description: Discover the FieldOptions UseInvariantCultureNumberFormat property to easily manage number formatting with invariant culture for consistent data handling.
type: docs
weight: 210
url: /net/aspose.words.fields/fieldoptions/useinvariantculturenumberformat/
---
## FieldOptions.UseInvariantCultureNumberFormat property

Gets or sets the value indicating that number format is parsed using invariant culture or not

```csharp
public bool UseInvariantCultureNumberFormat { get; set; }
```

## Remarks

When this property is set to `true`, number format is taken from an invariant culture.

When this property is set to `false`, number format is taken from the current thread's culture.

The default value is `false`.

## Examples

Shows how to format numbers according to the invariant culture.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Thread.CurrentThread.CurrentCulture = new CultureInfo("de-DE");
Field field = builder.InsertField(" = 1234567,89 \\# $#,###,###.##");
field.Update();

// Sometimes, fields may not format their numbers correctly under certain cultures. 
Assert.IsFalse(doc.FieldOptions.UseInvariantCultureNumberFormat);
Assert.AreEqual("$1.234.567,89 ,     ", field.Result);

// To fix this, we could change the culture for the entire thread.
// Another way to fix this is to set this flag,
// which gets all fields to use the invariant culture when formatting numbers.
// This way allows us to avoid changing the culture for the entire thread.
doc.FieldOptions.UseInvariantCultureNumberFormat = true;
field.Update();
Assert.AreEqual("$1.234.567,89", field.Result);
```

### See Also

* class [FieldOptions](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
