---
title: "System::Collections::ObjectModel::KeyedCollection κλάση"
linktitle: "KeyedCollection"
second_title: "Aspose.Page για C++"
description: "System::Collections::ObjectModel::KeyedCollection κλάση. Αφηρημένη συλλογή στοιχείων με ενσωματωμένα κλειδιά. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Αφηρημένη συλλογή στοιχείων με ενσωματωμένα κλειδιά. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Parameter | Περιγραφή |
| --- | --- |
| TKey | Τύπος κλειδιού. |
| TItem | τύπος τιμής. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Προσθέστε το στοιχείο στο τέλος του δοχείου. |
| [Contains](./contains/)(TKey) | Ελέγχει αν το κλειδί υπάρχει στο δοχείο. |
| [get_Comparer](./get_comparer/)() | Λαμβάνει τον συγκριτή. |
| [idx_get](./idx_get/)(TKey) | Λαμβάνει το στοιχείο σε συγκεκριμένο δείκτη. |
| [Remove](./remove/)(TKey) | Αφαιρεί το κλειδί από το δοχείο. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Κάνει ένα συγκεκριμένο όρισμα προτύπου να αντιμετωπίζεται ως αδύναμος δείκτης αντί για κοινόχρηστο δείκτη (εφόσον ισχύει). |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Κατώφλι δημιουργίας λεξικού αναζήτησης, προεπιλογή. |

## Δείτε επίσης

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
