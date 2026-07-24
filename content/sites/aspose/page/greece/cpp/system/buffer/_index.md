---
title: "Κλάση System::Buffer"
linktitle: "Προσωρινή μνήμη"
second_title: "Aspose.Page για C++"
description: "System::Buffer κλάση. Περιέχει μεθόδους που χειρίζονται ακατέργαστους πίνακες byte. Αυτό είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπου. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με οποιονδήποτε τρόπο σε C++."
type: docs
weight: 1000
url: /el/cpp/system/buffer/
---
## Buffer class


Περιέχει μεθόδους που χειρίζονται ακατέργαστους πίνακες byte. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπου. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με κανέναν τρόπο.

```cpp
class Buffer
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | Αντιγράφει έναν καθορισμένο αριθμό byte από το buffer προέλευσης στο buffer προορισμού. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο. |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | Καθορίζει τον αριθμό των byte που καταλαμβάνονται από όλα τα στοιχεία του καθορισμένου πίνακα. |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | Καθορίζει τον αριθμό των byte που καταλαμβάνονται από όλα τα στοιχεία του καθορισμένου πίνακα. |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | Καθορίζει τον αριθμό των byte που καταλαμβάνονται από όλα τα στοιχεία του καθορισμένου πίνακα. |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | Ερμηνεύει τον καθορισμένο τύπο πίνακα ως ακατέργαστο πίνακα byte και ανακτά την τιμή byte στην καθορισμένη μετατόπιση byte. |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | Ερμηνεύει τον καθορισμένο τύπο πίνακα ως ακατέργαστο πίνακα byte και ανακτά την τιμή byte στην καθορισμένη μετατόπιση byte. |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | Ερμηνεύει τον καθορισμένο τύπο πίνακα ως ακατέργαστο πίνακα byte και ανακτά την τιμή byte στην καθορισμένη μετατόπιση byte. |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | Ερμηνεύει τον καθορισμένο τύπο πίνακα ως ακατέργαστο πίνακα byte και ορίζει την καθορισμένη τιμή byte στην καθορισμένη μετατόπιση byte. |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | Ερμηνεύει τον καθορισμένο τύπο πίνακα ως ακατέργαστο πίνακα byte και ορίζει την καθορισμένη τιμή byte στην καθορισμένη μετατόπιση byte. |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | Ερμηνεύει τον καθορισμένο τύπο πίνακα ως ακατέργαστο πίνακα byte και ορίζει την καθορισμένη τιμή byte στην καθορισμένη μετατόπιση byte. |
## Παρατηρήσεις



```cpp
#include <system/buffer.h>

using namespace System;

void Print(const SmartPtr<Array<uint8_t>> &source, int size)
{
  for (auto i = 0; i < size; i++)
  {
    std::cout << static_cast<int>(source[i]) << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Δημιουργήστε και γεμίστε τον πίνακα.
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // Εκτυπώστε τα στοιχεία του πίνακα.
  Print(first, SIZE);

  // Δημιουργήστε έναν πίνακα που περιέχει ένα μέρος του πρώτου.
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // Εκτυπώστε τα στοιχεία του δεύτερου πίνακα.
  Print(second, SIZE / 2);

  // Ορίστε την τιμή του στοιχείου στη θέση 0 και εκτυπώστε τα στοιχεία του πίνακα.
  Buffer::SetByte(second, 0, 128);
  Print(second, SIZE / 2);

  return 0;
}
/*
This code example produces the following output:
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
16 18 20 22 24 26 28 30
128 18 20 22 24 26 28 30
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
