---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::Task::ContinueWith method. C++ में कार्य समाप्त होने पर निष्पादित होने वाली निरंतरता बनाता है।"
type: docs
weight: 700
url: /hi/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


एक निरंतरता बनाता है जो टास्क के पूर्ण होने पर निष्पादित होती है।

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) जब यह कार्य समाप्त हो जाए तो निष्पादित करने के लिए |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## संबंधित देखें

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
