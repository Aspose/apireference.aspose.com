---
title: "System::Byte class"
linktitle: "Byte"
second_title: "Aspose.Page C++ के लिए"
description: "System::Byte class. C++ में अनसाइनड 8-बिट इंटीजर के साथ काम करने के लिए मेथड्स शामिल करता है।"
type: docs
weight: 1100
url: /hi/cpp/system/byte/
---
## Byte class


अनसाइनड 8-बिट इंटीजर के साथ काम करने वाले मेथड्स शामिल हैं।

```cpp
class Byte
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Parse](./parse/)(const String\&) | निर्दिष्ट स्ट्रिंग, जिसमें किसी संख्या का स्ट्रिंग प्रतिनिधित्व होता है, को समकक्ष 8-बिट अनसाइनड इंटीजर में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | प्रदान की गई फ़ॉर्मेटिंग जानकारी का उपयोग करके, निर्दिष्ट स्ट्रिंग, जिसमें किसी संख्या का स्ट्रिंग प्रतिनिधित्व होता है, को समकक्ष 8-बिट अनसाइनड इंटीजर में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | प्रदान की गई फ़ॉर्मेटिंग जानकारी और नंबर स्टाइल का उपयोग करके, निर्दिष्ट स्ट्रिंग, जिसमें किसी संख्या का स्ट्रिंग प्रतिनिधित्व होता है, को समकक्ष 8-बिट अनसाइनड इंटीजर में परिवर्तित करता है। |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | निर्दिष्ट स्ट्रिंग, जिसमें किसी संख्या का स्ट्रिंग प्रतिनिधित्व होता है, को समकक्ष 8-बिट अनसाइनड इंटीजर में परिवर्तित करता है। |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | प्रदान की गई फ़ॉर्मेटिंग जानकारी और नंबर स्टाइल का उपयोग करके, निर्दिष्ट स्ट्रिंग, जिसमें किसी संख्या का स्ट्रिंग प्रतिनिधित्व होता है, को समकक्ष 8-बिट अनसाइनड इंटीजर में परिवर्तित करता है। |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | सबसे बड़ा संभव मान। |
| static constexpr [MinValue](./minvalue/) | सबसे छोटा संभव मान। |
## टिप्पणियाँ



```cpp
#include <system/byte.h>

using namespace System;

int main()
{
  auto b1 = Byte::Parse(u"123");
  std::cout << static_cast<uint32_t>(b1) << std::endl;

  try
  {
    auto b2 = Byte::Parse(u"345");
    std::cout << static_cast<uint32_t>(b2) << std::endl;
  }
  catch (const OverflowException &ex)
  {
    std::cerr << ex.what() << std::endl;
  }

  uint8_t b3 = 0;
  if (Byte::TryParse(u"10", b3))
  {
    std::cout << static_cast<uint32_t>(b3) << std::endl;
  }
  else
  {
    std::cerr << "Something went wrong." << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
123
System::OverflowException: Value was either too large or too small for an UInt8
10
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
