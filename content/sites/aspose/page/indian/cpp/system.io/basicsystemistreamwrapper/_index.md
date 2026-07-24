---
title: "System::IO::BasicSystemIStreamWrapper क्लास"
linktitle: "BasicSystemIStreamWrapper"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BasicSystemIStreamWrapper क्लास। C++ में एक std::istream-समतुल्य रैपर का प्रतिनिधित्व करता है जो आंतरिक बफ़र के रूप में BasicSystemIOStreamBuf का उपयोग करता है।"
type: docs
weight: 600
url: /hi/cpp/system.io/basicsystemistreamwrapper/
---
## BasicSystemIStreamWrapper class


एक std::istream-समतुल्य रैपर का प्रतिनिधित्व करता है जो आंतरिक बफ़र के रूप में [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) का उपयोग करता है।

```cpp
template<typename Elem,typename Traits>class BasicSystemIStreamWrapper : public std::basic_istream<Elem, std::char_traits<Elem>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIStreamWrapper\&&) | पॉइंटर रीसेट करने और [swap()](./swap/) को कॉल करने के लिए मूव कंस्ट्रक्टर और मूव असाइनमेंट ऑपरेटर में उपयोग किया जाता है। |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | [BasicSystemIStreamWrapper](./) का नया इंस्टेंस बनाता है। |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(const BasicSystemIStreamWrapper\&) | कॉपी कंस्ट्रक्टर। हटाया गया। |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/)(BasicSystemIStreamWrapper\&&) | मूव कंस्ट्रक्टर। |
| [operator=](./operator=/)(const BasicSystemIStreamWrapper\&) | कॉपी असाइनमेंट ऑपरेटर। हटाया गया। |
| [operator=](./operator=/)(BasicSystemIStreamWrapper\&&) | मूव असाइनमेंट ऑपरेटर। |
| [swap](./swap/)(BasicSystemIStreamWrapper\&) | यदि वे समान नहीं हैं, तो *this और **right** को बदलने का कॉल। |
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
