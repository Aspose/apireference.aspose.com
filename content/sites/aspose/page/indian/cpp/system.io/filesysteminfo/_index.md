---
title: "System::IO::FileSystemInfo क्लास"
linktitle: "FileSystemInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::FileSystemInfo क्लास। FileInfo और DirectoryInfo के लिए बेस क्लास। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 1600
url: /hi/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


[FileInfo](../fileinfo/) और [DirectoryInfo](../directoryinfo/) के लिए बेस क्लास। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।

```cpp
class FileSystemInfo : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Delete](./delete/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई इकाई को हटाता है। |
| virtual [Finalize](./finalize/)() | कुछ नहीं करता। |
| [get_Attributes](./get_attributes/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई इकाई के गुण लौटाता है। |
| [get_CreationTime](./get_creationtime/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई इकाई का निर्माण समय स्थानीय समय के रूप में लौटाता है। |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई इकाई का निर्माण समय UTC समय के रूप में लौटाता है। |
| virtual [get_Exists](./get_exists/)() | निर्धारित करता है कि क्या वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए पथ द्वारा संदर्भित इकाई मौजूद है। |
| [get_Extension](./get_extension/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए फ़ाइल का एक्सटेंशन लौटाता है। |
| virtual [get_FullName](./get_fullname/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का पूरा नाम (पथ सहित) लौटाता है। |
| [get_LastAccessTime](./get_lastaccesstime/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का अंतिम एक्सेस समय स्थानीय समय के रूप में लौटाता है। |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का अंतिम एक्सेस समय UTC समय के रूप में लौटाता है। |
| [get_LastWriteTime](./get_lastwritetime/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का अंतिम लिखने का समय स्थानीय समय के रूप में लौटाता है। |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का अंतिम लिखने का समय UTC समय के रूप में लौटाता है। |
| virtual [get_Name](./get_name/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का एक नाम लौटाता है। |
| [Refresh](./refresh/)() | वर्तमान ऑब्जेक्ट की स्थिति को रीफ़्रेश करता है। |
| [set_Attributes](./set_attributes/)(FileAttributes) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई पर निर्दिष्ट गुण सेट करता है। |
| [set_CreationTime](./set_creationtime/)(DateTime) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का निर्माण समय स्थानीय समय के रूप में सेट करता है। |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का निर्माण समय UTC समय के रूप में सेट करता है। |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का अंतिम एक्सेस समय स्थानीय समय के रूप में सेट करता है। |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का अंतिम एक्सेस समय UTC समय के रूप में सेट करता है। |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का अंतिम लिखने का समय स्थानीय समय के रूप में सेट करता है। |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए इकाई का अंतिम लिखने का समय UTC समय के रूप में सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
