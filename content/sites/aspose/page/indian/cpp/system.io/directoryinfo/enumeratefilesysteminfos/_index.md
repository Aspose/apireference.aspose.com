---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos मेथड"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos मेथड। सभी फ़ाइलों और निर्देशिकाओं को शामिल करने वाला एनेरेबल संग्रह लौटाता है जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में स्थित हैं C++ में।"
type: docs
weight: 700
url: /hi/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में स्थित सभी फ़ाइलों और निर्देशिकाओं को शामिल करने वाला एन्यूमेरेबल संग्रह लौटाता है।

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों और निर्देशिकाओं की खोज करता है।

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | खोज के लिए फ़ाइलों और निर्देशिकाओं का नाम पैटर्न |

### ReturnValue

फ़ाइलों और निर्देशिकाओं के मिलने वाले नामों से मेल खाने वाले **searchPattern** को दर्शाने वाले [FileSystemInfo](../../filesysteminfo/) ऑब्जेक्ट्स के साझा पॉइंटर्स का एनेरेबल संग्रह।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका या उस निर्देशिका से शुरू होने वाले संपूर्ण निर्देशिका वृक्ष में, निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों और निर्देशिकाओं की खोज करता है।

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | खोज के लिए फ़ाइलों और निर्देशिकाओं का नाम पैटर्न |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में ही करनी है या पूरे डायरेक्टरी ट्री में जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी की जड़ है। |

### ReturnValue

फ़ाइलों और निर्देशिकाओं के मिलने वाले नामों से मेल खाने वाले **searchPattern** को दर्शाने वाले [FileSystemInfo](../../filesysteminfo/) ऑब्जेक्ट्स के साझा पॉइंटर्स का एनेरेबल संग्रह।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
