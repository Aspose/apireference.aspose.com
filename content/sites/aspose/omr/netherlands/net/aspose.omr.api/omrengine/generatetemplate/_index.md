---
title: OmrEngine.GenerateTemplate
second_title: Aspose.OMR voor .NET API-referentie
description: OmrEngine methode. Maakt een sjabloon .omr en sjabloonafbeelding op basis van MemoryStream
type: docs
weight: 40
url: /nl/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | MemoryStream | De stream die opmaakregels bevat |
| settings | GlobalPageSettings | De algemene instellingen die van toepassing zijn op alle pagina-elementen |
| userImages | ImageCollection | Verzameling van afbeeldingen die kunnen worden gebruikt voor het genereren van een sjabloon. Sta toe om afbeeldingen van MemoryStream te gebruiken in plaats van het bestandssysteem |
| encoding | Encoding | codering van opmaakregels, standaard wordt UTF-8 gebruikt |

### Winstwaarde

Generatie resultaat

### Zie ook

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* naamruimte [Aspose.OMR.Api](../../omrengine/)
* montage [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | MemoryStream | De stream die opmaakregels bevat |
| userImages | ImageCollection | Verzameling van afbeeldingen die kunnen worden gebruikt voor het genereren van een sjabloon. Sta toe om afbeeldingen van MemoryStream te gebruiken in plaats van het bestandssysteem |
| encoding | Encoding | codering van opmaakregels, standaard wordt UTF-8 gebruikt |

### Winstwaarde

Generatie resultaat

### Zie ook

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* naamruimte [Aspose.OMR.Api](../../omrengine/)
* montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van een reeks van de opmaakregels

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| markupLines | String[] | Array van de opmaaklijnen |
| settings | GlobalPageSettings | De algemene instellingen die van toepassing zijn op alle pagina-elementen |
| userImages | ImageCollection | Verzameling van afbeeldingen die kunnen worden gebruikt voor het genereren van een sjabloon. Sta toe om afbeeldingen van MemoryStream te gebruiken in plaats van het bestandssysteem |

### Winstwaarde

Generatie resultaat

### Zie ook

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* naamruimte [Aspose.OMR.Api](../../omrengine/)
* montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van een reeks van de opmaakregels

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| markupLines | String[] | Array van de opmaaklijnen |
| userImages | ImageCollection | Verzameling van afbeeldingen die kunnen worden gebruikt voor het genereren van een sjabloon. Sta toe om afbeeldingen van MemoryStream te gebruiken in plaats van het bestandssysteem |

### Winstwaarde

Generatie resultaat

### Zie ook

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* naamruimte [Aspose.OMR.Api](../../omrengine/)
* montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van tekstopmaak

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| markupPath | String | Pad naar het tekstopmaakbestand |
| settings | GlobalPageSettings | De algemene instellingen die van toepassing zijn op alle pagina-elementen |
| encoding | Encoding | markup-bestandscodering, standaard wordt UTF-8 gebruikt |

### Winstwaarde

Generatie resultaat

### Zie ook

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* naamruimte [Aspose.OMR.Api](../../omrengine/)
* montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van tekstopmaak

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| markupPath | String | Pad naar het tekstopmaakbestand |
| encoding | Encoding | markup-bestandscodering, standaard wordt UTF-8 gebruikt |

### Winstwaarde

Generatie resultaat

### Zie ook

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* naamruimte [Aspose.OMR.Api](../../omrengine/)
* montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van tekstopmaak

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| markupPath | String | Pad naar het tekstopmaakbestand |
| imagesPaths | String[] | Volledige paden naar de afbeeldingen die bij het genereren zijn gebruikt |
| encoding | Encoding | markup-bestandscodering, standaard wordt UTF-8 gebruikt |

### Winstwaarde

Generatie resultaat

### Zie ook

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* naamruimte [Aspose.OMR.Api](../../omrengine/)
* montage [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van sjabloonobject

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| config | TemplateConfig | Sjabloonobject dat alle elementen vertegenwoordigt |
| settings | GlobalPageSettings | algemene instellingen die worden gebruikt bij het genereren van alle sjablonen |
| userImages | ImageCollection | Verzameling van afbeeldingen die kunnen worden gebruikt voor het genereren van een sjabloon. Sta toe om afbeeldingen van MemoryStream te gebruiken in plaats van het bestandssysteem |

### Winstwaarde

Generatie resultaat

### Zie ook

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* naamruimte [Aspose.OMR.Api](../../omrengine/)
* montage [Aspose.OMR](../../../)


