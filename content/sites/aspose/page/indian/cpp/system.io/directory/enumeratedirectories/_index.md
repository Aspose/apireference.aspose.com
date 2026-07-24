---
title: "System::IO::Directory::EnumerateDirectories मेथड"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Directory::EnumerateDirectories मेथड। निर्दिष्ट डायरेक्टरी या निर्दिष्ट डायरेक्टरी में जड़ित पूरे डायरेक्टरी ट्री में, निर्दिष्ट खोज मानदंड को संतुष्ट करने वाले डायरेक्टरीज़ की खोज करता है C++ में।"
type: docs
weight: 300
url: /hi/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली डायरेक्टरीज़ की खोज करता है।

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | खोज करने के लिए डायरेक्टरी का पूर्ण या सापेक्ष पथ |
| searchPattern | const String\& | डायरेक्टरीज़ को खोजने के लिए नाम पैटर्न। |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल निर्दिष्ट डायरेक्टरी में करनी है या उस डायरेक्टरी से शुरू होने वाले पूरे डायरेक्टरी ट्री में |

### ReturnValue

**searchPattern** से मेल खाने वाले पाए गए डायरेक्टरीज़ के पूर्ण पाथ का एनेमरेबल कलेक्शन

## संबंधित देखें

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
