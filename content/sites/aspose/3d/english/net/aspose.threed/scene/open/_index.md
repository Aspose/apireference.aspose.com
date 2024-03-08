---
title: Open
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 140
url: /net/aspose.threed/scene/open/
---
## Scene.Open method (1 of 9)

Opens the scene from given stream using specified file format.

```csharp
public void Open(Stream stream, FileFormat format, CancellationToken cancellationToken = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Input stream, user is responsible for closing the stream. |
| format | FileFormat | File format. |
| cancellationToken | CancellationToken | Cancellation token to the load task |

### Examples

The following code shows how to open a scene from stream

```csharp
Scene scene = new Scene();
using (var stream = new FileStream("input.fbx", FileMode.Open))
{
    scene.Open(stream, FileFormat.GLTF2);
}
```

### See Also

* class [FileFormat](../../fileformat)
* class [Scene](../../scene)
* namespace [Aspose.ThreeD](../../scene)
* assembly [Aspose.3D](../../../)

---

## Scene.Open method (2 of 9)

Opens the scene from given stream using specified IO config.

```csharp
public void Open(Stream stream, LoadOptions options, CancellationToken cancellationToken = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Input stream, user is responsible for closing the stream. |
| options | LoadOptions | More detailed configuration to open the stream. |
| cancellationToken | CancellationToken | Cancellation token to the load task |

### Examples

The following code shows how to open a scene from stream with extra load options

```csharp
Scene scene = new Scene();
using (var stream = new FileStream("input.fbx", FileMode.Open))
{
    var opt = new FbxLoadOptions();
    opt.LookupPaths.Add("textures");
    scene.Open(stream, opt);
}
```

### See Also

* class [LoadOptions](../../../aspose.threed.formats/loadoptions)
* class [Scene](../../scene)
* namespace [Aspose.ThreeD](../../scene)
* assembly [Aspose.3D](../../../)

---

## Scene.Open method (3 of 9)

Opens the scene from given stream

```csharp
public void Open(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Input stream, user is responsible for closing the stream. |

### Examples

The following code shows how to open a scene from stream

```csharp
Scene scene = new Scene();
using (var stream = new FileStream("input.fbx", FileMode.Open))
{
    scene.Open(stream);
}
```

### See Also

* class [Scene](../../scene)
* namespace [Aspose.ThreeD](../../scene)
* assembly [Aspose.3D](../../../)

---

## Scene.Open method (4 of 9)

Opens the scene from given stream

```csharp
public void Open(Stream stream, CancellationToken cancellationToken)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Input stream, user is responsible for closing the stream. |
| cancellationToken | CancellationToken | Cancellation token to the load task |

### Examples

The following code shows how to open a scene from stream with a cancellation token

```csharp
Scene scene = new Scene();
CancellationTokenSource cts = new CancellationTokenSource();
using (var stream = new FileStream("input.fbx", FileMode.Open))
{
    scene.Open(stream, cts.Token);
}
```

### See Also

* class [Scene](../../scene)
* namespace [Aspose.ThreeD](../../scene)
* assembly [Aspose.3D](../../../)

---

## Scene.Open method (5 of 9)

Opens the scene from given path using specified file format.

```csharp
public void Open(string fileName, FileFormat format, CancellationToken cancellationToken = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| format | FileFormat | File format. |
| cancellationToken | CancellationToken | Cancellation token to the load task |

### Examples

The following code shows how to open a scene from file name with a cancellation token

```csharp
Scene scene = new Scene();
CancellationTokenSource cts = new CancellationTokenSource();
scene.Open("input.fbx", FileFormat.FBX7400ASCII, cts.Token);

```

### See Also

* class [FileFormat](../../fileformat)
* class [Scene](../../scene)
* namespace [Aspose.ThreeD](../../scene)
* assembly [Aspose.3D](../../../)

---

## Scene.Open method (6 of 9)

Opens the scene from given path using specified file format.

```csharp
public void Open(string fileName, LoadOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| options | LoadOptions | More detailed configuration to open the stream. |

### Examples

The following code shows how to open a scene from file name with extra load options

```csharp
Scene scene = new Scene();
var opts = new FbxLoadOptions();
opts.LookupPaths.Add("textures");
scene.Open("input.fbx", opts);
```

### See Also

* class [LoadOptions](../../../aspose.threed.formats/loadoptions)
* class [Scene](../../scene)
* namespace [Aspose.ThreeD](../../scene)
* assembly [Aspose.3D](../../../)

---

## Scene.Open method (7 of 9)

Opens the scene from given path using specified file format.

```csharp
public void Open(string fileName, LoadOptions options, CancellationToken cancellationToken)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| options | LoadOptions | More detailed configuration to open the stream. |
| cancellationToken | CancellationToken | Cancellation token to the load task |

### Examples

The following code shows how to open a scene from file name with extra load options and cancellation token

```csharp
var cts = new CancellationTokenSource();
Scene scene = new Scene();
var opts = new FbxLoadOptions();
opts.LookupPaths.Add("textures");
scene.Open("input.fbx", opts, cts.Token);
```

### See Also

* class [LoadOptions](../../../aspose.threed.formats/loadoptions)
* class [Scene](../../scene)
* namespace [Aspose.ThreeD](../../scene)
* assembly [Aspose.3D](../../../)

---

## Scene.Open method (8 of 9)

Opens the scene from given path

```csharp
public void Open(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |

### Examples

The following code shows how to open a scene from file name

```csharp
Scene scene = new Scene();
scene.Open("input.fbx");
```

### See Also

* class [Scene](../../scene)
* namespace [Aspose.ThreeD](../../scene)
* assembly [Aspose.3D](../../../)

---

## Scene.Open method (9 of 9)

Opens the scene from given path

```csharp
public void Open(string fileName, CancellationToken cancellationToken)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| cancellationToken | CancellationToken | Cancellation token to the load task |

### Examples

The following code shows how to open a scene from file name and a cancellation token source

```csharp
var cts = new CancellationTokenSource();
Scene scene = new Scene();
scene.Open("input.fbx", cts.Token);
```

### See Also

* class [Scene](../../scene)
* namespace [Aspose.ThreeD](../../scene)
* assembly [Aspose.3D](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
