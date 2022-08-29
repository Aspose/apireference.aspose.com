---
title: GenerateTemplate
second_title: Aspose.OMR för .NET API-referens
description: Skapar en mall .omr och mallbild baserad på MemoryStream
type: docs
weight: 40
url: /sv/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection) {#generatetemplate_2}

Skapar en mall (.omr) och mallbild baserad på MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Strömmen som innehåller markeringslinjer |
| settings | GlobalPageSettings | De globala inställningarna som gäller för alla sidelement |
| userImages | ImageCollection | Samling av bilder som kan användas för en mallgenerering. Tillåt att använda bilder från MemoryStream istället för filsystem |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namnutrymme [Aspose.OMR.Api](../../omrengine)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection) {#generatetemplate_1}

Skapar en mall (.omr) och mallbild baserad på MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Strömmen som innehåller markeringslinjer |
| userImages | ImageCollection | Samling av bilder som kan användas för en mallgenerering. Tillåt att använda bilder från MemoryStream istället för filsystem |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namnutrymme [Aspose.OMR.Api](../../omrengine)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Skapar en mall (.omr) och mallbild baserat på en array av uppmärkningslinjerna

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| markupLines | String[] | Array av uppmärkningslinjer |
| settings | GlobalPageSettings | De globala inställningarna som gäller för alla sidelement |
| userImages | ImageCollection | Samling av bilder som kan användas för en mallgenerering. Tillåt att använda bilder från MemoryStream istället för filsystem |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namnutrymme [Aspose.OMR.Api](../../omrengine)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Skapar en mall (.omr) och mallbild baserat på en array av uppmärkningslinjerna

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| markupLines | String[] | Array av uppmärkningslinjer |
| userImages | ImageCollection | Samling av bilder som kan användas för en mallgenerering. Tillåt att använda bilder från MemoryStream istället för filsystem |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namnutrymme [Aspose.OMR.Api](../../omrengine)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings) {#generatetemplate_4}

Skapar en mall (.omr) och mallbild baserat på textmarkup

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| markupPath | String | Sökväg till textmarkeringsfilen |
| settings | GlobalPageSettings | De globala inställningarna som gäller för alla sidelement |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [OmrEngine](../../omrengine)
* namnutrymme [Aspose.OMR.Api](../../omrengine)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(string) {#generatetemplate_3}

Skapar en mall (.omr) och mallbild baserat på textmarkup

```csharp
public GenerationResult GenerateTemplate(string markupPath)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| markupPath | String | Sökväg till textmarkeringsfilen |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* namnutrymme [Aspose.OMR.Api](../../omrengine)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[]) {#generatetemplate_5}

Skapar en mall (.omr) och mallbild baserat på textmarkup

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| markupPath | String | Sökväg till textmarkeringsfilen |
| imagesPaths | String[] | Fullständiga vägar till bilderna som används i genereringen |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* namnutrymme [Aspose.OMR.Api](../../omrengine)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Skapar en mall (.omr) och mallbild baserat på Template object

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| config | TemplateConfig | Mallobjekt som representerar alla element |
| settings | GlobalPageSettings | globala inställningar som används i all mallgenerering |
| userImages | ImageCollection | Samling av bilder som kan användas för en mallgenerering. Tillåt att använda bilder från MemoryStream istället för filsystem |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* namnutrymme [Aspose.OMR.Api](../../omrengine)
* hopsättning [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
