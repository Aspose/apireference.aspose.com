---
title: CosPdfDictionary.Remove
second_title: Aspose.PDF for .NET API Reference
description: CosPdfDictionary method. Removes the element with the specified key from the CosPdfDictionary
type: docs
weight: 150
url: /net/aspose.pdf.dataeditor/cospdfdictionary/remove/
---
## Remove(string) {#remove_1}

Removes the element with the specified key from the [`CosPdfDictionary`](../).

```csharp
public bool Remove(string key)
```

| Parameter | Type | Description |
| --- | --- | --- |
| key | String | The key of the element to remove. |

### Return Value

True if the element is successfully removed; otherwise, false. This method also returns false if key was not found in the original dictionary or key the key is not editable

### See Also

* class [CosPdfDictionary](../)
* namespace [Aspose.Pdf.DataEditor](../../../aspose.pdf.dataeditor/)
* assembly [Aspose.PDF](../../../)

---

## Remove(KeyValuePair&lt;string, ICosPdfPrimitive&gt;) {#remove}

Removes the first occurrence of a specific object from the [`CosPdfDictionary`](../).

```csharp
public bool Remove(KeyValuePair<string, ICosPdfPrimitive> item)
```

| Parameter | Type | Description |
| --- | --- | --- |
| item | KeyValuePair`2 | The object to remove from the [`CosPdfDictionary`](../). |

### Return Value

true if item was successfully removed from the [`CosPdfDictionary`](../); otherwise, false. This method also returns false if item is not found in the original [`CosPdfDictionary`](../).

### See Also

* interface [ICosPdfPrimitive](../../icospdfprimitive/)
* class [CosPdfDictionary](../)
* namespace [Aspose.Pdf.DataEditor](../../../aspose.pdf.dataeditor/)
* assembly [Aspose.PDF](../../../)


