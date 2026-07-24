---
title: "System::Xml::Xsl::XsltContext::ResolveFunction विधि"
linktitle: "ResolveFunction"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XsltContext::ResolveFunction विधि। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, यह एक फ़ंक्शन संदर्भ को हल करता है और फ़ंक्शन को दर्शाता हुआ IXsltContextFunction लौटाता है। IXsltContextFunction का उपयोग निष्पादन समय पर फ़ंक्शन के रिटर्न वैल्यू को प्राप्त करने के लिए C++ में किया जाता है।"
type: docs
weight: 400
url: /hi/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, यह एक फ़ंक्शन संदर्भ को हल करता है और फ़ंक्शन को दर्शाता हुआ एक [IXsltContextFunction](../../ixsltcontextfunction/) लौटाता है। [IXsltContextFunction](../../ixsltcontextfunction/) का उपयोग निष्पादन समय पर फ़ंक्शन के रिटर्न वैल्यू को प्राप्त करने के लिए किया जाता है।

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| prefix | String | [XPath](../../../system.xml.xpath/) अभिव्यक्ति में जैसा दिखता है, फ़ंक्शन का उपसर्ग। |
| नाम | String | फ़ंक्शन का नाम। |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | हल किए जा रहे फ़ंक्शन के तर्क प्रकारों की एक एरे। यह आपको समान नाम वाले विधियों (उदाहरण के लिए, ओवरलोडेड मेथड्स) के बीच चयन करने की अनुमति देता है। |

### ReturnValue

फ़ंक्शन को दर्शाता हुआ एक [IXsltContextFunction](../../ixsltcontextfunction/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
