---
title: FormEditor.DelListItem
second_title: Aspose.PDF for .NET API Reference
description: FormEditor method. Delete item from the list field
type: docs
weight: 180
url: /net/aspose.pdf.facades/formeditor/dellistitem/
---
## FormEditor.DelListItem method

Delete item from the list field.

```csharp
public void DelListItem(string fieldName, string itemName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fieldName | String | Name of the field. |
| itemName | String | Name of the item which must be deleted. |

## Examples

```csharp
formEditor = new Aspose.Pdf.Facades.FormEditor("PdfForm.pdf", "FormEditor_DelListItem.pdf");
formEditor.DelListItem("listboxField", "item2");
```

### See Also

* class [FormEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)


