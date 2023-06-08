---
title: Image.Load
second_title: Aspose.CAD for .NET API Reference
description: Image method. Loads a new image from the specified file
type: docs
weight: 10
url: /net/aspose.cad/image/load/
---
## Load(string, LoadOptions) {#load_3}

Loads a new image from the specified file.

```csharp
public static Image Load(string filePath, LoadOptions loadOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path to load image from. |
| loadOptions | LoadOptions | The load options. |

### Return Value

The loaded drawing.

## Examples

Loads a drawing to process and unloads all related resources when dispose is called

```csharp
using (var image = Aspose.CAD.Image.Load("fileName.dwg", new LoadOptions
{
    UnloadOnDispose = true
}))
{
    // process the drawing
}
```

### See Also

* class [LoadOptions](../../loadoptions/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)

---

## Load(string) {#load_2}

Loads a new image from the specified file.

```csharp
public static Image Load(string filePath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path to load image from. |

### Return Value

The loaded drawing.

## Examples

Loads a drawing to process

```csharp
using (var image = Aspose.CAD.Image.Load("fileName.dwg"))
{
    // process the drawing
}
```

### See Also

* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)

---

## Load(Stream, LoadOptions) {#load_1}

Loads a new image from the specified stream.

```csharp
public static Image Load(Stream stream, LoadOptions loadOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The stream to load image from. |
| loadOptions | LoadOptions | The load options. |

### Return Value

The loaded drawing.

## Examples

Loads a drawing to process from corresponding stream and unloads all related resources when dispose is called

```csharp
using (var image = Aspose.CAD.Image.Load(File.OpenRead("fileName.dwg"), new LoadOptions
{
    UnloadOnDispose = true
}))
{
    // process the drawing
}
```

### See Also

* class [LoadOptions](../../loadoptions/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)

---

## Load(Stream) {#load}

Loads a new image from the specified stream.

```csharp
public static Image Load(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The stream to load image from. |

### Return Value

The loaded drawing.

## Examples

Loads a drawing to process from corresponding stream

```csharp
using (var image = Aspose.CAD.Image.Load(File.OpenRead("fileName.dwg"))
{
    // process the drawing
}
```

### See Also

* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)


