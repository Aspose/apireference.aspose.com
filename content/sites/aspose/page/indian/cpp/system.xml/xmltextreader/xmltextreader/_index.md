---
title: "System::Xml::XmlTextReader::XmlTextReader कंस्ट्रक्टर"
linktitle: "XmlTextReader"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextReader::XmlTextReader कंस्ट्रक्टर। C++ में निर्दिष्ट स्ट्रीम के साथ XmlTextReader क्लास का नया उदाहरण प्रारंभ करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmltextreader/xmltextreader/
---
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&) constructor


निर्दिष्ट स्ट्रीम के साथ [XmlTextReader](../) क्लास का नया उदाहरण प्रारंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<IO::Stream\>\& | XML डेटा पढ़ने के लिए स्ट्रीम जिसमें डेटा शामिल है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


निर्दिष्ट स्ट्रीम और [XmlNameTable](../../xmlnametable/) के साथ [XmlTextReader](../) क्लास का नया उदाहरण प्रारंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<IO::Stream\>\& | XML डेटा पढ़ने के लिए स्ट्रीम जिसमें डेटा शामिल है। |
| nt | const SharedPtr\<XmlNameTable\>\& | उपयोग करने के लिए [XmlNameTable](../../xmlnametable/)। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


निर्दिष्ट स्ट्रीम, [XmlNodeType](../../xmlnodetype/), और [XmlParserContext](../../xmlparsercontext/) के साथ [XmlTextReader](../) क्लास का नया उदाहरण प्रारंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | XML फ्रैगमेंट को पार्स करने के लिए स्ट्रीम जिसमें वह शामिल है। |
| fragType | XmlNodeType | XML फ्रैगमेंट का [XmlNodeType](../../xmlnodetype/)। यह यह भी निर्धारित करता है कि फ्रैगमेंट में क्या हो सकता है। |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) जिसमें **xmlFragment** को पार्स किया जाना है। इसमें उपयोग करने के लिए [XmlNameTable](../../xmlnametable/), एन्कोडिंग, नेमस्पेस स्कोप, वर्तमान **xml:lang**, और **xml:space** स्कोप शामिल हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&) constructor


निर्दिष्ट TextReader के साथ [XmlTextReader](../) क्लास का नया उदाहरण प्रारंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<IO::TextReader\>\& | XML डेटा पढ़ने के लिए TextReader जिसमें डेटा शामिल है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


निर्दिष्ट TextReader और [XmlNameTable](../../xmlnametable/) के साथ [XmlTextReader](../) क्लास का नया उदाहरण प्रारंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<IO::TextReader\>\& | XML डेटा पढ़ने के लिए TextReader जिसमें डेटा शामिल है। |
| nt | const SharedPtr\<XmlNameTable\>\& | उपयोग करने के लिए [XmlNameTable](../../xmlnametable/)। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&) constructor


निर्दिष्ट फ़ाइल के साथ [XmlTextReader](../) क्लास का नया उदाहरण प्रारंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| url | const String\& | XML डेटा वाली फ़ाइल के लिए URL। [XmlTextReader::get_BaseURI](../get_baseuri/) को इस मान पर सेट किया जाता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&) constructor


निर्दिष्ट URL और स्ट्रीम के साथ [XmlTextReader](../) क्लास का नया उदाहरण प्रारंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| url | const String\& | बाहरी संसाधनों को हल करने के लिए उपयोग किया जाने वाला URL। यह मान [XmlTextReader::get_BaseURI](../get_baseuri/) को सेट किया जाता है। |
| इनपुट | const SharedPtr\<IO::Stream\>\& | XML डेटा पढ़ने के लिए स्ट्रीम जिसमें डेटा शामिल है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


निर्दिष्ट URL, स्ट्रीम और [XmlNameTable](../../xmlnametable/) के साथ [XmlTextReader](../) वर्ग का नया उदाहरण आरंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::Stream> &input, const SharedPtr<XmlNameTable> &nt)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| url | const String\& | बाहरी संसाधनों को हल करने के लिए उपयोग किया जाने वाला URL। यह मान [XmlTextReader::get_BaseURI](../get_baseuri/) को सेट किया जाता है। यदि **url** **nullptr** है, तो **BaseURI** को [String::Empty](../../../system/string/empty/) पर सेट किया जाता है। |
| इनपुट | const SharedPtr\<IO::Stream\>\& | XML डेटा पढ़ने के लिए स्ट्रीम जिसमें डेटा शामिल है। |
| nt | const SharedPtr\<XmlNameTable\>\& | उपयोग करने के लिए [XmlNameTable](../../xmlnametable/)। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&) constructor


निर्दिष्ट URL और TextReader के साथ [XmlTextReader](../) वर्ग का नया उदाहरण आरंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| url | const String\& | बाहरी संसाधनों को हल करने के लिए उपयोग किया जाने वाला URL। यह मान [XmlTextReader::get_BaseURI](../get_baseuri/) को सेट किया जाता है। |
| इनपुट | const SharedPtr\<IO::TextReader\>\& | XML डेटा पढ़ने के लिए TextReader जिसमें डेटा शामिल है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) constructor


निर्दिष्ट URL, TextReader और [XmlNameTable](../../xmlnametable/) के साथ [XmlTextReader](../) वर्ग का नया उदाहरण आरंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlNameTable> &nt)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| url | const String\& | बाहरी संसाधनों को हल करने के लिए उपयोग किया जाने वाला URL। यह मान [XmlTextReader::get_BaseURI](../get_baseuri/) को सेट किया जाता है। यदि **url** **nullptr** है, तो **BaseURI** को [String::Empty](../../../system/string/empty/) पर सेट किया जाता है। |
| इनपुट | const SharedPtr\<IO::TextReader\>\& | XML डेटा पढ़ने के लिए TextReader जिसमें डेटा शामिल है। |
| nt | const SharedPtr\<XmlNameTable\>\& | उपयोग करने के लिए [XmlNameTable](../../xmlnametable/)। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, const SharedPtr\<XmlNameTable\>\&) constructor


निर्दिष्ट फ़ाइल और [XmlNameTable](../../xmlnametable/) के साथ [XmlTextReader](../) वर्ग का नया उदाहरण आरंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &url, const SharedPtr<XmlNameTable> &nt)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| url | const String\& | XML डेटा वाली फ़ाइल को पढ़ने के लिए URL। |
| nt | const SharedPtr\<XmlNameTable\>\& | उपयोग करने के लिए [XmlNameTable](../../xmlnametable/)। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::XmlTextReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


निर्दिष्ट स्ट्रिंग, [XmlNodeType](../../xmlnodetype/) और [XmlParserContext](../../xmlparsercontext/) के साथ [XmlTextReader](../) वर्ग का नया उदाहरण आरंभ करता है।

```cpp
System::Xml::XmlTextReader::XmlTextReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xmlFragment | const String\& | पार्स करने के लिए XML अंश वाली स्ट्रिंग। |
| fragType | XmlNodeType | [XmlNodeType](../../xmlnodetype/) XML अंश का प्रकार। यह यह भी निर्धारित करता है कि अंश स्ट्रिंग में क्या हो सकता है। |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) जिसमें **xmlFragment** को पार्स किया जाना है। इसमें उपयोग करने के लिए [XmlNameTable](../../xmlnametable/), एन्कोडिंग, नेमस्पेस स्कोप, वर्तमान **xml:lang**, और **xml:space** स्कोप शामिल हैं। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
