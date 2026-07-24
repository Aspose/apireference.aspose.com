---
title: "System::Comparison κλάση"
linktitle: "Comparison"
second_title: "Aspose.Page για C++"
description: "System::Comparison κλάση. Αντιπροσωπεύει έναν δείκτη στη μέθοδο που συγκρίνει δύο αντικείμενα του ίδιου τύπου. Αυτός ο τύπος πρέπει να κατανεμηθεί στη στοίβα και να περάσει σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση System::SmartPtr για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 1300
url: /el/cpp/system/comparison/
---
## Comparison class


Αντιπροσωπεύει έναν δείκτη στη μέθοδο που συγκρίνει δύο αντικείμενα του ίδιου τύπου. Αυτός ο τύπος πρέπει να κατανεμηθεί στη στοίβα και να περάσει σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση [System::SmartPtr](../smartptr/) για τη διαχείριση αντικειμένων αυτού του τύπου.

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των αντικειμένων που συγκρίνει η μέθοδος |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Comparison](./comparison/)(Y) | Δημιουργεί μια παρουσία του εκχωρητή [Comparison](./) που αντιπροσωπεύει τον δείκτη προς την καθορισμένη κλήσιμη οντότητα. |
| [operator()](./operator()/)(T, T) | Καλεί το κλήσιμο αντικείμενο που δείχνει το τρέχον αντικείμενο. |
## Παρατηρήσεις



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// Η κλάση προτύπου που αντιπροσωπεύει έναν δυναμικό πίνακα.
template <typename T>
class MyArray
{
  // Χρησιμοποιείται για την αποθήκευση των δεδομένων του πίνακα.
  std::vector<T> m_data;

public:
  // Δημιουργεί μια νέα παρουσία του δυναμικού μας πίνακα.
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // Χρησιμοποιείται για την ταξινόμηση των δεδομένων του πίνακα. Αυτή η μέθοδος δέχεται μια παρουσία του
  // 'System::Comparison' κλάση προτύπου.
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // Επιστρέφει έναν αριθμό στοιχείων που αποθηκεύει ο δυναμικός μας πίνακας.
  size_t get_Size()
  {
    return m_data.size();
  }

  // Χρησιμοποιείται για την λήψη ενός στοιχείου στον καθορισμένο δείκτη.
  T& operator[](int index)
  {
    if (index < 0 || index >= m_data.size())
    {
      throw IndexOutOfRangeException(u"index");
    }
    return m_data[index];
  }
};

int main() {
  // Δημιουργήστε μια παρουσία της κλάσης MyArray με τα καθορισμένα στοιχεία.
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // Ταξινομήστε κατά αύξουσα σειρά τα στοιχεία του δυναμικού πίνακα.
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // Εκτυπώστε τα στοιχεία του δυναμικού πίνακα.
  for (auto i = 0; i < arr.get_Size(); ++i)
  {
    Console::WriteLine(arr[i]);
  }

  return 0;
}
/*
This code example produces the following output:
a
b
c
d
e
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
