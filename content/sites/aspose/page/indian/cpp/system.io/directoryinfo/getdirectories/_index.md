---
title: "System::IO::DirectoryInfo::GetDirectories method"
linktitle: "GetDirectories"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::DirectoryInfo::GetDirectories मेथड। यह एक एरे लौटाता है जिसमें साझा पॉइंटर्स होते हैं जो उन सभी डायरेक्टरीज़ का प्रतिनिधित्व करने वाले DirectoryInfo ऑब्जेक्ट्स को दर्शाते हैं जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में स्थित हैं, C++ में।"
type: docs
weight: 1200
url: /hi/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


एक एरे लौटाता है जिसमें साझा पॉइंटर्स होते हैं जो [DirectoryInfo](../) ऑब्जेक्ट्स को दर्शाते हैं, जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में स्थित सभी डायरेक्टरीज़ का प्रतिनिधित्व करते हैं।

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में निर्दिष्ट खोज मानदंडों को पूरा करने वाली डायरेक्टरीज़ की खोज करता है।

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | डायरेक्टरीज़ को खोजने के लिए नाम पैटर्न। |

### ReturnValue

एक एरे जिसमें साझा पॉइंटर्स होते हैं जो [DirectoryInfo](../) ऑब्जेक्ट्स को दर्शाते हैं, जो पाए गए डायरेक्टरीज़ का प्रतिनिधित्व करते हैं जिनके नाम **searchPattern** से मेल खाते हैं।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी या उस डायरेक्टरी के मूल में स्थित पूरे डायरेक्टरी ट्री में, निर्दिष्ट खोज मानदंडों को पूरा करने वाली डायरेक्टरीज़ की खोज करता है।

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | डायरेक्टरीज़ को खोजने के लिए नाम पैटर्न। |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में ही करनी है या पूरे डायरेक्टरी ट्री में जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी की जड़ है। |

### ReturnValue

एक एरे जिसमें साझा पॉइंटर्स होते हैं जो [DirectoryInfo](../) ऑब्जेक्ट्स को दर्शाते हैं, जो पाए गए डायरेक्टरीज़ का प्रतिनिधित्व करते हैं जिनके नाम **searchPattern** से मेल खाते हैं।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
