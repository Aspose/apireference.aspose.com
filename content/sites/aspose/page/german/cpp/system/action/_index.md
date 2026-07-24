---
title: "System::Action typedef"
linktitle: "Aktion"
second_title: "Aspose.Page für C++"
description: "System::Action typedef. Delegatentyp, der Methoden referenziert, die keinen Rückgabewert in C++ haben."
type: docs
weight: 9400
url: /de/cpp/system/action/
---
## Action typedef


Delegatentyp, der Methoden referenziert, die keinen Rückgabewert haben.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Hinweise



```cpp
#include <system/action.h>

using namespace System;

// Die Funktion, die die übergebene Zeichenkette ausgibt.
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
* Library [Aspose.Page for C++](../../)
