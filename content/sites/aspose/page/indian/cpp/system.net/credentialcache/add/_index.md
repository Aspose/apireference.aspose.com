---
title: "System::Net::CredentialCache::Add मेथड"
linktitle: "Add"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::CredentialCache::Add मेथड. निर्दिष्ट नेटवर्क क्रेडेंशियल्स को C++ में कैश में जोड़ता है।"
type: docs
weight: 400
url: /hi/cpp/system.net/credentialcache/add/
---
## CredentialCache::Add(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) method


निर्दिष्ट नेटवर्क क्रेडेंशियल्स को कैश में जोड़ता है।

```cpp
void System::Net::CredentialCache::Add(String host, int32_t port, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| host | String | क्रेडेंशियल्स से जुड़े होस्ट नाम। |
| पोर्ट | int32_t | पोर्ट संख्या। |
| authenticationType | String | प्रमाणीकरण योजना। |
| credential | System::SharedPtr\<NetworkCredential\> | जोड़ने के लिए क्रेडेंशियल्स। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::Add(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) method


निर्दिष्ट नेटवर्क क्रेडेंशियल्स को कैश में जोड़ता है।

```cpp
void System::Net::CredentialCache::Add(System::SharedPtr<Uri> uriPrefix, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | संसाधन का URI प्रीफ़िक्स जिससे क्रेडेंशियल्स जुड़े होते हैं। |
| authenticationType | String | प्रमाणीकरण योजना। |
| credential | System::SharedPtr\<NetworkCredential\> | जोड़ने के लिए क्रेडेंशियल्स। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
