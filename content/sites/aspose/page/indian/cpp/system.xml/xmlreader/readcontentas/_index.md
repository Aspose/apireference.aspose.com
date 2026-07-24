---
title: "System::Xml::XmlReader::ReadContentAs मेथड"
linktitle: "ReadContentAs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadContentAs मेथड। सामग्री को C++ में निर्दिष्ट प्रकार की वस्तु के रूप में पढ़ता है।"
type: docs
weight: 3900
url: /hi/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


निर्दिष्ट प्रकार की वस्तु के रूप में सामग्री पढ़ता है।

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| returnType | const TypeInfo\& | वापस किए जाने वाले मान का प्रकार। |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | एक [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) ऑब्जेक्ट जो प्रकार रूपांतरण से संबंधित किसी भी नेमस्पेस प्रीफ़िक्स को हल करने के लिए उपयोग किया जाता है। उदाहरण के लिए, इसे [XmlQualifiedName](../../xmlqualifiedname/) ऑब्जेक्ट को **xs:string** में बदलते समय उपयोग किया जा सकता है। यह मान **nullptr** हो सकता है। |

### ReturnValue

वांछित प्रकार में परिवर्तित किया गया संयोजित पाठ सामग्री या गुण मान।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
