---
title: "System::UriComponents enum"
linktitle: "UriComponents"
second_title: "Aspose.Page C++ के लिए"
description: "System::UriComponents enum। C++ में URI घटकों का प्रतिनिधित्व करता है।"
type: docs
weight: 8900
url: /hi/cpp/system/uricomponents/
---
## UriComponents enum


URI घटकों का प्रतिनिधित्व करता है।

```cpp
enum class UriComponents
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| स्कीम | 1 | स्कीम डेटा। |
| UserInfo | 2 | UserInfo डेटा। |
| Host | 4 | होस्ट डेटा। |
| पोर्ट | 8 | पोर्ट डेटा। |
| SchemeAndServer | n/a | स्कीम, होस्ट और पोर्ट डेटा। |
| Path | 16 | लोकलपाथ डेटा। |
| क्वेरी | 32 | क्वेरी डेटा। |
| PathAndQuery | n/a | लोकलपाथ और क्वेरी डेटा। |
| HttpRequestUrl | n/a | स्कीम, होस्ट, पोर्ट, क्वेरी और लोकलपाथ डेटा। |
| Fragment | 64 | फ़्रैगमेंट डेटा। |
| AbsoluteUri | n/a | Scheme, Host, Port, Quer, LocalPath और Fragment डेटा। |
| StrongPort | 128 | Port डेटा; यदि पोर्ट डेटा [Uri](../uri/) में मौजूद नहीं है और Scheme को डिफ़ॉल्ट पोर्ट असाइन किया गया है, तो डिफ़ॉल्ट पोर्ट लौटाया जाता है; यदि कोई डिफ़ॉल्ट पोर्ट नहीं है, तो -1 लौटाया जाता है। |
| HostAndPort | n/a | Host और Port डेटा; यदि पोर्ट डेटा [Uri](../uri/) में मौजूद नहीं है और Scheme को डिफ़ॉल्ट पोर्ट असाइन किया गया है, तो डिफ़ॉल्ट पोर्ट लौटाया जाता है। यदि कोई डिफ़ॉल्ट पोर्ट नहीं है, तो -1 लौटाया जाता है। |
| StrongAuthority | n/a | UserInfo, Host, और Port डेटा। यदि [Uri](../uri/) में कोई पोर्ट डेटा नहीं है और Scheme को डिफ़ॉल्ट पोर्ट असाइन किया गया है, तो डिफ़ॉल्ट पोर्ट लौटाया जाता है। यदि कोई डिफ़ॉल्ट पोर्ट नहीं है, तो -1 लौटाया जाता है। |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | निर्दिष्ट करता है कि डिलिमिटर को शामिल किया जाना चाहिए। |
| SerializationInfoString | n/a | पूर्ण [Uri](../uri/) संदर्भ जो [Uri](../uri/) सीरियलाइज़र के लिए आवश्यक है। इस संदर्भ में IPv6 स्कोप शामिल है। |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
