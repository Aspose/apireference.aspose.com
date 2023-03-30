---
title: OmrEngine.GenerateTemplate
second_title: Aspose.OMR für .NET-API-Referenz
description: OmrEngine methode. Erstellt eine Vorlage .omr und ein Vorlagenbild basierend auf MemoryStream
type: docs
weight: 40
url: /de/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

Erstellt eine Vorlage (.omr) und ein Vorlagenbild basierend auf MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Der Stream, der Markup-Zeilen enthält |
| settings | GlobalPageSettings | Die globalen Einstellungen, die für alle Seitenelemente gelten |
| userImages | ImageCollection | Sammlung von Bildern, die für eine Vorlagengenerierung verwendet werden können. Ermöglicht die Verwendung von Bildern aus MemoryStream anstelle des Dateisystems |
| encoding | Encoding | Codierung von Markup-Zeilen, standardmäßig wird UTF-8 verwendet |

### Rückgabewert

Generierungsergebnis

### Siehe auch

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namensraum [Aspose.OMR.Api](../../omrengine/)
* Montage [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

Erstellt eine Vorlage (.omr) und ein Vorlagenbild basierend auf MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Der Stream, der Markup-Zeilen enthält |
| userImages | ImageCollection | Sammlung von Bildern, die für eine Vorlagengenerierung verwendet werden können. Ermöglicht die Verwendung von Bildern aus MemoryStream anstelle des Dateisystems |
| encoding | Encoding | Codierung von Markup-Zeilen, standardmäßig wird UTF-8 verwendet |

### Rückgabewert

Generierungsergebnis

### Siehe auch

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namensraum [Aspose.OMR.Api](../../omrengine/)
* Montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Erstellt eine Vorlage (.omr) und ein Vorlagenbild basierend auf einem Array der Markup-Zeilen

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| markupLines | String[] | Array der Markup-Zeilen |
| settings | GlobalPageSettings | Die globalen Einstellungen, die für alle Seitenelemente gelten |
| userImages | ImageCollection | Sammlung von Bildern, die für eine Vorlagengenerierung verwendet werden können. Ermöglicht die Verwendung von Bildern aus MemoryStream anstelle des Dateisystems |

### Rückgabewert

Generierungsergebnis

### Siehe auch

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namensraum [Aspose.OMR.Api](../../omrengine/)
* Montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Erstellt eine Vorlage (.omr) und ein Vorlagenbild basierend auf einem Array der Markup-Zeilen

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| markupLines | String[] | Array der Markup-Zeilen |
| userImages | ImageCollection | Sammlung von Bildern, die für eine Vorlagengenerierung verwendet werden können. Ermöglicht die Verwendung von Bildern aus MemoryStream anstelle des Dateisystems |

### Rückgabewert

Generierungsergebnis

### Siehe auch

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namensraum [Aspose.OMR.Api](../../omrengine/)
* Montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Erstellt eine Vorlage (.omr) und ein Vorlagenbild basierend auf Textmarkup

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| markupPath | String | Pfad zur Textmarkierungsdatei |
| settings | GlobalPageSettings | Die globalen Einstellungen, die für alle Seitenelemente gelten |
| encoding | Encoding | Markup-Dateicodierung, standardmäßig wird UTF-8 verwendet |

### Rückgabewert

Generierungsergebnis

### Siehe auch

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* namensraum [Aspose.OMR.Api](../../omrengine/)
* Montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Erstellt eine Vorlage (.omr) und ein Vorlagenbild basierend auf Textmarkup

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| markupPath | String | Pfad zur Textmarkierungsdatei |
| encoding | Encoding | Markup-Dateicodierung, standardmäßig wird UTF-8 verwendet |

### Rückgabewert

Generierungsergebnis

### Siehe auch

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* namensraum [Aspose.OMR.Api](../../omrengine/)
* Montage [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Erstellt eine Vorlage (.omr) und ein Vorlagenbild basierend auf Textmarkup

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| markupPath | String | Pfad zur Textmarkierungsdatei |
| imagesPaths | String[] | Vollständige Pfade zu den bei der Generierung verwendeten Bildern |
| encoding | Encoding | Markup-Dateicodierung, standardmäßig wird UTF-8 verwendet |

### Rückgabewert

Generierungsergebnis

### Siehe auch

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* namensraum [Aspose.OMR.Api](../../omrengine/)
* Montage [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Erstellt eine Vorlage (.omr) und ein Vorlagenbild basierend auf Vorlagenobjekt

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| config | TemplateConfig | Vorlagenobjekt, das alle Elemente darstellt |
| settings | GlobalPageSettings | globale Einstellungen, die bei der gesamten Vorlagengenerierung verwendet werden |
| userImages | ImageCollection | Sammlung von Bildern, die für eine Vorlagengenerierung verwendet werden können. Ermöglicht die Verwendung von Bildern aus MemoryStream anstelle des Dateisystems |

### Rückgabewert

Generierungsergebnis

### Siehe auch

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* namensraum [Aspose.OMR.Api](../../omrengine/)
* Montage [Aspose.OMR](../../../)


