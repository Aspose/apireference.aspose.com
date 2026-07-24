---
title: "System::Collections::BitArray क्लास"
linktitle: "BitArray"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::BitArray क्लास। बिट्स की एक एरे जो इंडेक्स द्वारा अभिगमित की जा सकती है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 100
url: /hi/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const bool\&) override | कंटेनर के अंत में मान जोड़ता है। |
| [And](./and/)(const BitArrayPtr\&) | दो BitSets के बीच बिटवाइज़ 'and' की गणना करता है। |
| [BitArray](./bitarray/)(const bitset\&) | कॉपी कंस्ट्रक्टर। |
| [BitArray](./bitarray/)(const BitArray\&) | कॉपी कंस्ट्रक्टर। |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | कॉपी कंस्ट्रक्टर। |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | कॉपी कंस्ट्रक्टर। |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | कॉपी कंस्ट्रक्टर। |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | कॉपी कंस्ट्रक्टर। |
| [BitArray](./bitarray/)(int, bool) | फ़िल कंस्ट्रक्टर। |
| [Clear](./clear/)() override | सभी तत्वों को हटाता है। |
| [Contains](./contains/)(const bool\&) const override | जाँचता है कि क्या विशिष्ट मान कंटेनर में मौजूद है। लागू नहीं किया गया। |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | डेटा को मौजूदा एरे तत्वों में कॉपी करता है। |
| [data](./data/)() | अधीनस्थ डेटा संरचना तक पहुँच। |
| [data](./data/)() const | अधीनस्थ डेटा संरचना तक पहुँच। |
| [Get](./get/)(int) const | प्राप्त करता है [BitArray](./) तत्व। |
| [get_Count](./get_count/)() const override | कंटेनर का आकार प्राप्त करता है। |
| [get_Length](./get_length/)() const | कंटेनर का आकार प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | एन्यूमरेटर ऑब्जेक्ट बनाता है। |
| [idx_get](./idx_get/)(int) const | गेटर फ़ंक्शन। |
| [idx_set](./idx_set/)(int, bool) | सेटर फ़ंक्शन। |
| [Not](./not/)() | BitSet को नकारता है। |
| [operator!=](./operator!=/)(const BitArray\&) const | बिटवाइज़ तुलना ऑपरेटर। |
| [operator==](./operator==/)(const BitArray\&) const | बिटवाइज़ तुलना ऑपरेटर। |
| [operator[]](./operator[]/)(int) | एक्सेसर फ़ंक्शन। |
| [Or](./or/)(const BitArrayPtr\&) | दो BitSets के बीच बिटवाइज़ 'or' की गणना करता है। |
| [Remove](./remove/)(const bool\&) override | निर्दिष्ट मान की पहली उपस्थिति लौटाता है। लागू नहीं किया गया है। |
| [Set](./set/)(int, bool) | [BitArray](./) तत्व सेट करता है। |
| [SetAll](./setall/)(bool) | सभी तत्वों को विशिष्ट मान पर सेट करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | कमजोर टेम्प्लेट आर्ग्यूमेंट्स तंत्र का औपचारिक कार्यान्वयन; इस क्लास पर लागू नहीं होता। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [Xor](./xor/)(const BitArrayPtr\&) | दो BitSets के बीच बिटवाइज़ 'xor' की गणना करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [bitset](./bitset/) | RTTI जानकारी। |
## टिप्पणियाँ



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // BitArray क्लास का नया उदाहरण बनाता है।
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // मानों को प्रिंट करें।
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## संबंधित देखें

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
