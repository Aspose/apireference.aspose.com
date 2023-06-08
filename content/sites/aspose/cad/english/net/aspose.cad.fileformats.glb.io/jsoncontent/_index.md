---
title: Struct JsonContent
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.IO.JsonContent struct. Represents an immutable json object stored in memory
type: docs
weight: 10390
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
| static [Parse](../../aspose.cad.fileformats.glb.io/jsoncontent/parse/#parse_1)(JsonDocument) |  |
| static [Parse](../../aspose.cad.fileformats.glb.io/jsoncontent/parse/#parse)(string, JsonDocumentOptions) | Parses a json text an converts it to a `JsonContent` |
| static [Serialize](../../aspose.cad.fileformats.glb.io/jsoncontent/serialize/)(object, JsonSerializerOptions) | Converts the value of a specified type into a `JsonContent` using JsonSerializer. |
| [DeepClone](../../aspose.cad.fileformats.glb.io/jsoncontent/deepclone/)() |  |
| [Deserialize](../../aspose.cad.fileformats.glb.io/jsoncontent/deserialize/#deserialize)(Type, JsonSerializerOptions) |  |
| [Deserialize&lt;T&gt;](../../aspose.cad.fileformats.glb.io/jsoncontent/deserialize/#deserialize_1)(JsonSerializerOptions) |  |
| [Equals](../../aspose.cad.fileformats.glb.io/jsoncontent/equals/#equals)(JsonContent) |  |
| override [Equals](../../aspose.cad.fileformats.glb.io/jsoncontent/equals/#equals_1)(object) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.io/jsoncontent/gethashcode/)() |  |
| [GetNode](../../aspose.cad.fileformats.glb.io/jsoncontent/getnode/)(params IConvertible[]) |  |
| [GetValue&lt;T&gt;](../../aspose.cad.fileformats.glb.io/jsoncontent/getvalue/)(params IConvertible[]) |  |
| [ToJson](../../aspose.cad.fileformats.glb.io/jsoncontent/tojson/)(JsonSerializerOptions) |  |
| static [AreEqualByContent](../../aspose.cad.fileformats.glb.io/jsoncontent/areequalbycontent/)(JsonContent, JsonContent, float) | Compares two `JsonContent` objects for equality. |
| static [IsJsonSerializable](../../aspose.cad.fileformats.glb.io/jsoncontent/isjsonserializable/#isjsonserializable)(object) |  |
| static [IsJsonSerializable](../../aspose.cad.fileformats.glb.io/jsoncontent/isjsonserializable/#isjsonserializable_1)(object, out object) |  |
| [implicit operator](../../aspose.cad.fileformats.glb.io/jsoncontent/op_implicit/#op_implicit) |  (6 operators) |

## Remarks

The data structure is stored in memory as a DOM, using standard objects and collections. Use [`Serialize`](./serialize/) and [`Deserialize`](./deserialize/) to convert to your types. Use [`Parse`](./parse/) and [`ToJson`](./tojson/) to convert from/to raw json text.

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.IO](../../aspose.cad.fileformats.glb.io/)
* assembly [Aspose.CAD](../../)


