---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke विधि"
linktitle: "Invoke"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke विधि. C++ में दिए गए संदर्भ में दिए गए तर्कों के साथ फ़ंक्शन को कॉल करने के लिए विधि प्रदान करती है।"
type: docs
weight: 500
url: /hi/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


दिए गए संदर्भ में दिए गए आर्ग्यूमेंट्स के साथ फ़ंक्शन को कॉल करने की विधि प्रदान करता है।

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | फ़ंक्शन कॉल के लिए XSLT संदर्भ। |
| args | ArrayPtr\<SharedPtr\<Object\>\> | फ़ंक्शन कॉल के तर्क। प्रत्येक तर्क ऐरे में एक तत्व है। |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | फ़ंक्शन कॉल के लिए संदर्भ नोड। |

### ReturnValue

फ़ंक्शन के रिटर्न वैल्यू को दर्शाने वाला एक [Object](../../../system/object/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
