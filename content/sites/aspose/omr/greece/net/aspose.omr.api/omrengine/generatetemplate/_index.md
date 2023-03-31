---
title: OmrEngine.GenerateTemplate
second_title: Aspose.OMR για Αναφορά API .NET
description: OmrEngine μέθοδος. Δημιουργεί ένα πρότυπο .omr και μια εικόνα προτύπου με βάση το MemoryStream
type: docs
weight: 40
url: /el/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | MemoryStream | Η ροή που περιέχει γραμμές σήμανσης |
| settings | GlobalPageSettings | Οι καθολικές ρυθμίσεις που ισχύουν για όλα τα στοιχεία σελίδας |
| userImages | ImageCollection | Συλλογή εικόνων που μπορούν να χρησιμοποιηθούν για μια γενιά προτύπων. Επιτρέψτε τη χρήση εικόνων από το MemoryStream αντί για σύστημα αρχείων |
| encoding | Encoding | Η κωδικοποίηση γραμμών σήμανσης, από προεπιλογή χρησιμοποιείται το UTF-8 |

### Επιστρεφόμενη Αξία

Αποτέλεσμα γενιάς

### Δείτε επίσης

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* χώρος ονομάτων [Aspose.OMR.Api](../../omrengine/)
* συνέλευση [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | MemoryStream | Η ροή που περιέχει γραμμές σήμανσης |
| userImages | ImageCollection | Συλλογή εικόνων που μπορούν να χρησιμοποιηθούν για μια γενιά προτύπων. Επιτρέψτε τη χρήση εικόνων από το MemoryStream αντί για σύστημα αρχείων |
| encoding | Encoding | Η κωδικοποίηση γραμμών σήμανσης, από προεπιλογή χρησιμοποιείται το UTF-8 |

### Επιστρεφόμενη Αξία

Αποτέλεσμα γενιάς

### Δείτε επίσης

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* χώρος ονομάτων [Aspose.OMR.Api](../../omrengine/)
* συνέλευση [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση έναν πίνακα των γραμμών σήμανσης

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| markupLines | String[] | Πίνακας γραμμών σήμανσης |
| settings | GlobalPageSettings | Οι καθολικές ρυθμίσεις που ισχύουν για όλα τα στοιχεία σελίδας |
| userImages | ImageCollection | Συλλογή εικόνων που μπορούν να χρησιμοποιηθούν για μια γενιά προτύπων. Επιτρέψτε τη χρήση εικόνων από το MemoryStream αντί για σύστημα αρχείων |

### Επιστρεφόμενη Αξία

Αποτέλεσμα γενιάς

### Δείτε επίσης

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* χώρος ονομάτων [Aspose.OMR.Api](../../omrengine/)
* συνέλευση [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση έναν πίνακα των γραμμών σήμανσης

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| markupLines | String[] | Πίνακας γραμμών σήμανσης |
| userImages | ImageCollection | Συλλογή εικόνων που μπορούν να χρησιμοποιηθούν για μια γενιά προτύπων. Επιτρέψτε τη χρήση εικόνων από το MemoryStream αντί για σύστημα αρχείων |

### Επιστρεφόμενη Αξία

Αποτέλεσμα γενιάς

### Δείτε επίσης

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* χώρος ονομάτων [Aspose.OMR.Api](../../omrengine/)
* συνέλευση [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το κείμενο markup

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| markupPath | String | Διαδρομή προς το αρχείο σήμανσης κειμένου |
| settings | GlobalPageSettings | Οι καθολικές ρυθμίσεις που ισχύουν για όλα τα στοιχεία σελίδας |
| encoding | Encoding | κωδικοποίηση αρχείου σήμανσης, από προεπιλογή χρησιμοποιείται UTF-8 |

### Επιστρεφόμενη Αξία

Αποτέλεσμα γενιάς

### Δείτε επίσης

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* χώρος ονομάτων [Aspose.OMR.Api](../../omrengine/)
* συνέλευση [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το κείμενο markup

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| markupPath | String | Διαδρομή προς το αρχείο σήμανσης κειμένου |
| encoding | Encoding | κωδικοποίηση αρχείου σήμανσης, από προεπιλογή χρησιμοποιείται UTF-8 |

### Επιστρεφόμενη Αξία

Αποτέλεσμα γενιάς

### Δείτε επίσης

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* χώρος ονομάτων [Aspose.OMR.Api](../../omrengine/)
* συνέλευση [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το κείμενο markup

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| markupPath | String | Διαδρομή προς το αρχείο σήμανσης κειμένου |
| imagesPaths | String[] | Πλήρεις διαδρομές προς τις εικόνες που χρησιμοποιούνται στη γενιά |
| encoding | Encoding | κωδικοποίηση αρχείου σήμανσης, από προεπιλογή χρησιμοποιείται UTF-8 |

### Επιστρεφόμενη Αξία

Αποτέλεσμα γενιάς

### Δείτε επίσης

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* χώρος ονομάτων [Aspose.OMR.Api](../../omrengine/)
* συνέλευση [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Δημιουργεί ένα πρότυπο (.omr) και μια εικόνα προτύπου με βάση το Template object

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| config | TemplateConfig | Αντικείμενο προτύπου που αντιπροσωπεύει όλα τα στοιχεία |
| settings | GlobalPageSettings | καθολικές ρυθμίσεις που χρησιμοποιούνται σε όλες τις δημιουργίες προτύπων |
| userImages | ImageCollection | Συλλογή εικόνων που μπορούν να χρησιμοποιηθούν για μια γενιά προτύπων. Επιτρέψτε τη χρήση εικόνων από το MemoryStream αντί για σύστημα αρχείων |

### Επιστρεφόμενη Αξία

Αποτέλεσμα γενιάς

### Δείτε επίσης

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* χώρος ονομάτων [Aspose.OMR.Api](../../omrengine/)
* συνέλευση [Aspose.OMR](../../../)


