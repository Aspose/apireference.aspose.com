---
title: "System::Action typedef"
linktitle: "Δράση"
second_title: "Aspose.Page για C++"
description: "System::Action typedef. Τύπος delegate που αναφέρεται σε μεθόδους που δεν έχουν τιμή επιστροφής στην C++."
type: docs
weight: 9400
url: /el/cpp/system/action/
---
## Action typedef


Τύπος delegate που αναφέρεται σε μεθόδους που δεν έχουν τιμή επιστροφής.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Παρατηρήσεις



```cpp
#include <system/action.h>

using namespace System;

// Η συνάρτηση που εκτυπώνει το δοσμένο κείμενο.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Δημιουργήστε μια παρουσία της Action.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // Κλήστε το Action.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
