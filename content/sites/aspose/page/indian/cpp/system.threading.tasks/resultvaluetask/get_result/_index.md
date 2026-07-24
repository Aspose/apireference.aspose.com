---
title: "System::Threading::Tasks::ResultValueTask::get_Result मेथड"
linktitle: "get_Result"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::ResultValueTask::get_Result मेथड. C++ में पूर्ण कार्य का परिणाम प्राप्त करता है।"
type: docs
weight: 900
url: /hi/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


पूरा किए गए कार्य का परिणाम प्राप्त करता है।

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T परिणाम मान।
## टिप्पणियाँ



यदि कार्य एक [ResultTask<T>](../../resulttask/) द्वारा समर्थित है, तो यह मेथड परिणाम की प्रतीक्षा करेगा और उसे कैश करेगा। बाद के कॉल्स कैश किए गए मान को बिना प्रतीक्षा किए लौटाएंगे।

## संबंधित देखें

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
