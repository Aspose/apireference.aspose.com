---
title: Class AbstractPath
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.AbstractPath τάξη. ΑνAbstractPath είναι μια βασική κλάση για κλάσεις που καθορίζουν μια μοναδική τοποθεσία σε ένα περιβάλλον παρόμοιο με ένα σύστημα αρχείων όπως ένα τοπικό σύστημα αρχείων μια απομακρυσμένη αποθήκευση αρχείων ή ένα αρχείο ZIP μεταξύ άλλων.
type: docs
weight: 10
url: /el/net/aspose.gis/abstractpath/
---
## AbstractPath class

Αν`AbstractPath` είναι μια βασική κλάση για κλάσεις που καθορίζουν μια μοναδική τοποθεσία σε ένα περιβάλλον παρόμοιο με ένα σύστημα αρχείων, όπως ένα τοπικό σύστημα αρχείων, μια απομακρυσμένη αποθήκευση αρχείων ή ένα αρχείο ZIP, μεταξύ άλλων.

```csharp
public abstract class AbstractPath
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Λαμβάνει μια παράσταση συμβολοσειράς της θέσης αυτής`AbstractPath` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Παίρνει έναν διαχωριστικό χαρακτήρα που χρησιμοποιείται για τον διαχωρισμό των επιπέδων καταλόγου του[`Location`](./location/) σειρά. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | Δημιουργεί ένα`AbstractPath` που αντιπροσωπεύει μια τοποθεσία στο τοπικό σύστημα αρχείων. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | Δημιουργεί ένα`AbstractPath` από έναStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Συνδυάζει αυτό`AbstractPath` με καθορισμένα στοιχεία διαδρομής. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Διαγράφει ένα αρχείο στο οποίο επισημαίνεται αυτή η διαδρομή. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Επιστρέφει την επέκταση αυτού`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Επιστρέφει το όνομα του αρχείου και την επέκταση αυτού`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Επιστρέφει το όνομα αρχείου αυτού`AbstractPath` χωρίς την επέκταση. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η διαδρομή οδηγεί σε ένα υπάρχον αρχείο που μπορεί να ανοίξει για ανάγνωση. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Επιστρέφει διαδρομές που βρίσκονται μέσα σε αυτό`AbstractPath` , αν είναι κατάλογος. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Ανοίγει αυτό`AbstractPath`ως αρχείο. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Επιστρέφει ένα νέο`AbstractPath` με την επέκταση αρχείου αλλαγμένη στην καθορισμένη τιμή. |

### Παρατηρήσεις

Αν`AbstractPath` μπορεί να καθορίσει μια θέση σε ένα τοπικό σύστημα αρχείων, μια τοποθεσία σε ένα απομακρυσμένο σύστημα αρχείων ή έναν εξωτερικό χώρο αποθήκευσης όπως το χώρο αποθήκευσης Azure Blob και ούτω καθεξής. Η τοποθεσία μπορεί να δείχνει σε ένα υπάρχον ή μη υπάρχον αντικείμενα που μοιάζουν με αρχείο, αντικείμενα που μοιάζουν με κατάλογο ή να έχει οποιοδήποτε άλλο νόημα εύλογο για το περιβάλλον στο οποίο ανήκει. Για παράδειγμα, ένα`AbstractPath` Ο κληρονόμος που αντιπροσωπεύει μια τοποθεσία στο τοπικό σύστημα αρχείων μπορεί να υποδείξει ένα αρχείο, κατάλογο υπάρχον ή σε μια θέση στο σύστημα αρχείων που δεν έχει δημιουργηθεί ακόμα. Για να διαθέσετε ένα νέο χώρο αποθήκευσης που μοιάζει με σύστημα αρχείων`Aspose.GIS` θα πρέπει κανείς να κληρονομήσει αυτήν την κλάση και να εφαρμόσει τις αφηρημένες μεθόδους της.

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


