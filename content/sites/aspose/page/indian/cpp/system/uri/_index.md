---
title: "System::Uri class"
linktitle: "Uri"
second_title: "Aspose.Page C++ के लिए"
description: "System::Uri क्लास। यूनिफ़ाइड रिसोर्स आइडेंटिफ़ायर। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 6700
url: /hi/cpp/system/uri/
---
## Uri class


यूनिफ़ाइड रिसोर्स आइडेंटिफ़ायर। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class Uri : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | निर्दिष्ट होस्ट नाम का प्रकार निर्धारित करता है। |
| static [CheckSchemeName](./checkschemename/)(const String\&) | निर्दिष्ट स्कीम वैध है या नहीं निर्धारित करता है। |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | निर्दिष्ट तुलना नियमों का उपयोग करके निर्दिष्ट [Uri](./) ऑब्जेक्ट्स की तुलना करता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | निर्धारित करता है कि वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए URI समान हैं या नहीं। |
| static [EscapeDataString](./escapedatastring/)(const String\&) | एक स्ट्रिंग को उसके एस्केप्ड प्रतिनिधित्व में परिवर्तित करता है। |
| static [EscapeUriString](./escapeuristring/)(const String\&) | एक URI स्ट्रिंग को उसके एस्केप्ड प्रतिनिधित्व में परिवर्तित करता है। |
| static [FromHex](./fromhex/)(char16_t) | हेक्साडेसिमल अंक का दशमलव मान प्राप्त करता है। |
| [get_AbsolutePath](./get_absolutepath/)() const | URI का एब्सोल्यूट पाथ लौटाता है। |
| [get_AbsoluteUri](./get_absoluteuri/)() const | एब्सोल्यूट URI लौटाता है। |
| [get_Authority](./get_authority/)() const | सर्वर के लिए होस्ट नाम और पोर्ट नंबर लौटाता है। |
| [get_DnsSafeHost](./get_dnssafehost/)() const | एक अनएस्केप्ड होस्ट नाम लौटाता है। |
| [get_Fragment](./get_fragment/)() const | एस्केप्ड URI फ्रैगमेंट लौटाता है। |
| [get_Host](./get_host/)() const | होस्ट नाम लौटाता है। |
| [get_HostNameType](./get_hostnametype/)() const | होस्ट नाम प्रकार लौटाता है। |
| [get_IdnHost](./get_idnhost/)() const | होस्ट का अंतर्राष्ट्रीय डोमेन नाम लौटाता है। |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया URI पूर्ण है या नहीं। |
| [get_IsDefaultPort](./get_isdefaultport/)() const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया URI अपने स्कीम के लिए डिफ़ॉल्ट पोर्ट रखता है या नहीं। |
| [get_IsFile](./get_isfile/)() const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया URI फ़ाइल है या नहीं। |
| [get_IsLoopback](./get_isloopback/)() const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया URI स्थानीय होस्ट को संदर्भित करता है या नहीं। |
| [get_IsUnc](./get_isunc/)() const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया URI UNC पथ है या नहीं। |
| [get_LocalPath](./get_localpath/)() const | वर्तमान ऑब्जेक्ट के द्वारा प्रतिनिधित्व किए गए URI द्वारा संदर्भित फ़ाइल नाम का ऑपरेटिंग सिस्टम प्रतिनिधित्व लौटाता है। |
| [get_OriginalString](./get_originalstring/)() const | वर्तमान ऑब्जेक्ट के निर्माण के समय कंस्ट्रक्टर को पास किया गया URI स्ट्रिंग लौटाता है। |
| [get_PathAndQuery](./get_pathandquery/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए URI के पूर्ण पथ और क्वेरी घटकों को प्रश्न चिह्न (?) द्वारा अलग करके लौटाता है। |
| [get_Port](./get_port/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए URI का पोर्ट नंबर लौटाता है। |
| [get_Query](./get_query/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए URI में शामिल क्वेरी जानकारी लौटाता है। |
| [get_Scheme](./get_scheme/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए URI की स्कीम लौटाता है। |
| [get_Segments](./get_segments/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए URI के पथ खंडों को शामिल करने वाली स्ट्रिंग्स की एक एरे लौटाता है। |
| [get_UserEscaped](./get_userescaped/)() const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट के कंस्ट्रक्टर को पास किया गया URI स्ट्रिंग पूरी तरह से एस्केप किया गया था या नहीं। |
| [get_UserInfo](./get_userinfo/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए URI से जुड़ा उपयोगकर्ता नाम, पासवर्ड और अन्य उपयोगकर्ता जानकारी लौटाता है। |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | निर्दिष्ट एस्केपिंग का उपयोग करके वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए URI के निर्दिष्ट घटकों को लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | URI का हैश कोड प्राप्त करता है। |
| [GetLeftPart](./getleftpart/)(UriPartial) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए URI का निर्दिष्ट भाग लौटाता है। |
| static [HexEscape](./hexescape/)(char16_t) | निर्दिष्ट अक्षर का हेक्साडेसिमल समकक्ष लौटाता है। |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | एक अक्षर के निर्दिष्ट हेक्साडेसिमल प्रतिनिधित्व को अक्षर में परिवर्तित करता है। |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | निर्धारित करता है कि वर्तमान [Uri](./) ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया URI निर्दिष्ट [Uri](./) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए URI का बेस है या नहीं। |
| static [IsHexDigit](./ishexdigit/)(char16_t) | निर्धारित करता है कि निर्दिष्ट अक्षर एक वैध हेक्साडेसिमल अंक दर्शाता है या नहीं। |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | निर्धारित करता है कि निर्दिष्ट स्ट्रिंग में निर्दिष्ट स्थिति पर स्थित अक्षर हेक्साडेसिमल एन्कोडेड है या नहीं। |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | यह दर्शाता है कि इस [Uri](./) को बनाने के लिए प्रयुक्त स्ट्रिंग सही ढंग से बनी हुई थी और इसे आगे एस्केप करने की आवश्यकता नहीं है। |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | निर्धारित करता है कि निर्दिष्ट स्ट्रिंग एक सही ढंग से बनी हुई URI है या नहीं। |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | दो [Uri](./) उदाहरणों के बीच अंतर निर्धारित करता है। |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | वर्तमान और निर्दिष्ट [Uri](./) वस्तुओं द्वारा प्रतिनिधित्व किए गए URI के बीच अंतर निर्धारित करता है। |
| [ToString](./tostring/)() const override | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए URI की स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | एक [Uri](./) वस्तु बनाता है जो निर्दिष्ट URI का प्रतिनिधित्व करती है; एक तर्क URI के प्रकार को निर्दिष्ट करता है। |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | निर्दिष्ट [Uri](./) वस्तु जो बेस URI का प्रतिनिधित्व करती है और सापेक्ष URI की स्ट्रिंग प्रतिनिधित्व से, एक [Uri](./) ऑब्जेक्ट बनाता है। |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | निर्दिष्ट बेस और सापेक्ष URI से एक [Uri](./) ऑब्जेक्ट बनाता है। |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | निर्दिष्ट एस्केप की गई स्ट्रिंग को अनएस्केप करता है। |
| [Uri](./uri/)(const String\&) | एक [Uri](./) वस्तु बनाता है जो निर्दिष्ट URI का प्रतिनिधित्व करती है। |
| [Uri](./uri/)(const String\&, bool) | एक [Uri](./) वस्तु बनाता है जो निर्दिष्ट URI का प्रतिनिधित्व करती है; एक तर्क यह निर्दिष्ट करता है कि क्या URI को एस्केप किया जाना चाहिए। |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | निर्दिष्ट [Uri](./) वस्तु जो बेस URI का प्रतिनिधित्व करती है और सापेक्ष URI की स्ट्रिंग प्रतिनिधित्व से, एक [Uri](./) ऑब्जेक्ट बनाता है; एक तर्क यह निर्दिष्ट करता है कि क्या URI को एस्केप किया जाना चाहिए। |
| [Uri](./uri/)(const String\&, UriKind) | एक [Uri](./) वस्तु बनाता है जो निर्दिष्ट URI का प्रतिनिधित्व करती है; एक तर्क URI के प्रकार को निर्दिष्ट करता है। |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | निर्दिष्ट बेस और सापेक्ष URI से एक [Uri](./) ऑब्जेक्ट बनाता है। |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | निर्दिष्ट बेस और सापेक्ष URI से एक [Uri](./) ऑब्जेक्ट बनाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | संचार प्रोटोकॉल योजना को [Uri](./) के पते भाग से अलग करने वाले अक्षरों को निर्दिष्ट करता है। |
| static [UriSchemeFile](./urischemefile/) | निर्दिष्ट करता है कि [Uri](./) एक फ़ाइल की ओर संकेत करता है। |
| static [UriSchemeFtp](./urischemeftp/) | निर्दिष्ट करता है कि [Uri](./) फ़ाइल ट्रांसफ़र प्रोटोकॉल के माध्यम से पहुँचता है। |
| static [UriSchemeGopher](./urischemegopher/) | निर्दिष्ट करता है कि [Uri](./) गोफ़र प्रोटोकॉल के माध्यम से पहुँचता है। |
| static [UriSchemeHttp](./urischemehttp/) | निर्दिष्ट करता है कि [Uri](./) हाइपरटेक्स्ट ट्रांसफ़र प्रोटोकॉल के माध्यम से पहुँचता है। |
| static [UriSchemeHttps](./urischemehttps/) | निर्दिष्ट करता है कि [Uri](./) सुरक्षित हाइपरटेक्स्ट ट्रांसफ़र प्रोटोकॉल के माध्यम से पहुँचता है। |
| static [UriSchemeMailto](./urischememailto/) | निर्दिष्ट करता है कि [Uri](./) एक ईमेल पता है और सरल मेल ट्रांसपोर्ट प्रोटोकॉल के माध्यम से पहुँचता है। |
| static [UriSchemeNetPipe](./urischemenetpipe/) | निर्दिष्ट करता है कि [Uri](./) [Windows](../../system.windows/) कम्यूनिकेशन फाउंडेशन द्वारा उपयोग किए जाने वाले NetPipe योजना के माध्यम से पहुँचता है। |
| static [UriSchemeNetTcp](./urischemenettcp/) | निर्दिष्ट करता है कि [Uri](./) [Windows](../../system.windows/) कम्यूनिकेशन फाउंडेशन द्वारा उपयोग किए जाने वाले NetTcp योजना के माध्यम से पहुँचता है। |
| static [UriSchemeNews](./urischemenews/) | निर्दिष्ट करता है कि [Uri](./) एक इंटरनेट न्यूज़ ग्रुप है और नेटवर्क न्यूज़ ट्रांसपोर्ट प्रोटोकॉल के माध्यम से पहुँचता है। |
| static [UriSchemeNntp](./urischemenntp/) | निर्दिष्ट करता है कि [Uri](./) एक इंटरनेट न्यूज़ ग्रुप है और नेटवर्क न्यूज़ ट्रांसपोर्ट प्रोटोकॉल के माध्यम से पहुँचता है। |
## टिप्पणियाँ



```cpp
#include "system/smart_ptr.h"
#include "system/uri.h"
#include <iostream>

int main()
{
  const auto uri = System::MakeObject<System::Uri>(u"https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/");

std::cout <<
  "AbsolutePath: " << uri->get_AbsolutePath() << std::endl <<
  "AbsoluteUri: " << uri->get_AbsoluteUri() << std::endl <<
  "Authority: " << uri->get_Authority() << std::endl <<
  "DnsSafeHost: " << uri->get_DnsSafeHost() << std::endl <<
  "Fragment: " << uri->get_Fragment() << std::endl <<
  "Host: " << uri->get_Host() << std::endl <<
  "IdnHost: " << uri->get_IdnHost() << std::endl <<
  "LocalPath: " << uri->get_LocalPath() << std::endl <<
  "OriginalString: " << uri->get_OriginalString() << std::endl <<
  "PathAndQuery: " << uri->get_PathAndQuery() << std::endl <<
  "Port: " << uri->get_Port() << std::endl <<
  "Query: " << uri->get_Query() << std::endl <<
  "Scheme: " << uri->get_Scheme() << std::endl;

  return 0;
}
/*
This code example produces the following output:
AbsolutePath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
AbsoluteUri: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Authority: docs.codeporting.com
DnsSafeHost: docs.codeporting.com
Fragment:
Host: docs.codeporting.com
IdnHost: docs.codeporting.com
LocalPath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
OriginalString: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
PathAndQuery: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Port: 443
Query:
Scheme: https
*/
```

## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
