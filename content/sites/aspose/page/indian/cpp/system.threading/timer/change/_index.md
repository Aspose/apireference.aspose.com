---
title: "System::Threading::Timer::Change मेथड"
linktitle: "परिवर्तन"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Timer::Change मेथड। C++ में टाइमर को पुनः शेड्यूल या रद्द करता है।"
type: docs
weight: 200
url: /hi/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


टाइमर को पुनः निर्धारित या रद्द करता है।

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) अगली कॉलबैक फ़ंक्शन के कॉल से पहले, मिलीसेकंड में; नकारात्मक मान टाइमर को रद्द कर देते हैं चाहे वह शेड्यूल किया गया हो। |
| period | int64_t | [Timeout](../../timeout/) क्रमिक कॉलबैक फ़ंक्शन कॉलों के बीच, मिलीसेकंड में; शून्य या नकारात्मक मान का अर्थ है कि टाइमर केवल एक बार चलना चाहिए। |

## संबंधित देखें

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


टाइमर को पुनः निर्धारित या रद्द करता है।

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) अगली कॉलबैक फ़ंक्शन कॉल से पहले; नकारात्मक मान टाइमर को रद्द कर देते हैं चाहे वह शेड्यूल किया गया हो। |
| period | System::TimeSpan | [Timeout](../../timeout/) क्रमिक कॉलबैक फ़ंक्शन कॉलों के बीच; शून्य या नकारात्मक मान का अर्थ है कि टाइमर केवल एक बार चलना चाहिए। |

## संबंधित देखें

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
