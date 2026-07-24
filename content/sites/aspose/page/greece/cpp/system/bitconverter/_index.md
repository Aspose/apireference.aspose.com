---
title: "System::BitConverter κλάση"
linktitle: "BitConverter"
second_title: "Aspose.Page για C++"
description: "System::BitConverter κλάση. Περιέχει μεθόδους που εκτελούν μετατροπές ακολουθίας byte σε τύπο τιμής και αντίστροφα. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπου. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με οποιονδήποτε τρόπο σε C++."
type: docs
weight: 500
url: /el/cpp/system/bitconverter/
---
## BitConverter class


Περιέχει μεθόδους που εκτελούν μετατροπές ακολουθίας byte σε τύπο τιμής και αντίστροφα. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπου. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με κανέναν τρόπο.

```cpp
class BitConverter
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | Δείχνει το endianness της τρέχουσας αρχιτεκτονικής. |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | Επιστρέφει μια τιμή ακέραιου 64-bit της οποίας η δυαδική αναπαράσταση είναι ίση με τη δυαδική αναπαράσταση της συγκεκριμένης τιμής κινητής υποδιαστολής διπλής ακρίβειας. |
| static [GetBytes](./getbytes/)(bool) | Μετατρέπει τη συγκεκριμένη λογική τιμή σε έναν πίνακα byte. |
| static [GetBytes](./getbytes/)(char_t) | Μετατρέπει τη συγκεκριμένη τιμή char_t σε έναν πίνακα byte. |
| static [GetBytes](./getbytes/)(int16_t) | Μετατρέπει τη συγκεκριμένη τιμή ακέραιου 16-bit σε έναν πίνακα byte. |
| static [GetBytes](./getbytes/)(int) | Μετατρέπει τη συγκεκριμένη τιμή ακέραιου 32-bit σε έναν πίνακα byte. |
| static [GetBytes](./getbytes/)(int64_t) | Μετατρέπει τη συγκεκριμένη τιμή ακέραιου 64-bit σε έναν πίνακα byte. |
| static [GetBytes](./getbytes/)(uint16_t) | Μετατρέπει τη συγκεκριμένη τιμή αμετάβλητου ακέραιου 16-bit σε έναν πίνακα byte. |
| static [GetBytes](./getbytes/)(uint32_t) | Μετατρέπει τη συγκεκριμένη τιμή αμετάβλητου ακέραιου 32-bit σε έναν πίνακα byte. |
| static [GetBytes](./getbytes/)(uint64_t) | Μετατρέπει τη συγκεκριμένη τιμή αμετάβλητου ακέραιου 64-bit σε έναν πίνακα byte. |
| static [GetBytes](./getbytes/)(float) | Μετατρέπει τη συγκεκριμένη τιμή κινητής υποδιαστολής μονής ακρίβειας σε έναν πίνακα byte. |
| static [GetBytes](./getbytes/)(double) | Μετατρέπει τη συγκεκριμένη τιμή κινητής υποδιαστολής διπλής ακρίβειας σε έναν πίνακα byte. |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | Επιστρέφει μια τιμή κινητής υποδιαστολής διπλής ακρίβειας της οποίας η τιμή είναι ισοδύναμη με την τιμή. |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει ένα byte από τον συγκεκριμένο πίνακα, αρχίζοντας από τον καθορισμένο δείκτη, σε λογική τιμή. |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει ένα byte από τον συγκεκριμένο πίνακα, αρχίζοντας από τον καθορισμένο δείκτη, σε λογική τιμή. |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει δύο byte από τον συγκεκριμένο πίνακα, αρχίζοντας από τον καθορισμένο δείκτη, σε τιμή char_t. |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει δύο byte από τον συγκεκριμένο πίνακα, αρχίζοντας από τον καθορισμένο δείκτη, σε τιμή char_t. |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει οκτώ bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή κινητής υποδιαστολής διπλής ακρίβειας. |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει οκτώ bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή κινητής υποδιαστολής διπλής ακρίβειας. |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει δύο bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 16-bit. |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει δύο bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 16-bit. |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει τέσσερα bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 32-bit. |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει τέσσερα bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 32-bit. |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει οκτώ bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 64-bit. |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει οκτώ bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 64-bit. |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει τέσσερα bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή κινητής υποδιαστολής μονής ακρίβειας. |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει τέσσερα bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή κινητής υποδιαστολής μονής ακρίβειας. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | Μετατρέπει όλες τις τιμές του καθορισμένου πίνακα byte στη δεκαεξαδική τους αναπαράσταση ως συμβολοσειρά. Η μορφή των γραμμάτων που θα χρησιμοποιηθούν στη δεκαεξαδική σημειογραφία και ο διαχωριστής που εισάγεται μεταξύ κάθε ζεύγους γειτονικών bytes καθορίζονται μέσω των αντίστοιχων ορισμάτων. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει τις τιμές του καθορισμένου πίνακα byte στη δεκαεξαδική τους αναπαράσταση ως συμβολοσειρά, ξεκινώντας από τον καθορισμένο δείκτη. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | Μετατρέπει μια περιοχή τιμών του καθορισμένου πίνακα byte στη δεκαεξαδική τους αναπαράσταση ως συμβολοσειρά. |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει δύο bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 16-bit χωρίς πρόσημο. |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει δύο bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 16-bit χωρίς πρόσημο. |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει τέσσερα bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 32-bit χωρίς πρόσημο. |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει τέσσερα bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 32-bit χωρίς πρόσημο. |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Μετατρέπει οκτώ bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 64-bit χωρίς πρόσημο. |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Μετατρέπει οκτώ bytes από τον καθορισμένο πίνακα που ξεκινά από το καθορισμένο δείκτη σε τιμή ακέραιου 64-bit χωρίς πρόσημο. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | Δείχνει τη σειρά byte (endianness) της τρέχουσας αρχιτεκτονικής. true εάν η αρχιτεκτονική είναι little endian, false διαφορετικά. |
## Παρατηρήσεις



```cpp
#include <system/bit_converter.h>
#include <system/smart_ptr.h>

using namespace System;

template <typename T>
void Print(T arg)
{
  std::cout << arg << ' ';

  for (const auto byte: BitConverter::GetBytes(arg))
  {
    std::cout << std::hex << static_cast<int>(byte);
  }

  std::cout << std::endl;
}

int main()
{
  // Δημιουργήστε τιμές για εκτύπωση.
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // Εκτυπώστε την τιμή και τα bytes της.
  Print(anInt);
  Print(aDouble);

  return 0;
}
/*
This code example produces the following output:
1234567890 d229649
0.123457 5f633937dd9abf3f
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
