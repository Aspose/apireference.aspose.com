---
title: GenerateTemplate
second_title: Referencia de API de Aspose.OMR para .NET
description: Crea una plantilla .omr y una imagen de plantilla basada en MemoryStream
type: docs
weight: 40
url: /es/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection) {#generatetemplate_2}

Crea una plantilla (.omr) y una imagen de plantilla basada en MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| stream | MemoryStream | El flujo que contiene líneas de marcado |
| settings | GlobalPageSettings | La configuración global aplicable a todos los elementos de la página |
| userImages | ImageCollection | Colección de imágenes que se pueden utilizar para la generación de una plantilla. Permitir usar imágenes de MemoryStream en lugar del sistema de archivos |

### Valor_devuelto

Resultado de la generación

### Ver también

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espacio de nombres [Aspose.OMR.Api](../../omrengine)
* asamblea [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection) {#generatetemplate_1}

Crea una plantilla (.omr) y una imagen de plantilla basada en MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| stream | MemoryStream | El flujo que contiene líneas de marcado |
| userImages | ImageCollection | Colección de imágenes que se pueden utilizar para la generación de una plantilla. Permitir usar imágenes de MemoryStream en lugar del sistema de archivos |

### Valor_devuelto

Resultado de la generación

### Ver también

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espacio de nombres [Aspose.OMR.Api](../../omrengine)
* asamblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Crea una plantilla (.omr) y una imagen de plantilla basada en una matriz de líneas de marcado

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| markupLines | String[] | Matriz de las líneas de marcado |
| settings | GlobalPageSettings | La configuración global aplicable a todos los elementos de la página |
| userImages | ImageCollection | Colección de imágenes que se pueden utilizar para la generación de una plantilla. Permitir usar imágenes de MemoryStream en lugar del sistema de archivos |

### Valor_devuelto

Resultado de la generación

### Ver también

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espacio de nombres [Aspose.OMR.Api](../../omrengine)
* asamblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Crea una plantilla (.omr) y una imagen de plantilla basada en una matriz de líneas de marcado

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| markupLines | String[] | Matriz de las líneas de marcado |
| userImages | ImageCollection | Colección de imágenes que se pueden utilizar para la generación de una plantilla. Permitir usar imágenes de MemoryStream en lugar del sistema de archivos |

### Valor_devuelto

Resultado de la generación

### Ver también

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espacio de nombres [Aspose.OMR.Api](../../omrengine)
* asamblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings) {#generatetemplate_4}

Crea una plantilla (.omr) y una imagen de plantilla basada en marcado de texto

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| markupPath | String | Ruta al archivo de marcado de texto |
| settings | GlobalPageSettings | La configuración global aplicable a todos los elementos de la página |

### Valor_devuelto

Resultado de la generación

### Ver también

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [OmrEngine](../../omrengine)
* espacio de nombres [Aspose.OMR.Api](../../omrengine)
* asamblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string) {#generatetemplate_3}

Crea una plantilla (.omr) y una imagen de plantilla basada en marcado de texto

```csharp
public GenerationResult GenerateTemplate(string markupPath)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| markupPath | String | Ruta al archivo de marcado de texto |

### Valor_devuelto

Resultado de la generación

### Ver también

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* espacio de nombres [Aspose.OMR.Api](../../omrengine)
* asamblea [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[]) {#generatetemplate_5}

Crea una plantilla (.omr) y una imagen de plantilla basada en marcado de texto

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| markupPath | String | Ruta al archivo de marcado de texto |
| imagesPaths | String[] | Rutas completas a las imágenes utilizadas en la generación. |

### Valor_devuelto

Resultado de la generación

### Ver también

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* espacio de nombres [Aspose.OMR.Api](../../omrengine)
* asamblea [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Crea una plantilla (.omr) y una imagen de plantilla basada en el objeto Plantilla

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| config | TemplateConfig | Objeto de plantilla que representa todos los elementos. |
| settings | GlobalPageSettings | configuración global utilizada en toda la generación de plantillas |
| userImages | ImageCollection | Colección de imágenes que se pueden utilizar para la generación de una plantilla. Permitir usar imágenes de MemoryStream en lugar del sistema de archivos |

### Valor_devuelto

Resultado de la generación

### Ver también

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espacio de nombres [Aspose.OMR.Api](../../omrengine)
* asamblea [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
