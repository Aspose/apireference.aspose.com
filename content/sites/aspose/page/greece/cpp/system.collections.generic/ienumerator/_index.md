---
title: "System::Collections::Generic::IEnumerator κλάση"
linktitle: "IEnumerator"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::IEnumerator κλάση. Διεπαφή ενός enumerator που μπορεί να χρησιμοποιηθεί για επανάληψη μέσω ορισμένων στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2300
url: /el/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


Διεπαφή του enumerator που μπορεί να χρησιμοποιηθεί για επανάληψη μέσω ορισμένων στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παράδειγμα αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | Προετοιμάζει τον επαναλήπτη για χρήση από την κλάση VirtualizedIterator. |
| [CloneIterator](./cloneiterator/)() const override | Κλωνοποιεί τον τρέχοντα επαναλήπτη. |
| virtual [Current](./current/)() const | Επιστρέφει το τρέχον στοιχείο. |
| virtual [get_Current](./get_current/)() const | Επιστρέφει το τρέχον στοιχείο. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | Μετακινεί τον επαναλήπτη ένα βήμα προς τα εμπρός. |
| [InitializeIterator](./initializeiterator/)() override | Κάνει την πρώτη κλήση του [MoveNext()](./movenext/) και προετοιμάζει το αντικείμενο enumerator για χρήση από το VirtualizedIterator. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | Σημειώνει τον enumerator που ανήκει στον virtualized iterator. |
| virtual [MoveNext](./movenext/)() | Μετακινεί τον απαριθμητή στο επόμενο στοιχείο. Εάν δεν έχει αναφερθεί προηγουμένως κανένα στοιχείο, ορίζει την αναφορά στο πρώτο διαθέσιμο στοιχείο. Εάν φτάσει στο τέλος του κοντέινερ, δεν κάνει τίποτα. |
| virtual [Reset](./reset/)() | Επαναφέρει τον enumerator στη θέση πριν το πρώτο στοιχείο. |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [ValueType](./valuetype/) | Τύπος τιμής. |
## Παρατηρήσεις



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Δημιουργήστε την παρουσία της κλάσης List.
  auto collection = MakeObject<List<int>>();

  // Γεμίστε τη λίστα.
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // Αποκτήστε τον απαριθμητή της λίστας.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // Αποκτήστε το τρέχον στοιχείο και εκτυπώστε το.
    std::cout << enumerator->get_Current() << ' ';
  }

  // Επαναφέρετε τον απαριθμητή.
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
