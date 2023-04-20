---
title: SVGDocument.Save
second_title: Aspose.SVG για Αναφορά API .NET
description: SVGDocument μέθοδος. Αποθηκεύει το έγγραφο σε τοπικό αρχείο που καθορίζεται απόurl . Όλοι οι πόροι που χρησιμοποιούνται σε αυτό το έγγραφο θα αποθηκευτούν στο σε παρακείμενο φάκελο το όνομα του οποίου θα κατασκευαστεί ως output_file_name  _files.
type: docs
weight: 90
url: /el/net/aspose.svg/svgdocument/save/
---
## Save(Url) {#save_3}

Αποθηκεύει το έγγραφο σε τοπικό αρχείο που καθορίζεται από`url` . Όλοι οι πόροι που χρησιμοποιούνται σε αυτό το έγγραφο θα αποθηκευτούν στο σε παρακείμενο φάκελο, το όνομα του οποίου θα κατασκευαστεί ως: output_file_name + "_files".

```csharp
public void Save(Url url)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| url | Url | Τοπική διεύθυνση URL στο αρχείο εξόδου. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Αυξάνεται εάν το καθορισμένο`url` δεν είναι έγκυρη διεύθυνση URL τοπικού αρχείου. |

### Δείτε επίσης

* class [Url](../../url/)
* class [SVGDocument](../)
* χώρος ονομάτων [Aspose.Svg](../../svgdocument/)
* συνέλευση [Aspose.SVG](../../../)

---

## Save(string) {#save_6}

Αποθηκεύει το έγγραφο σε τοπικό αρχείο που καθορίζεται από`μονοπάτι` . Όλοι οι πόροι που χρησιμοποιούνται σε αυτό το έγγραφο θα αποθηκευτούν στο σε παρακείμενο φάκελο, το όνομα του οποίου θα κατασκευαστεί ως: output_file_name + "_files".

```csharp
public void Save(string path)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Τοπική διαδρομή προς το αρχείο εξόδου. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Αυξάνεται εάν το καθορισμένο`μονοπάτι` δεν είναι έγκυρη τοπική διαδρομή αρχείου. |

### Δείτε επίσης

* class [SVGDocument](../)
* χώρος ονομάτων [Aspose.Svg](../../svgdocument/)
* συνέλευση [Aspose.SVG](../../../)

---

## Save(IOutputStorage) {#save}

Αποθηκεύει το περιεχόμενο και τους πόρους του εγγράφου στον χώρο αποθήκευσης εξόδου.

```csharp
public void Save(IOutputStorage outputStorage)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outputStorage | IOutputStorage | Η αποθήκευση εξόδου[`IOutputStorage`](../../../aspose.svg.io/ioutputstorage/). |

### Δείτε επίσης

* interface [IOutputStorage](../../../aspose.svg.io/ioutputstorage/)
* class [SVGDocument](../)
* χώρος ονομάτων [Aspose.Svg](../../svgdocument/)
* συνέλευση [Aspose.SVG](../../../)

---

## Save(string, SVGSaveFormat) {#save_7}

Αποθηκεύει το έγγραφο σε τοπικό αρχείο που καθορίζεται από`μονοπάτι` . Όλοι οι πόροι που χρησιμοποιούνται σε αυτό το έγγραφο θα αποθηκευτούν στο σε παρακείμενο φάκελο, το όνομα του οποίου θα κατασκευαστεί ως: output_file_name + "_files".

```csharp
public void Save(string path, SVGSaveFormat saveFormat)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Τοπική διαδρομή προς το αρχείο εξόδου. |
| saveFormat | SVGSaveFormat | Μορφοποίηση στην οποία αποθηκεύεται το έγγραφο. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Αυξάνεται εάν το καθορισμένο`μονοπάτι` δεν είναι έγκυρη τοπική διαδρομή αρχείου. |

### Δείτε επίσης

* enum [SVGSaveFormat](../../../aspose.svg.saving/svgsaveformat/)
* class [SVGDocument](../)
* χώρος ονομάτων [Aspose.Svg](../../svgdocument/)
* συνέλευση [Aspose.SVG](../../../)

---

## Save(IOutputStorage, SVGSaveFormat) {#save_1}

Αποθηκεύει το περιεχόμενο και τους πόρους του εγγράφου στον χώρο αποθήκευσης εξόδου.

