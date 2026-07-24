---
title: "System::IO::BinaryReader::Read विधि"
linktitle: "पढ़ें"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BinaryReader::Read विधि. इनपुट स्ट्रीम से C++ में एक एकल अक्षर पढ़ती है।"
type: docs
weight: 700
url: /hi/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


इनपुट स्ट्रीम से एक एकल अक्षर पढ़ता है।

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

UTF-16 एन्कोडिंग में एन्कोडेड अक्षर पढ़ें; यदि पढ़ा गया अक्षर UTF-16 एन्कोडिंग में दो कोडपॉइंट द्वारा दर्शाया गया है तो केवल उच्च सर्रैगेट लौटाया जाता है।

## संबंधित देखें

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


इनपुट स्ट्रीम से निर्दिष्ट संख्या में अक्षर पढ़ता है, उन्हें UTF-16 एन्कोडिंग में परिवर्तित करता है और परिणामी UTF-16 अक्षरों को निर्दिष्ट स्थिति से शुरू होकर निर्दिष्ट कैरेक्टर एरे में लिखता है।

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | ArrayPtr\<char_t\> | इनपुट स्ट्रीम से पढ़े गए अक्षरों को लिखने के लिए UTF-16 अक्षर एरे |
| सूचकांक | int | एक 0-आधारित सूचकांक **buffer** में जहाँ से लिखना शुरू करना है |
| count | int | स्ट्रीम से पढ़े जाने वाले अक्षरों की संख्या |

### ReturnValue

इनपुट स्ट्रीम से पढ़े गए अक्षरों की संख्या

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


इनपुट स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है।

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | ArrayPtr\<uint8_t\> | पढ़े गए बाइट्स को लिखने के लिए बाइट एरे। |
| सूचकांक | int | एक 0-आधारित स्थिति **buffer** में जहाँ लिखना शुरू किया जाए |
| count | int | पढ़ने के लिए बाइट्स की संख्या |

### ReturnValue

पढ़े गए बाइट्स की संख्या

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
