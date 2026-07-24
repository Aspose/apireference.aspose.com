---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem मेथड"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::ThreadPoolImpl::QueueUserWorkItem मेथड। C++ में कार्य आइटम को कतार में जोड़ता है।"
type: docs
weight: 700
url: /hi/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


वर्क आइटम को कतार में जोड़ता है।

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कॉलबैक | WaitCallback | चलाने के लिए कॉलबैक फ़ंक्शन। |
| स्थिति | const System::SharedPtr\<System::Object\>\& | कॉलबैक फ़ंक्शन का आर्ग्युमेंट। |

### ReturnValue

हमेशा true लौटाता है।

## संबंधित देखें

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
