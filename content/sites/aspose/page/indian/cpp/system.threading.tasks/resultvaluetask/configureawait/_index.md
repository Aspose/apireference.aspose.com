---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait मेथड"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait मेथड. C++ में इस कार्य के लिए एक awaiter को कॉन्फ़िगर करता है।"
type: docs
weight: 300
url: /hi/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


इस टास्क के लिए awaiter को कॉन्फ़िगर करता है।

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| continueOnCapturedContext | bool | true मूल रूप से कैप्चर किए गए संदर्भ में निरंतरता को वापस भेजने का प्रयास करने के लिए; अन्यथा false. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> एक ऑब्जेक्ट जो इस कार्य के लिए awaiters के व्यवहार को कॉन्फ़िगर करता है।

## संबंधित देखें

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
