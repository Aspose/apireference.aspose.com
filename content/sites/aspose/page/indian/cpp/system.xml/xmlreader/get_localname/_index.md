---
title: "System::Xml::XmlReader::get_LocalName विधि"
linktitle: "get_LocalName"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::get_LocalName विधि। जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो C++ में वर्तमान नोड का स्थानीय नाम प्राप्त करता है।"
type: docs
weight: 1400
url: /hi/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो वर्तमान नोड का लोकल नाम प्राप्त करता है।

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

वर्तमान नोड का नाम, जिसमें प्रीफ़िक्स हटाया गया है। उदाहरण के लिए, **LocalName** तत्व **<bk:book>** के लिए **book** है। उन नोड प्रकारों के लिए जिनका नाम नहीं होता (जैसे **[Text](../../../system.text/)**, **Comment**, आदि), यह मेथड [String::Empty](../../../system/string/empty/) लौटाता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
