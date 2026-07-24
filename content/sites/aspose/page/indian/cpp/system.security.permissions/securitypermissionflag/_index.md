---
title: "System::Security::Permissions::SecurityPermissionFlag enum"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Permissions::SecurityPermissionFlag enum। C++ में सुरक्षा अनुमति के फ़्लैग।"
type: docs
weight: 300
url: /hi/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


सुरक्षा अनुमति के फ़्लैग।

```cpp
enum class SecurityPermissionFlag
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| NoFlags | 0 | कोई पहुँच नहीं। |
| असर्शन | 1 | सुनिश्चित करें कि अनुमति दी गई है। |
| UnmanagedCode | 2 | अनमैनेज्ड कोड को कॉल करें। |
| SkipVerification | 4 | कोड सत्यापन को छोड़ें। |
| निष्पादन | 8 | कोड निष्पादित करें। |
| ControlThread | 16 | थ्रेड्स पर संचालन करें। |
| ControlEvidence | 32 | CLR साक्ष्य को नियंत्रित या बदलें। |
| ControlPolicy | 64 | नीति देखें और बदलें। |
| SerializationFormatter | 128 | सीरियलाइज़ करें। |
| ControlDomainPolicy | 256 | डोमेन नीति सेट करें। |
| ControlPrincipal | 512 | प्रिंसिपल ऑब्जेक्ट को नियंत्रित करें। |
| ControlAppDomain | 1024 | एप्लिकेशन डोमेन को नियंत्रित करें। |
| RemotingConfiguration | 2048 | रिमोटिंग को कॉन्फ़िगर करें। |
| इन्फ्रास्ट्रक्चर | 4096 | CLR इन्फ्रास्ट्रक्चर में प्लग इन करें। |
| BindingRedirects | 8192 | स्पष्ट बाइंडिंग रीडायरेक्शन करें। |
| AllFlags | 16383 | अप्रतिबंधित। |

## संबंधित देखें

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
