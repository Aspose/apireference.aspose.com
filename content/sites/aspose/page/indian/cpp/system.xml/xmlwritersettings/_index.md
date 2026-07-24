---
title: "System::Xml::XmlWriterSettings क्लास"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlWriterSettings क्लास। वह सेट फीचर्स निर्दिष्ट करता है जो C++ में XmlWriter::Create मेथड द्वारा निर्मित XmlWriter ऑब्जेक्ट पर समर्थित होते हैं।"
type: docs
weight: 4500
url: /hi/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


एक सेट फीचर्स निर्दिष्ट करता है जो [XmlWriter](../xmlwriter/) ऑब्जेक्ट पर समर्थित होते हैं, जिसे [XmlWriter::Create](../xmlwriter/create/) मेथड द्वारा बनाया गया है।

```cpp
class XmlWriterSettings : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | [XmlWriterSettings](./) इंस्टेंस की एक कॉपी बनाता है। |
| [get_CheckCharacters](./get_checkcharacters/)() | एक मान लौटाता है जो यह दर्शाता है कि क्या XML राइटर को यह जांचना चाहिए कि दस्तावेज़ में सभी अक्षर W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) के "2.2 Characters" सेक्शन के अनुरूप हैं। |
| [get_CloseOutput](./get_closeoutput/)() | एक मान लौटाता है जो यह दर्शाता है कि क्या [XmlWriter](../xmlwriter/) को [XmlWriter::Close](../xmlwriter/close/) मेथड कॉल होने पर अंतर्निहित स्ट्रीम या TextWriter भी बंद करना चाहिए। |
| [get_ConformanceLevel](./get_conformancelevel/)() | XML राइटर द्वारा XML आउटपुट की जाँच के लिए आवश्यक अनुरूपता स्तर को लौटाता है। |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | एक मान लौटाता है जो यह दर्शाता है कि क्या [XmlWriter](../xmlwriter/) URI एट्रिब्यूट्स को एस्केप नहीं करता है। |
| [get_Encoding](./get_encoding/)() | उपयोग करने के लिए टेक्स्ट एन्कोडिंग का प्रकार लौटाता है। |
| [get_Indent](./get_indent/)() | एक मान लौटाता है जो यह दर्शाता है कि क्या तत्वों को इंडेंट किया जाए। |
| [get_IndentChars](./get_indentchars/)() | इंडेंट करने पर उपयोग करने के लिए कैरेक्टर स्ट्रिंग लौटाता है। यह सेटिंग तब उपयोग होती है जब [XmlWriterSettings::set_Indent](./set_indent/) का मान **true** पर सेट किया गया हो। |
| [get_NamespaceHandling](./get_namespacehandling/)() | एक मान लौटाता है जो यह दर्शाता है कि क्या [XmlWriter](../xmlwriter/) XML सामग्री लिखते समय डुप्लिकेट नेमस्पेस डिक्लेरेशन्स को हटाए। डिफ़ॉल्ट व्यवहार यह है कि राइटर सभी नेमस्पेस डिक्लेरेशन्स को आउटपुट करे जो राइटर के नेमस्पेस रिजॉल्वर में मौजूद हैं। |
| [get_NewLineChars](./get_newlinechars/)() | लाइन ब्रेक के लिए उपयोग करने वाली कैरेक्टर स्ट्रिंग लौटाता है। |
| [get_NewLineHandling](./get_newlinehandling/)() | एक मान लौटाता है जो यह दर्शाता है कि क्या आउटपुट में लाइन ब्रेक को सामान्यीकृत किया जाए। |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | एक मान लौटाता है जो यह दर्शाता है कि क्या एट्रिब्यूट्स को नई लाइन पर लिखा जाए। |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | एक मान लौटाता है जो यह दर्शाता है कि क्या XML घोषणा को छोड़ दिया जाए। |
| [get_OutputMethod](./get_outputmethod/)() | [XmlWriter](../xmlwriter/) आउटपुट को सीरियलाइज़ करने के लिए उपयोग की जाने वाली विधि लौटाता है। |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | एक मान लौटाता है जो यह दर्शाता है कि क्या [XmlWriter](../xmlwriter/) [XmlWriter::Close](../xmlwriter/close/) मेथड कॉल होने पर सभी अनक्लोज़्ड एलिमेंट टैग्स में क्लोज़िंग टैग्स जोड़ देगा। |
| [Reset](./reset/)() | सेटिंग्स क्लास के सदस्यों को उनके डिफ़ॉल्ट मानों पर रीसेट करता है। |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि क्या XML राइटर को यह जांचना चाहिए कि दस्तावेज़ में सभी अक्षर W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) के "2.2 Characters" सेक्शन के अनुरूप हैं। |
| [set_CloseOutput](./set_closeoutput/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि क्या [XmlWriter](../xmlwriter/) को [XmlWriter::Close](../xmlwriter/close/) मेथड कॉल होने पर अंतर्निहित स्ट्रीम या TextWriter भी बंद करना चाहिए। |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | XML राइटर द्वारा XML आउटपुट की जाँच के लिए आवश्यक अनुरूपता स्तर सेट करता है। |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि क्या [XmlWriter](../xmlwriter/) URI एट्रिब्यूट्स को एस्केप नहीं करता है। |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | उपयोग करने के लिए टेक्स्ट एन्कोडिंग का प्रकार सेट करता है। |
| [set_Indent](./set_indent/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि क्या तत्वों को इंडेंट किया जाए। |
| [set_IndentChars](./set_indentchars/)(const String\&) | इंडेंट करने के समय उपयोग की जाने वाली अक्षर स्ट्रिंग सेट करता है। यह सेटिंग तब उपयोग की जाती है जब [XmlWriterSettings::set_Indent](./set_indent/) मान **true** पर सेट किया जाता है। |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | एक मान सेट करता है जो यह दर्शाता है कि XML सामग्री लिखते समय [XmlWriter](../xmlwriter/) को डुप्लिकेट नेमस्पेस डिक्लेरेशन्स हटाने चाहिए या नहीं। डिफ़ॉल्ट व्यवहार यह है कि राइटर सभी नेमस्पेस डिक्लेरेशन्स आउटपुट करता है जो राइटर के नेमस्पेस रिजॉल्वर में मौजूद हैं। |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | लाइन ब्रेक के लिए उपयोग की जाने वाली अक्षर स्ट्रिंग सेट करता है। |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | आउटपुट में लाइन ब्रेक को सामान्यीकृत करने के लिए एक मान सेट करता है। |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | एट्रिब्यूट्स को नई पंक्ति में लिखने के लिए एक मान सेट करता है। |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | XML घोषणा को छोड़ने के लिए एक मान सेट करता है। |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि जब [XmlWriter::Close](../xmlwriter/close/) मेथड को कॉल किया जाता है तो [XmlWriter](../xmlwriter/) सभी अनक्लोज़्ड एलिमेंट टैग्स में क्लोज़िंग टैग्स जोड़ देगा या नहीं। |
| [XmlWriterSettings](./xmlwritersettings/)() | [XmlWriterSettings](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
