---
title: "System::Net::WebRequest::CreateHttp मेथड"
linktitle: "CreateHttp"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebRequest::CreateHttp मेथड. C++ में निर्दिष्ट URI का उपयोग करके WebRequest क्लास का नया इंस्टेंस बनाता है।"
type: docs
weight: 300
url: /hi/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


निर्दिष्ट URI का उपयोग करके [WebRequest](../) क्लास का नया इंस्टेंस बनाता है।

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| requestUriString | String | [WebRequest](../) क्लास का नया इंस्टेंस बनाने के लिए उपयोग किया जाने वाला URI। |

### ReturnValue

एक नया बनाया गया WebRequest-क्लास इंस्टेंस।
## टिप्पणियाँ



जब निर्दिष्ट URI किसी भी स्कीम से शुरू होता है, सिवाय [http://](http://) या [https://](https://) के, तो NotSupportedException फेंका जाएगा।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


निर्दिष्ट URI का उपयोग करके [WebRequest](../) क्लास का नया इंस्टेंस बनाता है।

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | [WebRequest](../) क्लास का नया इंस्टेंस बनाने के लिए उपयोग किया जाने वाला URI। |

### ReturnValue

एक नया बनाया गया WebRequest-क्लास इंस्टेंस।
## टिप्पणियाँ



जब निर्दिष्ट URI किसी भी स्कीम से शुरू होता है, सिवाय [http://](http://) या [https://](https://) के, तो NotSupportedException फेंका जाएगा।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
