---
title: "System::Action typedef"
linktitle: "Action"
second_title: "Aspose.Font için C++"
description: "System::Action typedef. C++'ta dönüş değeri olmayan yöntemlere referans veren bir temsilci türü."
type: docs
weight: 9400
url: /tr/cpp/system/action/
---
## Action typedef


Dönüş değeri olmayan yöntemleri referans alan bir delege tipini temsil eder.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Açıklamalar



```cpp
#include <system/action.h>

using namespace System;

// Geçilen dizeyi yazdıran işlev.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Action sınıfının bir örneğini oluştur.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // Eylemi çağır.
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
* Library [Aspose.Font for C++](../../)
