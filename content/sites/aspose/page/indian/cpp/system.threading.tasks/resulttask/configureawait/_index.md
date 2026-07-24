---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait मेथड"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait मेथड। C++ में इस परिणाम कार्य पर await के व्यवहार को संदर्भ कैप्चर के संबंध में कॉन्फ़िगर करता है।"
type: docs
weight: 200
url: /hi/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


यह निर्धारित करता है कि इस परिणाम टास्क पर await कैसे संदर्भ कैप्चर के संबंध में व्यवहार करे।

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| continueOnCapturedContext | bool | कैप्चर किए गए संदर्भ पर जारी रखना है या नहीं |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## टिप्पणियाँ



यह async/await पैटर्न के लिए संदर्भ प्रवाह पर सूक्ष्म नियंत्रण सक्षम करता है

## संबंधित देखें

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
