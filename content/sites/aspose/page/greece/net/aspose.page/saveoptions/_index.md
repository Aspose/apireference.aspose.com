---
title: Class SaveOptions
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.SaveOptions τάξη. Αυτή η κλάση περιέχει επιλογές που είναι απαραίτητες για τη διαχείριση της διαδικασίας μετατροπής.
type: docs
weight: 300
url: /el/net/aspose.page/saveoptions/
---
## SaveOptions class

Αυτή η κλάση περιέχει επιλογές που είναι απαραίτητες για τη διαχείριση της διαδικασίας μετατροπής.

```csharp
public abstract class SaveOptions
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [SaveOptions](saveoptions/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`SaveOptions` κλάση με προεπιλεγμένες τιμές για σημαίες!:SuppressErrors (αλήθεια) και[`Debug`](./debug/) (ψευδή). |
| [SaveOptions](saveoptions/#constructor_1)(bool) | Αρχικοποιεί μια νέα παρουσία του`SaveOptions` κλάση με προεπιλεγμένη τιμή για σημαία[`Debug`](./debug/) (ψευδή). |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Καθορίζει πρόσθετους φακέλους στους οποίους ο μετατροπέας θα πρέπει να βρει γραμματοσειρές για το έγγραφο εισόδου. Ο προεπιλεγμένος φάκελος είναι φάκελος τυπικών γραμματοσειρών όπου το OS βρίσκει γραμματοσειρές για εσωτερικές ανάγκες. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Καθορίζει εάν οι πληροφορίες εντοπισμού σφαλμάτων πρέπει να εκτυπωθούν σε τυπική ροή εξόδου ή όχι. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Επιστρέφει μια λίστα σφαλμάτων μετατροπής που έχουν καταργηθεί Εάν!:SuppressErrors είναι αλήθεια. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | Η κατηγορία Ποιότητα καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο καθορισμένος αριθμός, τόσο μεγαλύτερη είναι η συμπίεση και επομένως χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 έχει ως αποτέλεσμα εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 έχει ως αποτέλεσμα την υψηλότερη. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Καθορίζει εάν τα σφάλματα πρέπει να καταστραφούν ή όχι. Εάν προστεθούν αληθινά κατασταλμένα σφάλματα[`Exceptions`](./exceptions/) list. Εάν είναι false, το πρώτο σφάλμα θα τερματίσει το πρόγραμμα. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Page](../../aspose.page/)
* συνέλευση [Aspose.Page](../../)


