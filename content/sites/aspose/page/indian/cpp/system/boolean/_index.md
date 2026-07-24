---
title: "System::Boolean class"
linktitle: "बूलियन"
second_title: "Aspose.Page C++ के लिए"
description: "System::Boolean class. C++ में System.Boolean .Net प्रकार के स्थैतिक सदस्यों को रखने वाली क्लास।"
type: docs
weight: 600
url: /hi/cpp/system/boolean/
---
## Boolean class


क्लास जो [System.Boolean](./) .[Net](../../system.net/) प्रकार के स्थैतिक सदस्यों को रखती है।

```cpp
class Boolean
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Parse](./parse/)(const String\&) | निर्दिष्ट स्ट्रिंग को बूल प्रकार के मान में परिवर्तित करता है। |
| static [TryParse](./tryparse/)(const String\&, bool\&) | निर्दिष्ट स्ट्रिंग को बूल प्रकार के मान में परिवर्तित करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [FalseString](./falsestring/) | [String](../string/) 'false' बूलियन मान का प्रतिनिधित्व। |
| static [TrueString](./truestring/) | [String](../string/) 'true' बूलियन मान का प्रतिनिधित्व। |
## टिप्पणियाँ



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // बूलियन वेरिएबल बनाएं।
  bool isWeekend = false;

  // इनपुट स्ट्रिंग को पार्स करें और परिणाम प्रिंट करें।
  if (Boolean::TryParse(u"True", isWeekend))
  {
    std::cout << "Is weekend: " << (isWeekend ? "Yes" : "No");
  }
  else
  {
    std::cerr << "Something went wrong" << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
Is weekend: Yes
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
