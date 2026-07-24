---
title: "System::Threading::Tasks::ResultValueTask::AsTask मेथड"
linktitle: "AsTask"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::ResultValueTask::AsTask मेथड. इस ResultValueTask को C++ में ResultTask<T> के एक साझा पॉइंटर में परिवर्तित करता है।"
type: docs
weight: 200
url: /hi/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


इस [ResultValueTask](../) को [ResultTask<T>](../../resulttask/) के एक साझा पॉइंटर में परिवर्तित करता है।

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## टिप्पणियाँ



यदि [ResultValueTask](../) में प्रत्यक्ष परिणाम है, तो उस परिणाम के साथ एक पूर्ण कार्य बनाता है। यदि इसमें कोई कार्य है, तो उस कार्य का एक साझा पॉइंटर लौटाता है।

## संबंधित देखें

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
