---
title: "System::Byte κλάση"
linktitle: "Byte"
second_title: "Aspose.Page για C++"
description: "System::Byte κλάση. Περιέχει μεθόδους για εργασία με τον ακεραίο 8-bit χωρίς πρόσημο σε C++."
type: docs
weight: 1100
url: /el/cpp/system/byte/
---
## Byte class


Περιέχει μεθόδους για εργασία με τον μη-υπογεγραμμένο 8-bit ακέραιο.

```cpp
class Byte
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Μετατρέπει τη καθορισμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στον ισοδύναμο ακεραίο 8-bit χωρίς πρόσημο. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Μετατρέπει τη καθορισμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στον ισοδύναμο ακεραίο 8-bit χωρίς πρόσημο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Μετατρέπει τη καθορισμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στον ισοδύναμο ακεραίο 8-bit χωρίς πρόσημο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης και το στυλ αριθμού. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | Μετατρέπει τη καθορισμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στον ισοδύναμο ακεραίο 8-bit χωρίς πρόσημο. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | Μετατρέπει τη καθορισμένη συμβολοσειρά που περιέχει την αναπαράσταση συμβολοσειράς ενός αριθμού στον ισοδύναμο ακεραίο 8-bit χωρίς πρόσημο χρησιμοποιώντας τις παρεχόμενες πληροφορίες μορφοποίησης και το στυλ αριθμού. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | Μεγαλύτερη δυνατή τιμή. |
| static constexpr [MinValue](./minvalue/) | Μικρότερη δυνατή τιμή. |
## Παρατηρήσεις



```cpp
#include <system/byte.h>

using namespace System;

int main()
{
  auto b1 = Byte::Parse(u"123");
  std::cout << static_cast<uint32_t>(b1) << std::endl;

  try
  {
    auto b2 = Byte::Parse(u"345");
    std::cout << static_cast<uint32_t>(b2) << std::endl;
  }
  catch (const OverflowException &ex)
  {
    std::cerr << ex.what() << std::endl;
  }

  uint8_t b3 = 0;
  if (Byte::TryParse(u"10", b3))
  {
    std::cout << static_cast<uint32_t>(b3) << std::endl;
  }
  else
  {
    std::cerr << "Something went wrong." << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
123
System::OverflowException: Value was either too large or too small for an UInt8
10
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
