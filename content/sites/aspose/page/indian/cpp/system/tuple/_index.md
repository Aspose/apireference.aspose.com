---
title: "System::Tuple क्लास"
linktitle: "Tuple"
second_title: "Aspose.Page C++ के लिए"
description: "System::Tuple क्लास। ट्यूपल डेटा संरचना का प्रतिनिधित्व करने वाली क्लास। C++ में अधिकतम आइटम संख्या 8 है।"
type: docs
weight: 6400
url: /hi/cpp/system/tuple/
---
## Tuple class


एक ट्यूपल डेटा संरचना का प्रतिनिधित्व करने वाला क्लास। अधिकतम आइटम संख्या 8 है।

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| पैरामीटर | विवरण |
| --- | --- |
| आर्ग्युमेंट्स | ट्यूपल के तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | निर्धारित करता है कि वर्तमान और निर्दिष्ट ऑब्जेक्ट समान हैं या नहीं। |
| [get_Item](./get_item/)() const | [Tuple](./) ऑब्जेक्ट के घटक का मान प्राप्त करता है। |
| [Tuple](./tuple/)(Args...) | एक ट्यूपल ऑब्जेक्ट बनाता है। |
## टिप्पणियाँ



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::MakeObject<System::Tuple<int, int, int>>(32, 16, 128);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 32
Item 2: 16
Item 3: 128
*/
```

## संबंधित देखें

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
