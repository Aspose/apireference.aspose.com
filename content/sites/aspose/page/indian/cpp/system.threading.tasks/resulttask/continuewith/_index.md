---
title: "System::Threading::Tasks::ResultTask::ContinueWith मेथड"
linktitle: "ContinueWith"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::ResultTask::ContinueWith मेथड। एक निरंतरता बनाता है जो परिणाम कार्य के पूरा होने पर C++ में निष्पादित होती है।"
type: docs
weight: 300
url: /hi/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


एक continuation बनाता है जो परिणाम टास्क के पूर्ण होने पर निष्पादित होता है।

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) जब यह कार्य पूरा हो जाए तो निष्पादित करने के लिए, इस परिणाम कार्य को प्राप्त करते हुए |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## टिप्पणियाँ



निरंतरता क्रिया इस [ResultTask](../) को प्राप्त करती है ताकि परिणाम मान तक पहुँच सके

## संबंधित देखें

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
