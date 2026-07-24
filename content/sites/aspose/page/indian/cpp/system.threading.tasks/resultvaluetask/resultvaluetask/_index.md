---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask निर्माता"
linktitle: "ResultValueTask"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask निर्माता. एक खाली, अनइनिशियलाइज़्ड ResultValueTask को C++ में बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


एक खाली, अनइनिशियलाइज़्ड [ResultValueTask](../) बनाता है।

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## टिप्पणियाँ



कार्य पूर्ण नहीं हुआ है और इसमें कोई परिणाम नहीं है। परिणाम प्राप्त करने का प्रयास करने पर एक अपवाद फेंका जाएगा।

## संबंधित देखें

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


एक साझा पॉइंटर से [ResultTask<T>](../../resulttask/) को लेकर एक [ResultValueTask](../) बनाता है।

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कार्य | const RTaskPtr\<T\>\& | रैप करने के लिए कार्य। खाली कार्य के लिए यह null हो सकता है। |
## टिप्पणियाँ



[ResultValueTask](../) प्रदान किए गए कार्य की स्थिति और परिणाम का प्रतिनिधित्व करेगा।

## संबंधित देखें

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


निर्दिष्ट परिणाम के साथ एक पूर्ण [ResultValueTask](../) बनाता है।

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| परिणाम | const T\& | पूर्ण कार्य में लपेटने के लिए परिणाम मान। |
## टिप्पणियाँ



यह एक सफलतापूर्वक पूर्ण कार्य बनाता है जो तुरंत मान को लौटाता है।

## संबंधित देखें

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
