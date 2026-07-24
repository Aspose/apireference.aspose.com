---
title: "System::Threading::CancellationTokenSource क्लास"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::CancellationTokenSource class. C++ में रद्दीकरण सूचनाओं को ट्रिगर करने के लिए उपयोग किया जा सकने वाला एक रद्दीकरण टोकन स्रोत।"
type: docs
weight: 400
url: /hi/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


एक रद्दीकरण टोकन स्रोत जो रद्दीकरण सूचनाओं को ट्रिगर करने के लिए उपयोग किया जा सकता है।

```cpp
class CancellationTokenSource : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Cancel](./cancel/)() | रद्दीकरण के अनुरोध को संप्रेषित करता है। |
| [CancellationTokenSource](./cancellationtokensource/)() | नया [CancellationTokenSource](./) बनाता है। |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | एक लिंक्ड टोकन स्रोत बनाता है जो प्रदान किए गए किसी भी टोकन के रद्द होने पर रद्द हो जाता है। |
| [Dispose](./dispose/)() override | [CancellationTokenSource](./) द्वारा उपयोग किए गए सभी संसाधनों को रिलीज़ करता है। |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | जाँचता है कि रद्दीकरण का अनुरोध किया गया है या नहीं। |
| [get_Token](./get_token/)() const | इस स्रोत से जुड़े रद्दीकरण टोकन को प्राप्त करता है। |
## टिप्पणियाँ


ऑपरेशनों के सहयोगी रद्दीकरण के लिए रद्दीकरण टोकन बनाने और नियंत्रित करने के तंत्र प्रदान करता है।
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
