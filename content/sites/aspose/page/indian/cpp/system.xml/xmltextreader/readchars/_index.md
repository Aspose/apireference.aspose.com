---
title: "System::Xml::XmlTextReader::ReadChars मेथड"
linktitle: "ReadChars"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextReader::ReadChars मेथड। एक तत्व की पाठ सामग्री को एक अक्षर बफ़र में पढ़ता है। यह मेथड बड़े एम्बेडेड टेक्स्ट स्ट्रीम को क्रमिक रूप से C++ में कॉल करके पढ़ने के लिए डिज़ाइन किया गया है।"
type: docs
weight: 4600
url: /hi/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


एक तत्व की पाठ सामग्री को कैरेक्टर बफ़र में पढ़ता है। यह विधि बड़े एम्बेडेड टेक्स्ट स्ट्रीम को क्रमिक रूप से कॉल करके पढ़ने के लिए डिज़ाइन की गई है।

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | const ArrayPtr\<char16_t\>\& | पाठ सामग्री लिखे जाने वाले बफ़र के रूप में कार्य करने वाले अक्षरों की एरे। |
| सूचकांक | int32_t | वह स्थिति **buffer** के भीतर जहाँ मेथड पाठ सामग्री लिखना शुरू कर सकता है। |
| count | int32_t | **buffer** में लिखे जाने वाले अक्षरों की संख्या। |

### ReturnValue

पढ़े गए अक्षरों की संख्या। यदि रीडर किसी तत्व पर स्थित नहीं है या वर्तमान संदर्भ में लौटाने के लिए और कोई पाठ सामग्री नहीं है तो यह 0 हो सकता है।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
