---
title: "System::Xml::Xsl::XslCompiledTransform::Transform method"
linktitle: "Transform"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XslCompiledTransform::Transform मेथड। IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और C++ में परिणामों को XmlWriter में आउटपुट करता है।"
type: docs
weight: 400
url: /hi/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) जिसे आप आउटपुट करना चाहते हैं। यदि स्टाइल शीट में **xsl:output** तत्व है, तो आपको [XmlWriter](../../../system.xml/xmlwriter/) को [XmlWriterSettings](../../../system.xml/xmlwritersettings/) ऑब्जेक्ट का उपयोग करके बनाना चाहिए जो [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) मान से प्राप्त होता है। यह सुनिश्चित करता है कि [XmlWriter](../../../system.xml/xmlwriter/) के पास सही आउटपुट सेटिंग्स हों। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक स्ट्रीम में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रनटाइम तर्क प्रदान करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| परिणाम | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक TextWriter में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रन-टाइम तर्क प्रदान करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| परिणाम | const SharedPtr\<IO::TextWriter\>\& | वह TextWriter जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रन-टाइम तर्क प्रदान करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) जिसे आप आउटपुट करना चाहते हैं। यदि स्टाइल शीट में **xsl:output** तत्व है, तो आपको [XmlWriter](../../../system.xml/xmlwriter/) को [XmlWriterSettings](../../../system.xml/xmlwritersettings/) ऑब्जेक्ट का उपयोग करके बनाना चाहिए जो [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) मान से प्राप्त होता है। यह सुनिश्चित करता है कि [XmlWriter](../../../system.xml/xmlwriter/) के पास सही आउटपुट सेटिंग्स हों। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रन-टाइम तर्क प्रदान करता है और [XmlResolver](../../../system.xml/xmlresolver/) XSLT **document()** फ़ंक्शन को हल करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट वह दस्तावेज़ जिसे ट्रांसफ़ॉर्म करना है। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | तर्क सूची के रूप में [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) जिसे आप आउटपुट करना चाहते हैं। यदि स्टाइल शीट में **xsl:output** तत्व है, तो आपको [XmlWriter](../../../system.xml/xmlwriter/) को [XmlWriterSettings](../../../system.xml/xmlwritersettings/) ऑब्जेक्ट का उपयोग करके बनाना चाहिए जो [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) मान से प्राप्त होता है। यह सुनिश्चित करता है कि [XmlWriter](../../../system.xml/xmlwriter/) के पास सही आउटपुट सेटिंग्स हों। |
| documentResolver | const SharedPtr\<XmlResolver\>\& | यह [XmlResolver](../../../system.xml/xmlresolver/) XSLT **document()** फ़ंक्शन को हल करने के लिए उपयोग किया जाता है। यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


निर्दिष्ट [XmlReader](../../../system.xml/xmlreader/) वस्तु द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | इनपुट दस्तावेज़ को सम्मिलित करने वाला [XmlReader](../../../system.xml/xmlreader/)। |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) जिसे आप आउटपुट करना चाहते हैं। यदि स्टाइल शीट में **xsl:output** तत्व है, तो आपको [XmlWriter](../../../system.xml/xmlwriter/) को [XmlWriterSettings](../../../system.xml/xmlwritersettings/) ऑब्जेक्ट का उपयोग करके बनाना चाहिए जो [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) मान से प्राप्त होता है। यह सुनिश्चित करता है कि [XmlWriter](../../../system.xml/xmlwriter/) के पास सही आउटपुट सेटिंग्स हों। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


निर्दिष्ट [XmlReader](../../../system.xml/xmlreader/) वस्तु द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक स्ट्रीम में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | इनपुट दस्तावेज़ को सम्मिलित करने वाला एक [XmlReader](../../../system.xml/xmlreader/)। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| परिणाम | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


निर्दिष्ट [XmlReader](../../../system.xml/xmlreader/) वस्तु द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक TextWriter में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | इनपुट दस्तावेज़ को सम्मिलित करने वाला एक [XmlReader](../../../system.xml/xmlreader/)। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| परिणाम | const SharedPtr\<IO::TextWriter\>\& | वह TextWriter जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


