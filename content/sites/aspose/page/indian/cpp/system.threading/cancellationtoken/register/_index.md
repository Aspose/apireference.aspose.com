---
title: "System::Threading::CancellationToken::Register विधि"
linktitle: "Register"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::CancellationToken::Register विधि। C++ में रद्दीकरण का अनुरोध होने पर एक कॉलबैक पंजीकृत करता है जो बुलाया जाएगा।"
type: docs
weight: 400
url: /hi/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


एक कॉलबैक पंजीकृत करता है जिसे रद्दीकरण के अनुरोध पर बुलाया जाएगा।

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| callback | const Action<>\& | रद्दीकरण का अनुरोध होने पर निष्पादित करने के लिए [Action<>](../../../system/action/)। |

### ReturnValue

एक [CancellationTokenRegistration](../../cancellationtokenregistration/) वस्तु जिसे कॉलबैक को डीरजिस्टर्ड करने के लिए उपयोग किया जा सकता है।
## टिप्पणियाँ



यदि रद्दीकरण का अनुरोध पहले ही किया जा चुका है, तो कॉलबैक तुरंत बुलाया जाएगा।

## संबंधित देखें

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
