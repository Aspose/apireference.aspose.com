---
title: "System::Action typedef"
linktitle: "Åtgärd"
second_title: "Aspose.Page för C++"
description: "System::Action typedef. Delegattyp som refererar till metoder som inte har något returvärde i C++."
type: docs
weight: 9400
url: /sv/cpp/system/action/
---
## Action typedef


Delegattyp som refererar till metoder som inte har något returvärde.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Anmärkningar



```cpp
#include <system/action.h>

using namespace System;

// Funktionen som skriver ut den överförda strängen.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Skapa en instans av Action.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // Anropa action.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
