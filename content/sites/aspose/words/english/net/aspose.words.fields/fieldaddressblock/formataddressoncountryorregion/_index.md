---
title: FieldAddressBlock.FormatAddressOnCountryOrRegion
linktitle: FormatAddressOnCountryOrRegion
articleTitle: FormatAddressOnCountryOrRegion
second_title: Aspose.Words for .NET
description: Optimize address formatting with the FieldAddressBlock FormatAddressOnCountryOrRegion property, ensuring compliance with global postal standards for accurate delivery.
type: docs
weight: 30
url: /net/aspose.words.fields/fieldaddressblock/formataddressoncountryorregion/
---
## FieldAddressBlock.FormatAddressOnCountryOrRegion property

Gets or sets whether to format the address according to the country/region of the recipient as defined by POST*CODE (Universal Postal Union 2006).

```csharp
public bool FormatAddressOnCountryOrRegion { get; set; }
```

## Examples

Shows how to insert an ADDRESSBLOCK field.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

FieldAddressBlock field = (FieldAddressBlock)builder.InsertField(FieldType.FieldAddressBlock, true);

Assert.That(field.GetFieldCode(), Is.EqualTo(" ADDRESSBLOCK "));

// Setting this to "2" will include all countries and regions,
// unless it is the one specified in the ExcludedCountryOrRegionName property.
field.IncludeCountryOrRegionName = "2";
field.FormatAddressOnCountryOrRegion = true;
field.ExcludedCountryOrRegionName = "United States";
field.NameAndAddressFormat = "<Title> <Forename> <Surname> <Address Line 1> <Region> <Postcode> <Country>";

// By default, this property will contain the language ID of the first character of the document.
// We can set a different culture for the field to format the result with like this.
field.LanguageId = new CultureInfo("en-US").LCID.ToString();

Assert.That(field.GetFieldCode(), Is.EqualTo(" ADDRESSBLOCK  \\c 2 \\d \\e \"United States\" \\f \"<Title> <Forename> <Surname> <Address Line 1> <Region> <Postcode> <Country>\" \\l 1033"));
```

### See Also

* class [FieldAddressBlock](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
