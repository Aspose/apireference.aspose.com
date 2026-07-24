---
title: "System::IO::FileInfo::CopyTo विधि"
linktitle: "CopyTo"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::FileInfo::CopyTo विधि. वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल को निर्दिष्ट स्थान पर कॉपी करता है। यदि गंतव्य फ़ाइल पहले से मौजूद है, तो C++ में कॉपी करना विफल हो जाता है।"
type: docs
weight: 300
url: /hi/cpp/system.io/fileinfo/copyto/
---
## FileInfo::CopyTo(const String\&) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल को निर्दिष्ट स्थान पर कॉपी करता है। यदि लक्ष्य फ़ाइल पहले से मौजूद है, तो कॉपी विफल हो जाती है।

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destFileName | const String\& | गंतव्य फ़ाइल नाम |

### ReturnValue

कॉपी का प्रतिनिधित्व करने वाला एक [FileInfo](../) ऑब्जेक्ट

## संबंधित देखें

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::CopyTo(const String\&, bool) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल को निर्दिष्ट स्थान पर कॉपी करता है। एक पैरामीटर यह निर्दिष्ट करता है कि मौजूदा लक्ष्य फ़ाइल को ओवरराइट किया जाना चाहिए या नहीं।

```cpp
FileInfoPtr System::IO::FileInfo::CopyTo(const String &destFileName, bool overwrite)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destFileName | const String\& | गंतव्य फ़ाइल नाम |
| ओवरराइट | bool | सही यदि मौजूदा गंतव्य फ़ाइल को अधिलेखित किया जाना चाहिए, गलत यदि गंतव्य फ़ाइल पहले से मौजूद होने पर कॉपी विफल होनी चाहिए |

### ReturnValue

कॉपी का प्रतिनिधित्व करने वाला एक [FileInfo](../) ऑब्जेक्ट

## संबंधित देखें

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
