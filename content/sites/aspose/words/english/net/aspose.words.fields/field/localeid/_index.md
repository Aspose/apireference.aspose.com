---
title: Field.LocaleId
linktitle: LocaleId
articleTitle: LocaleId
second_title: Aspose.Words for .NET
description: Manage your field's LocaleId property effortlessly. Get or set the LCID for enhanced localization and user experience in your applications.
type: docs
weight: 60
url: /net/aspose.words.fields/field/localeid/
---
## Field.LocaleId property

Gets or sets the LCID of the field.

```csharp
public int LocaleId { get; set; }
```

## Examples

Shows how to insert a field and work with its locale.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a DATE field, and then print the date it will display.
// Your thread's current culture determines the formatting of the date.
Field field = builder.InsertField(@"DATE");
Console.WriteLine($"Today's date, as displayed in the \"{CultureInfo.CurrentCulture.EnglishName}\" culture: {field.Result}");

Assert.That(field.LocaleId, Is.EqualTo(1033));
// Changing the culture of our thread will impact the result of the DATE field.
// Another way to get the DATE field to display a date in a different culture is to use its LocaleId property.
// This way allows us to avoid changing the thread's culture to get this effect.
doc.FieldOptions.FieldUpdateCultureSource = FieldUpdateCultureSource.FieldCode;
CultureInfo de = new CultureInfo("de-DE");
field.LocaleId = de.LCID;
field.Update();

Console.WriteLine($"Today's date, as displayed according to the \"{CultureInfo.GetCultureInfo(field.LocaleId).EnglishName}\" culture: {field.Result}");
```

### See Also

* class [Field](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
