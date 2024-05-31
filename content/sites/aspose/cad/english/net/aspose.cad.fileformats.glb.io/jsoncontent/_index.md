---
title: Struct JsonContent
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.IO.JsonContent struct. Represents an immutable json object stored in memory
type: docs
weight: 10730
url: /net/aspose.cad.fileformats.glb.io/jsoncontent/
---
## JsonContent structure

Represents an immutable json object stored in memory.

```csharp
public struct JsonContent : ICloneable, IEquatable<JsonContent>
```

## Properties

| Name | Description |
| --- | --- |
| [Content](../../aspose.cad.fileformats.glb.io/jsoncontent/content/) { get; } | Gets the dynamic json structure. |

## Methods

| Name | Description |
| --- | --- |
| static [CreateFrom](../../aspose.cad.fileformats.glb.io/jsoncontent/createfrom/#createfrom_2)(IConvertible) |  |
| static [CreateFrom](../../aspose.cad.fileformats.glb.io/jsoncontent/createfrom/#createfrom)(IDictionary) |  |
| static [CreateFrom](../../aspose.cad.fileformats.glb.io/jsoncontent/createfrom/#createfrom_1)(IList) |  |
| [DeepClone](../../aspose.cad.fileformats.glb.io/jsoncontent/deepclone/)() |  |
| [Equals](../../aspose.cad.fileformats.glb.io/jsoncontent/equals/#equals)(JsonContent) |  |
| override [Equals](../../aspose.cad.fileformats.glb.io/jsoncontent/equals/#equals_1)(object) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.io/jsoncontent/gethashcode/)() |  |
| [GetNode](../../aspose.cad.fileformats.glb.io/jsoncontent/getnode/)(params IConvertible[]) |  |
| [GetValue&lt;T&gt;](../../aspose.cad.fileformats.glb.io/jsoncontent/getvalue/)(params IConvertible[]) |  |
| static [AreEqualByContent](../../aspose.cad.fileformats.glb.io/jsoncontent/areequalbycontent/)(JsonContent, JsonContent, float) | Compares two `JsonContent` objects for equality. |
| static [IsJsonSerializable](../../aspose.cad.fileformats.glb.io/jsoncontent/isjsonserializable/#isjsonserializable)(object) |  |
| static [IsJsonSerializable](../../aspose.cad.fileformats.glb.io/jsoncontent/isjsonserializable/#isjsonserializable_1)(object, out object) |  |
| [implicit operator](../../aspose.cad.fileformats.glb.io/jsoncontent/op_implicit/#op_implicit) |  (6 operators) |

## Remarks

The data structure is stored in memory as a DOM, using standard objects and collections. Use JsonSerializerSettings) and JsonSerializerSettings) to convert to your types. Use !:Parse(JsonDocument) and JsonSerializerSettings) to convert from/to raw json text.

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.IO](../../aspose.cad.fileformats.glb.io/)
* assembly [Aspose.CAD](../../)


