---
title: "System::Threading::Mutex::WaitOne मेथड"
linktitle: "WaitOne"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Mutex::WaitOne मेथड. म्यूटेक्स को लॉक करता है। आवश्यक होने पर C++ में अनिश्चितकाल तक प्रतीक्षा करता है।"
type: docs
weight: 500
url: /hi/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Mutex को लॉक करता है। यदि आवश्यक हो तो अनिश्चितकाल तक प्रतीक्षा करता है।

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

हमेशा true लौटाता है क्योंकि यह म्यूटेक्स लॉक होने तक वापस नहीं आता।

## संबंधित देखें

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


Mutex को लॉक करता है। यदि आवश्यक हो तो प्रतीक्षा करता है।

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| millisecondsTimeout | int | मिलीसेकंड में प्रतीक्षा टाइमआउट। |

### ReturnValue

यदि म्यूटेक्स लॉक हो गया तो true लौटाता है, या यदि टाइमआउट समाप्त हो गया तो false लौटाता है।

## संबंधित देखें

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Mutex को लॉक करता है। यदि आवश्यक हो तो प्रतीक्षा करता है।

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| timeout | TimeSpan | एक [System::TimeSpan](../../../system/timespan/) जो प्रतीक्षा करने के मिलीसेकंड की संख्या दर्शाता है, या एक [System::TimeSpan](../../../system/timespan/) जो -1 मिलीसेकंड को अनिश्चितकालीन प्रतीक्षा दर्शाता है। |

### ReturnValue

यदि म्यूटेक्स लॉक हो गया तो true लौटाता है, या यदि टाइमआउट समाप्त हो गया तो false लौटाता है।

## संबंधित देखें

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
