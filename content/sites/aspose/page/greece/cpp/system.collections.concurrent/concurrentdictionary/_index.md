---
title: "System::Collections::Concurrent::ConcurrentDictionary κλάση"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Page για C++"
description: "System::Collections::Concurrent::ConcurrentDictionary κλάση. Υλοποίηση λεξικού ασφαλούς-νήματος. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


Υλοποίηση λεξικού ασφαλούς-νήματος. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| Parameter | Περιγραφή |
| --- | --- |
| TKey | Τύπος κλειδιού. |
| TValue | Τύπος τιμής. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | Προσθέτει τιμή στο λεξικό. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία στο υποδοχέα. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | Αντιγράφει τα στοιχεία του κοντέινερ σε υπάρχοντα στοιχεία του πίνακα. |
| [get_KeysInternal](./get_keysinternal/)() const override | Λαμβάνει τη συλλογή περιτυλίγματος για πρόσβαση στα κλειδιά του λεξικού. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | Πληροφορίες RTTI. |
| [Remove](./remove/)(const TKey\&) override | Αφαιρεί στοιχείο από το υποδοχέα. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | Προσπαθεί να προσθέσει ζεύγος κλειδί/τιμή στο λεξικό. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Τύπος υλοποίησης. |
| [ThisType](./thistype/) | Αυτός ο τύπος. |
## Παρατηρήσεις



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // Δημιουργήστε ένα αντικείμενο της κλάσης ConcurrentDictionary.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // Συμπληρώστε το concurrent dictionary.
  for (auto i = 0; i < itemsCount; ++i)
  {
    concurrentDictionary->Add(i, i * i);
  }

  Console::WriteLine(concurrentDictionary->idx_get(3));

  return 0;
}
/*
This code example produces the following output:
9
*/
```

## Δείτε επίσης

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Page for C++](../../)
