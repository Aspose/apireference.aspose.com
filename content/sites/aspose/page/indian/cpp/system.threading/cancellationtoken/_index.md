---
title: "System::Threading::CancellationToken क्लास"
linktitle: "CancellationToken"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::CancellationToken क्लास। यह सूचित करता है कि ऑपरेशनों को रद्द किया जाना चाहिए। यह क्लास थ्रेड्स के बीच सहयोगी रद्दीकरण के लिए एक तंत्र प्रदान करती है, जिससे एक थ्रेड अन्य थ्रेड्स को सूचित कर सकता है कि C++ में कोई ऑपरेशन रद्द किया जाना चाहिए।"
type: docs
weight: 200
url: /hi/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


संचार करता है कि संचालन रद्द किए जाने चाहिए। यह वर्ग थ्रेड्स के बीच सहयोगी रद्दीकरण के लिए एक तंत्र प्रदान करता है, जिससे एक थ्रेड अन्य थ्रेड्स को सूचित कर सकता है कि कोई संचालन रद्द किया जाना चाहिए।

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |
| [get_CanBeCanceled](./get_canbecanceled/)() const | जाँचता है कि क्या यह टोकन रद्द स्थिति में हो सकता है। |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | जाँचता है कि इस टोकन के लिए रद्दीकरण का अनुरोध किया गया है या नहीं। |
| static [get_None](./get_none/)() | एक खाली [System::Threading::CancellationToken](./) मान लौटाता है। |
| [Register](./register/)(const Action<>\&) const | एक कॉलबैक पंजीकृत करता है जिसे रद्दीकरण के अनुरोध पर बुलाया जाएगा। |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | यदि रद्दीकरण का अनुरोध किया गया है तो OperationCanceledException फेंकता है। |
## टिप्पणियाँ



एक [CancellationToken](./) केवल उसके संबंधित [CancellationTokenSource](../cancellationtokensource/) के माध्यम से ही रद्द किया जा सकता है।

## संबंधित देखें

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
