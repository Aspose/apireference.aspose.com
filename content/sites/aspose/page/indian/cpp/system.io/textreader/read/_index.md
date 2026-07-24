---
title: "System::IO::TextReader::Read method"
linktitle: "पढ़ें"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::TextReader::Read method. C++ में स्ट्रीम से एक एकल अक्षर पढ़ता है।"
type: docs
weight: 400
url: /hi/cpp/system.io/textreader/read/
---
## TextReader::Read() method


स्ट्रीम से एक एकल अक्षर पढ़ता है।

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

UTF-16 एन्कोडिंग में एन्कोडेड अक्षर पढ़ें; यदि पढ़ा गया अक्षर UTF-16 एन्कोडिंग में दो कोडपॉइंट द्वारा दर्शाया गया है तो केवल उच्च सर्रैगेट लौटाया जाता है।

## संबंधित देखें

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


स्ट्रीम से निर्दिष्ट संख्या में अक्षर पढ़ता है और उन्हें निर्दिष्ट स्थिति से शुरू होते हुए निर्दिष्ट कैरेक्टर ऐरे में लिखता है।

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | ArrayPtr\<char_t\> | स्ट्रीम से पढ़े गए अक्षरों को लिखने के लिए UTF-16 अक्षर एरे |
| सूचकांक | int | एक 0-आधारित सूचकांक **buffer** में जहाँ से लिखना शुरू करना है |
| count | int | स्ट्रीम से पढ़े जाने वाले अक्षरों की संख्या |

### ReturnValue

स्ट्रीम से पढ़े गए अक्षरों की संख्या

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
