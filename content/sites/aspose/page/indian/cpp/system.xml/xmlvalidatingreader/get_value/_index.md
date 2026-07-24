---
title: "System::Xml::XmlValidatingReader::get_Value method"
linktitle: "get_Value"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlValidatingReader::get_Value method. C++ में वर्तमान नोड का टेक्स्ट मान लौटाता है।"
type: docs
weight: 2900
url: /hi/cpp/system.xml/xmlvalidatingreader/get_value/
---
## XmlValidatingReader::get_Value method


वापस देता है वर्तमान नोड का पाठ मान।

```cpp
String System::Xml::XmlValidatingReader::get_Value() override
```


### ReturnValue

लौटा गया मान नोड के XmlValidatingReader::NodeType पर निर्भर करता है।
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
