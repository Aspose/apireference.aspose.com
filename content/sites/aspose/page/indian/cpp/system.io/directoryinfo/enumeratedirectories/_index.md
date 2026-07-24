---
title: "System::IO::DirectoryInfo::EnumerateDirectories मेथड"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::DirectoryInfo::EnumerateDirectories मेथड। वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में स्थित सभी निर्देशिकाओं को शामिल करने वाला एक enumerable संग्रह लौटाता है C++ में।"
type: docs
weight: 500
url: /hi/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में स्थित सभी डायरेक्टरीज़ को शामिल करने वाला एनेमरेबल संग्रह लौटाता है।

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में निर्दिष्ट खोज मानदंडों को पूरा करने वाली डायरेक्टरीज़ की खोज करता है।

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | डायरेक्टरीज़ को खोजने के लिए नाम पैटर्न। |

### ReturnValue

वह enumerable संग्रह जिसमें [DirectoryInfo](../) ऑब्जेक्ट्स के साझा पॉइंटर्स होते हैं, जो उन निर्देशिकाओं का प्रतिनिधित्व करते हैं जिनके नाम **searchPattern** से मेल खाते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी या उस डायरेक्टरी के मूल में स्थित पूरे डायरेक्टरी ट्री में, निर्दिष्ट खोज मानदंडों को पूरा करने वाली डायरेक्टरीज़ की खोज करता है।

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | डायरेक्टरीज़ को खोजने के लिए नाम पैटर्न। |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में ही करनी है या पूरे डायरेक्टरी ट्री में जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी की जड़ है। |

### ReturnValue

वह enumerable संग्रह जिसमें [DirectoryInfo](../) ऑब्जेक्ट्स के साझा पॉइंटर्स होते हैं, जो उन निर्देशिकाओं का प्रतिनिधित्व करते हैं जिनके नाम **searchPattern** से मेल खाते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
