---
title: Remove
second_title: Aspose.Medical for .NET API Reference
description: Removes the first occurrence of a specific value from the element.
type: docs
weight: 90
url: /net/aspose.medical.dicom.elements/multivaluetextelement/remove/
---

## MultiValueTextElement.Remove method

Removes the first occurrence of a specific value from the element.

```csharp
public bool Remove(string value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The object to remove from the element. |

### Return Value

`true` if value is successfully removed; otherwise, `false`. This method also returns `false` if value was not found in the element.

### Exceptions

| exception | condition |
| --- | --- |
| [DicomValidationException](../../../aspose.medical.dicom.valuevalidation/dicomvalidationexception) | Number of values does not match Value Multiplicity. |

### See Also

* class [MultiValueTextElement](../../multivaluetextelement)
* namespace [Aspose.Medical.Dicom.Elements](../../multivaluetextelement)
* assembly [Aspose.Medical](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
