---
title: "System::Threading::Mutex क्लास"
linktitle: "Mutex"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Mutex क्लास। Mutex कार्यान्वयन। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 900
url: /hi/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Mutex](./mutex/)() | RTTI जानकारी। |
| [Mutex](./mutex/)(bool) | निर्माता। |
| [Mutex](./mutex/)(bool, const String\&) | निर्माता। |
| [ReleaseMutex](./releasemutex/)() | Mutex को रिलीज़ करता है। |
| static [Remove](./remove/)(const String\&) | सिस्टम से नामित Mutex को मिटाता है। |
| virtual [Reset](./reset/)() | Mutex की स्थिति रीसेट करता है। लागू नहीं किया गया है। |
| virtual [Set](./set/)() | Mutex को संकेतित स्थिति में सेट करता है। लागू नहीं किया गया है। |
| [WaitOne](./waitone/)() override | Mutex को लॉक करता है। यदि आवश्यक हो तो अनिश्चितकाल तक प्रतीक्षा करता है। |
| [WaitOne](./waitone/)(int) override | Mutex को लॉक करता है। यदि आवश्यक हो तो प्रतीक्षा करता है। |
| [WaitOne](./waitone/)(TimeSpan) override | Mutex को लॉक करता है। यदि आवश्यक हो तो प्रतीक्षा करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | फ़ंक्शन द्वारा लौटाया जाने वाला विशेष मान, अन्यथा एरे में सिग्नल्ड ऑब्जेक्ट का इंडेक्स लौटाता है, यदि टाइमआउट समाप्त हो जाता है और कुछ भी सिग्नल नहीं करता। |
## टिप्पणियाँ



```cpp
#include "system/threading/mutex.h"
#include "system/threading/thread.h"
#include "system/console.h"
#include "system/convert.h"
#include "system/smart_ptr.h"
#include "system/string.h"

int main()
{
  auto mutex = System::MakeObject<System::Threading::Mutex>();

  System::String str;

  const int THREADS_COUNT = 3;
  std::vector<System::SharedPtr<System::Threading::Thread>> threads;
  threads.reserve(THREADS_COUNT);

  for (auto i = 0; i < THREADS_COUNT; ++i)
  {
    threads.push_back(System::MakeObject<System::Threading::Thread>([&mutex, &str]()
    {
      mutex->WaitOne();

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" started." + System::Environment::get_NewLine();

      System::Threading::Thread::Sleep(200);

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" ended." + System::Environment::get_NewLine();

      mutex->ReleaseMutex();
    }));

    threads[i]->Start();
  }

  System::Threading::Thread::Sleep(700);

  System::Console::WriteLine(str);

  return 0;
}
/*
This code example produces the following output:
Thread 1 started.
Thread 1 ended.
Thread 2 started.
Thread 2 ended.
Thread 3 started.
Thread 3 ended.
*/
```

## संबंधित देखें

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
