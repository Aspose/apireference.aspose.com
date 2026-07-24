---
title: "System::Xml::XmlReader::Create मेथड"
linktitle: "बनाएँ"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::Create मेथड। C++ में निर्दिष्ट स्ट्रीम का उपयोग करके डिफ़ॉल्ट सेटिंग्स के साथ एक नया XmlReader इंस्टेंस बनाता है।"
type: docs
weight: 7700
url: /hi/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


निर्दिष्ट स्ट्रीम का उपयोग करके डिफ़ॉल्ट सेटिंग्स के साथ एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जिसमें XML डेटा होता है। [XmlReader](../) स्ट्रीम के पहले बाइट्स को स्कैन करता है ताकि बाइट ऑर्डर मार्क या एन्कोडिंग के अन्य संकेत मिल सकें। जब एन्कोडिंग निर्धारित हो जाती है, तो एन्कोडिंग का उपयोग स्ट्रीम को पढ़ना जारी रखने के लिए किया जाता है, और प्रोसेसिंग इनपुट को (Unicode) कैरेक्टर्स की स्ट्रीम के रूप में पार्स करना जारी रखती है। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


निर्दिष्ट स्ट्रीम और सेटिंग्स के साथ एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जिसमें XML डेटा होता है। [XmlReader](../) स्ट्रीम के पहले बाइट्स को स्कैन करता है ताकि बाइट ऑर्डर मार्क या एन्कोडिंग के अन्य संकेत मिल सकें। जब एन्कोडिंग निर्धारित हो जाती है, तो एन्कोडिंग का उपयोग स्ट्रीम को पढ़ना जारी रखने के लिए किया जाता है, और प्रोसेसिंग इनपुट को (Unicode) कैरेक्टर्स की स्ट्रीम के रूप में पार्स करना जारी रखती है। |
| settings | const SharedPtr\<XmlReaderSettings\>\& | नए [XmlReader](../) इंस्टेंस की सेटिंग्स। यह मान **nullptr** हो सकता है। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


निर्दिष्ट स्ट्रीम, सेटिंग्स, और पार्सिंग के लिए कॉन्टेक्स्ट जानकारी का उपयोग करके एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जिसमें XML डेटा होता है। [XmlReader](../) स्ट्रीम के पहले बाइट्स को स्कैन करता है ताकि बाइट ऑर्डर मार्क या एन्कोडिंग के अन्य संकेत मिल सकें। जब एन्कोडिंग निर्धारित हो जाती है, तो एन्कोडिंग का उपयोग स्ट्रीम को पढ़ना जारी रखने के लिए किया जाता है, और प्रोसेसिंग इनपुट को (Unicode) कैरेक्टर्स की स्ट्रीम के रूप में पार्स करना जारी रखती है। |
| settings | SharedPtr\<XmlReaderSettings\> | नए [XmlReader](../) इंस्टेंस की सेटिंग्स। यह मान **nullptr** हो सकता है। |
| inputContext | const SharedPtr\<XmlParserContext\>\& | XML फ्रैगमेंट को पार्स करने के लिए आवश्यक कॉन्टेक्स्ट जानकारी। कॉन्टेक्स्ट जानकारी में उपयोग करने के लिए [XmlNameTable](../../xmlnametable/), एन्कोडिंग, नेमस्पेस स्कोप, वर्तमान **xml:lang** और **xml:space** स्कोप, बेस URI, और डॉक्यूमेंट टाइप डिफिनिशन शामिल हो सकते हैं। यह मान **nullptr** हो सकता है। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


