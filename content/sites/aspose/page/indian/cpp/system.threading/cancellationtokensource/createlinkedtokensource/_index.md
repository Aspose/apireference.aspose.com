---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource मेथड"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource मेथड। एक लिंक्ड टोकन स्रोत बनाता है जो प्रदान किए गए किसी भी टोकन के रद्द होने पर C++ में रद्द हो जाता है।"
type: docs
weight: 600
url: /hi/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


एक लिंक्ड टोकन स्रोत बनाता है जो प्रदान किए गए किसी भी टोकन के रद्द होने पर रद्द हो जाता है।

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| token1 | const CancellationToken\& | पहला रद्दीकरण टोकन जिसे मॉनिटर किया जाना है। |
| token2 | const CancellationToken\& | दूसरा रद्दीकरण टोकन जिसे मॉनिटर किया जाना है। |

### ReturnValue

नया टोकन स्रोत जो किसी भी इनपुट टोकन के रद्द होने पर रद्द हो जाएगा।
## टिप्पणियाँ



वापसी किया गया स्रोत तुरंत रद्द हो जाएगा यदि कोई भी इनपुट टोकन पहले से रद्द हो चुका हो।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
