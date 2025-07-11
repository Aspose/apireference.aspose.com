---
title: IFieldResultFormatter.Format
linktitle: Format
articleTitle: Format
second_title: Aspose.Words for .NET
description: Discover the iFieldResultFormatter Format method in Aspose.Words that enhances document formatting with customizable capitalization options like Upper case.
type: docs
weight: 10
url: /net/aspose.words.fields/ifieldresultformatter/format/
---
## Format(*string, [GeneralFormat](../../generalformat/)*) {#format_1}

Called when Aspose.Words applies a capitalization format switch, i.e. \* Upper.

```csharp
public string Format(string value, GeneralFormat format)
```

## Remarks

The implementation should return `null` to indicate that the default formatting should be applied.

## Examples

Shows how to automatically apply a custom format to field results as the fields are updated.

```csharp
public void FieldResultFormatting()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);
    FieldResultFormatter formatter = new FieldResultFormatter("${0}", "Date: {0}", "Item # {0}:");
    doc.FieldOptions.ResultFormatter = formatter;

    // Our field result formatter applies a custom format to newly created fields of three types of formats.
    // Field result formatters apply new formatting to fields as they are updated,
    // which happens as soon as we create them using this InsertField method overload.
    // 1 -  Numeric:
    builder.InsertField(" = 2 + 3 \\# $###");

    Assert.That(doc.Range.Fields[0].Result, Is.EqualTo("$5"));
    Assert.That(formatter.CountFormatInvocations(FieldResultFormatter.FormatInvocationType.Numeric), Is.EqualTo(1));

    // 2 -  Date/time:
    builder.InsertField("DATE \\@ \"d MMMM yyyy\"");

    Assert.That(doc.Range.Fields[1].Result.StartsWith("Date: "), Is.True);
    Assert.That(formatter.CountFormatInvocations(FieldResultFormatter.FormatInvocationType.DateTime), Is.EqualTo(1));

    // 3 -  General:
    builder.InsertField("QUOTE \"2\" \\* Ordinal");

    Assert.That(doc.Range.Fields[2].Result, Is.EqualTo("Item # 2:"));
    Assert.That(formatter.CountFormatInvocations(FieldResultFormatter.FormatInvocationType.General), Is.EqualTo(1));

    formatter.PrintFormatInvocations();
}

/// <summary>
/// When fields with formatting are updated, this formatter will override their formatting
/// with a custom format, while tracking every invocation.
/// </summary>
private class FieldResultFormatter : IFieldResultFormatter
{
    public FieldResultFormatter(string numberFormat, string dateFormat, string generalFormat)
    {
        mNumberFormat = numberFormat;
        mDateFormat = dateFormat;
        mGeneralFormat = generalFormat;
    }

    public string FormatNumeric(double value, string format)
    {
        if (string.IsNullOrEmpty(mNumberFormat))
            return null;

        string newValue = String.Format(mNumberFormat, value);
        FormatInvocations.Add(new FormatInvocation(FormatInvocationType.Numeric, value, format, newValue));
        return newValue;
    }

    public string FormatDateTime(DateTime value, string format, CalendarType calendarType)
    {
        if (string.IsNullOrEmpty(mDateFormat))
            return null;

        string newValue = String.Format(mDateFormat, value);
        FormatInvocations.Add(new FormatInvocation(FormatInvocationType.DateTime, $"{value} ({calendarType})", format, newValue));
        return newValue;
    }

    public string Format(string value, GeneralFormat format)
    {
        return Format((object)value, format);
    }

    public string Format(double value, GeneralFormat format)
    {
        return Format((object)value, format);
    }

    private string Format(object value, GeneralFormat format)
    {
        if (string.IsNullOrEmpty(mGeneralFormat))
            return null;

        string newValue = String.Format(mGeneralFormat, value);
        FormatInvocations.Add(new FormatInvocation(FormatInvocationType.General, value, format.ToString(), newValue));
        return newValue;
    }

    public int CountFormatInvocations(FormatInvocationType formatInvocationType)
    {
        if (formatInvocationType == FormatInvocationType.All)
            return FormatInvocations.Count;
        return FormatInvocations.Count(f => f.FormatInvocationType == formatInvocationType);
    }

    public void PrintFormatInvocations()
    {
        foreach (FormatInvocation f in FormatInvocations)
            Console.WriteLine($"Invocation type:\t{f.FormatInvocationType}\n" +
                              $"\tOriginal value:\t\t{f.Value}\n" +
                              $"\tOriginal format:\t{f.OriginalFormat}\n" +
                              $"\tNew value:\t\t\t{f.NewValue}\n");
    }

    private readonly string mNumberFormat;
    private readonly string mDateFormat;
    private readonly string mGeneralFormat;
    private List<FormatInvocation> FormatInvocations { get; } = new List<FormatInvocation>();

    private class FormatInvocation
    {
        public FormatInvocationType FormatInvocationType { get; }
        public object Value { get; }
        public string OriginalFormat { get; }
        public string NewValue { get; }

        public FormatInvocation(FormatInvocationType formatInvocationType, object value, string originalFormat, string newValue)
        {
            Value = value;
            FormatInvocationType = formatInvocationType;
            OriginalFormat = originalFormat;
            NewValue = newValue;
        }
    }

    public enum FormatInvocationType
    {
        Numeric, DateTime, General, All
    }
}
```

