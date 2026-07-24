---
title: "System::Threading::Tasks::ResultValueTask क्लास"
linktitle: "ResultValueTask"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::ResultValueTask क्लास। C++ में एक प्रत्यक्ष परिणाम मान या ResultTask<T> को लपेटने वाली हाइब्रिड टास्क-सम प्रकार को दर्शाता है।"
type: docs
weight: 200
url: /hi/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


एक हाइब्रिड टास्क-सम प्रकार को दर्शाता है जो प्रत्यक्ष परिणाम मान या एक [ResultTask<T>](../resulttask/) को लपेट सकता है।

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| पैरामीटर | विवरण |
| --- | --- |
| T | कार्य द्वारा उत्पन्न परिणाम का प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AsTask](./astask/)() const | इस [ResultValueTask](./) को [ResultTask<T>](../resulttask/) के साझा पॉइंटर में परिवर्तित करता है। |
| [ConfigureAwait](./configureawait/)(bool) const | इस टास्क के लिए awaiter को कॉन्फ़िगर करता है। |
| [Equals](./equals/)(ResultValueTask) override | निर्धारित करता है कि यह इंस्टेंस दूसरे [ResultValueTask](./) इंस्टेंस के बराबर है या नहीं। |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | निर्धारित करता है कि यह इंस्टेंस किसी अन्य ऑब्जेक्ट के बराबर है या नहीं। |
| [get_IsCanceled](./get_iscanceled/)() const | एक मान प्राप्त करता है जो दर्शाता है कि टास्क रद्द होने के कारण पूरा हुआ था या नहीं। |
| [get_IsCompleted](./get_iscompleted/)() const | एक मान प्राप्त करता है जो दर्शाता है कि टास्क पूरा हुआ है या नहीं। |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | एक मान प्राप्त करता है जो दर्शाता है कि टास्क सफलतापूर्वक पूरा हुआ है या नहीं। |
| [get_IsFaulted](./get_isfaulted/)() const | एक मान प्राप्त करता है जो दर्शाता है कि टास्क अनहैंडल्ड एक्सेप्शन के कारण पूरा हुआ है या नहीं। |
| [get_Result](./get_result/)() const | पूरा किए गए कार्य का परिणाम प्राप्त करता है। |
| [GetAwaiter](./getawaiter/)() const | await अभिव्यक्तियों का समर्थन करने के लिए इस टास्क के लिए एक awaiter प्राप्त करता है। |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | [ResultValueTask](./) के लिए असमानता ऑपरेटर। |
| [operator==](./operator==/)(const ResultValueTask\&) const | [ResultValueTask](./) के लिए समानता ऑपरेटर। |
| [ResultValueTask](./resultvaluetask/)() | एक खाली, अनइनिशियलाइज़्ड [ResultValueTask](./) बनाता है। |
| [ResultValueTask](./resultvaluetask/)(const T\&) | निर्दिष्ट परिणाम के साथ एक पूर्ण [ResultValueTask](./) बनाता है। |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | एक साझा पॉइंटर से [ResultTask<T>](../resulttask/) को लेकर [ResultValueTask](./) बनाता है। |
## टिप्पणियाँ


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## संबंधित देखें

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
