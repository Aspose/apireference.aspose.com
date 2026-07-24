---
title: "System::Threading::Thread क्लास"
linktitle: "Thread"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Thread क्लास। थ्रेड कार्यान्वयन। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1200
url: /hi/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Abort](./abort/)() | थ्रेड को समाप्त करता है। लागू नहीं किया गया। |
| [get_CurrentCulture](./get_currentculture/)() | थ्रेड की संस्कृति प्राप्त करता है। |
| static [get_CurrentThread](./get_currentthread/)() | वर्तमान थ्रेड का वर्णन करने वाली वस्तु प्राप्त करता है। |
| [get_CurrentUICulture](./get_currentuiculture/)() | थ्रेड द्वारा उपयोग की जाने वाली यूज़र इंटरफ़ेस संस्कृति प्राप्त करता है। |
| [get_IsAlive](./get_isalive/)() | जाँचता है कि थ्रेड जीवित है या नहीं। |
| [get_IsBackground](./get_isbackground/)() | जाँचता है कि थ्रेड बैकग्राउंड है या नहीं। |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | जाँचता है कि थ्रेड एक थ्रेड पूल द्वारा स्वामित्व में है या नहीं। |
| [get_ManagedThreadId](./get_managedthreadid/)() const | थ्रेड का पहचानकर्ता प्राप्त करता है। इसे OS से प्राप्त किया जा सकता है, लेकिन यदि OS थ्रेड पहचानकर्ता int सीमा से अधिक हो जाता है, तो थ्रेड के आईडी आपस में टकरा सकते हैं। |
| [get_Name](./get_name/)() | थ्रेड का नाम प्राप्त करता है। |
| [get_ThreadState](./get_threadstate/)() | थ्रेड की स्थिति प्राप्त करता है। |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | वर्तमान थ्रेड का पहचानकर्ता प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | थ्रेड को बाधित करता है। लागू नहीं किया गया। |
| [Join](./join/)() | प्रबंधित थ्रेड से जुड़ता है। यदि आवश्यक हो तो असीमित प्रतीक्षा करता है। |
| [Join](./join/)(int) | प्रबंधित थ्रेड से जुड़ता है। सीमित प्रतीक्षा करता है। |
| [Join](./join/)(TimeSpan) | प्रबंधित थ्रेड से जुड़ता है। सीमित प्रतीक्षा करता है। |
| static [MemoryBarrier](./memorybarrier/)() | मेमोरी एक्सेस को सिंक्रनाइज़ करता है। |
| [operator=](./operator=/)(const Thread\&) | विभिन्न थ्रेड से TLS डेटा कॉपी करता है। |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | थ्रेड की संस्कृति सेट करता है। |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | थ्रेड द्वारा उपयोग की जाने वाली यूज़र इंटरफ़ेस संस्कृति सेट करता है। |
| [set_IsBackground](./set_isbackground/)(bool) | थ्रेड को बैकग्राउंड या फ़ोरग्राउंड सेट करता है। |
| [set_Name](./set_name/)(const System::String\&) | थ्रेड का नाम सेट करता है। |
| static [Sleep](./sleep/)(int) | निर्दिष्ट टाइमआउट के लिए वर्तमान थ्रेड को रोकता है। |
| static [Sleep](./sleep/)(TimeSpan) | निर्दिष्ट टाइमआउट के लिए वर्तमान थ्रेड को रोकता है। |
| static [SpinWait](./spinwait/)(int) | विशिष्ट संख्या में लूप इटरेशन की प्रतीक्षा करता है। |
| [Start](./start/)() | नल आर्ग्यूमेंट ऑब्जेक्ट का उपयोग करके थ्रेड शुरू करता है। |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | थ्रेड शुरू करता है। |
| [Thread](./thread/)() | निर्माता। |
| [Thread](./thread/)(ThreadStart) | निर्माता। |
| [Thread](./thread/)(ParameterizedThreadStart) | निर्माता। |
| [Thread](./thread/)(Thread\&) | कॉपी कंस्ट्रक्टर। |
| static [Yield](./yield/)() | थ्रेड को यील्ड करता है। |
| virtual [~Thread](./~thread/)() | डिस्ट्रक्टर। |
## टिप्पणियाँ



```cpp
#include "system/threading/thread.h"
#include "system/smart_ptr.h"

int main()
{
  auto thread = System::MakeObject<System::Threading::Thread>([]()
  {
    std::cout << "Child thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;
    System::Threading::Thread::Sleep(200);
  });

  std::cout << "Main thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;

  thread->Start();
  thread->Join();

  return 0;
}
/*
This code example produces the following output:
Main thread ID: 2
Child thread ID: 1
*/
```

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
