---
title: MappedDataFieldCollection.ContainsValue
linktitle: ContainsValue
articleTitle: ContainsValue
second_title: Aspose.Words for .NET
description: Discover if a field mapping exists in MappedDataFieldCollection with the ContainsValue method. Enhance your data management efficiency today!
type: docs
weight: 60
url: /net/aspose.words.mailmerging/mappeddatafieldcollection/containsvalue/
---
## MappedDataFieldCollection.ContainsValue method

Determines whether a mapping from the specified field in the data source exists in the collection.

```csharp
public bool ContainsValue(string dataSourceFieldName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| dataSourceFieldName | String | Case-sensitive name of the field in the data source. |

### Return Value

`true` if item is found in the collection; otherwise, `false`.

## Examples

Shows how to map data columns and MERGEFIELDs with different names so the data is transferred between them during a mail merge.

```csharp
public void MappedDataFieldCollection()
{
    Document doc = CreateSourceDocMappedDataFields();
    DataTable dataTable = CreateSourceTableMappedDataFields();

    // The table has a column named "Column2", but there are no MERGEFIELDs with that name.
    // Also, we have a MERGEFIELD named "Column3", but the data source does not have a column with that name.
    // If data from "Column2" is suitable for the "Column3" MERGEFIELD,
    // we can map that column name to the MERGEFIELD in the "MappedDataFields" key/value pair.
    MappedDataFieldCollection mappedDataFields = doc.MailMerge.MappedDataFields;

    // We can link a data source column name to a MERGEFIELD name like this.
    mappedDataFields.Add("MergeFieldName", "DataSourceColumnName");

    // Link the data source column named "Column2" to MERGEFIELDs named "Column3".
    mappedDataFields.Add("Column3", "Column2");

    // The MERGEFIELD name is the "key" to the respective data source column name "value".
    Assert.That(mappedDataFields["MergeFieldName"], Is.EqualTo("DataSourceColumnName"));
    Assert.That(mappedDataFields.ContainsKey("MergeFieldName"), Is.True);
    Assert.That(mappedDataFields.ContainsValue("DataSourceColumnName"), Is.True);

    // Now if we run this mail merge, the "Column3" MERGEFIELDs will take data from "Column2" of the table.
    doc.MailMerge.Execute(dataTable);

    doc.Save(ArtifactsDir + "MailMerge.MappedDataFieldCollection.docx");

    // We can iterate over the elements in this collection.
    Assert.That(mappedDataFields.Count, Is.EqualTo(2));

    using (IEnumerator<KeyValuePair<string, string>> enumerator = mappedDataFields.GetEnumerator())
        while (enumerator.MoveNext())
            Console.WriteLine(
                $"Column named {enumerator.Current.Value} is mapped to MERGEFIELDs named {enumerator.Current.Key}");

    // We can also remove elements from the collection.
    mappedDataFields.Remove("MergeFieldName");

    Assert.That(mappedDataFields.ContainsKey("MergeFieldName"), Is.False);
    Assert.That(mappedDataFields.ContainsValue("DataSourceColumnName"), Is.False);

    mappedDataFields.Clear();

    Assert.That(mappedDataFields.Count, Is.EqualTo(0));
}

/// <summary>
/// Create a document with 2 MERGEFIELDs, one of which does not have a
/// corresponding column in the data table from the method below.
/// </summary>
private static Document CreateSourceDocMappedDataFields()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    builder.InsertField(" MERGEFIELD Column1");
    builder.Write(", ");
    builder.InsertField(" MERGEFIELD Column3");

    return doc;
}

/// <summary>
/// Create a data table with 2 columns, one of which does not have a
/// corresponding MERGEFIELD in the source document from the method above.
/// </summary>
private static DataTable CreateSourceTableMappedDataFields()
{
    DataTable dataTable = new DataTable("MyTable");
    dataTable.Columns.Add("Column1");
    dataTable.Columns.Add("Column2");
    dataTable.Rows.Add(new object[] { "Value1", "Value2" });

    return dataTable;
}
```

### See Also

* class [MappedDataFieldCollection](../)
* namespace [Aspose.Words.MailMerging](../../../aspose.words.mailmerging/)
* assembly [Aspose.Words](../../../)
