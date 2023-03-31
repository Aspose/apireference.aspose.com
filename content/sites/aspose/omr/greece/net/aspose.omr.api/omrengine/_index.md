---
title: Class OmrEngine
second_title: Aspose.OMR για Αναφορά API .NET
description: Aspose.OMR.Api.OmrEngine τάξη. Η μηχανή OMR. Χειρίζεται τη δημιουργία του προτύπου και των κλάσεων επεξεργασίας εικόνας και των στοιχείων GUI.
type: docs
weight: 20
url: /el/net/aspose.omr.api/omrengine/
---
## OmrEngine class

Η μηχανή OMR. Χειρίζεται τη δημιουργία του προτύπου και των κλάσεων επεξεργασίας εικόνας και των στοιχείων GUI.

```csharp
public class OmrEngine
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [OmrEngine](omrengine/)() | Ο προεπιλεγμένος κατασκευαστής. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το .json markup |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το JSON markup |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το κείμενο markup |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση έναν πίνακα των γραμμών σήμανσης |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το MemoryStream |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το κείμενο markup |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το κείμενο markup |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση έναν πίνακα των γραμμών σήμανσης |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το Template object |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το MemoryStream |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | Δημιουργεί το[`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/) παράδειγμα που επιτρέπει την εργασία με OMR API χρησιμοποιώντας GUI. Takes[`TemplateProcessor`](../templateprocessor/) ως παράμετρος και λειτουργεί μόνο με εικόνες που έχουν δημιουργηθεί χρησιμοποιώντας καθορισμένο template |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | Δημιουργεί το[`TemplateProcessor`](../templateprocessor/) παράδειγμα που επιτρέπει την εργασία με καθορισμένο πρότυπο. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | Δημιουργεί το[`TemplateProcessor`](../templateprocessor/) παράδειγμα που επιτρέπει την εργασία με καθορισμένο πρότυπο. |

### Παραδείγματα

```csharp
// λάβετε τον επεξεργαστή προτύπου
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// λήψη διόρθωσης ελέγχου GUI
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// δημιουργία προτύπου
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### Δείτε επίσης

* χώρος ονομάτων [Aspose.OMR.Api](../../aspose.omr.api/)
* συνέλευση [Aspose.OMR](../../)