निर्दिष्ट [XmlReader](../../../system.xml/xmlreader/) वस्तु द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | इनपुट दस्तावेज़ को सम्मिलित करने वाला एक [XmlReader](../../../system.xml/xmlreader/)। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) जिसे आप आउटपुट करना चाहते हैं। यदि स्टाइल शीट में **xsl:output** तत्व है, तो आपको [XmlWriter](../../../system.xml/xmlwriter/) को [XmlWriterSettings](../../../system.xml/xmlwritersettings/) ऑब्जेक्ट का उपयोग करके बनाना चाहिए जो [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) मान से प्राप्त होता है। यह सुनिश्चित करता है कि [XmlWriter](../../../system.xml/xmlwriter/) के पास सही आउटपुट सेटिंग्स हों। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


निर्दिष्ट [XmlReader](../../../system.xml/xmlreader/) वस्तु द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है और [XmlResolver](../../../system.xml/xmlresolver/) XSLT **document()** फ़ंक्शन को हल करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | इनपुट दस्तावेज़ को सम्मिलित करने वाला एक [XmlReader](../../../system.xml/xmlreader/)। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) जिसे आप आउटपुट करना चाहते हैं। यदि स्टाइल शीट में **xsl:output** तत्व है, तो आपको [XmlWriter](../../../system.xml/xmlwriter/) को [XmlWriterSettings](../../../system.xml/xmlwritersettings/) ऑब्जेक्ट का उपयोग करके बनाना चाहिए जो [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) मान से प्राप्त होता है। यह सुनिश्चित करता है कि [XmlWriter](../../../system.xml/xmlwriter/) के पास सही आउटपुट सेटिंग्स हों। |
| documentResolver | const SharedPtr\<XmlResolver\>\& | यह [XmlResolver](../../../system.xml/xmlresolver/) XSLT **document()** फ़ंक्शन को हल करने के लिए उपयोग किया जाता है। यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputUri | const String\& | इनपुट दस्तावेज़ का URI। |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) जिसे आप आउटपुट करना चाहते हैं। यदि स्टाइल शीट में **xsl:output** तत्व है, तो आपको [XmlWriter](../../../system.xml/xmlwriter/) को [XmlWriterSettings](../../../system.xml/xmlwritersettings/) ऑब्जेक्ट का उपयोग करके बनाना चाहिए जो [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) मान से प्राप्त होता है। यह सुनिश्चित करता है कि [XmlWriter](../../../system.xml/xmlwriter/) के पास सही आउटपुट सेटिंग्स हों। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को स्ट्रीम में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputUri | const String\& | इनपुट दस्तावेज़ का URI। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| परिणाम | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक TextWriter में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputUri | const String\& | इनपुट दस्तावेज़ का URI। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| परिणाम | const SharedPtr\<IO::TextWriter\>\& | वह TextWriter जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके ट्रांसफ़ॉर्म को निष्पादित करता है और परिणामों को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputUri | const String\& | इनपुट दस्तावेज़ का URI। |
| arguments | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें ट्रांसफ़ॉर्म के इनपुट के रूप में उपयोग किए जाने वाले नेमस्पेस-योग्य तर्क होते हैं। यह मान **nullptr** हो सकता है। |
| results | const SharedPtr\<XmlWriter\>\& | [XmlWriter](../../../system.xml/xmlwriter/) जिसे आप आउटपुट करना चाहते हैं। यदि स्टाइल शीट में **xsl:output** तत्व है, तो आपको [XmlWriter](../../../system.xml/xmlwriter/) को [XmlWriterSettings](../../../system.xml/xmlwritersettings/) ऑब्जेक्ट का उपयोग करके बनाना चाहिए जो [XslCompiledTransform::get_OutputSettings](../get_outputsettings/) मान से प्राप्त होता है। यह सुनिश्चित करता है कि [XmlWriter](../../../system.xml/xmlwriter/) के पास सही आउटपुट सेटिंग्स हों। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक फ़ाइल में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputUri | const String\& | इनपुट दस्तावेज़ का URI। |
| resultsFile | const String\& | आउटपुट फ़ाइल का URI। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
