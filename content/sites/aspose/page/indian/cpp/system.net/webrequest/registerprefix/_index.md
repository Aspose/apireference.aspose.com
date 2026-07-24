---
title: "System::Net::WebRequest::RegisterPrefix विधि"
linktitle: "RegisterPrefix"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebRequest::RegisterPrefix विधि। निर्दिष्ट URI के लिए WebRequest उत्तराधिकारी को C++ में पंजीकृत करता है।"
type: docs
weight: 600
url: /hi/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


निर्दिष्ट URI के लिए [WebRequest](../) उत्तराधिकारी को पंजीकृत करता है।

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| उपसर्ग | String | URI या URI उपसर्ग। |
| creator | System::SharedPtr\<IWebRequestCreate\> | नए [WebRequest](../) वर्ग के उदाहरण बनाता है। |

### ReturnValue

जब [WebRequest](../) उत्तराधिकारी निर्दिष्ट URI के लिए सफलतापूर्वक पंजीकृत हो जाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
