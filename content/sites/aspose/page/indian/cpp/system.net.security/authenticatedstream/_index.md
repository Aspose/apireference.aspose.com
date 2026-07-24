---
title: "System::Net::Security::AuthenticatedStream class"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Security::AuthenticatedStream क्लास। स्ट्रीम के माध्यम से क्रेडेंशियल पास करने के लिए मेथड्स शामिल हैं। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर को फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए उपयोग करें।"
type: docs
weight: 100
url: /hi/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


स्ट्रीम के माध्यम से क्रेडेंशियल पास करने के लिए मेथड्स शामिल हैं। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर को फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए उपयोग करें।

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | एक मान लौटाता है जो दर्शाता है कि प्रमाणीकरण सफलतापूर्वक पास हुआ है। |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | एक मान लौटाता है जो दर्शाता है कि इस स्ट्रीम के द्वारा भेजा गया डेटा एन्क्रिप्टेड है। |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | एक मान लौटाता है जो दर्शाता है कि सर्वर और क्लाइंट दोनों प्रमाणित हैं। |
| virtual [get_IsServer](./get_isserver/)() const | एक मान लौटाता है जो दर्शाता है कि कनेक्शन की स्थानीय पक्ष सर्वर है। |
| virtual [get_IsSigned](./get_issigned/)() const | एक मान लौटाता है जो दर्शाता है कि इस स्ट्रीम के द्वारा भेजा गया डेटा साइन किया गया है। |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | RTTI जानकारी। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](../../system.io/stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## संबंधित देखें

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
