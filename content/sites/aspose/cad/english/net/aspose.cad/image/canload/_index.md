---
title: Image.CanLoad
second_title: Aspose.CAD for .NET API Reference
description: Image method. Determines whether image can be loaded from the specified file path
type: docs
weight: 160
url: /net/aspose.cad/image/canload/
---
## CanLoad(string) {#canload_2}

Determines whether image can be loaded from the specified file path.

```csharp
public static bool CanLoad(string filePath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path. |

### Return Value

`true` if image can be loaded from the specified file; otherwise, `false`.

## Examples

Checks whether loading of a drawing is possible

```csharp
var fileName = @"C:\path\drawing.dwg";
if (Aspose.CAD.Image.CanLoad(fileName))
{
    using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName))
    {
        // process the drawing
    }
}
```

### See Also

* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)

---

## CanLoad(string, LoadOptions) {#canload_3}

Determines whether an image can be loaded from the specified file path and optionally using the specified open options

```csharp
public static bool CanLoad(string filePath, LoadOptions loadOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path. |
| loadOptions | LoadOptions | The load options. |

### Return Value

`true` if an image can be loaded from the specified file; otherwise, `false`.

## Examples

Checks whether loading of a drawing is possible with specified encoding

```csharp
var fileName = @"C:\path\drawing.dwg";
if (Aspose.CAD.Image.CanLoad(fileName, new LoadOptions
{
    SpecifiedEncoding = CodePages.Japanese
}))
{
    using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName))
    {
        // process the drawing
    }
}
```

### See Also

* class [LoadOptions](../../loadoptions/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)

---

## CanLoad(Stream) {#canload}

Determines whether image can be loaded from the specified stream.

```csharp
public static bool CanLoad(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The stream to load from. |

### Return Value

`true` if image can be loaded from the specified stream; otherwise, `false`.

## Examples

Checks whether loading of a drawing is possible from the stream specified

```csharp
using (var f = File.OpenRead("file.dxf"))
{
    var currentPosition = f.Position;
    if (Image.CanLoad(f))
    {
        Assert.AreEqual(currentPosition, f.Position);
        // process the drawing...
    }
}
```

### See Also

* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)

---

## CanLoad(Stream, LoadOptions) {#canload_1}

Determines whether image can be loaded from the specified stream and optionally using the specified *loadOptions*.

```csharp
public static bool CanLoad(Stream stream, LoadOptions loadOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The stream to load from. |
| loadOptions | LoadOptions | The load options. |

### Return Value

`true` if image can be loaded from the specified stream; otherwise, `false`.

## Examples

Checks whether loading of a drawing is possible from the stream specified with a corresponding encoding

```csharp
using (var f = File.OpenRead("file.dwg", new LoadOptions
{
    SpecifiedEncoding = CodePages.Japanese
}))
{
    var currentPosition = f.Position;
    if (Image.CanLoad(f))
    {
        Assert.AreEqual(currentPosition, f.Position);
        // process the drawing...
    }
}
```

### See Also

* class [LoadOptions](../../loadoptions/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)


