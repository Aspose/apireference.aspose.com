---
title: Scene.FromFile
second_title: Aspose.3D for .NET API Reference
description: Scene method. Opens the scene from given path using specified file format
type: docs
weight: 20
url: /net/aspose.threed/scene/fromfile/
---
## FromFile(string, FileFormat, CancellationToken) {#fromfile_1}

Opens the scene from given path using specified file format.

```csharp
public static Scene FromFile(string fileName, FileFormat format, 
    CancellationToken cancellationToken = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| format | FileFormat | File format. |
| cancellationToken | CancellationToken | Cancellation token to the load task |

### Exceptions

| exception | condition |
| --- | --- |
| IOException | Thrown when failed at reading input |
| [ImportException](../../importexception/) | Thrown when input is not a valid 3D format |

### Examples

The following code shows how to create a scene from a file

```csharp
var cts = new CancellationTokenSource();
Scene scene = Scene.FromFile("input.fbx", FileFormat.FBX7400ASCII, cts.Token);
```

### See Also

* class [FileFormat](../../fileformat/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## FromFile(string, LoadOptions, CancellationToken) {#fromfile_2}

Opens the scene from given path using specified file format.

```csharp
public static Scene FromFile(string fileName, LoadOptions options, 
    CancellationToken cancellationToken = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| options | LoadOptions | More detailed configuration to open the stream. |
| cancellationToken | CancellationToken | Cancellation token to the load task |

### Exceptions

| exception | condition |
| --- | --- |
| IOException | Thrown when failed at reading input |
| [ImportException](../../importexception/) | Thrown when input is not a valid 3D format |

### Examples

The following code shows how to create a scene from a file

```csharp
var cts = new CancellationTokenSource();
var opt = new FbxLoadOptions();
opt.LookupPaths.Add("textures");
Scene scene = Scene.FromFile("input.fbx", opt, cts.Token);
```

### See Also

* class [LoadOptions](../../../aspose.threed.formats/loadoptions/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## FromFile(string) {#fromfile}

Opens the scene from given path

```csharp
public static Scene FromFile(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |

### Exceptions

| exception | condition |
| --- | --- |
| IOException | Thrown when failed at reading input |
| [ImportException](../../importexception/) | Thrown when input is not a valid 3D format |

### Examples

The following code shows how to create a scene from a file

```csharp
Scene scene = Scene.FromFile("input.fbx");
```

### See Also

* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## FromFile(string, CancellationToken) {#fromfile_3}

Opens the scene from given path

```csharp
public static Scene FromFile(string fileName, CancellationToken cancellationToken)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name. |
| cancellationToken | CancellationToken | Cancellation token to the load task |

### Exceptions

| exception | condition |
| --- | --- |
| IOException | Thrown when failed at reading input |
| [ImportException](../../importexception/) | Thrown when input is not a valid 3D format |

### Examples

The following code shows how to create a scene from a file

```csharp
var cts = new CancellationTokenSource();
Scene scene = Scene.FromFile("input.fbx", cts.Token);
```

### See Also

* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


