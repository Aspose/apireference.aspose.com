---
title: "System::Xml::XmlWriter::Create method"
linktitle: "बनाएँ"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlWriter::Create मेथड। निर्दिष्ट स्ट्रीम का उपयोग करके C++ में एक नया XmlWriter इंस्टेंस बनाता है।"
type: docs
weight: 3700
url: /hi/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


निर्दिष्ट स्ट्रीम का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जिसमें आप लिखना चाहते हैं। [XmlWriter](../) XML 1.0 टेक्स्ट सिंटैक्स लिखता है और इसे निर्दिष्ट स्ट्रीम में जोड़ता है। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


स्ट्रीम और [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जिसमें आप लिखना चाहते हैं। [XmlWriter](../) XML 1.0 टेक्स्ट सिंटैक्स लिखता है और इसे निर्दिष्ट स्ट्रीम में जोड़ता है। |
| settings | SharedPtr\<XmlWriterSettings\> | नए [XmlWriter](../) इंस्टेंस को कॉन्फ़िगर करने के लिए उपयोग किया गया [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट। यदि यह **nullptr** है, तो डिफ़ॉल्ट सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) उपयोग किया जाता है। यदि [XmlWriter](../) को XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) मेथड के साथ उपयोग किया जा रहा है, तो आपको XslCompiledTransform::get_OutputSettings मान का उपयोग करके सही सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट प्राप्त करना चाहिए। यह सुनिश्चित करता है कि निर्मित [XmlWriter](../) ऑब्जेक्ट के पास सही आउटपुट सेटिंग्स हों। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


निर्दिष्ट TextWriter का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | वह TextWriter जिसमें आप लिखना चाहते हैं। [XmlWriter](../) XML 1.0 टेक्स्ट सिंटैक्स लिखता है और इसे निर्दिष्ट TextWriter में जोड़ता है। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


TextWriter और [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट्स का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | वह TextWriter जिसमें आप लिखना चाहते हैं। [XmlWriter](../) XML 1.0 टेक्स्ट सिंटैक्स लिखता है और इसे निर्दिष्ट TextWriter में जोड़ता है। |
| settings | SharedPtr\<XmlWriterSettings\> | नए [XmlWriter](../) इंस्टेंस को कॉन्फ़िगर करने के लिए उपयोग किया गया [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट। यदि यह **nullptr** है, तो डिफ़ॉल्ट सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) उपयोग किया जाता है। यदि [XmlWriter](../) को XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) मेथड के साथ उपयोग किया जा रहा है, तो आपको XslCompiledTransform::get_OutputSettings मान का उपयोग करके सही सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट प्राप्त करना चाहिए। यह सुनिश्चित करता है कि निर्मित [XmlWriter](../) ऑब्जेक्ट के पास सही आउटपुट सेटिंग्स हों। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


निर्दिष्ट [Text::StringBuilder](../../../system.text/stringbuilder/) का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | वह [Text::StringBuilder](../../../system.text/stringbuilder/) जिसमें लिखना है। [XmlWriter](../) द्वारा लिखा गया कंटेंट [Text::StringBuilder](../../../system.text/stringbuilder/) में जोड़ा जाता है। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


[Text::StringBuilder](../../../system.text/stringbuilder/) और [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट्स का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | वह [Text::StringBuilder](../../../system.text/stringbuilder/) जिसमें लिखना है। [XmlWriter](../) द्वारा लिखा गया कंटेंट [Text::StringBuilder](../../../system.text/stringbuilder/) में जोड़ा जाता है। |
| settings | SharedPtr\<XmlWriterSettings\> | नए [XmlWriter](../) इंस्टेंस को कॉन्फ़िगर करने के लिए उपयोग किया गया [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट। यदि यह **nullptr** है, तो डिफ़ॉल्ट सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) उपयोग किया जाता है। यदि [XmlWriter](../) को XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) मेथड के साथ उपयोग किया जा रहा है, तो आपको XslCompiledTransform::get_OutputSettings मान का उपयोग करके सही सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट प्राप्त करना चाहिए। यह सुनिश्चित करता है कि निर्मित [XmlWriter](../) ऑब्जेक्ट के पास सही आउटपुट सेटिंग्स हों। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


निर्दिष्ट [XmlWriter](../) ऑब्जेक्ट का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | वह [XmlWriter](../) ऑब्जेक्ट जिसे आप आधारभूत राइटर के रूप में उपयोग करना चाहते हैं। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट जो निर्दिष्ट [XmlWriter](../) ऑब्जेक्ट के चारों ओर लिपटा हुआ है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


निर्दिष्ट [XmlWriter](../) और [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट्स का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | वह [XmlWriter](../) ऑब्जेक्ट जिसे आप आधारभूत राइटर के रूप में उपयोग करना चाहते हैं। |
| settings | SharedPtr\<XmlWriterSettings\> | नए [XmlWriter](../) इंस्टेंस को कॉन्फ़िगर करने के लिए उपयोग किया गया [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट। यदि यह **nullptr** है, तो डिफ़ॉल्ट सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) उपयोग किया जाता है। यदि [XmlWriter](../) को XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) मेथड के साथ उपयोग किया जा रहा है, तो आपको XslCompiledTransform::get_OutputSettings मान का उपयोग करके सही सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट प्राप्त करना चाहिए। यह सुनिश्चित करता है कि निर्मित [XmlWriter](../) ऑब्जेक्ट के पास सही आउटपुट सेटिंग्स हों। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट जो निर्दिष्ट [XmlWriter](../) ऑब्जेक्ट के चारों ओर लिपटा हुआ है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&) method


निर्दिष्ट फ़ाइलनाम का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outputFileName | const String\& | वह फ़ाइल जिसमें आप लिखना चाहते हैं। [XmlWriter](../) निर्दिष्ट पथ पर एक फ़ाइल बनाता है और उसमें XML 1.0 टेक्स्ट सिंटैक्स में लिखता है। **outputFileName** को फ़ाइल सिस्टम पाथ होना चाहिए। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


फ़ाइलनाम और [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट का उपयोग करके एक नया [XmlWriter](../) इंस्टेंस बनाता है।

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outputFileName | const String\& | वह फ़ाइल जिसमें आप लिखना चाहते हैं। [XmlWriter](../) निर्दिष्ट पथ पर एक फ़ाइल बनाता है और उसमें XML 1.0 टेक्स्ट सिंटैक्स में लिखता है। **outputFileName** को फ़ाइल सिस्टम पाथ होना चाहिए। |
| settings | SharedPtr\<XmlWriterSettings\> | नए [XmlWriter](../) इंस्टेंस को कॉन्फ़िगर करने के लिए उपयोग किया गया [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट। यदि यह **nullptr** है, तो डिफ़ॉल्ट सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) उपयोग किया जाता है। यदि [XmlWriter](../) को XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) मेथड के साथ उपयोग किया जा रहा है, तो आपको XslCompiledTransform::get_OutputSettings मान का उपयोग करके सही सेटिंग्स वाला एक [XmlWriterSettings](../../xmlwritersettings/) ऑब्जेक्ट प्राप्त करना चाहिए। यह सुनिश्चित करता है कि निर्मित [XmlWriter](../) ऑब्जेक्ट के पास सही आउटपुट सेटिंग्स हों। |

### ReturnValue

एक [XmlWriter](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
