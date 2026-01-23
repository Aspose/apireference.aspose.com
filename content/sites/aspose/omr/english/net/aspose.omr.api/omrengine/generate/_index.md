---
title: Generate
second_title: Aspose.OMR for .NET API Reference
description: Creates a GenerationResultaspose.omr.generation/generationresult which contains template .omr and template image based on markup stream
type: docs
weight: 30
url: /net/aspose.omr.api/omrengine/generate/
---
## Generate(Stream, GlobalPageSettings, ImageCollection, Encoding) {#generate_1}

Creates a [`GenerationResult`](../../../aspose.omr.generation/generationresult) which contains template (.omr) and template image based on markup stream

```csharp
public GenerationResult Generate(Stream markupStream, GlobalPageSettings settings = null, 
    ImageCollection collection = null, Encoding encoding = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| markupStream | Stream | Readable stream which contains markup lines for template config(txt or json) |
| settings | GlobalPageSettings | global settings used in template generation for all pages |
| collection | ImageCollection | Collection of images that can be used for a template generation. Allow to use images from MemoryStream instead of file system |
| encoding | Encoding | markup lines encoding, by default UTF-8 is used |

### Return Value

Generation result

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | markupPath |
| [RuntimeExceptionOMR](../../../aspose.omr.exceptions/runtimeexceptionomr) | template generation |

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## Generate(string, GlobalPageSettings, string[], Encoding) {#generate_2}

Creates a [`GenerationResult`](../../../aspose.omr.generation/generationresult) which contains template (.omr) and template image based on markup content stored by specified path

```csharp
public GenerationResult Generate(string markupPath, GlobalPageSettings settings = null, 
    string[] imagesPaths = null, Encoding encoding = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| markupPath | String | Path to a file which contains markup lines for template config(txt or json) |
| settings | GlobalPageSettings | global settings used in template generation for all pages |
| imagesPaths | String[] | Path to images that will be used for a template generation |
| encoding | Encoding | markup lines encoding, by default UTF-8 is used |

### Return Value

Generation result

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | markupPath |
| FileNotFoundException | markupPath |
| [RuntimeExceptionOMR](../../../aspose.omr.exceptions/runtimeexceptionomr) | template generation |

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## Generate(string[], GlobalPageSettings, ImageCollection) {#generate_3}

Creates a [`GenerationResult`](../../../aspose.omr.generation/generationresult) which contains template (.omr) and template image based on markup content

```csharp
public GenerationResult Generate(string[] markupContent, GlobalPageSettings settings = null, 
    ImageCollection collection = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| markupContent | String[] | Collection markup lines for template config(txt or json) |
| settings | GlobalPageSettings | global settings used in template generation for all pages |
| collection | ImageCollection | Collection of images that can be used for a template generation. Allow to use images from MemoryStream instead of file system |

### Return Value

Generation result

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException |  |
| [RuntimeExceptionOMR](../../../aspose.omr.exceptions/runtimeexceptionomr) | template generation |

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## Generate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generate}

Creates a [`GenerationResult`](../../../aspose.omr.generation/generationresult) which contains template (.omr) and template image based on markup content

```csharp
public GenerationResult Generate(TemplateConfig config, GlobalPageSettings settings = null, 
    ImageCollection collection = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| config | TemplateConfig | Template config, |
| settings | GlobalPageSettings | global settings used in template generation for all pages |
| collection | ImageCollection | Collection of images that can be used for a template generation. Allow to use images from MemoryStream instead of file system |

### Return Value

Generation result

### Exceptions

| exception | condition |
| --- | --- |
| [RuntimeExceptionOMR](../../../aspose.omr.exceptions/runtimeexceptionomr) | template generation |

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
