---
title: "System::Predicate टाइपडिफ"
linktitle: "प्रेडिकेट"
second_title: "Aspose.Page C++ के लिए"
description: "System::Predicate टाइपडिफ। यह एक प्रेडिकेट के पॉइंटर को दर्शाता है - एक ऐसा इनवोकेबल एंटिटी जो एक एकल आर्ग्यूमेंट लेता है और C++ में बूल मान लौटाता है।"
type: docs
weight: 12500
url: /hi/cpp/system/predicate/
---
## Predicate typedef


एक प्रेडिकेट के लिए पॉइंटर का प्रतिनिधित्व करता है - एक इनवोकेबल एंटिटी जो एक एकल आर्ग्युमेंट लेती है और बूल मान लौटाती है।

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## टिप्पणियाँ



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // ऐरे को भरें।
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // एक प्रेडिकेट बनाएं जो 3 से बड़े ऐरे एलिमेंट को लौटाता है।
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // बनाए गए प्रेडिकेट का उपयोग करके ऐरे का पहला एलिमेंट खोजें और उसे प्रिंट करें।
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
