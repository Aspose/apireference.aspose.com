---
title: Scene.Save
second_title: Aspose.3D for .NET API Reference
description: Scene method. Saves the scene to stream using specified file format
type: docs
weight: 160
url: /net/aspose.threed/scene/save/
---
## Save(Stream, FileFormat) {#save}

Saves the scene to stream using specified file format.

```csharp
public void Save(Stream stream, FileFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Input stream, user is responsible for closing the stream. |
| format | FileFormat | Format. |

### Examples

The following code shows how to save scene

```csharp
Scene scene = Scene.FromFile("input.fbx");
using(var ms = new MemoryStream())
{
    scene.Save(ms, FileFormat.USDZ);
}
```

### See Also

* class [FileFormat](../../fileformat/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Save(Stream, FileFormat, CancellationToken) {#save_1}

Saves the scene to stream using specified file format.

```csharp
public void Save(Stream stream, FileFormat format, CancellationToken cancellationToken)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Input stream, user is responsible for closing the stream. |
| format | FileFormat | Format. |
| cancellationToken | CancellationToken | Cancellation token to the save task |

### Examples

The following code shows how to save scene

```csharp
Scene scene = Scene.FromFile("input.fbx");
var cts = new CancellationTokenSource();
using(var ms = new MemoryStream())
{
    scene.Save(ms, FileFormat.USDZ, cts.Token);
}
```

### See Also

* class [FileFormat](../../fileformat/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Save(Stream, SaveOptions) {#save_2}

Saves the scene to stream using specified file format.

```csharp
public void Save(Stream stream, SaveOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Input stream, user is responsible for closing the stream. |
| options | SaveOptions | More detailed configuration to save the stream. |

### Examples

The following code shows how to save scene

```csharp
Scene scene = Scene.FromFile("input.fbx");
var opt = new UsdSaveOptions();
opt.PrimitiveToMesh = true;
using(var ms = new MemoryStream())
{
    scene.Save(ms, opt);
}
```

### See Also

* class [SaveOptions](../../../aspose.threed.formats/saveoptions/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Save(Stream, SaveOptions, CancellationToken) {#save_3}

Saves the scene to stream using specified file format.

```csharp
public void Save(Stream stream, SaveOptions options, CancellationToken cancellationToken)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Input stream, user is responsible for closing the stream. |
| options | SaveOptions | More detailed configuration to save the stream. |
| cancellationToken | CancellationToken | Cancellation token to the save task |

### Examples

The following code shows how to save scene

```csharp
Scene scene = Scene.FromFile("input.fbx");
var cts = new CancellationTokenSource();
var opt = new UsdSaveOptions();
opt.PrimitiveToMesh = true;
using(var ms = new MemoryStream())
{
    scene.Save(ms, opt, cts.Token);
}
```

### See Also

* class [SaveOptions](../../../aspose.threed.formats/saveoptions/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Save(string) {#save_4}

Saves the scene to specified path using specified file format.

```csharp
public void Save(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |

### Examples

The following code shows how to save scene

```csharp
Scene scene = Scene.FromFile("input.fbx");
scene.Save("output.usdz");
```

### See Also

* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Save(string, FileFormat) {#save_5}

Saves the scene to specified path using specified file format.

```csharp
public void Save(string fileName, FileFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| format | FileFormat | Format. |

### Examples

The following code shows how to save scene

```csharp
Scene scene = Scene.FromFile("input.fbx");
scene.Save("output.usdz", FileFormat.USDZ);
```

### See Also

* class [FileFormat](../../fileformat/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Save(string, FileFormat, CancellationToken) {#save_6}

Saves the scene to specified path using specified file format.

```csharp
public void Save(string fileName, FileFormat format, CancellationToken cancellationToken)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| format | FileFormat | Format. |
| cancellationToken | CancellationToken | Cancellation token to the save task |

### Examples

The following code shows how to save scene

```csharp
var cts = new CancellationTokenSource();
Scene scene = Scene.FromFile("input.fbx");
scene.Save("output.usdz", FileFormat.USDZ, cts.Token);
```

### See Also

* class [FileFormat](../../fileformat/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Save(string, SaveOptions) {#save_7}

Saves the scene to specified path using specified file format.

```csharp
public void Save(string fileName, SaveOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| options | SaveOptions | More detailed configuration to save the stream. |

### Examples

The following code shows how to save scene

```csharp
var scene = Scene.FromFile("input.fbx");
var opts = new UsdSaveOptions();
opts.PrimitiveToMesh = true;
scene.Save("output.usdz", opts);
```

### See Also

* class [SaveOptions](../../../aspose.threed.formats/saveoptions/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Save(string, SaveOptions, CancellationToken) {#save_8}

Saves the scene to specified path using specified file format.

```csharp
public void Save(string fileName, SaveOptions options, CancellationToken cancellationToken)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| options | SaveOptions | More detailed configuration to save the stream. |
| cancellationToken | CancellationToken | Cancellation token to the save task |

### Examples

The following code shows how to save scene

```csharp
var cts = new CancellationTokenSource();
var scene = Scene.FromFile("input.fbx");
var opts = new UsdSaveOptions();
opts.PrimitiveToMesh = true;
scene.Save("output.usdz", opts, cts.Token);
```

### See Also

* class [SaveOptions](../../../aspose.threed.formats/saveoptions/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


