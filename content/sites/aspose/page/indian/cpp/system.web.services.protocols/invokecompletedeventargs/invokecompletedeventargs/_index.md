---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs कंस्ट्रक्टर"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs कंस्ट्रक्टर। C++ में एक नया उदाहरण बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


एक नया उदाहरण बनाता है।

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| त्रुटि | Exception | असिंक्रोनस ऑपरेशन के दौरान हुई कोई भी त्रुटि। |
| रद्द किया गया | bool | एक मान जो दर्शाता है कि असिंक्रोनस ऑपरेशन रद्द किया गया है या नहीं। |
| userState | System::SharedPtr\<Object\> | वैकल्पिक उपयोगकर्ता‑प्रदान किया गया स्टेट ऑब्जेक्ट जो [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) मेथड को पास किया जाता है। |
| परिणाम | System::ArrayPtr\<System::SharedPtr\<Object\>\> | असिंक्रोनस ऑपरेशन परिणामों का संग्रह। |

## संबंधित देखें

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
