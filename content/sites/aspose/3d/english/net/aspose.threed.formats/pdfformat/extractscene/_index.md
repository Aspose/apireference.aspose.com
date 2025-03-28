---
title: PdfFormat.ExtractScene
second_title: Aspose.3D for .NET API Reference
description: PdfFormat method. Extract 3D scenes from PDF file
type: docs
weight: 20
url: /net/aspose.threed.formats/pdfformat/extractscene/
---
## ExtractScene(string) {#extractscene_1}

Extract 3D scenes from PDF file.

```csharp
public List<Scene> ExtractScene(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name of input PDF file |

### Return Value

List of decoded 3D scenes that supported by Aspose.3D

## Examples

The following code shows how to extract all supported 3D scenes from a 3D PDF file, and write them to obj format.

```csharp
var scenes = FileFormat.PDF.ExtractScene("input.pdf");
for(int i = 0; i < scenes.Count; i++) 
{
    scenes[i].Save($"output-{i}.obj");
}
```

### See Also

* class [Scene](../../../aspose.threed/scene/)
* class [PdfFormat](../)
* namespace [Aspose.ThreeD.Formats](../../pdfformat/)
* assembly [Aspose.3D](../../../)

---

## ExtractScene(string, byte[]) {#extractscene_2}

Extract 3D scenes from PDF file.

```csharp
public List<Scene> ExtractScene(string fileName, byte[] password)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name of input PDF file |
| password | Byte[] | Password of the PDF file |

### Return Value

List of decoded 3D scenes that supported by Aspose.3D

## Examples

The following code shows how to extract all supported 3D scenes from a 3D PDF file, and write them to obj format.

```csharp
var scenes = FileFormat.PDF.ExtractScene("input.pdf");
for(int i = 0; i < scenes.Count; i++) 
{
    scenes[i].Save($"output-{i}.obj");
}
```

### See Also

* class [Scene](../../../aspose.threed/scene/)
* class [PdfFormat](../)
* namespace [Aspose.ThreeD.Formats](../../pdfformat/)
* assembly [Aspose.3D](../../../)

---

## ExtractScene(Stream, byte[]) {#extractscene}

Extract raw 3D content from PDF stream.

```csharp
public List<Scene> ExtractScene(Stream stream, byte[] password = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Stream of input PDF file |
| password | Byte[] | Password of the PDF file |

### Return Value

List of decoded 3D scenes that supported by Aspose.3D

## Examples

The following code shows how to extract all supported 3D scenes from a 3D PDF file, and write them to obj format.

```csharp
var scenes = FileFormat.PDF.ExtractScene("input.pdf");
for(int i = 0; i < scenes.Count; i++) 
{
    scenes[i].Save($"output-{i}.obj");
}
```

### See Also

* class [Scene](../../../aspose.threed/scene/)
* class [PdfFormat](../)
* namespace [Aspose.ThreeD.Formats](../../pdfformat/)
* assembly [Aspose.3D](../../../)


