---
title: TypedArrayT Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.TypedArray1T class. TypedArray objects present an array-like view of an underlying binary data buffer
type: docs
weight: 6210
url: /net/aspose.svg/typedarray-1/
---
## TypedArray&lt;T&gt; class

TypedArray objects present an array-like view of an underlying binary data buffer.

```csharp
public abstract class TypedArray<T> : TypedArray
    where T : struct
```

| Parameter | Description |
| --- | --- |
| T | The data type. |

## Properties

| Name | Description |
| --- | --- |
| [Buffer](../../aspose.svg/typedarray/buffer/) { get; } | Gets the ArrayBuffer referenced by this instance. |
| [ByteLength](../../aspose.svg/typedarray/bytelength/) { get; } | Gets the byteLength accessor property represents the length of an ArrayBuffer in bytes. |
| [ByteOffset](../../aspose.svg/typedarray/byteoffset/) { get; } | Gets the byteOffset from the start of referenced ArrayBuffer. |
| abstract [Item](../../aspose.svg/typedarray-1/item/) { get; set; } | Gets or sets the !:T at the specified index. |
| [Length](../../aspose.svg/typedarray/length/) { get; } | Gets the length of a typed array. |

## Methods

| Name | Description |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |

### See Also

* class [TypedArray](../typedarray/)
* namespace [Aspose.Svg](../../aspose.svg/)
* assembly [Aspose.SVG](../../)
