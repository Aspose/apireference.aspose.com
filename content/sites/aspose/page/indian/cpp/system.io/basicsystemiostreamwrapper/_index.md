---
title: "System::IO::BasicSystemIOStreamWrapper क्लास"
linktitle: "BasicSystemIOStreamWrapper"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BasicSystemIOStreamWrapper क्लास। एक std::iostream-समतुल्य रैपर का प्रतिनिधित्व करता है जो C++ में आंतरिक बफ़र के रूप में BasicSystemIOStreamBuf का उपयोग करता है।"
type: docs
weight: 500
url: /hi/cpp/system.io/basicsystemiostreamwrapper/
---
## BasicSystemIOStreamWrapper class


एक std::iostream-समतुल्य रैपर का प्रतिनिधित्व करता है जो आंतरिक बफ़र के रूप में [BasicSystemIOStreamBuf](../basicsystemiostreambuf/) का उपयोग करता है।

```cpp
template<typename Elem,typename Traits>class BasicSystemIOStreamWrapper : public std::basic_iostream<Elem, std::char_traits<Elem>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AssignRV](./assignrv/)(BasicSystemIOStreamWrapper\&&) | पॉइंटर रीसेट करने और [swap()](./swap/) को कॉल करने के लिए मूव कंस्ट्रक्टर और मूव असाइनमेंट ऑपरेटर में उपयोग किया जाता है। |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(SharedPtr\<Stream\>, SystemIOStreamWrappingMode) | [BasicSystemIOStreamWrapper](./) का एक नया उदाहरण बनाता है। |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(const BasicSystemIOStreamWrapper\&) | कॉपी कंस्ट्रक्टर। हटाया गया। |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/)(BasicSystemIOStreamWrapper\&&) | मूव कंस्ट्रक्टर। |
| [operator=](./operator=/)(const BasicSystemIOStreamWrapper\&) | कॉपी असाइनमेंट ऑपरेटर। हटाया गया। |
| [operator=](./operator=/)(BasicSystemIOStreamWrapper\&&) | मूव असाइनमेंट ऑपरेटर। |
| [swap](./swap/)(BasicSystemIOStreamWrapper\&) | यदि वे समान नहीं हैं, तो *this और **right** को बदलने का कॉल। |
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
