---
title: "System::BitConverter क्लास"
linktitle: "BitConverter"
second_title: "Aspose.Page C++ के लिए"
description: "System::BitConverter क्लास। ऐसे मेथड्स शामिल करता है जो बाइट्स की श्रृंखला को वैल्यू टाइप में और उसके विपरीत रूपांतरण करते हैं। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको C++ में किसी भी तरह इसका इंस्टेंस नहीं बनाना चाहिए।"
type: docs
weight: 500
url: /hi/cpp/system/bitconverter/
---
## BitConverter class


बाइट्स की श्रृंखला को वैल्यू टाइप में और इसके विपरीत रूपांतरण करने वाले मेथड्स शामिल हैं। यह एक स्थैतिक टाइप है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको इसे किसी भी तरह से इंस्टेंस नहीं बनाना चाहिए।

```cpp
class BitConverter
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | वर्तमान आर्किटेक्चर की एंडियननेस दर्शाता है। |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | एक 64-बिट पूर्णांक मान लौटाता है जिसकी बाइनरी प्रतिनिधित्व निर्दिष्ट डबल-प्रिसिशन फ्लोटिंग पॉइंट मान की बाइनरी प्रतिनिधित्व के बराबर होती है। |
| static [GetBytes](./getbytes/)(bool) | निर्दिष्ट बूलियन मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(char_t) | निर्दिष्ट char_t मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(int16_t) | निर्दिष्ट 16-बिट पूर्णांक मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(int) | निर्दिष्ट 32-बिट पूर्णांक मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(int64_t) | निर्दिष्ट 64-बिट पूर्णांक मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(uint16_t) | निर्दिष्ट अनसाइनड 16-बिट पूर्णांक मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(uint32_t) | निर्दिष्ट अनसाइनड 32-बिट पूर्णांक मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(uint64_t) | निर्दिष्ट अनसाइनड 64-बिट पूर्णांक मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(float) | निर्दिष्ट सिंगल-प्रिसिशन फ्लोटिंग पॉइंट मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [GetBytes](./getbytes/)(double) | निर्दिष्ट डबल-प्रिसिशन फ्लोटिंग पॉइंट मान को बाइट्स की एरे में परिवर्तित करता है। |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | एक डबल-प्रिसिशन फ्लोटिंग पॉइंट मान लौटाता है जिसका मान मूल मान के बराबर है। |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट एरे से एक बाइट, निर्दिष्ट इंडेक्स से शुरू होकर, बूलियन मान में परिवर्तित करता है। |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट एरे से एक बाइट, निर्दिष्ट इंडेक्स से शुरू होकर, बूलियन मान में परिवर्तित करता है। |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट एरे से दो बाइट्स, निर्दिष्ट इंडेक्स से शुरू होकर, char_t मान में परिवर्तित करता है। |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट एरे से दो बाइट्स, निर्दिष्ट इंडेक्स से शुरू होकर, char_t मान में परिवर्तित करता है। |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर आठ बाइट्स को डबल-प्रेसिशन फ्लोटिंग पॉइंट मान में परिवर्तित करता है। |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर आठ बाइट्स को डबल-प्रेसिशन फ्लोटिंग पॉइंट मान में परिवर्तित करता है। |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर दो बाइट्स को 16-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर दो बाइट्स को 16-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर चार बाइट्स को 32-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर चार बाइट्स को 32-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर आठ बाइट्स को 64-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर आठ बाइट्स को 64-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर चार बाइट्स को सिंगल-प्रेसिशन फ्लोटिंग पॉइंट मान में परिवर्तित करता है। |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर चार बाइट्स को सिंगल-प्रेसिशन फ्लोटिंग पॉइंट मान में परिवर्तित करता है। |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | निर्दिष्ट बाइट सरणी के सभी मानों को उनके हेक्साडेसिमल स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है। हेक्साडेसिमल नोटेशन में उपयोग किए जाने वाले अक्षरों का केस और पड़ोसी बाइट्स की प्रत्येक जोड़ी के बीच डाला गया विभाजक संबंधित तर्कों के माध्यम से निर्दिष्ट किया जाता है। |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट बाइट सरणी के मानों को निर्दिष्ट सूचकांक से शुरू होकर उनके हेक्साडेसिमल स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है। |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | निर्दिष्ट बाइट सरणी के मानों की एक सीमा को उनके हेक्साडेसिमल स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है। |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर दो बाइट्स को अनसाइन्ड 16-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर दो बाइट्स को अनसाइन्ड 16-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर चार बाइट्स को अनसाइन्ड 32-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर चार बाइट्स को अनसाइन्ड 32-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर आठ बाइट्स को अनसाइन्ड 64-बिट पूर्णांक मान में परिवर्तित करता है। |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | निर्दिष्ट सरणी से निर्दिष्ट सूचकांक से शुरू होकर आठ बाइट्स को अनसाइन्ड 64-बिट पूर्णांक मान में परिवर्तित करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | वर्तमान आर्किटेक्चर की एंडियननेस को दर्शाता है। यदि आर्किटेक्चर लिटिल एंडियन है तो true, अन्यथा false। |
## टिप्पणियाँ



```cpp
#include <system/bit_converter.h>
#include <system/smart_ptr.h>

using namespace System;

template <typename T>
void Print(T arg)
{
  std::cout << arg << ' ';

  for (const auto byte: BitConverter::GetBytes(arg))
  {
    std::cout << std::hex << static_cast<int>(byte);
  }

  std::cout << std::endl;
}

int main()
{
  // प्रिंट करने के लिए मान बनाएं।
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // मान और उसके बाइट्स को प्रिंट करें।
  Print(anInt);
  Print(aDouble);

  return 0;
}
/*
This code example produces the following output:
1234567890 d229649
0.123457 5f633937dd9abf3f
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
