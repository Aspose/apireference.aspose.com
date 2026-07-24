---
title: "System::Threading::Tasks::ValueTask क्लास"
linktitle: "ValueTask"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::ValueTask क्लास। C++ में असिंक्रोनस ऑपरेशन का awaitable परिणाम प्रदान करता है।"
type: docs
weight: 500
url: /hi/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


एक असिंक्रोनस ऑपरेशन का प्रतीक्षा योग्य परिणाम प्रदान करता है।

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AsTask](./astask/)() const | इस [ValueTask](./) को [Task](../task/) के एक साझा पॉइंटर में परिवर्तित करता है। |
| [ConfigureAwait](./configureawait/)(bool) const | इस टास्क के लिए awaiter को कॉन्फ़िगर करता है। |
| [Equals](./equals/)(ValueTask) override | निर्धारित करता है कि यह इंस्टेंस दूसरे [ValueTask](./) इंस्टेंस के बराबर है या नहीं। |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | निर्धारित करता है कि यह इंस्टेंस किसी अन्य ऑब्जेक्ट के बराबर है या नहीं। |
| [get_IsCanceled](./get_iscanceled/)() const | एक मान प्राप्त करता है जो दर्शाता है कि टास्क रद्द होने के कारण पूरा हुआ था या नहीं। |
| [get_IsCompleted](./get_iscompleted/)() const | एक मान प्राप्त करता है जो दर्शाता है कि टास्क पूरा हुआ है या नहीं। |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | एक मान प्राप्त करता है जो दर्शाता है कि टास्क सफलतापूर्वक पूरा हुआ है या नहीं। |
| [get_IsFaulted](./get_isfaulted/)() const | एक मान प्राप्त करता है जो दर्शाता है कि टास्क अनहैंडल्ड एक्सेप्शन के कारण पूरा हुआ है या नहीं। |
| [GetAwaiter](./getawaiter/)() const | await अभिव्यक्तियों का समर्थन करने के लिए इस टास्क के लिए एक awaiter प्राप्त करता है। |
| [operator!=](./operator!=/)(const ValueTask\&) const | [ValueTask](./) के लिए असमानता ऑपरेटर। |
| [operator==](./operator==/)(const ValueTask\&) const | [ValueTask](./) के लिए समानता ऑपरेटर। |
| [ValueTask](./valuetask/)() | एक खाली, अनइनिशियलाइज़्ड [ValueTask](./) बनाता है। |
| [ValueTask](./valuetask/)(const TaskPtr\&) | एक साझा पॉइंटर से [Task](../task/) को लेकर [ValueTask](./) बनाता है। |
## संबंधित देखें

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
