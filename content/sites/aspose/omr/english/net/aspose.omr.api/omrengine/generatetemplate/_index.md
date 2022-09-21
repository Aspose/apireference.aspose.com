---
title: GenerateTemplate
second_title: Aspose.OMR for .NET API Reference
description: Creates a template .omr and template image based on MemoryStream
type: docs
weight: 40
url: /net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

Creates a template (.omr) and template image based on MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | The stream which contains markup lines |
| settings | GlobalPageSettings | The global settings applicable to all page elements |
| userImages | ImageCollection | Collection of images that can be used for a template generation. Allow to use images from MemoryStream instead of file system |
| encoding | Encoding | markup lines encoding, by default UTF-8 is used |

### Return Value

Generation result

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

Creates a template (.omr) and template image based on MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | The stream which contains markup lines |
| userImages | ImageCollection | Collection of images that can be used for a template generation. Allow to use images from MemoryStream instead of file system |
| encoding | Encoding | markup lines encoding, by default UTF-8 is used |

### Return Value

Generation result

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Creates a template (.omr) and template image based on an array of the markup lines

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| markupLines | String[] | Array of the markup lines |
| settings | GlobalPageSettings | The global settings applicable to all page elements |
| userImages | ImageCollection | Collection of images that can be used for a template generation. Allow to use images from MemoryStream instead of file system |

### Return Value

Generation result

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Creates a template (.omr) and template image based on an array of the markup lines

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| markupLines | String[] | Array of the markup lines |
| userImages | ImageCollection | Collection of images that can be used for a template generation. Allow to use images from MemoryStream instead of file system |

### Return Value

Generation result

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Creates a template (.omr) and template image based on text markup

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| markupPath | String | Path to the text markup file |
| settings | GlobalPageSettings | The global settings applicable to all page elements |
| encoding | Encoding | markup file encoding, by default UTF-8 is used |

### Return Value

Generation result

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Creates a template (.omr) and template image based on text markup

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| markupPath | String | Path to the text markup file |
| encoding | Encoding | markup file encoding, by default UTF-8 is used |

### Return Value

Generation result

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Creates a template (.omr) and template image based on text markup

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| markupPath | String | Path to the text markup file |
| imagesPaths | String[] | Full paths to the images used in generation |
| encoding | Encoding | markup file encoding, by default UTF-8 is used |

### Return Value

Generation result

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Creates a template (.omr) and template image based on Template object

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| config | TemplateConfig | Template object that represent all elements |
| settings | GlobalPageSettings | global settings used in all template generation |
| userImages | ImageCollection | Collection of images that can be used for a template generation. Allow to use images from MemoryStream instead of file system |

### Return Value

Generation result

### See Also

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
