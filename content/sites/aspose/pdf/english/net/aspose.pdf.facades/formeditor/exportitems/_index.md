---
title: FormEditor.ExportItems
second_title: Aspose.PDF for .NET API Reference
description: FormEditor property. Sets options for combo box with export values
type: docs
weight: 30
url: /net/aspose.pdf.facades/formeditor/exportitems/
---
## FormEditor.ExportItems property

Sets options for combo box with export values.

```csharp
public string[][] ExportItems { get; set; }
```

## Examples

```csharp
FormEditor formEditor = new FormEditor("PdfForm.pdf", "PdfForm_Updated.pdf"));
formEditor.ExportItems = new string[][] 
{ 
    new string[] { "1", "Firs" }, 
    new string[] { "2", "Second" }, 
    new string[] { "3", "Third" } 
};
formEditor.AddField(FieldType.ListBox, "AddedListBoxField", "Second", 1, 10, 30, 110, 130);
formEditor.Save();
```

### See Also

* class [FormEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)


