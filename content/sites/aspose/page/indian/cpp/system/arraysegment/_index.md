---
title: "System::ArraySegment क्लास"
linktitle: "ArraySegment"
second_title: "Aspose.Page C++ के लिए"
description: "System::ArraySegment क्लास। एक-आयामी एरे का एक खंड दर्शाता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या संदर्भ द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी System::SmartPtr क्लास का उपयोग न करें।"
type: docs
weight: 300
url: /hi/cpp/system/arraysegment/
---
## ArraySegment class


एक-आयामी एरे का एक खंड दर्शाता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या संदर्भ द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी [System::SmartPtr](../smartptr/) क्लास का उपयोग न करें।

```cpp
template<typename T>class ArraySegment : public System::Object
```


| पैरामीटर | विवरण |
| --- | --- |
| T | एरे खंड तत्वों का प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स का हैशिंग सक्षम करता है। |
## टिप्पणियाँ



```cpp
#include <system/array_segment.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<ArraySegment<String>> &segment)
{
  for (auto i = segment->get_Offset(); i < segment->get_Offset() + segment->get_Count(); i++)
  {
    std::cout << segment->get_Array()[i] << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // एरे बनाएं और उसे भरें।
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // पूरे एरे को शामिल करने वाला एरे खंड बनाएं।
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // एरे खंड आइटम्स को प्रिंट करें।
  Print(fullArray);

  // एरे खंड बनाएं।
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // एरे खंड आइटम्स को प्रिंट करें।
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
