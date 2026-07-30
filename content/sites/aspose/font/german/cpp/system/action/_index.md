---
title: "System::Action typedef"
linktitle: "Action"
second_title: "Aspose.Font für C++"
description: "System::Action typedef. Delegatentyp, der Methoden referenziert, die keinen Rückgabewert haben, in C++."
type: docs
weight: 9400
url: /de/cpp/system/action/
---
## Action typedef


Delegattyp, der Methoden referenziert, die keinen Rückgabewert haben.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Hinweise



```cpp
#include <system/action.h>

using namespace System;

// Die Funktion, die den übergebenen String ausgibt.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Erstelle eine Instanz von Action.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // Rufe die Aktion auf.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
