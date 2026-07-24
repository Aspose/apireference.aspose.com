---
title: "System::Xml::XmlNodeReader::get_Value मेथड"
linktitle: "get_Value"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeReader::get_Value मेथड। C++ में वर्तमान नोड का पाठ मान लौटाता है।"
type: docs
weight: 2100
url: /hi/cpp/system.xml/xmlnodereader/get_value/
---
## XmlNodeReader::get_Value method


वापस देता है वर्तमान नोड का पाठ मान।

```cpp
String System::Xml::XmlNodeReader::get_Value() override
```


### ReturnValue

वापसी मान नोड के [XmlNodeReader::get_NodeType](../get_nodetype/) पर निर्भर करता है।
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
