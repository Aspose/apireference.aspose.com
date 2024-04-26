---
title: Bitmap.Save
second_title: Aspose.Page for .NET API Reference
description: Bitmap method. Saves this Image to the specified file or stream
type: docs
weight: 190
url: /net/aspose.page.drawing/bitmap/save/
---
## Save(string) {#save_1}

Saves this Image to the specified file or stream.

```csharp
public void Save(string filename)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | A string that contains the name of the file to which to save this Image. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *filename* is null. |
| ExternalException | The image was saved with the wrong image format.-or- The image was saved to the same file it was created from. |

### See Also

* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Save(string, ImageFormat) {#save_2}

Saves this Image to the specified file in the specified format.

```csharp
public void Save(string filename, ImageFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filename | String | A string that contains the name of the file to which to save this Image. |
| format | ImageFormat | The [`ImageFormat`](../../../aspose.page.drawing.imaging/imageformat/) for this Image. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *filename* or *format* is null. |
| ExternalException | The image was saved with the wrong image format.-or- The image was saved to the same file it was created from. |

### See Also

* enum [ImageFormat](../../../aspose.page.drawing.imaging/imageformat/)
* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)

---

## Save(Stream, ImageFormat) {#save}

Saves this image to the specified stream in the specified format.

```csharp
public void Save(Stream stream, ImageFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The Stream where the image will be saved. |
| format | ImageFormat | An [`ImageFormat`](../../../aspose.page.drawing.imaging/imageformat/) that specifies the format of the saved image. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *stream* or *format* is null. |
| ExternalException | The image was saved with the wrong image format |

### See Also

* enum [ImageFormat](../../../aspose.page.drawing.imaging/imageformat/)
* class [Bitmap](../)
* namespace [Aspose.Page.Drawing](../../bitmap/)
* assembly [Aspose.Page](../../../)