निर्दिष्ट स्ट्रीम, बेस URI, और सेटिंग्स का उपयोग करके एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जिसमें XML डेटा होता है। [XmlReader](../) स्ट्रीम के पहले बाइट्स को स्कैन करता है ताकि बाइट ऑर्डर मार्क या एन्कोडिंग के अन्य संकेत मिल सकें। जब एन्कोडिंग निर्धारित हो जाती है, तो एन्कोडिंग का उपयोग स्ट्रीम को पढ़ना जारी रखने के लिए किया जाता है, और प्रोसेसिंग इनपुट को (Unicode) कैरेक्टर्स की स्ट्रीम के रूप में पार्स करना जारी रखती है। |
| settings | SharedPtr\<XmlReaderSettings\> | नए [XmlReader](../) इंस्टेंस की सेटिंग्स। यह मान **nullptr** हो सकता है। |
| baseUri | const String\& | पढ़े जा रहे एंटिटी या डॉक्यूमेंट के लिए बेस URI। यह मान **nullptr** हो सकता है। **[Security](../../../system.security/) Note** बेस URI का उपयोग XML डॉक्यूमेंट के रिलेटिव URI को हल करने के लिए किया जाता है। अविश्वसनीय स्रोत से बेस URI का उपयोग न करें। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


निर्दिष्ट टेक्स्ट रीडर का उपयोग करके एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<IO::TextReader\>\& | XML डेटा पढ़ने के लिए उपयोग किया जाने वाला टेक्स्ट रीडर। एक टेक्स्ट रीडर यूनिकोड अक्षरों की स्ट्रीम लौटाता है, इसलिए XML घोषणा में निर्दिष्ट एन्कोडिंग डेटा स्ट्रीम को डिकोड करने के लिए XML रीडर द्वारा उपयोग नहीं की जाती। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


निर्दिष्ट टेक्स्ट रीडर और सेटिंग्स का उपयोग करके एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<IO::TextReader\>\& | XML डेटा पढ़ने के लिए उपयोग किया जाने वाला टेक्स्ट रीडर। एक टेक्स्ट रीडर यूनिकोड अक्षरों की स्ट्रीम लौटाता है, इसलिए XML घोषणा में निर्दिष्ट एन्कोडिंग डेटा स्ट्रीम को डिकोड करने के लिए XML रीडर द्वारा उपयोग नहीं की जाती। |
| settings | const SharedPtr\<XmlReaderSettings\>\& | नए [XmlReader](../) के लिए सेटिंग्स। यह मान **nullptr** हो सकता है। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


निर्दिष्ट टेक्स्ट रीडर, सेटिंग्स और पार्सिंग के लिए संदर्भ जानकारी का उपयोग करके एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<IO::TextReader\>\& | XML डेटा पढ़ने के लिए उपयोग किया जाने वाला टेक्स्ट रीडर। एक टेक्स्ट रीडर यूनिकोड अक्षरों की स्ट्रीम लौटाता है, इसलिए XML घोषणा में निर्दिष्ट एन्कोडिंग डेटा स्ट्रीम को डिकोड करने के लिए XML रीडर द्वारा उपयोग नहीं की जाती। |
| settings | SharedPtr\<XmlReaderSettings\> | नए [XmlReader](../) इंस्टेंस की सेटिंग्स। यह मान **nullptr** हो सकता है। |
| inputContext | const SharedPtr\<XmlParserContext\>\& | XML फ्रैगमेंट को पार्स करने के लिए आवश्यक कॉन्टेक्स्ट जानकारी। कॉन्टेक्स्ट जानकारी में उपयोग करने के लिए [XmlNameTable](../../xmlnametable/), एन्कोडिंग, नेमस्पेस स्कोप, वर्तमान **xml:lang** और **xml:space** स्कोप, बेस URI, और डॉक्यूमेंट टाइप डिफिनिशन शामिल हो सकते हैं। यह मान **nullptr** हो सकता है। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


निर्दिष्ट टेक्स्ट रीडर, सेटिंग्स और बेस URI का उपयोग करके एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | XML डेटा पढ़ने के लिए उपयोग किया जाने वाला टेक्स्ट रीडर। एक टेक्स्ट रीडर यूनिकोड अक्षरों की स्ट्रीम लौटाता है, इसलिए XML घोषणा में निर्दिष्ट एन्कोडिंग डेटा स्ट्रीम को डिकोड करने के लिए [XmlReader](../) द्वारा उपयोग नहीं की जाती। |
| settings | SharedPtr\<XmlReaderSettings\> | नए [XmlReader](../) इंस्टेंस की सेटिंग्स। यह मान **nullptr** हो सकता है। |
| baseUri | const String\& | पढ़े जा रहे एंटिटी या डॉक्यूमेंट के लिए बेस URI। यह मान **nullptr** हो सकता है। **[Security](../../../system.security/) Note** बेस URI का उपयोग XML डॉक्यूमेंट के रिलेटिव URI को हल करने के लिए किया जाता है। अविश्वसनीय स्रोत से बेस URI का उपयोग न करें। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


