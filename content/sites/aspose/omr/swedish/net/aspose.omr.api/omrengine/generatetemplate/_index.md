---
title: OmrEngine.GenerateTemplate
second_title: Aspose.OMR för .NET API-referens
description: OmrEngine metod. Skapar en mall .omr och mallbild baserad på MemoryStream
type: docs
weight: 40
url: /sv/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

Skapar en mall (.omr) och mallbild baserad på MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Strömmen som innehåller markeringslinjer |
| settings | GlobalPageSettings | De globala inställningarna som gäller för alla sidelement |
| userImages | ImageCollection | Samling av bilder som kan användas för en mallgenerering. Tillåt att använda bilder från MemoryStream istället för filsystem |
| encoding | Encoding | kodning av uppmärkningslinjer, som standard används UTF-8 |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namnutrymme [Aspose.OMR.Api](../../omrengine/)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

Skapar en mall (.omr) och mallbild baserad på MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Strömmen som innehåller markeringslinjer |
| userImages | ImageCollection | Samling av bilder som kan användas för en mallgenerering. Tillåt att använda bilder från MemoryStream istället för filsystem |
| encoding | Encoding | kodning av uppmärkningslinjer, som standard används UTF-8 |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namnutrymme [Aspose.OMR.Api](../../omrengine/)
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

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namnutrymme [Aspose.OMR.Api](../../omrengine/)
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

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namnutrymme [Aspose.OMR.Api](../../omrengine/)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Skapar en mall (.omr) och mallbild baserat på textmarkup

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| markupPath | String | Sökväg till textmarkeringsfilen |
| settings | GlobalPageSettings | De globala inställningarna som gäller för alla sidelement |
| encoding | Encoding | kodning av markupfiler, som standard används UTF-8 |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* namnutrymme [Aspose.OMR.Api](../../omrengine/)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Skapar en mall (.omr) och mallbild baserat på textmarkup

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| markupPath | String | Sökväg till textmarkeringsfilen |
| encoding | Encoding | kodning av markupfiler, som standard används UTF-8 |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* namnutrymme [Aspose.OMR.Api](../../omrengine/)
* hopsättning [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Skapar en mall (.omr) och mallbild baserat på textmarkup

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| markupPath | String | Sökväg till textmarkeringsfilen |
| imagesPaths | String[] | Fullständiga vägar till bilderna som används i genereringen |
| encoding | Encoding | kodning av markupfiler, som standard används UTF-8 |

### Returvärde

Generationsresultat

### Se även

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* namnutrymme [Aspose.OMR.Api](../../omrengine/)
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

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namnutrymme [Aspose.OMR.Api](../../omrengine/)
* hopsättning [Aspose.OMR](../../../)


