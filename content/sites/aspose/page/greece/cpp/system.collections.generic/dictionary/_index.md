---
title: "System::Collections::Generic::Dictionary κλάση"
linktitle: "Dictionary"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::Dictionary κλάση. Προώθηση δήλωσης της κλάσης Dictionary σε C++."
type: docs
weight: 1100
url: /el/cpp/system.collections.generic/dictionary/
---
## Dictionary class


Προώθηση δήλωσης της κλάσης [Dictionary](./).

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| Parameter | Περιγραφή |
| --- | --- |
| TKey | Τύπος κλειδιού. |
| TValue | Τύπος τιμής. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Dictionary](./dictionary/)() | Δημιουργεί κενό λεξικό. |
| [Dictionary](./dictionary/)(const map_t\&) | Αντιγράφει δεδομένα από το map. |
| [Dictionary](./dictionary/)(int) | Υπερφόρτωση που αντιστοιχεί στη δημιουργία προ-κατανεμημένου λεξικού· στην πραγματικότητα δεν κάνει κατανομή. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Κατασκευαστής αντιγραφής. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Κατασκευαστής αντιγραφής. |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Δημιουργεί κενό λεξικό. |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Δημιουργεί κενό λεξικό. |
| [GetEnumerator](./getenumerator/)() override | Δημιουργεί αντικείμενο enumerator. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Δείκτης προς διεπαφή enumerable. |
| [IEnumeratorPtr](./ienumeratorptr/) | Δείκτης προς enumerator. |
| [KeyCollection](./keycollection/) | Πληροφορίες RTTI. |
| [KVPair](./kvpair/) | Τύπος ζεύγους κλειδιού-τιμής. |
| [map_t](./map_t/) | Βασικός τύπος δεδομένων. |
| [Ptr](./ptr/) | Τύπος δείκτη. |
| [ValueCollection](./valuecollection/) | Συλλογή τιμών για εξαγωγή. |
## Παρατηρήσεις


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Δημιουργήστε την παρουσία της κλάσης Dictionary.
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // Γεμίστε το λεξικό.
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // Εκτυπώστε τα στοιχεία του λεξικού.
  for (const auto &pair: dictionary)
  {
    std::cout << pair.get_Key() << " - " << pair.get_Value() << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
0 - Foo
1 - Bar
2 - Baz
*/
```

## Δείτε επίσης

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
