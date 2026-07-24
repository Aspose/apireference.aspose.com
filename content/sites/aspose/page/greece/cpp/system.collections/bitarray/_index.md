---
title: "System::Collections::BitArray κλάση"
linktitle: "BitArray"
second_title: "Aspose.Page για C++"
description: "System::Collections::BitArray κλάση. Πίνακας bits που μπορεί να προσπελαστεί με δείκτη. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const bool\&) override | Προσθέτει τιμή στο τέλος του container. |
| [And](./and/)(const BitArrayPtr\&) | Υπολογίζει το bitwise 'and' μεταξύ δύο BitSets. |
| [BitArray](./bitarray/)(const bitset\&) | Κατασκευαστής αντιγραφής. |
| [BitArray](./bitarray/)(const BitArray\&) | Κατασκευαστής αντιγραφής. |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | Κατασκευαστής αντιγραφής. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | Κατασκευαστής αντιγραφής. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | Κατασκευαστής αντιγραφής. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | Κατασκευαστής αντιγραφής. |
| [BitArray](./bitarray/)(int, bool) | Κατασκευαστής γεμίσματος. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία. |
| [Contains](./contains/)(const bool\&) const override | Ελέγχει αν μια συγκεκριμένη τιμή υπάρχει στο container. Δεν έχει υλοποιηθεί. |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | Αντιγράφει δεδομένα σε υπάρχοντα στοιχεία του πίνακα. |
| [data](./data/)() | Πρόσβαση στην υποκείμενη δομή δεδομένων. |
| [data](./data/)() const | Πρόσβαση στην υποκείμενη δομή δεδομένων. |
| [Get](./get/)(int) const | Λαμβάνει το στοιχείο [BitArray](./). |
| [get_Count](./get_count/)() const override | Λαμβάνει το μέγεθος του container. |
| [get_Length](./get_length/)() const | Λαμβάνει το μέγεθος του container. |
| [GetEnumerator](./getenumerator/)() override | Δημιουργεί αντικείμενο enumerator. |
| [idx_get](./idx_get/)(int) const | Συνάρτηση getter. |
| [idx_set](./idx_set/)(int, bool) | Συνάρτηση setter. |
| [Not](./not/)() | Αντιστρέφει το BitSet. |
| [operator!=](./operator!=/)(const BitArray\&) const | Τελεστής bitwise σύγκρισης. |
| [operator==](./operator==/)(const BitArray\&) const | Τελεστής bitwise σύγκρισης. |
| [operator[]](./operator[]/)(int) | Συνάρτηση πρόσβασης. |
| [Or](./or/)(const BitArrayPtr\&) | Υπολογίζει το bitwise 'or' μεταξύ δύο BitSets. |
| [Remove](./remove/)(const bool\&) override | Επιστρέφει την πρώτη εμφάνιση της καθορισμένης τιμής. Δεν έχει υλοποιηθεί. |
| [Set](./set/)(int, bool) | Ορίζει το στοιχείο [BitArray](./). |
| [SetAll](./setall/)(bool) | Ορίζει όλα τα στοιχεία σε συγκεκριμένη τιμή. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Επίσημη υλοποίηση του μηχανισμού αδύναμων ορισμάτων προτύπου· δεν εφαρμόζεται σε αυτήν την κλάση. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
| [Xor](./xor/)(const BitArrayPtr\&) | Υπολογίζει το bitwise 'xor' μεταξύ δύο BitSets. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [bitset](./bitset/) | Πληροφορίες RTTI. |
## Παρατηρήσεις



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Δημιουργεί ένα νέο στιγμιότυπο της κλάσης BitArray.
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // Εκτυπώνει τιμές.
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
