---
title: "System::Net::CredentialCache::GetCredential मेथड"
linktitle: "GetCredential"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::CredentialCache::GetCredential मेथड. C++ में निर्दिष्ट होस्ट नाम, पोर्ट और प्रमाणीकरण प्रकार के लिए क्रेडेंशियल्स लौटाता है।"
type: docs
weight: 500
url: /hi/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


निर्दिष्ट होस्ट नाम, पोर्ट, और प्रमाणीकरण प्रकार के लिए क्रेडेंशियल लौटाता है।

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| host | String | क्रेडेंशियल्स से जुड़े होस्ट नाम। |
| पोर्ट | int32_t | पोर्ट संख्या। |
| authenticationType | String | प्रमाणीकरण प्रकार। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


निर्दिष्ट URI प्रीफ़िक्स और ऑथेंटिकेशन प्रकार के लिए क्रेडेंशियल्स लौटाता है।

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | URI प्रीफ़िक्स। |
| authenticationType | String | एक प्रमाणीकरण प्रकार। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
