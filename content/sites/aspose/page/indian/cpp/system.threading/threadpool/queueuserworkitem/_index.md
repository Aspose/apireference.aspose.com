---
title: "System::Threading::ThreadPool::QueueUserWorkItem मेथड"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::ThreadPool::QueueUserWorkItem मेथड। कार्य आइटम को कतार में रखता है जो C++ में बिना पैरामीटर के कॉलबैक के साथ मौजूद है।"
type: docs
weight: 600
url: /hi/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


कार्य आइटम को कतार में रखता है जिसमें बिना पैरामीटर वाला कॉलबैक मौजूद है।

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कॉलबैक | WaitCallback | जॉब के रूप में उपयोग करने के लिए कॉलबैक फ़ंक्शन। |

### ReturnValue

हमेशा true लौटाता है।

## संबंधित देखें

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


कार्य आइटम को कतार में रखता है जिसमें बिना पैरामीटर वाला कॉलबैक मौजूद है।

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कॉलबैक | WaitCallback | जॉब के रूप में उपयोग करने के लिए कॉलबैक फ़ंक्शन। |
| स्थिति | const System::SharedPtr\<System::Object\>\& | जॉब फ़ंक्शन पैरामीटर। |

### ReturnValue

हमेशा true लौटाता है।

## संबंधित देखें

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
