---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader constructor"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader constructor. C++ में निर्दिष्ट मानों के साथ XmlValidatingReader क्लास का एक नया इंस्टेंस प्रारंभ करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


निर्दिष्ट मानों के साथ [XmlValidatingReader](../) क्लास का एक नया इंस्टेंस प्रारंभ करता है।

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | XML फ्रैगमेंट को पार्स करने के लिए स्ट्रीम जिसमें वह शामिल है। |
| fragType | XmlNodeType | [XmlNodeType](../../xmlnodetype/) XML फ्रैगमेंट का प्रकार। यह निर्धारित करता है कि फ्रैगमेंट में क्या हो सकता है (नीचे तालिका देखें)। |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) जिसमें XML फ्रैगमेंट को पार्स किया जाएगा। इसमें उपयोग करने के लिए [XmlNameTable](../../xmlnametable/), एन्कोडिंग, नेमस्पेस स्कोप, वर्तमान **xml:lang**, और **xml:space** स्कोप शामिल हैं। |
## टिप्पणियाँ



निम्न तालिका **fragType** के वैध मानों और रीडर द्वारा विभिन्न नोड प्रकारों को कैसे पार्स किया जाता है, को सूचीबद्ध करती है। |||
|-|-|
| XmlNodeType | फ़्रैगमेंट में हो सकता है |
| Element | कोई भी वैध एलिमेंट सामग्री (उदाहरण के लिए, एलिमेंट्स, कमेंट्स, प्रोसेसिंग इंस्ट्रक्शन, CDATA, टेक्स्ट, और एंटिटी रेफ़रेंसेज़ का कोई भी संयोजन)। |
| Attribute | एट्रिब्यूट का मान (उद्धरण चिह्नों के भीतर भाग)। |
| Document | पूरे XML दस्तावेज़ की सामग्री; यह दस्तावेज़ स्तर के नियमों को लागू करता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


दिए गए [XmlReader](../../xmlreader/) से प्राप्त सामग्री को वैधता जांचने वाले [XmlValidatingReader](../) क्लास का एक नया इंस्टेंस प्रारंभ करता है।

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | वैलिडेशन के दौरान पढ़ने के लिए [XmlReader](../../xmlreader/). वर्तमान कार्यान्वयन केवल [XmlTextReader](../../xmltextreader/) का समर्थन करता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


निर्दिष्ट मानों के साथ [XmlValidatingReader](../) क्लास का एक नया इंस्टेंस प्रारंभ करता है।

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xmlFragment | const String\& | पार्स करने के लिए XML अंश वाली स्ट्रिंग। |
| fragType | XmlNodeType | [XmlNodeType](../../xmlnodetype/) XML फ्रैगमेंट का प्रकार है। यह यह भी निर्धारित करता है कि फ्रैगमेंट स्ट्रिंग में क्या हो सकता है (नीचे तालिका देखें)। |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) जिसमें XML फ्रैगमेंट को पार्स किया जाना है। इसमें उपयोग करने के लिए [NameTable](../../nametable/), एन्कोडिंग, नेमस्पेस स्कोप, वर्तमान **xml:lang**, और **xml:space** स्कोप शामिल हैं। |
## टिप्पणियाँ



निम्न तालिका **fragType** के वैध मानों और रीडर द्वारा विभिन्न नोड प्रकारों को कैसे पार्स किया जाता है, को सूचीबद्ध करती है। |||
|-|-|
| XmlNodeType | फ़्रैगमेंट में हो सकता है |
| Element | कोई भी वैध एलिमेंट सामग्री (उदाहरण के लिए, एलिमेंट्स, कमेंट्स, प्रोसेसिंग इंस्ट्रक्शन, CDATA, टेक्स्ट, और एंटिटी रेफ़रेंसेज़ का कोई भी संयोजन)। |
| Attribute | एट्रिब्यूट का मान (उद्धरण चिह्नों के भीतर भाग)। |
| Document | पूरे XML दस्तावेज़ की सामग्री; यह दस्तावेज़ स्तर के नियमों को लागू करता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
