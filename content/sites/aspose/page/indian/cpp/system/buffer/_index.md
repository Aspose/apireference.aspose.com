---
title: "System::Buffer क्लास"
linktitle: "बफ़र"
second_title: "Aspose.Page C++ के लिए"
description: "System::Buffer क्लास। कच्चे बाइट एरेज़ को संभालने वाले मेथड्स शामिल हैं। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको C++ में किसी भी माध्यम से इसका इंस्टेंस कभी नहीं बनाना चाहिए।"
type: docs
weight: 1000
url: /hi/cpp/system/buffer/
---
## Buffer class


कच्ची बाइट एरेज़ को नियंत्रित करने वाले मेथड्स शामिल हैं। यह एक स्थैतिक टाइप है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको इसे किसी भी तरह से इंस्टेंस नहीं बनाना चाहिए।

```cpp
class Buffer
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | निर्दिष्ट संख्या में बाइट्स को स्रोत बफ़र से गंतव्य बफ़र में कॉपी करता है। |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है। |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है। |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है। |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है। |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है। |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है। |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है। |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | निर्दिष्ट एरे के सभी तत्वों द्वारा घेरित बाइट्स की संख्या निर्धारित करता है। |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | निर्दिष्ट एरे के सभी तत्वों द्वारा घेरित बाइट्स की संख्या निर्धारित करता है। |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | निर्दिष्ट एरे के सभी तत्वों द्वारा घेरित बाइट्स की संख्या निर्धारित करता है। |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान प्राप्त करता है। |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान प्राप्त करता है। |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान प्राप्त करता है। |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान सेट करता है। |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान सेट करता है। |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान सेट करता है। |
## टिप्पणियाँ



```cpp
#include <system/buffer.h>

using namespace System;

void Print(const SmartPtr<Array<uint8_t>> &source, int size)
{
  for (auto i = 0; i < size; i++)
  {
    std::cout << static_cast<int>(source[i]) << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // एरे बनाएं और उसे भरें।
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // एरे के आइटम प्रिंट करें।
  Print(first, SIZE);

  // पहले एरे का एक भाग शामिल करने वाला एरे बनाएं।
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // दूसरे एरे के आइटम प्रिंट करें।
  Print(second, SIZE / 2);

  // इंडेक्स 0 पर आइटम का मान सेट करें और एरे के आइटम प्रिंट करें।
  Buffer::SetByte(second, 0, 128);
  Print(second, SIZE / 2);

  return 0;
}
/*
This code example produces the following output:
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
16 18 20 22 24 26 28 30
128 18 20 22 24 26 28 30
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
