---
title: "System::IO::DirectoryInfo::GetFiles method"
linktitle: "GetFiles"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::DirectoryInfo::GetFiles मेथड। वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में स्थित सभी निर्देशिकाओं को दर्शाने वाले FileInfo ऑब्जेक्ट्स के साझा पॉइंटर्स को शामिल करने वाला एक एरे लौटाता है C++ में।"
type: docs
weight: 1300
url: /hi/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में स्थित सभी निर्देशिकाओं को दर्शाने वाले [FileInfo](../../fileinfo/) ऑब्जेक्ट्स के साझा पॉइंटर्स को शामिल करने वाला एक एरे लौटाता है।

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों की खोज करता है।

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | फ़ाइलों को खोजने के लिए नाम पैटर्न। |

### ReturnValue

एक एरे जिसमें [FileInfo](../../fileinfo/) ऑब्जेक्ट्स के साझा पॉइंटर्स होते हैं, जो उन फ़ाइलों का प्रतिनिधित्व करते हैं जिनके नाम **searchPattern** से मेल खाते हैं।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए निर्देशिका या उस निर्देशिका से शुरू होने वाले संपूर्ण निर्देशिका वृक्ष में, निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों की खोज करता है।

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| searchPattern | const String\& | फ़ाइलों को खोजने के लिए नाम पैटर्न। |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी में ही करनी है या पूरे डायरेक्टरी ट्री में जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डायरेक्टरी की जड़ है। |

### ReturnValue

एक एरे जिसमें [FileInfo](../../fileinfo/) ऑब्जेक्ट्स के साझा पॉइंटर्स होते हैं, जो उन फ़ाइलों का प्रतिनिधित्व करते हैं जिनके नाम **searchPattern** से मेल खाते हैं।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
