---
title: "System::Threading::Timer::Timer कन्स्ट्रक्टर"
linktitle: "Timer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Timer::Timer कन्स्ट्रक्टर। C++ में कन्स्ट्रक्टर।"
type: docs
weight: 100
url: /hi/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


निर्माता।

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कॉलबैक | TimerCallback | टाइमर द्वारा कॉल किया जाने वाला फ़ंक्शन। |

## संबंधित देखें

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


निर्माता।

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कॉलबैक | TimerCallback | टाइमर द्वारा कॉल किया जाने वाला फ़ंक्शन। |
| स्थिति | const System::SharedPtr\<System::Object\>\& | कॉलबैक फ़ंक्शन का आर्ग्युमेंट। |
| dueTime | int64_t | [Timeout](../../timeout/) पहली कॉलबैक फ़ंक्शन कॉल से पहले, मिलीसेकंड में; नकारात्मक मान निर्माण के बाद टाइमर को शेड्यूल नहीं करते, इसलिए इसे बाद में पुनः शेड्यूल किया जा सकता है। |
| period | int64_t | [Timeout](../../timeout/) क्रमिक कॉलबैक फ़ंक्शन कॉलों के बीच, मिलीसेकंड में; शून्य या नकारात्मक मान का अर्थ है कि टाइमर केवल एक बार चलना चाहिए। |

## संबंधित देखें

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


निर्माता।

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कॉलबैक | TimerCallback | टाइमर द्वारा कॉल किया जाने वाला फ़ंक्शन। |
| स्थिति | const System::SharedPtr\<System::Object\>\& | कॉलबैक फ़ंक्शन का आर्ग्युमेंट। |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) पहली कॉलबैक फ़ंक्शन कॉल से पहले; नकारात्मक मान निर्माण के बाद टाइमर को शेड्यूल नहीं करते, इसलिए इसे बाद में पुनः शेड्यूल किया जा सकता है। |
| period | System::TimeSpan | [Timeout](../../timeout/) क्रमिक कॉलबैक फ़ंक्शन कॉलों के बीच; शून्य या नकारात्मक मान का अर्थ है कि टाइमर केवल एक बार चलना चाहिए। |

## संबंधित देखें

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
