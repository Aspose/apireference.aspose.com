---
title: "System::Xml::XmlNamedNodeMap::Item मेथड"
linktitle: "Item"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNamedNodeMap::Item मेथड। C++ में XmlNamedNodeMap में निर्दिष्ट इंडेक्स पर नोड को पुनः प्राप्त करता है।"
type: docs
weight: 800
url: /hi/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


[XmlNamedNodeMap](../) में निर्दिष्ट इंडेक्स पर नोड को पुनः प्राप्त करता है।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| index | int32_t | जिस नोड को प्राप्त करना है, उसके सूचकांक स्थिति [XmlNamedNodeMap](../) से। सूचकांक शून्य-आधारित है; इसलिए, पहले नोड का सूचकांक 0 है और अंतिम नोड का सूचकांक [XmlNamedNodeMap::get_Count](../get_count/) - 1 है। |

### ReturnValue

निर्दिष्ट सूचकांक पर स्थित [XmlNode](../../xmlnode/)। यदि **index** 0 से कम है या [XmlNamedNodeMap::get_Count](../get_count/) मान के बराबर या उससे अधिक है, तो **nullptr** लौटाया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
