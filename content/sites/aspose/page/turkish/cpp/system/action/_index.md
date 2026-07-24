---
title: "System::Action typedef"
linktitle: "Eylem"
second_title: "Aspose.Page için C++"
description: "System::Action typedef. C++'da dönüş değeri olmayan yöntemlere referans veren temsilci türü."
type: docs
weight: 9400
url: /tr/cpp/system/action/
---
## Action typedef


Geri dönüş değeri olmayan yöntemlere referans veren delege türü.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Açıklamalar



```cpp
#include <system/action.h>

using namespace System;

// Geçilen dizgiyi yazdıran fonksiyon.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Action'ın bir örneğini oluştur.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // Action'ı çağır.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
