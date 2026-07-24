---
title: "System::Action typedef"
linktitle: "Aksi"
second_title: "Aspose.Page untuk C++"
description: "System::Action typedef. Tipe delegasi yang merujuk ke metode yang tidak memiliki nilai kembali dalam C++."
type: docs
weight: 9400
url: /id/cpp/system/action/
---
## Action typedef


Tipe delegate yang merujuk pada metode yang tidak memiliki nilai kembali.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## Catatan



```cpp
#include <system/action.h>

using namespace System;

// Fungsi yang mencetak string yang diberikan.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Buat sebuah instance dari Action.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // Panggil aksi.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
