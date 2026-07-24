---
title: "System::IO::Directory क्लास"
linktitle: "Directory"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Directory क्लास। डायरेक्टरीज़ को संशोधित करने के लिए मेथड्स शामिल करता है। यह एक स्थिर प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको C++ में किसी भी तरीके से इसका इंस्टेंस कभी नहीं बनाना चाहिए।"
type: docs
weight: 1100
url: /hi/cpp/system.io/directory/
---
## Directory class


डायरेक्टरीज़ को संशोधित करने के लिए मेथड्स शामिल करता है। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको इसे किसी भी तरह से इंस्टेंस नहीं बनाना चाहिए।

```cpp
class Directory
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | यदि निर्दिष्ट पथ में डायरेक्टरी मौजूद नहीं हैं तो सभी डायरेक्टरी बनाता है। |
| static [Delete](./delete/)(const String\&, bool) | निर्दिष्ट फ़ाइल या डायरेक्टरी को हटाता है। कोई अपवाद नहीं फेंकता। |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली डायरेक्टरीज़ की खोज करता है। |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों की खोज करता है। |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों और डायरेक्टरीज़ की खोज करता है। |
| static [Exists](./exists/)(const String\&) | निर्धारित करता है कि निर्दिष्ट पथ मौजूदा डायरेक्टरी को दर्शाता है या नहीं। |
| static [GetCreationTime](./getcreationtime/)(const String\&) | निर्दिष्ट इकाई का निर्माण समय स्थानीय समय के रूप में लौटाता है। |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | निर्दिष्ट इकाई का निर्माण समय UTC समय के रूप में लौटाता है। |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | वर्तमान डायरेक्टरी का पूर्ण नाम (पथ सहित) लौटाता है। |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली डायरेक्टरीज़ की खोज करता है। |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | निर्दिष्ट पथ की रूट डायरेक्टरी लौटाता है। |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों की खोज करता है। |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों और डायरेक्टरीज़ की खोज करता है। |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | निर्दिष्ट इकाई का अंतिम पहुँच समय स्थानीय समय के रूप में लौटाता है। |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | निर्दिष्ट इकाई का अंतिम पहुँच समय UTC समय के रूप में लौटाता है। |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | निर्दिष्ट इकाई का अंतिम लेखन समय स्थानीय समय के रूप में लौटाता है। |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | निर्दिष्ट इकाई का अंतिम लेखन समय UTC समय के रूप में लौटाता है। |
| static [GetLogicalDrives](./getlogicaldrives/)() | लागू नहीं किया गया। |
| static [GetParent](./getparent/)(const String\&) | निर्दिष्ट इकाई की पैरेंट डायरेक्टरी का प्रतिनिधित्व करने वाले [DirectoryInfo](../directoryinfo/) ऑब्जेक्ट के लिए एक साझा पॉइंटर लौटाता है। |
| static [Move](./move/)(const String\&, const String\&) | निर्दिष्ट इकाई को नई जगह पर ले जाता है। यदि ले जाने वाली इकाई एक डायरेक्टरी है, तो यह अपनी सभी सामग्री के साथ स्थानांतरित होती है। |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | निर्दिष्ट इकाई का निर्माण समय स्थानीय समय के रूप में सेट करता है। |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | निर्दिष्ट इकाई का निर्माण समय UTC समय के रूप में सेट करता है। |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | वर्तमान डायरेक्टरी सेट करता है। |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | निर्दिष्ट इकाई का अंतिम पहुँच समय स्थानीय समय के रूप में सेट करता है। |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | निर्दिष्ट इकाई का अंतिम पहुँच समय UTC समय के रूप में सेट करता है। |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | निर्दिष्ट इकाई का अंतिम लेखन समय स्थानीय समय के रूप में सेट करता है। |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | निर्दिष्ट इकाई का अंतिम लेखन समय UTC समय के रूप में सेट करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | [String](../../system/string/) ऑब्जेक्ट्स के सेट पर इटरेट करने वाले IEnumerable ऑब्जेक्ट के लिए एक साझा पॉइंटर का उपनाम है। |
## टिप्पणियाँ



```cpp
#include "system/io/directory.h"
#include "system/io/path.h"
#include "system/string.h"
#include <iostream>

void PrintMessage(const System::String &path)
{
  std::cout << "Directory '" << path << (System::IO::Directory::Exists(path) ? "' exists." : "' doesn't exist.") << std::endl;
}

int main()
{
  // डायरेक्टरी पाथ्स को शामिल करने वाली स्ट्रिंग्स बनाएं।
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // जाँचें कि डायरेक्टरी मौजूद हैं या नहीं।
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // टेम्प डायरेक्टरी की जानकारी प्रिंट करें।
  std::cout <<
    "Creation Time: " << System::IO::Directory::GetCreationTime(tempPath) << std::endl <<
    "Last Access Time: " << System::IO::Directory::GetLastAccessTime(tempPath) << std::endl <<
    "Last Write Time: " << System::IO::Directory::GetLastWriteTime(tempPath) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Directory 'C:\' exists.
Directory 'C:\Some directory' doesn't exist.
Directory 'C:\Users\lanor\AppData\Local\Temp\' exists.
Creation Time: 27.08.2021 14:21:42
Last Access Time: 07.10.2021 12:16:41
Last Write Time: 07.10.2021 12:16:41
*/
```

## संबंधित देखें

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
