---
title: "Aspose::Page::IMultiPageDevice::OpenPage method"
linktitle: "OpenPage"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::IMultiPageDevice::OpenPage method. C++ में प्रत्येक पृष्ठ रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है।"
type: docs
weight: 400
url: /hi/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


प्रत्येक पृष्ठ रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है।

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| width | फ़्लोट | पृष्ठ की चौड़ाई। |
| height | फ़्लोट | पृष्ठ की ऊँचाई। |

### ReturnValue

यदि खोला गया पृष्ठ चयनित पृष्ठ संख्याओं की सीमा में आता है तो true लौटाता है, अन्यथा false।

## संबंधित देखें

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


पृष्ठ रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है।

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| शीर्षक | System::String | पृष्ठ का शीर्षक। |

### ReturnValue

यदि पृष्ठ अनुरोधित सीमा में है तो true, अन्यथा false। उन डिवाइसों में उपयोग किया जाता है जो निर्दिष्ट पृष्ठ संख्याओं की सरणी को रेंडर कर सकते हैं।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
