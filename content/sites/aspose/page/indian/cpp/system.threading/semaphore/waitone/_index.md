---
title: "System::Threading::Semaphore::WaitOne मेथड"
linktitle: "WaitOne"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Semaphore::WaitOne मेथड। सेमाफोर को लॉक करता है। C++ में आवश्यक होने पर असीमित प्रतीक्षा करता है।"
type: docs
weight: 500
url: /hi/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


सेमाफोर को लॉक करता है। यदि आवश्यक हो तो असीमित प्रतीक्षा करता है।

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

सेमाफोर लॉक होने तक वापस नहीं लौटता, इसलिए हमेशा true लौटाता है।

## संबंधित देखें

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Semaphore::WaitOne(int) method


सेमाफोर को लॉक करता है। यदि आवश्यक हो तो प्रतीक्षा करता है।

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| millisecondsTimeout | int | मिलीसेकंड में प्रतीक्षा टाइमआउट। |

### ReturnValue

यदि सेमाफोर लॉक हो गया तो true लौटाता है, या यदि टाइमआउट पार हो गया तो false।

## संबंधित देखें

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