निर्दिष्ट XML रीडर और सेटिंग्स का उपयोग करके एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| रीडर | const SharedPtr\<XmlReader\>\& | वह ऑब्जेक्ट जिसे आप आधारभूत XML रीडर के रूप में उपयोग करना चाहते हैं। |
| settings | SharedPtr\<XmlReaderSettings\> | नए [XmlReader](../) इंस्टेंस के लिए सेटिंग्स। [XmlReaderSettings](../../xmlreadersettings/) ऑब्जेक्ट का कन्फॉर्मेंस लेवल या तो आधारभूत रीडर के कन्फॉर्मेंस लेवल से मेल खाना चाहिए, या इसे [ConformanceLevel::Auto](../../conformancelevel/) पर सेट किया जाना चाहिए। |

### ReturnValue

एक ऑब्जेक्ट जो निर्दिष्ट [XmlReader](../) ऑब्जेक्ट के चारों ओर लपेटा गया है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&) method


निर्दिष्ट URI के साथ एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputUri | const String\& | XML डेटा वाली फ़ाइल के लिए URI। पथ को एक मानक डेटा प्रतिनिधित्व में बदलने के लिए [XmlUrlResolver](../../xmlurlresolver/) क्लास का उपयोग किया जाता है। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


निर्दिष्ट URI और सेटिंग्स का उपयोग करके एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputUri | const String\& | XML डेटा वाली फ़ाइल के लिए URI। [XmlReaderSettings](../../xmlreadersettings/) ऑब्जेक्ट पर [XmlResolver](../../xmlresolver/) ऑब्जेक्ट पथ को एक मानक डेटा प्रतिनिधित्व में बदलने के लिए उपयोग किया जाता है। यदि XmlReaderSettings::get_XmlResolver मान **nullptr** है, तो एक नया [XmlUrlResolver](../../xmlurlresolver/) ऑब्जेक्ट उपयोग किया जाता है। |
| settings | const SharedPtr\<XmlReaderSettings\>\& | नए [XmlReader](../) इंस्टेंस की सेटिंग्स। यह मान **nullptr** हो सकता है। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


निर्दिष्ट URI, सेटिंग्स और पार्सिंग के लिए संदर्भ जानकारी का उपयोग करके एक नया [XmlReader](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputUri | const String\& | XML डेटा वाली फ़ाइल के लिए URI। [XmlReaderSettings](../../xmlreadersettings/) ऑब्जेक्ट पर [XmlResolver](../../xmlresolver/) ऑब्जेक्ट पथ को एक मानक डेटा प्रतिनिधित्व में बदलने के लिए उपयोग किया जाता है। यदि XmlReaderSettings::get_XmlResolver मान **nullptr** है, तो एक नया [XmlUrlResolver](../../xmlurlresolver/) ऑब्जेक्ट उपयोग किया जाता है। |
| settings | SharedPtr\<XmlReaderSettings\> | नए [XmlReader](../) इंस्टेंस की सेटिंग्स। यह मान **nullptr** हो सकता है। |
| inputContext | const SharedPtr\<XmlParserContext\>\& | XML फ्रैगमेंट को पार्स करने के लिए आवश्यक कॉन्टेक्स्ट जानकारी। कॉन्टेक्स्ट जानकारी में उपयोग करने के लिए [XmlNameTable](../../xmlnametable/), एन्कोडिंग, नेमस्पेस स्कोप, वर्तमान **xml:lang** और **xml:space** स्कोप, बेस URI, और डॉक्यूमेंट टाइप डिफिनिशन शामिल हो सकते हैं। यह मान **nullptr** हो सकता है। |

### ReturnValue

एक ऑब्जेक्ट जो स्ट्रीम में XML डेटा को पढ़ने के लिए उपयोग किया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
