---
title: "System::Action टाइपडिफ"
linktitle: "Action"
second_title: "Aspose.Page C++ के लिए"
description: "System::Action टाइपडिफ। एक डेलीगेट प्रकार जो C++ में ऐसे मेथड्स को रेफ़रेंस करता है जिनका रिटर्न वैल्यू नहीं होता।"
type: docs
weight: 9400
url: /hi/cpp/system/action/
---
## Action typedef


डेलीगेट प्रकार जो उन मेथड्स को संदर्भित करता है जिनका कोई रिटर्न वैल्यू नहीं होता।

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## टिप्पणियाँ



```cpp
#include <system/action.h>

using namespace System;

// पास की गई स्ट्रिंग को प्रिंट करने वाला फ़ंक्शन।
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Action का एक इंस्टेंस बनाएं।
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // एक्शन को कॉल करें।
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
