---
title: "System::Action typedef"
linktitle: "Action"
second_title: "Aspose.Page voor C++"
description: "System::Action typedef. Delegatetype die verwijst naar methoden die geen retourwaarde hebben in C++."
type: docs
weight: 9400
url: /nl/cpp/system/action/
---
## Action typedef


Delegatietype dat methoden verwijst die geen retourwaarde hebben.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Opmerkingen



```cpp
#include <system/action.h>

using namespace System;

// De functie die de meegegeven string afdrukt.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Maak een instantie van Action.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // Roep de actie aan.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
