---
title: "System::IO::StringReader::Read मेथड"
linktitle: "पढ़ें"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::StringReader::Read मेथड. C++ में स्ट्रीम से एकल अक्षर पढ़ता है।"
type: docs
weight: 500
url: /hi/cpp/system.io/stringreader/read/
---
## StringReader::Read() method


स्ट्रीम से एक एकल अक्षर पढ़ता है।

```cpp
virtual int System::IO::StringReader::Read() override
```


### ReturnValue

पढ़ा गया अक्षर या -1 यदि कोई अक्षर नहीं पढ़ा गया

## संबंधित देखें

* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StringReader::Read(ArrayPtr\<char_t\>, int, int) method


निर्दिष्ट स्थिति से शुरू होकर, निर्दिष्ट संख्या में अक्षरों को स्ट्रीम से निर्दिष्ट कैरेक्टर एरे में पढ़ता है।

```cpp
virtual int System::IO::StringReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | ArrayPtr\<char_t\> | स्ट्रीम से पढ़े गए अक्षरों को लिखने के लिए कैरेक्टर एरे |
| सूचकांक | int | एक 0-आधारित सूचकांक **buffer** में जहाँ से लिखना शुरू करना है |
| count | int | स्ट्रीम से पढ़े जाने वाले अक्षरों की संख्या |

### ReturnValue

स्ट्रीम से पढ़े गए अक्षरों की संख्या

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
