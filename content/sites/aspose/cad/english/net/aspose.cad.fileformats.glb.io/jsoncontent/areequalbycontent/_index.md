---
title: JsonContent.AreEqualByContent
second_title: Aspose.CAD for .NET API Reference
description: JsonContent method. Compares two JsonContent objects for equality
type: docs
weight: 120
url: /net/aspose.cad.fileformats.glb.io/jsoncontent/areequalbycontent/
---
## JsonContent.AreEqualByContent method

Compares two [`JsonContent`](../) objects for equality.

```csharp
public static bool AreEqualByContent(JsonContent a, JsonContent b, float precission)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | JsonContent | The first object to compare. |
| b | JsonContent | The second object to compare. |
| precission | Single | The precission threshold when comparing floating point values. |

### Return Value

true if the objects are considered equal

## Remarks

- Comparing json structures is tricky because the values are typeless, so when we parse a json DOM into memory we don't know which should be the right type to use for comparison. - Also, System.Text.JSon is roundtrip safe when used in Net Core, but it is not when used in Net Framework, so depending on the framework we use, floating point roundtrips will behave differently.

### See Also

* struct [JsonContent](../)
* namespace [Aspose.CAD.FileFormats.GLB.IO](../../jsoncontent/)
* assembly [Aspose.CAD](../../../)


