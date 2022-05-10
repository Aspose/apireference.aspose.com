---
title: Metafile
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 10
url: /net/system.drawing.imaging/metafile/metafile/
---
## Metafile constructor (1 of 8)

Initializes a new instance of the [`Metafile`](../../metafile) class from the specified handle.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| Parameter | Type | Description |
| --- | --- | --- |
| henhmetafile | IntPtr | A handle to an enhanced metafile. |
| deleteEmf | Boolean | true to delete the enhanced metafile handle when the Metafile is deleted; otherwise, false. |

### See Also

* class [Metafile](../../metafile)
* namespace [System.Drawing.Imaging](../../metafile)
* assembly [Aspose.Drawing](../../../)

---

## Metafile constructor (2 of 8)

Initializes a new instance of the [`Metafile`](../../metafile) class from the specified handle to a device context and an EmfType enumeration that specifies the format of the Metafile.

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| Parameter | Type | Description |
| --- | --- | --- |
| referenceHdc | IntPtr | The handle to a device context. |
| emfType | EmfType | An EmfType that specifies the format of the Metafile. |

### See Also

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* namespace [System.Drawing.Imaging](../../metafile)
* assembly [Aspose.Drawing](../../../)

---

## Metafile constructor (3 of 8)

Initializes a new instance of the [`Metafile`](../../metafile) class from the specified file name.

```csharp
public Metafile(string filename)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | A String that represents the file name from which to create the new Metafile. |

### See Also

* class [Metafile](../../metafile)
* namespace [System.Drawing.Imaging](../../metafile)
* assembly [Aspose.Drawing](../../../)

---

## Metafile constructor (4 of 8)

Initializes a new instance of the [`Metafile`](../../metafile) class from the specified file name.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | A String that represents the file name from which to create the new Metafile. |
| referenceHdc | IntPtr | A Windows handle to a device context. |

### See Also

* class [Metafile](../../metafile)
* namespace [System.Drawing.Imaging](../../metafile)
* assembly [Aspose.Drawing](../../../)

---

## Metafile constructor (5 of 8)

Initializes a new instance of the [`Metafile`](../../metafile) class from the specified data stream.

```csharp
public Metafile(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The Stream from which to create the new Metafile. |

### See Also

* class [Metafile](../../metafile)
* namespace [System.Drawing.Imaging](../../metafile)
* assembly [Aspose.Drawing](../../../)

---

## Metafile constructor (6 of 8)

Initializes a new instance of the [`Metafile`](../../metafile) class from the specified data stream and a Windows handle to a device context. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | A Stream that contains the data for this Metafile. |
| referenceHdc | IntPtr | A Windows handle to a device context of the Metafile object. |

### See Also

* class [Metafile](../../metafile)
* namespace [System.Drawing.Imaging](../../metafile)
* assembly [Aspose.Drawing](../../../)

---

## Metafile constructor (7 of 8)

Initializes a new instance of the [`Metafile`](../../metafile) class from the specified data stream, a Windows handle to a device context, and an EmfType enumeration that specifies the format of the Metafile.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | A Stream that contains the data for this Metafile. |
| referenceHdc | IntPtr | A Windows handle to a device context. |
| type | EmfType | An EmfType that specifies the format of the Metafile. |

### See Also

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* namespace [System.Drawing.Imaging](../../metafile)
* assembly [Aspose.Drawing](../../../)

---

## Metafile constructor (8 of 8)

Initializes a new instance of the [`Metafile`](../../metafile) class from the specified data stream, a Windows handle to a device context, and an EmfType enumeration that specifies the format of the Metafile.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | A Stream that contains the data for this Metafile. |
| referenceHdc | IntPtr | A Windows handle to a device context. |
| frameRect | RectangleF | A Rectangle that represents the rectangle that bounds the new Metafile. |
| frameUnit | MetafileFrameUnit | A MetafileFrameUnit that specifies the unit of measure for frameRect. |
| type | EmfType | An EmfType that specifies the format of the Metafile. |

### See Also

* enum [MetafileFrameUnit](../../metafileframeunit)
* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* namespace [System.Drawing.Imaging](../../metafile)
* assembly [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
