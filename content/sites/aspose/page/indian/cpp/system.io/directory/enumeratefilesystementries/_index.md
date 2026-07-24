---
title: "System::IO::Directory::EnumerateFileSystemEntries विधि"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Directory::EnumerateFileSystemEntries विधि. निर्दिष्ट खोज मानदंड को संतुष्ट करने वाली फ़ाइलों और निर्देशिकाओं को खोजता है, चाहे वह निर्दिष्ट निर्देशिका में हो या निर्दिष्ट निर्देशिका में मूलित पूरी निर्देशिका वृक्ष में, C++ में।"
type: docs
weight: 500
url: /hi/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों और डायरेक्टरीज़ की खोज करता है।

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | खोज करने के लिए डायरेक्टरी का पूर्ण या सापेक्ष पथ |
| searchPattern | const String\& | खोज के लिए फ़ाइलों और निर्देशिकाओं का नाम पैटर्न |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल निर्दिष्ट डायरेक्टरी में करनी है या उस डायरेक्टरी से शुरू होने वाले पूरे डायरेक्टरी ट्री में |

### ReturnValue

पाए गए फ़ाइलों और निर्देशिकाओं के पूर्ण पथों का गणनीय संग्रह, जिनके नाम **searchPattern** से मेल खाते हैं

## संबंधित देखें

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
