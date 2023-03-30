---
title: Class TemplateProcessor
second_title: Aspose.OMR για Αναφορά API .NET
description: Aspose.OMR.Api.TemplateProcessor τάξη. Κατηγορία για επεξεργασία προτύπων και εικόνων.  Κάθε παρουσία αυτής της κλάσης λειτουργεί με ένα μόνο πρότυπο OMR. Είναι σε θέση να αναγνωρίσει εικόνες του προτύπου που καθορίζονται στον κατασκευαστή.
type: docs
weight: 30
url: /el/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

Κατηγορία για επεξεργασία προτύπων και εικόνων.  Κάθε παρουσία αυτής της κλάσης λειτουργεί με ένα μόνο πρότυπο OMR. Είναι σε θέση να αναγνωρίσει εικόνες του προτύπου που καθορίζονται στον κατασκευαστή.

```csharp
public class TemplateProcessor
```

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | Ενημερώνει το αποτέλεσμα αναγνώρισης χρησιμοποιώντας ακριβείς παραμέτρους. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | Αναγνωρίζει εικόνες από τον φάκελο |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | Αναγνώριση εικόνας από ροή μνήμης |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | Αναγνωρίζει την εικόνα |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | Αναγνωρίζει το πρότυπο πολλών σελίδων |

### Παραδείγματα

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### Δείτε επίσης

* χώρος ονομάτων [Aspose.OMR.Api](../../aspose.omr.api/)
* συνέλευση [Aspose.OMR](../../)


