---
title: OdsoDataSourceType Enum
linktitle: OdsoDataSourceType
articleTitle: OdsoDataSourceType
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words OdsoDataSourceType enum to easily connect to external data sources, enhancing your document processing capabilities.
type: docs
weight: 6720
url: /net/aspose.words.settings/odsodatasourcetype/
---
## OdsoDataSourceType enumeration

Specifies the type of the external data source to be connected to as part of the ODSO connection information.

```csharp
public enum OdsoDataSourceType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Text | `0` | Specifies that a given document has been connected to a text file. Possibly wdMergeSubTypeOther. |
| Database | `1` | Specifies that a given document has been connected to a database. Possibly wdMergeSubTypeAccess. |
| AddressBook | `2` | Specifies that a given document has been connected to an address book of contacts. Possibly wdMergeSubTypeOAL. |
| Document1 | `3` | Specifies that a given document has been connected to another document format supported by the producing application. Possibly wdMergeSubTypeOLEDBWord. |
| Document2 | `4` | Specifies that a given document has been connected to another document format supported by the producing application. Possibly wdMergeSubTypeWorks. |
| Native | `5` | Specifies that a given document has been connected to another document format native to the producing application. Possibly wdMergeSubTypeOLEDBText |
| Email | `6` | Specifies that a given document has been connected to an e-mail application. Possibly wdMergeSubTypeOutlook. |
| None | `7` | The type of the external data source is not specified. Possibly wdMergeSubTypeWord. |
| Legacy | `8` | Specifies that a given document has been connected to a legacy document format supported by the producing application Possibly wdMergeSubTypeWord2000. |
| Master | `9` | Specifies that a given document has been connected to a data source which aggregates other data sources. |
| Default | `7` | Equals to None. |

## Remarks

The OOXML specification is very vague for this enum. I guess it might correspond to the WdMergeSubType enumeration http://msdn.microsoft.com/en-us/library/bb237801.aspx.

## Examples

Shows how to execute a mail merge with data from an Office Data Source Object.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Dear ");
builder.InsertField("MERGEFIELD FirstName", "<FirstName>");
builder.Write(" ");
builder.InsertField("MERGEFIELD LastName", "<LastName>");
builder.Writeln(": ");
builder.InsertField("MERGEFIELD Message", "<Message>");

// Create a data source in the form of an ASCII file, with the "|" character
// acting as the delimiter that separates columns. The first line contains the three columns' names,
// and each subsequent line is a row with their respective values.
string[] lines = { "FirstName|LastName|Message",
    "John|Doe|Hello! This message was created with Aspose Words mail merge." };
string dataSrcFilename = ArtifactsDir + "MailMerge.MailMergeSettings.DataSource.txt";

File.WriteAllLines(dataSrcFilename, lines);

MailMergeSettings settings = doc.MailMergeSettings;
settings.MainDocumentType = MailMergeMainDocumentType.MailingLabels;
settings.CheckErrors = MailMergeCheckErrors.Simulate;
settings.DataType = MailMergeDataType.Native;
settings.DataSource = dataSrcFilename;
settings.Query = "SELECT * FROM " + doc.MailMergeSettings.DataSource;
settings.LinkToQuery = true;
settings.ViewMergedData = true;

Assert.That(settings.Destination, Is.EqualTo(MailMergeDestination.Default));
Assert.That(settings.DoNotSupressBlankLines, Is.False);

Odso odso = settings.Odso;
odso.DataSource = dataSrcFilename;
odso.DataSourceType = OdsoDataSourceType.Text;
odso.ColumnDelimiter = '|';
odso.FirstRowContainsColumnNames = true;

Assert.That(odso.Clone(), Is.Not.SameAs(odso));
Assert.That(settings.Clone(), Is.Not.SameAs(settings));

// Opening this document in Microsoft Word will execute the mail merge before displaying the contents. 
doc.Save(ArtifactsDir + "MailMerge.MailMergeSettings.docx");
```

### See Also

* namespace [Aspose.Words.Settings](../../aspose.words.settings/)
* assembly [Aspose.Words](../../)
