---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption क्लास"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption क्लास. C++ में PageDeviceColorSpaceUsage सुविधा विकल्पों का वर्णन करता है।"
type: docs
weight: 200
url: /hi/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


वर्णन करता है [PageDeviceColorSpaceUsage](../) सुविधा विकल्पों को।

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | यदि डिवाइस निर्धारित करता है कि [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) पैरामीटर द्वारा निर्दिष्ट प्रोफ़ाइल को डिवाइस कलर स्पेस प्रोफ़ाइल के रूप में उपयोग किया जा सकता है, तो समान प्रोफ़ाइल का उपयोग करने वाले सभी तत्वों को पहले से ही डिवाइस कलर स्पेस में निर्दिष्ट माना जाता है। सभी अन्य तत्वों को उस तत्व के लिए निर्दिष्ट प्रोफ़ाइल का उपयोग **MUST** करना चाहिए। यदि प्रोफ़ाइल को डिवाइस कलर स्पेस प्रोफ़ाइल के रूप में उपयोग नहीं किया जा सकता, तो प्रोफ़ाइल का उपयोग करने वाले तत्वों को किसी भी अन्य तत्व की तरह रंग प्रबंधन **MUST** किया जाना चाहिए। |
| static [OverrideDeviceDefault](./overridedevicedefault/) | यदि [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) पैरामीटर द्वारा निर्दिष्ट प्रोफ़ाइल में चैनलों की संख्या डिवाइस के प्राइमरी की संख्या के बराबर है, तो इसे सभी तत्वों के लिए डिवाइस के आंतरिक रंग प्रबंधन के बजाय उपयोग किया जाना **SHOULD** है। इस प्रोफ़ाइल का उपयोग करने वाले तत्वों को डिवाइस कलर स्पेस में माना जाता है और आगे रंग प्रबंधन नहीं किया जाएगा। |
## संबंधित देखें

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