```csharp
public void Save(IOutputStorage outputStorage, SVGSaveFormat saveFormat)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outputStorage | IOutputStorage | Η αποθήκευση εξόδου[`IOutputStorage`](../../../aspose.svg.io/ioutputstorage/). |
| saveFormat | SVGSaveFormat | Μορφοποίηση στην οποία αποθηκεύεται το έγγραφο. |

### Δείτε επίσης

* interface [IOutputStorage](../../../aspose.svg.io/ioutputstorage/)
* enum [SVGSaveFormat](../../../aspose.svg.saving/svgsaveformat/)
* class [SVGDocument](../)
* χώρος ονομάτων [Aspose.Svg](../../svgdocument/)
* συνέλευση [Aspose.SVG](../../../)

---

## Save(string, SVGSaveOptions) {#save_8}

Αποθηκεύει το έγγραφο σε τοπικό αρχείο που καθορίζεται από`μονοπάτι` . Όλοι οι πόροι που χρησιμοποιούνται σε αυτό το έγγραφο θα αποθηκευτούν στο σε παρακείμενο φάκελο, το όνομα του οποίου θα κατασκευαστεί ως: output_file_name + "_files".

```csharp
public void Save(string path, SVGSaveOptions saveOptions)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Τοπική διαδρομή προς το αρχείο εξόδου. |
| saveOptions | SVGSaveOptions | Επιλογές αποθήκευσης SVG. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Αυξάνεται εάν το καθορισμένο`μονοπάτι` δεν είναι έγκυρη τοπική διαδρομή αρχείου. |

### Δείτε επίσης

* class [SVGSaveOptions](../../../aspose.svg.saving/svgsaveoptions/)
* class [SVGDocument](../)
* χώρος ονομάτων [Aspose.Svg](../../svgdocument/)
* συνέλευση [Aspose.SVG](../../../)

---

## Save(IOutputStorage, SVGSaveOptions) {#save_2}

Αποθηκεύει το περιεχόμενο και τους πόρους του εγγράφου στον χώρο αποθήκευσης εξόδου.

```csharp
public void Save(IOutputStorage outputStorage, SVGSaveOptions saveOptions)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outputStorage | IOutputStorage | Η αποθήκευση εξόδου[`IOutputStorage`](../../../aspose.svg.io/ioutputstorage/). |
| saveOptions | SVGSaveOptions | Επιλογές αποθήκευσης SVG. |

### Δείτε επίσης

* interface [IOutputStorage](../../../aspose.svg.io/ioutputstorage/)
* class [SVGSaveOptions](../../../aspose.svg.saving/svgsaveoptions/)
* class [SVGDocument](../)
* χώρος ονομάτων [Aspose.Svg](../../svgdocument/)
* συνέλευση [Aspose.SVG](../../../)

---

## Save(Url, SVGSaveFormat) {#save_4}

Αποθηκεύει το έγγραφο σε τοπικό αρχείο που καθορίζεται από`url` . Όλοι οι πόροι που χρησιμοποιούνται σε αυτό το έγγραφο θα αποθηκευτούν στο σε παρακείμενο φάκελο, το όνομα του οποίου θα κατασκευαστεί ως: output_file_name + "_files".

```csharp
public void Save(Url url, SVGSaveFormat saveFormat)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| url | Url | Τοπική διεύθυνση URL στο αρχείο εξόδου. |
| saveFormat | SVGSaveFormat | Μορφοποίηση στην οποία αποθηκεύεται το έγγραφο. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Αυξάνεται εάν το καθορισμένο`url` δεν είναι έγκυρη διεύθυνση URL τοπικού αρχείου. |

### Δείτε επίσης

* class [Url](../../url/)
* enum [SVGSaveFormat](../../../aspose.svg.saving/svgsaveformat/)
* class [SVGDocument](../)
* χώρος ονομάτων [Aspose.Svg](../../svgdocument/)
* συνέλευση [Aspose.SVG](../../../)

---

## Save(Url, SVGSaveOptions) {#save_5}

Αποθηκεύει το έγγραφο σε τοπικό αρχείο που καθορίζεται από`url` . Όλοι οι πόροι που χρησιμοποιούνται σε αυτό το έγγραφο θα αποθηκευτούν στο σε παρακείμενο φάκελο, το όνομα του οποίου θα κατασκευαστεί ως: output_file_name + "_files".

```csharp
public void Save(Url url, SVGSaveOptions saveOptions)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| url | Url | Τοπική διεύθυνση URL στο αρχείο εξόδου. |
| saveOptions | SVGSaveOptions | Επιλογές αποθήκευσης SVG. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Αυξάνεται εάν το καθορισμένο`url` δεν είναι έγκυρη διεύθυνση URL τοπικού αρχείου. |

### Δείτε επίσης

* class [Url](../../url/)
* class [SVGSaveOptions](../../../aspose.svg.saving/svgsaveoptions/)
* class [SVGDocument](../)
* χώρος ονομάτων [Aspose.Svg](../../svgdocument/)
* συνέλευση [Aspose.SVG](../../../)


