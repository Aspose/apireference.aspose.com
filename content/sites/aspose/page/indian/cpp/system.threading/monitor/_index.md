---
title: "System::Threading::Monitor class"
linktitle: "Monitor"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Monitor class। क्लास Monitor C++ में वस्तुओं तक पहुँच को समकालिक करने की एक तंत्र प्रदान करती है।"
type: docs
weight: 800
url: /hi/cpp/system.threading/monitor/
---
## Monitor class


क्लास [Monitor](./) वस्तुओं तक पहुँच को समकालिक करने की एक तंत्र प्रदान करती है।

```cpp
class Monitor : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | निर्दिष्ट वस्तु पर एक विशिष्ट लॉक प्राप्त करता है। |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | निर्दिष्ट वस्तु पर एक विशिष्ट लॉक प्राप्त करता है, और एटॉमिक रूप से एक मान सेट करता है जो दर्शाता है कि लॉक लिया गया था या नहीं। |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | निर्दिष्ट वस्तु पर विशिष्ट लॉक को रिलीज़ करता है। |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | निर्धारित करता है कि वर्तमान थ्रेड के पास निर्दिष्ट वस्तु पर लॉक है या नहीं। |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | प्रतीक्षा कतार में थ्रेड को लॉक की गई वस्तु की स्थिति में परिवर्तन के बारे में सूचित करता है (अभी लागू नहीं)। |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | सभी प्रतीक्षा कर रहे थ्रेड को वस्तु की स्थिति में परिवर्तन के बारे में सूचित करता है (अभी लागू नहीं)। |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | निर्दिष्ट वस्तु पर एक विशिष्ट लॉक प्राप्त करने का प्रयास करता है (अभी लागू नहीं)। |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | निर्दिष्ट वस्तु पर एक विशिष्ट लॉक प्राप्त करने का प्रयास करता है, और एटॉमिक रूप से एक मान सेट करता है जो दर्शाता है कि लॉक लिया गया था या नहीं। |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | निर्दिष्ट मिलीसेकंड की संख्या के लिए, निर्दिष्ट वस्तु पर एक विशिष्ट लॉक प्राप्त करने का प्रयास करता है (अभी लागू नहीं)। |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | निर्दिष्ट समय अवधि के लिए, निर्दिष्ट वस्तु पर एक विशिष्ट लॉक प्राप्त करने का प्रयास करता है (अभी लागू नहीं)। |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | निर्दिष्ट अवधि के लिए, निर्दिष्ट वस्तु पर एक विशेष लॉक प्राप्त करने का प्रयास करता है, और एटॉमिक रूप से एक मान सेट करता है जो दर्शाता है कि लॉक लिया गया था या नहीं। |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | निर्दिष्ट अवधि के लिए, निर्दिष्ट वस्तु पर एक विशेष लॉक प्राप्त करने का प्रयास करता है, और एटॉमिक रूप से एक मान सेट करता है जो दर्शाता है कि लॉक लिया गया था या नहीं। |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | किसी वस्तु पर लॉक को रिलीज़ करता है और वर्तमान थ्रेड को तब तक ब्लॉक करता है जब तक वह लॉक को पुनः प्राप्त नहीं करता। यदि निर्दिष्ट टाइम‑आउट अंतराल समाप्त हो जाता है, तो थ्रेड तैयार कतार में प्रवेश करता है। वैकल्पिक रूप से, प्रतीक्षा से पहले सिंक्रनाइज़्ड संदर्भ के लिए सिंक्रनाइज़ेशन डोमेन से बाहर निकलता है और बाद में डोमेन को पुनः प्राप्त करता है। लागू नहीं किया गया। |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | किसी वस्तु पर लॉक को रिलीज़ करता है और वर्तमान थ्रेड को तब तक ब्लॉक करता है जब तक वह लॉक को पुनः प्राप्त नहीं करता। यदि निर्दिष्ट टाइम‑आउट अंतराल समाप्त हो जाता है, तो थ्रेड तैयार कतार में प्रवेश करता है। वैकल्पिक रूप से, प्रतीक्षा से पहले सिंक्रनाइज़्ड संदर्भ के लिए सिंक्रनाइज़ेशन डोमेन से बाहर निकलता है और बाद में डोमेन को पुनः प्राप्त करता है। लागू नहीं किया गया। |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | किसी वस्तु पर लॉक को रिलीज़ करता है और वर्तमान थ्रेड को तब तक ब्लॉक करता है जब तक वह लॉक को पुनः प्राप्त नहीं करता। यदि निर्दिष्ट टाइम‑आउट अंतराल समाप्त हो जाता है, तो थ्रेड तैयार कतार में प्रवेश करता है। लागू नहीं किया गया। |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | किसी वस्तु पर लॉक को रिलीज़ करता है और वर्तमान थ्रेड को तब तक ब्लॉक करता है जब तक वह लॉक को पुनः प्राप्त नहीं करता। यदि निर्दिष्ट टाइम‑आउट अंतराल समाप्त हो जाता है, तो थ्रेड तैयार कतार में प्रवेश करता है। लागू नहीं किया गया। |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | किसी वस्तु पर लॉक को रिलीज़ करता है और वर्तमान थ्रेड को तब तक ब्लॉक करता है जब तक वह लॉक को पुनः प्राप्त नहीं करता। लागू नहीं किया गया। |
## टिप्पणियाँ



```cpp
#include "system/threading/monitor.h"
#include "system/threading/thread.h"
#include "system/smart_ptr.h"
#include "system/string.h"
#include <iostream>
#include <vector>

int main()
{
  using namespace System::Threading;

  const auto threadsCount = 3;
  std::cout << "Threads count: " << threadsCount << std::endl;
  auto locker = System::MakeObject<System::Object>();
  int x = 0;

  std::vector<System::SharedPtr<Thread>> threads;
  threads.reserve(threadsCount);
  for (auto i = 0; i < threadsCount; ++i)
  {
    threads.emplace_back(System::MakeObject<Thread>([&x, &locker]() -> void {
      Monitor::Enter(locker);

      x = 1;
      for (auto i = 0; i < 5; ++i)
      {
        std::cout << Thread::get_CurrentThread()->get_Name() << ": " << x++ << std::endl;
        Thread::Sleep(100);
      }

      Monitor::Exit(locker);
    }));
    threads.back()->set_Name(System::String("Thread " + std::to_string(i)));
    threads.back()->Start();
  }

  Thread::Sleep(threadsCount * 100);

  for (auto& thread : threads)
  {
    thread->Join();
  }

  return 0;
}
/*
This code example produces the following output:
Threads count: 3
Thread 0: 1
Thread 0: 2
Thread 0: 3
Thread 0: 4
Thread 0: 5
Thread 1: 1
Thread 1: 2
Thread 1: 3
Thread 1: 4
Thread 1: 5
Thread 2: 1
Thread 2: 2
Thread 2: 3
Thread 2: 4
Thread 2: 5
*/
```

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