### See Also

* enum [GeneralFormat](../../generalformat/)
* interface [IFieldResultFormatter](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)

---

## Format(*double, [GeneralFormat](../../generalformat/)*) {#format}

Called when Aspose.Words applies a number format switch, i.e. \* Ordinal.

```csharp
public string Format(double value, GeneralFormat format)
```

## Remarks

The implementation should return `null` to indicate that the default formatting should be applied.

## Examples

Shows how to automatically apply a custom format to field results as the fields are updated.

```csharp
public void FieldResultFormatting()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);
    FieldResultFormatter formatter = new FieldResultFormatter("${0}", "Date: {0}", "Item # {0}:");
    doc.FieldOptions.ResultFormatter = formatter;

    // Our field result formatter applies a custom format to newly created fields of three types of formats.
    // Field result formatters apply new formatting to fields as they are updated,
    // which happens as soon as we create them using this InsertField method overload.
    // 1 -  Numeric:
    builder.InsertField(" = 2 + 3 \\# $###");

    Assert.That(doc.Range.Fields[0].Result, Is.EqualTo("$5"));
    Assert.That(formatter.CountFormatInvocations(FieldResultFormatter.FormatInvocationType.Numeric), Is.EqualTo(1));

    // 2 -  Date/time:
    builder.InsertField("DATE \\@ \"d MMMM yyyy\"");

    Assert.That(doc.Range.Fields[1].Result.StartsWith("Date: "), Is.True);
    Assert.That(formatter.CountFormatInvocations(FieldResultFormatter.FormatInvocationType.DateTime), Is.EqualTo(1));

    // 3 -  General:
    builder.InsertField("QUOTE \"2\" \\* Ordinal");

    Assert.That(doc.Range.Fields[2].Result, Is.EqualTo("Item # 2:"));
    Assert.That(formatter.CountFormatInvocations(FieldResultFormatter.FormatInvocationType.General), Is.EqualTo(1));

    formatter.PrintFormatInvocations();
}

/// <summary>
/// When fields with formatting are updated, this formatter will override their formatting
/// with a custom format, while tracking every invocation.
/// </summary>
private class FieldResultFormatter : IFieldResultFormatter
{
    public FieldResultFormatter(string numberFormat, string dateFormat, string generalFormat)
    {
        mNumberFormat = numberFormat;
        mDateFormat = dateFormat;
        mGeneralFormat = generalFormat;
    }

    public string FormatNumeric(double value, string format)
    {
        if (string.IsNullOrEmpty(mNumberFormat))
            return null;

        string newValue = String.Format(mNumberFormat, value);
        FormatInvocations.Add(new FormatInvocation(FormatInvocationType.Numeric, value, format, newValue));
        return newValue;
    }

    public string FormatDateTime(DateTime value, string format, CalendarType calendarType)
    {
        if (string.IsNullOrEmpty(mDateFormat))
            return null;

        string newValue = String.Format(mDateFormat, value);
        FormatInvocations.Add(new FormatInvocation(FormatInvocationType.DateTime, $"{value} ({calendarType})", format, newValue));
        return newValue;
    }

    public string Format(string value, GeneralFormat format)
    {
        return Format((object)value, format);
    }

    public string Format(double value, GeneralFormat format)
    {
        return Format((object)value, format);
    }

    private string Format(object value, GeneralFormat format)
    {
        if (string.IsNullOrEmpty(mGeneralFormat))
            return null;

        string newValue = String.Format(mGeneralFormat, value);
        FormatInvocations.Add(new FormatInvocation(FormatInvocationType.General, value, format.ToString(), newValue));
        return newValue;
    }

    public int CountFormatInvocations(FormatInvocationType formatInvocationType)
    {
        if (formatInvocationType == FormatInvocationType.All)
            return FormatInvocations.Count;
        return FormatInvocations.Count(f => f.FormatInvocationType == formatInvocationType);
    }

    public void PrintFormatInvocations()
    {
        foreach (FormatInvocation f in FormatInvocations)
            Console.WriteLine($"Invocation type:\t{f.FormatInvocationType}\n" +
                              $"\tOriginal value:\t\t{f.Value}\n" +
                              $"\tOriginal format:\t{f.OriginalFormat}\n" +
                              $"\tNew value:\t\t\t{f.NewValue}\n");
    }

    private readonly string mNumberFormat;
    private readonly string mDateFormat;
    private readonly string mGeneralFormat;
    private List<FormatInvocation> FormatInvocations { get; } = new List<FormatInvocation>();

    private class FormatInvocation
    {
        public FormatInvocationType FormatInvocationType { get; }
        public object Value { get; }
        public string OriginalFormat { get; }
        public string NewValue { get; }

        public FormatInvocation(FormatInvocationType formatInvocationType, object value, string originalFormat, string newValue)
        {
            Value = value;
            FormatInvocationType = formatInvocationType;
            OriginalFormat = originalFormat;
            NewValue = newValue;
        }
    }

    public enum FormatInvocationType
    {
        Numeric, DateTime, General, All
    }
}
```

### See Also

* enum [GeneralFormat](../../generalformat/)
* interface [IFieldResultFormatter](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
