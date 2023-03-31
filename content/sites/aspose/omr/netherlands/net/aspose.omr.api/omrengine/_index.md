---
title: Class OmrEngine
second_title: Aspose.OMR voor .NET API-referentie
description: Aspose.OMR.Api.OmrEngine klas. De OMRengine. Zorgt voor het maken van de sjabloon en beeldverwerkingsklassen en GUIcomponenten.
type: docs
weight: 20
url: /nl/net/aspose.omr.api/omrengine/
---
## OmrEngine class

De OMR-engine. Zorgt voor het maken van de sjabloon en beeldverwerkingsklassen en GUI-componenten.

```csharp
public class OmrEngine
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [OmrEngine](omrengine/)() | De standaard constructeur. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van .json markup |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van JSON markup |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van tekstopmaak |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van een reeks van de opmaakregels |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van MemoryStream |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van tekstopmaak |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van tekstopmaak |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van een reeks van de opmaakregels |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van sjabloonobject |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | Maakt een sjabloon (.omr) en sjabloonafbeelding op basis van MemoryStream |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | Creëert de[`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/) instantie die het mogelijk maakt om met OMR API te werken met behulp van GUI. Takes[`TemplateProcessor`](../templateprocessor/) als parameter en werkt alleen met afbeeldingen die zijn gemaakt met de opgegeven template |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | Creëert de[`TemplateProcessor`](../templateprocessor/) instantie die het mogelijk maakt om met gespecificeerde template te werken. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | Creëert de[`TemplateProcessor`](../templateprocessor/) instantie die het mogelijk maakt om met gespecificeerde template te werken. |

### Voorbeelden

```csharp
// verkrijg de sjabloonprocessor
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// krijg correctie GUI-besturing
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// sjabloon genereren
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### Zie ook

* naamruimte [Aspose.OMR.Api](../../aspose.omr.api/)
* montage [Aspose.OMR](../../)


