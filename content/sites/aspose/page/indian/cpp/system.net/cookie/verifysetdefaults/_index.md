---
title: "System::Net::Cookie::VerifySetDefaults विधि"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Cookie::VerifySetDefaults method. C++ में डिफ़ॉल्ट attribute''s मानों को सत्यापित करता है और सेट करता है।"
type: docs
weight: 4200
url: /hi/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


डिफ़ॉल्ट एट्रिब्यूट के मानों को सत्यापित करता है और सेट करता है।

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| वेरिएंट | CookieVariant | कुकी की विशिष्टता। |
| uri | System::SharedPtr\<Uri\> | Uri-क्लास इंस्टेंस जो आंतरिक फ़ील्ड को प्रारंभ करने के लिए उपयोग किया जाता है। |
| isLocalDomain | bool | एक मान जो दर्शाता है कि कुकी स्थानीय डोमेन में पुश की गई है या नहीं। |
| localDomain | String | एक स्थानीय डोमेन नाम। |
| setDefault | bool | एक मान जो दर्शाता है कि कुकी के गुणों को उनके डिफ़ॉल्ट मानों का उपयोग करके प्रारंभ किया जाना चाहिए या नहीं। |
| shouldThrow | bool | एक मान जो दर्शाता है कि निर्दिष्ट मान अमान्य होने पर अपवाद फेंका जाना चाहिए या नहीं। |

### ReturnValue

सभी मान वैध होने पर true, अन्यथा false।

## संबंधित देखें

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
