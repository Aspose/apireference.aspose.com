---
title: "System::IO::DirectoryInfo::GetFileSystemInfos मेथड"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::DirectoryInfo::GetFileSystemInfos मेथड। वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में स्थित सभी फ़ाइलों और निर्देशिकाओं को दर्शाने वाले FileSystemInfo ऑब्जेक्ट्स के साझा पॉइंटर्स को शामिल करने वाला एक एरे C++ में लौटाता है।"
type: docs
weight: 1400
url: /hi/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में स्थित सभी फ़ाइलों और निर्देशिकाओं को दर्शाने वाले [FileSystemInfo](../../filesysteminfo/) ऑब्जेक्ट्स के साझा पॉइंटर्स को शामिल करने वाला एक एरे लौटाता है।

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों और निर्देशिकाओं की खोज करता है।

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | खोज के लिए फ़ाइलों और निर्देशिकाओं का नाम पैटर्न |

### ReturnValue

एक एरे जिसमें [FileSystemInfo](../../filesysteminfo/) ऑब्जेक्ट्स के साझा पॉइंटर्स होते हैं, जो उन फ़ाइलों और निर्देशिकाओं का प्रतिनिधित्व करते हैं जिनके नाम **searchPattern** से मेल खाते हैं।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका या उस निर्देशिका से शुरू होने वाले संपूर्ण निर्देशिका वृक्ष में, निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों और निर्देशिकाओं की खोज करता है।

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | खोज के लिए फ़ाइलों और निर्देशिकाओं का नाम पैटर्न |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में ही करनी है या पूरे डायरेक्टरी ट्री में जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी की जड़ है। |

### ReturnValue

एक एरे जिसमें [FileSystemInfo](../../filesysteminfo/) ऑब्जेक्ट्स के साझा पॉइंटर्स होते हैं, जो उन फ़ाइलों और निर्देशिकाओं का प्रतिनिधित्व करते हैं जिनके नाम **searchPattern** से मेल खाते हैं।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
