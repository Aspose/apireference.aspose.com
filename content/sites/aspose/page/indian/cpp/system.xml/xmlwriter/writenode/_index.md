---
title: "System::Xml::XmlWriter::WriteNode मेथड"
linktitle: "WriteNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlWriter::WriteNode मेथड। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह रीडर से राइटर तक सब कुछ कॉपी करता है और रीडर को अगले सिब्लिंग की शुरुआत में ले जाता है C++ में।"
type: docs
weight: 2600
url: /hi/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो रीडर से राइटर तक सब कुछ कॉपी करता है और रीडर को अगले सिब्लिंग की शुरुआत में ले जाता है।

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | पढ़ने के लिए [XmlReader](../../xmlreader/)। |
| defattr | bool | डिफ़ॉल्ट एट्रिब्यूट्स को [XmlReader](../../xmlreader/) से कॉपी करने के लिए **true**; अन्यथा **false**। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


XPathNavigator ऑब्जेक्ट से राइटर तक सब कुछ कॉपी करता है। XPathNavigator की स्थिति अपरिवर्तित रहती है।

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| navigator | SharedPtr\<XPath::XPathNavigator\> | कॉपी करने के लिए XPathNavigator। |
| defattr | bool | **true** डिफ़ॉल्ट एट्रिब्यूट्स कॉपी करने के लिए; अन्यथा, **false**। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
