---
title: "System::Comparison क्लास"
linktitle: "तुलना"
second_title: "Aspose.Page C++ के लिए"
description: "System::Comparison क्लास। दो समान प्रकार के वस्तुओं की तुलना करने वाले मेथड के लिए एक पॉइंटर का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या संदर्भ द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए System::SmartPtr क्लास का कभी उपयोग न करें।"
type: docs
weight: 1300
url: /hi/cpp/system/comparison/
---
## Comparison class


दो समान प्रकार के वस्तुओं की तुलना करने वाले मेथड के लिए एक पॉइंटर का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या संदर्भ द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए [System::SmartPtr](../smartptr/) क्लास का कभी उपयोग न करें।

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वह प्रकार जिसके वस्तुओं की तुलना मेथड करता है |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Comparison](./comparison/)(Y) | एक [Comparison](./) डेलीगेट का उदाहरण बनाता है जो निर्दिष्ट इनवोकेबल इकाई के पॉइंटर का प्रतिनिधित्व करता है। |
| [operator()](./operator()/)(T, T) | वर्तमान ऑब्जेक्ट द्वारा इंगित इनवोकेबल ऑब्जेक्ट को कॉल करता है। |
## टिप्पणियाँ



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// डायनामिक एरे का प्रतिनिधित्व करने वाली टेम्प्लेट क्लास।
template <typename T>
class MyArray
{
  // एरे डेटा को संग्रहीत करने के लिए उपयोग किया जाता है।
  std::vector<T> m_data;

public:
  // हमारे डायनामिक एरे का नया उदाहरण बनाता है।
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // ऐरे डेटा को सॉर्ट करने के लिए उपयोग किया जाता है। यह मेथड का एक इंस्टेंस स्वीकार करता है।
  // 'System::Comparison' टेम्प्लेट क्लास।
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // हमारे डायनेमिक ऐरे द्वारा संग्रहीत तत्वों की संख्या लौटाता है।
  size_t get_Size()
  {
    return m_data.size();
  }

  // निर्दिष्ट इंडेक्स पर एक तत्व प्राप्त करने के लिए उपयोग किया जाता है।
  T& operator[](int index)
  {
    if (index < 0 || index >= m_data.size())
    {
      throw IndexOutOfRangeException(u"index");
    }
    return m_data[index];
  }
};

int main() {
  // निर्दिष्ट तत्वों के साथ MyArray क्लास का एक इंस्टेंस बनाएं।
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // डायनेमिक ऐरे के आरोही तत्वों द्वारा सॉर्ट करें।
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // डायनेमिक ऐरे के तत्वों को प्रिंट करें।
  for (auto i = 0; i < arr.get_Size(); ++i)
  {
    Console::WriteLine(arr[i]);
  }

  return 0;
}
/*
This code example produces the following output:
a
b
c
d
e
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
