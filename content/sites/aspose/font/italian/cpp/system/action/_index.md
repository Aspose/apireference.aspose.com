---
title: "System::Action typedef"
linktitle: "Action"
second_title: "Aspose.Font per C++"
description: "System::Action typedef. Tipo di delegato che fa riferimento a metodi che non hanno valore di ritorno in C++."
type: docs
weight: 9400
url: /it/cpp/system/action/
---
## Action typedef


Tipo di delegato che fa riferimento a metodi che non hanno valore di ritorno.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Osservazioni



```cpp
#include <system/action.h>

using namespace System;

// La funzione che stampa la stringa passata.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Crea un'istanza di Action.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // Chiama l'azione.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
