---
title: FieldDate.UseLunarCalendar
linktitle: UseLunarCalendar
articleTitle: UseLunarCalendar
second_title: Aspose.Words for .NET
description: Optimize your date management with FieldDate's UseLunarCalendar property. Easily switch between Hijri and Hebrew Lunar calendars for enhanced functionality.
type: docs
weight: 30
url: /net/aspose.words.fields/fielddate/uselunarcalendar/
---
## FieldDate.UseLunarCalendar property

Gets or sets whether to use the Hijri Lunar or Hebrew Lunar calendar.

```csharp
public bool UseLunarCalendar { get; set; }
```

## Examples

Shows how to use DATE fields to display dates according to different kinds of calendars.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// If we want the text in the document always to display the correct date, we can use a DATE field.
// Below are three types of cultural calendars that a DATE field can use to display a date.
// 1 -  Islamic Lunar Calendar:
FieldDate field = (FieldDate)builder.InsertField(FieldType.FieldDate, true);
field.UseLunarCalendar = true;
Assert.That(field.GetFieldCode(), Is.EqualTo(" DATE  \\h"));
builder.Writeln();

// 2 -  Umm al-Qura calendar:
field = (FieldDate)builder.InsertField(FieldType.FieldDate, true);
field.UseUmAlQuraCalendar = true;
Assert.That(field.GetFieldCode(), Is.EqualTo(" DATE  \\u"));
builder.Writeln();

// 3 -  Indian National Calendar:
field = (FieldDate)builder.InsertField(FieldType.FieldDate, true);
field.UseSakaEraCalendar = true;
Assert.That(field.GetFieldCode(), Is.EqualTo(" DATE  \\s"));
builder.Writeln();

// Insert a DATE field and set its calendar type to the one last used by the host application.
// In Microsoft Word, the type will be the most recently used in the Insert -> Text -> Date and Time dialog box.
field = (FieldDate)builder.InsertField(FieldType.FieldDate, true);
field.UseLastFormat = true;
Assert.That(field.GetFieldCode(), Is.EqualTo(" DATE  \\l"));
builder.Writeln();

doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.DATE.docx");
```

### See Also

* class [FieldDate](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
