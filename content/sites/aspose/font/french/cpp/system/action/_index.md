---
title: "typedef System::Action"
linktitle: "Action"
second_title: "Aspose.Font pour C++"
description: "typedef System::Action. Type de délégué qui référence des méthodes ne retournant aucune valeur en C++."
type: docs
weight: 9400
url: /fr/cpp/system/action/
---
## Action typedef


Type de délégué qui référence des méthodes qui n'ont pas de valeur de retour.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Remarques



```cpp
#include <system/action.h>

using namespace System;

// La fonction qui affiche la chaîne passée.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Créez une instance de Action.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // Appelez l'action.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
