---
title: "System::Xml::XmlTextWriter क्लास"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextWriter क्लास। एक राइटर का प्रतिनिधित्व करता है जो तेज़, गैर-कैश्ड, केवल-फ़ॉरवर्ड तरीका प्रदान करता है XML डेटा वाले स्ट्रीम या फ़ाइलें उत्पन्न करने के लिए, जो W3C एक्स्टेंसिबल मार्कअप लैंग्वेज (XML) 1.0 और XML में नेमस्पेसेस की सिफ़ारिशों के अनुरूप होते हैं, C++ में।"
type: docs
weight: 4000
url: /hi/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


W3C Extensible Markup Language (XML) 1.0 और Namespaces in XML सिफ़ारिशों के अनुरूप XML डेटा वाली स्ट्रीम या फ़ाइलें उत्पन्न करने का तेज, गैर‑कैश्ड, केवल‑आगे का तरीका प्रदान करने वाला राइटर दर्शाता है।

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | इस स्ट्रीम और अंतर्निहित स्ट्रीम को बंद करता है। |
| [Flush](./flush/)() override | बफ़र में मौजूद सभी डेटा को अंतर्निहित स्ट्रीम्स में फ्लश करता है और साथ ही अंतर्निहित स्ट्रीम को भी फ्लश करता है। |
| [get_BaseStream](./get_basestream/)() | अंतर्निहित स्ट्रीम ऑब्जेक्ट लौटाता है। |
| [get_Formatting](./get_formatting/)() | निर्देश देता है कि आउटपुट कैसे स्वरूपित किया गया है। |
| [get_Indentation](./get_indentation/)() | जब [XmlTextWriter::set_Formatting](./set_formatting/) को [Formatting::Indented](../formatting/) पर सेट किया जाता है, तो पदानुक्रम में प्रत्येक स्तर के लिए लिखने वाले IndentChars की संख्या लौटाता है। |
| [get_IndentChar](./get_indentchar/)() | जब [XmlTextWriter::set_Formatting](./set_formatting/) को [Formatting::Indented](../formatting/) पर सेट किया जाता है, तो इंडेंट करने के लिए कौन सा अक्षर उपयोग करना है, यह लौटाता है। |
| [get_Namespaces](./get_namespaces/)() | एक मान लौटाता है जो दर्शाता है कि नेमस्पेस समर्थन करना है या नहीं। |
| [get_QuoteChar](./get_quotechar/)() | एट्रिब्यूट मानों को उद्धरण में रखने के लिए कौन सा अक्षर उपयोग करना है, यह लौटाता है। |
| [get_WriteState](./get_writestate/)() override | राइटर की स्थिति लौटाता है। |
| [get_XmlLang](./get_xmllang/)() override | वर्तमान **xml:lang** स्कोप लौटाता है। |
| [get_XmlSpace](./get_xmlspace/)() override | वर्तमान **xml:space** स्कोप को दर्शाने वाला एक [XmlSpace](../xmlspace/) लौटाता है। |
| [LookupPrefix](./lookupprefix/)(String) override | नेमस्पेस URI के लिए वर्तमान नेमस्पेस स्कोप में परिभाषित सबसे निकटतम प्रीफ़िक्स लौटाता है। |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | निर्देश देता है कि आउटपुट कैसे स्वरूपित किया गया है। |
| [set_Indentation](./set_indentation/)(int32_t) | जब [XmlTextWriter::set_Formatting](./set_formatting/) को [Formatting::Indented](../formatting/) पर सेट किया जाता है, तो पदानुक्रम में प्रत्येक स्तर के लिए लिखने वाले IndentChars की संख्या सेट करता है। |
| [set_IndentChar](./set_indentchar/)(char16_t) | जब [XmlTextWriter::set_Formatting](./set_formatting/) को [Formatting::Indented](../formatting/) पर सेट किया जाता है, तो इंडेंट करने के लिए कौन सा अक्षर उपयोग करना है, यह सेट करता है। |
| [set_Namespaces](./set_namespaces/)(bool) | एक मान सेट करता है जो दर्शाता है कि नेमस्पेस समर्थन करना है या नहीं। |
| [set_QuoteChar](./set_quotechar/)(char16_t) | ऐट्रिब्यूट मानों को उद्धरण में रखने के लिए उपयोग किए जाने वाले अक्षर को सेट करता है। |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | निर्दिष्ट बाइनरी बाइट्स को base64 के रूप में एन्कोड करता है और परिणामी टेक्स्ट को लिखता है। |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | निर्दिष्ट बाइनरी बाइट्स को binhex के रूप में एन्कोड करता है और परिणामी टेक्स्ट को लिखता है। |
| [WriteCData](./writecdata/)(String) override | निर्दिष्ट टेक्स्ट को शामिल करने वाला **...** ब्लॉक लिखता है। |
| [WriteCharEntity](./writecharentity/)(char16_t) override | निर्दिष्ट Unicode अक्षर मान के लिए कैरेक्टर एंटिटी के निर्माण को बाध्य करता है। |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | टेक्स्ट को एक बफ़र के अनुसार लिखता है। |
| [WriteComment](./writecomment/)(String) override | निर्दिष्ट टेक्स्ट को शामिल करने वाली टिप्पणी **** लिखता है। |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | निर्दिष्ट नाम और वैकल्पिक एट्रिब्यूट्स के साथ DOCTYPE घोषणा लिखता है। |
| [WriteEndAttribute](./writeendattribute/)() override | पिछली [XmlTextWriter::WriteStartAttribute](./writestartattribute/) कॉल को बंद करता है। |
| [WriteEndDocument](./writeenddocument/)() override | किसी भी खुले एलिमेंट या एट्रिब्यूट को बंद करता है और राइटर को फिर से स्टार्ट स्थिति में ले जाता है। |
| [WriteEndElement](./writeendelement/)() override | एक एलिमेंट को बंद करता है और संबंधित नेमस्पेस स्कोप को पॉप करता है। |
| [WriteEntityRef](./writeentityref/)(const String\&) override | एक एंटिटी रेफ़रेंस को **&name**; के रूप में लिखता है। |
| [WriteFullEndElement](./writefullendelement/)() override | एक एलिमेंट को बंद करता है और संबंधित नेमस्पेस स्कोप को पॉप करता है। |
| [WriteName](./writename/)(const String\&) override | निर्दिष्ट नाम को लिखता है, यह सुनिश्चित करते हुए कि वह [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) के अनुसार वैध नाम है। |
| [WriteNmToken](./writenmtoken/)(const String\&) override | निर्दिष्ट नाम को लिखता है, यह सुनिश्चित करते हुए कि वह [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) के अनुसार वैध **NmToken** है। |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | नाम और टेक्स्ट के बीच एक स्पेस के साथ प्रोसेसिंग इंस्ट्रक्शन लिखता है, जैसा कि **<?name text?>** है। |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | नेमस्पेस-योग्य नाम को लिखता है। यह मेथड दिए गए नेमस्पेस के लिए स्कोप में मौजूद प्रीफ़िक्स को खोजता है। |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | एक कैरेक्टर बफ़र से मैन्युअली रॉ मार्कअप लिखता है। |
| [WriteRaw](./writeraw/)(const String\&) override | एक स्ट्रिंग से मैन्युअली रॉ मार्कअप लिखता है। |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | एट्रिब्यूट की शुरुआत लिखता है। |
| [WriteStartDocument](./writestartdocument/)() override | संस्करण "1.0" के साथ XML घोषणा लिखता है। |
| [WriteStartDocument](./writestartdocument/)(bool) override | संस्करण "1.0" और स्टैंडअलोन एट्रिब्यूट के साथ XML घोषणा लिखता है। |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | निर्दिष्ट स्टार्ट टैग लिखता है और उसे दिए गए नेमस्पेस और प्रीफ़िक्स के साथ जोड़ता है। |
| [WriteString](./writestring/)(const String\&) override | दिए गए टेक्स्ट कंटेंट को लिखता है। |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | सर्जेट कैरेक्टर पेयर के लिए सर्जेट कैरेक्टर एंटिटी उत्पन्न करता है और लिखता है। |
| [WriteWhitespace](./writewhitespace/)(String) override | दिए गए सफ़ेद स्थान को लिखता है। |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | निर्दिष्ट स्ट्रीम और एन्कोडिंग का उपयोग करके [XmlTextWriter](./) क्लास की एक इंस्टेंस बनाता है। |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | निर्दिष्ट फ़ाइल का उपयोग करके [XmlTextWriter](./) क्लास की एक इंस्टेंस बनाता है। |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | निर्दिष्ट TextWriter का उपयोग करके [XmlTextWriter](./) क्लास की एक इंस्टेंस बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इसके बजाय [XmlWriter](../xmlwriter/) क्लास का उपयोग करने की सलाह दी जाती है।

इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
