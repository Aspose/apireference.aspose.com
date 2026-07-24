---
title: "System::Net::Http::Headers::ObjectCollection κλάση"
linktitle: "ObjectCollection"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::ObjectCollection κλάση. Αντιπροσωπεύει τη συλλογή των αντικειμένων σε C++."
type: docs
weight: 1600
url: /el/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Αντιπροσωπεύει τη συλλογή των αντικειμένων.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος αντικειμένου. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | Πληροφορίες RTTI. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Δημιουργεί μια νέα παρουσία. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ορίστε το n'th όρισμα προτύπου ως αδύναμο δείκτη (αντί για κοινόχρηστο). Επιτρέπει την εναλλαγή δεικτών σε containers σε αδύναμη λειτουργία. |

## Δείτε επίσης

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
