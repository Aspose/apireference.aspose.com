---
title: "System::IO::BasicSystemIOStreamBuf class"
linktitle: "BasicSystemIOStreamBuf"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BasicSystemIOStreamBuf class. C++ में एक बफ़र का प्रतिनिधित्व करता है जो System::IO::Stream- जैसे स्ट्रीम को रैप करता है और उन्हें std::iostream- जैसे स्ट्रीम के आंतरिक बफ़र के रूप में उपयोग करने की अनुमति देता है।"
type: docs
weight: 400
url: /hi/cpp/system.io/basicsystemiostreambuf/
---
## BasicSystemIOStreamBuf class


[System::IO::Stream](../stream/)- जैसे स्ट्रीम को रैप करने वाला बफ़र दर्शाता है और उन्हें std::iostream- जैसे स्ट्रीम के आंतरिक बफ़र के रूप में उपयोग करने की अनुमति देता है।

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamBuf : public std::basic_streambuf<Elem, std::char_traits<Elem>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamBuf\&&) | पॉइंटर रीसेट करने और [swap()](./swap/) को कॉल करने के लिए मूव कंस्ट्रक्टर और मूव असाइनमेंट ऑपरेटर में उपयोग किया जाता है। |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)() | [BasicSystemIOStreamBuf](./) का नया इंस्टेंस बनाता है। |
| explicit [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const SharedPtr\<Stream\>\&, SystemIOStreamWrappingMode, const std::locale\&) | [BasicSystemIOStreamBuf](./) का नया इंस्टेंस बनाता है। |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(const BasicSystemIOStreamBuf\&) | कॉपी कंस्ट्रक्टर। हटाया गया। |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/)(BasicSystemIOStreamBuf\&&) | मूव कंस्ट्रक्टर। |
| [operator=](./operator=/)(const BasicSystemIOStreamBuf\&) | कॉपी असाइनमेंट ऑपरेटर। हटाया गया। |
| [operator=](./operator=/)(BasicSystemIOStreamBuf\&&) | मूव असाइनमेंट ऑपरेटर। |
| [swap](./swap/)(BasicSystemIOStreamBuf\&) | यदि वे समान नहीं हैं, तो *this और right को बदलने का कॉल। |
| [~BasicSystemIOStreamBuf](./~basicsystemiostreambuf/)() override | डिस्ट्रक्टर। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [char_type](./char_type/) |  |
| [int_type](./int_type/) |  |
| [Mysb](./mysb/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [traits_type](./traits_type/) |  |
## संबंधित देखें

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
