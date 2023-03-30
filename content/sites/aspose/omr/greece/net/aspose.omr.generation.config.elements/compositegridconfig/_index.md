---
title: Class CompositeGridConfig
second_title: Aspose.OMR για Αναφορά API .NET
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig τάξη. Στοιχείο πλέγματος. Δημιουργία πίνακα φυσαλίδων. Κάθε γεμάτη φυσαλίδα αντιπροσωπεύει ένα σύμβολο σε σύνθετη τιμή Όλα τα επισημασμένα σύμβολα θα ενωθούν σε μία τιμή
type: docs
weight: 120
url: /el/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

Στοιχείο πλέγματος. Δημιουργία πίνακα φυσαλίδων. Κάθε γεμάτη φυσαλίδα αντιπροσωπεύει ένα σύμβολο σε σύνθετη τιμή Όλα τα επισημασμένα σύμβολα θα ενωθούν σε μία τιμή

```csharp
public class CompositeGridConfig : BaseConfig
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | Ο προεπιλεγμένος κατασκευαστής. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | Ο τύπος μιας φυσαλίδας |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | Όταν το στοιχείο σχεδιάζεται σε γονικό πολλαπλών στηλών - αντιπροσωπεύστε τη θέση. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | Ποσότητα στηλών μέσα στο πλέγμα. Κάθε στήλη αντιπροσωπεύει ένα μοναδικό σύμβολο στο αποτέλεσμα value Το ποσό πρέπει να είναι ίσο με[`ExtraRow`](./extrarow/) ποσότητα στηλών |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | Θα πρέπει να εμφανίζεται το όνομα αυτού του Πλέγματος |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | Τιμές για συγκεκριμένη στήλη που θα τοποθετηθούν πάνω από τις προεπιλεγμένες -[`Values`](./values/) . Παρουσιάζεται ως δισδιάστατος πίνακας. Πρώτη - σειρά. Δεύτερη - στήλη. Κάθε συμβολοσειρά αντιπροσωπεύει κείμενο μέσα στο συννεφάκι. εάν η συμβολοσειρά είναι μηδενική, δεν θα τοποθετηθεί συννεφάκι. Ο αριθμός των στηλών πρέπει να είναι ίσος με[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | Στοίχιση πλέγματος, υποδεικνύει πού πρέπει να σχεδιαστεί το πλέγμα στη σελίδα |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | Προσανατολισμός πλέγματος: οριζόντιος ή κατακόρυφος. Υποδεικνύει πώς πρέπει να τοποθετηθούν τα θυγατρικά στοιχεία |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | Χρώμα τετράγωνου περιγράμματος |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | Μέγεθος τετράγωνου περιγράμματος |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | Υποδεικνύει τι τύπο στοιχείου να σχεδιάσετε στην αρχή του πλέγματος |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | Όνομα πλέγματος. Χρησιμοποιείται ως αναγνωριστικό στην αναγνώριση |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | Περιγράψτε την περιστροφή του στοιχείου Grid γύρω από τον άξονά του. "90" - περιστρέψτε το CompositeGrid 90 μοίρες "-90" - περιστρέψτε το ComopositeGrid σε -90 μοίρες |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | Τύπος στοιχείου omr. Απαιτούμενο πεδίο για σειριοποίηση JSON. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | Συλλογή συμβολοσειρών που θα περιγράφουν πιθανά σύμβολα σε κάθε στήλη. Οι τιμές για συγκεκριμένες στήλη τοποθετούνται στο[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | Θέση πλέγματος X στη σελίδα, αντικαθιστά τη στοίχιση |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | Θέση πλέγματος Y στη σελίδα, αντικαθιστά τη στοίχιση |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | Το μέγεθος μιας φυσαλίδας |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | Το περιθώριο μεταξύ των γραμμών |

### Δείτε επίσης

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* χώρος ονομάτων [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* συνέλευση [Aspose.OMR](../../)


