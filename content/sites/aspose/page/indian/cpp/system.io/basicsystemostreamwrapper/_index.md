---
title: "System::IO::BasicSystemOStreamWrapper क्लास"
linktitle: "BasicSystemOStreamWrapper"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BasicSystemOStreamWrapper क्लास। यह एक std::ostream-समतुल्य रैपर का प्रतिनिधित्व करता है जो C++ में आंतरिक बफ़र के रूप में BasicSystemIOStreamBuf का उपयोग करता है।"
type: docs
weight: 700
url: /hi/cpp/system.io/basicsystemostreamwrapper/
---
## BasicSystemOStreamWrapper class


एक std::ostream-समतुल्य रैपर का प्रतिनिधित्व करता है जो आंतरिक बफ़र के रूप में [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) का उपयोग करता है।

```cpp
template<typename Elem,typename Traits>class BasicSystemOStreamWrapper : public std::basic_ostream<Elem, std::char_traits<Elem>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemOStreamWrapper\&&) | पॉइंटर रीसेट करने और [swap()](./swap/) को कॉल करने के लिए मूव कंस्ट्रक्टर और मूव असाइनमेंट ऑपरेटर में उपयोग किया जाता है। |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | [BasicSystemOStreamWrapper](./) का नया इंस्टेंस बनाता है। |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(const BasicSystemOStreamWrapper\&) | कॉपी कंस्ट्रक्टर। हटाया गया। |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/)(BasicSystemOStreamWrapper\&&) | मूव कंस्ट्रक्टर। |
| [operator=](./operator=/)(const BasicSystemOStreamWrapper\&) | कॉपी असाइनमेंट ऑपरेटर। हटाया गया। |
| [operator=](./operator=/)(BasicSystemOStreamWrapper\&&) | मूव असाइनमेंट ऑपरेटर। |
| [swap](./swap/)(BasicSystemOStreamWrapper\&) | यदि वे समान नहीं हैं, तो *this और **right** को बदलने का कॉल। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [char_type](./char_type/) |  |
| [Mybase](./mybase/) |  |
| [Mysb](./mysb/) |  |
| [traits_type](./traits_type/) |  |
## संबंधित देखें

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
