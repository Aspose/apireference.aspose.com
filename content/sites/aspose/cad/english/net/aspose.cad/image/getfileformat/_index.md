---
title: Image.GetFileFormat
second_title: Aspose.CAD for .NET API Reference
description: Image method. Gets the file format
type: docs
weight: 170
url: /net/aspose.cad/image/getfileformat/
---
## GetFileFormat(string) {#getfileformat_1}

Gets the file format.

```csharp
public static FileFormat GetFileFormat(string filePath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path. |

### Return Value

The determined file format.

## Remarks

The file format determined does not mean that the specified image may be loaded. Use one of the CanLoad method overloads to determine whether file may be loaded.

## Examples

Determines whether file is a DWG drawing

```csharp
var fileFormat = Image.GetFileFormat("file.dwg");
if (fileFormat >= FileFormat.CadR010 && fileFormat <= FileFormat.CadR2010)
{
    Console.WriteLine("This is a DWG drawing");
}
```

### See Also

* enum [FileFormat](../../fileformat/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)

---

## GetFileFormat(Stream) {#getfileformat}

Gets the file format.

```csharp
public static FileFormat GetFileFormat(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The stream. |

### Return Value

The determined file format.

## Remarks

The file format determined does not mean that the specified image may be loaded. Use one of the CanLoad method overloads to determine whether stream may be loaded.

## Examples

Determines whether a stream contains a DXF drawing

```csharp
using (var f = File.OpenRead("file.dxf"))
{
    var fileFormat = Image.GetFileFormat(f);
    if (fileFormat >= FileFormat.DXFCadR010 && fileFormat <= FileFormat.DXFCadR2010)
    {
        Console.WriteLine("This is a DXF drawing");
    }
}
```

### See Also

* enum [FileFormat](../../fileformat/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)


