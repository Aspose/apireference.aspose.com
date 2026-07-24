---
title: "System::Func class"
linktitle: "Func"
second_title: "Aspose.Page για C++"
description: "System::Func class. Αντιπροσωπευτικό λειτουργίας. Αυτός ο τύπος θα πρέπει να κατανεμηθεί στη στοίβα και να περνιέται σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση System::SmartPtr για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 2800
url: /el/cpp/system/func/
---
## Func class


Delegate λειτουργίας. Αυτός ο τύπος θα πρέπει να κατανεμηθεί στη στοίβα και να περνιέται σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση [System::SmartPtr](../smartptr/) για τη διαχείριση αντικειμένων αυτού του τύπου.

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| Parameter | Περιγραφή |
| --- | --- |
| Παράμετροι | Παράμετροι κλήσης, έπειτα υποχρεωτικός τύπος επιστροφής. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Func](./func/)() | Προεπιλεγμένος κατασκευαστής που δημιουργεί null-Func. |
| [Func](./func/)(T\&&) | Κατασκευαστής που δημιουργεί το αντικείμενο [Func](./) και του αναθέτει τιμή (είτε πραγματική κλήση επιστροφής είτε nullptr). |
| [Func](./func/)(const Func\&) | Κατασκευαστής αντιγραφής. |
| [Func](./func/)(Func\&&) | Κατασκευαστής μετακίνησης. |
| [operator=](./operator=/)(const Func\&) | Αντιγραφή ανάθεσης. |
| [operator=](./operator=/)(Func\&&) | Μετακίνηση ανάθεσης. |
| [~Func](./~func/)() | Καταστροφέας. |
## Παρατηρήσεις



```cpp
#include "system/func.h"
#include <iostream>

// Αυτή η συνάρτηση δέχεται μια παρουσία του αντικειμένου System::Func ως παράμετρο.
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // Δημιουργήστε μια παρουσία του αντικειμένου System::Func.
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // Περάστε την δημιουργημένη παρουσία ως όρισμα συνάρτησης.
  Print(1, func);
  Print(2, func);
  Print(3, func);

  return 0;
}
/*
This code example produces the following output:
1
4
9
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
