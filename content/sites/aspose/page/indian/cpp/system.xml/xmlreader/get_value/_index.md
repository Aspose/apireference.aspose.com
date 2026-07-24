---
title: "System::Xml::XmlReader::get_Value मेथड"
linktitle: "get_Value"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::get_Value मेथड। यदि व्युत्पन्न वर्ग में ओवरराइड किया गया हो, तो यह C++ में वर्तमान नोड का पाठ मान प्राप्त करता है।"
type: docs
weight: 2400
url: /hi/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान नोड का पाठ मान प्राप्त करता है।

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

वापसी मान नोड के [XmlReader::get_NodeType](../get_nodetype/) मान पर निर्भर करता है।
## टिप्पणियाँ



निम्न तालिका उन नोड प्रकारों को सूचीबद्ध करती है जिनके पास लौटाने के लिए मान होता है। सभी अन्य नोड प्रकार [String::Empty](../../../system/string/empty/) लौटाते हैं। |||
|-|-|
| नोड प्रकार | मान |
| Attribute | विशेषता का मान। |
| CDATA | CDATA अनुभाग की सामग्री। |
| Comment | टिप्पणी की सामग्री। |
| DocumentType | आंतरिक उपसमुच्चय। |
| ProcessingInstruction | पूरा सामग्री, लक्ष्य को छोड़कर। |
| SignificantWhitespace | मिश्रित सामग्री मॉडल में मार्कअप के बीच का श्वेत स्थान। |
| Text | टेक्स्ट नोड की सामग्री। |
| रिक्त स्थान | मार्कअप के बीच का श्वेत स्थान। |
| XmlDeclaration | घोषणा की सामग्री। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
