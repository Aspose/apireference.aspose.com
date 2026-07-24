---
title: "System::IO::FileInfo::Open विधि"
linktitle: "Open"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::FileInfo::Open विधि. वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल को निर्दिष्ट मोड में पढ़ने और लिखने के लिए तथा बिना शेयरिंग के C++ में खोलता है।"
type: docs
weight: 1600
url: /hi/cpp/system.io/fileinfo/open/
---
## FileInfo::Open(FileMode) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल को निर्दिष्ट मोड में पढ़ने और लिखने के लिए खोलता है और बिना शेयरिंग के।

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| mode | FileMode | फ़ाइल खोलने के मोड को निर्दिष्ट करता है |

### ReturnValue

वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल से जुड़ा एक [FileStream](../../filestream/) ऑब्जेक्ट

## संबंधित देखें

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Open(FileMode, FileAccess) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल को निर्दिष्ट मोड में, निर्दिष्ट एक्सेस प्रकार के साथ और बिना शेयरिंग के खोलता है।

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode, FileAccess access)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| mode | FileMode | फ़ाइल खोलने के मोड को निर्दिष्ट करता है |
| पहुँच | FileAccess | अनुरोधित अभिगम प्रकार |

### ReturnValue

वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल से जुड़ा एक [FileStream](../../filestream/) ऑब्जेक्ट

## संबंधित देखें

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Open(FileMode, FileAccess, FileShare) method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल को निर्दिष्ट मोड में, निर्दिष्ट एक्सेस प्रकार और शेयरिंग विकल्प के साथ खोलता है।

```cpp
FileStreamPtr System::IO::FileInfo::Open(FileMode mode, FileAccess access, FileShare share)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| mode | FileMode | फ़ाइल खोलने के मोड को निर्दिष्ट करता है |
| पहुँच | FileAccess | अनुरोधित अभिगम प्रकार |
| share | FileShare | अन्य [FileStream](../../filestream/) ऑब्जेक्ट्स द्वारा खुले फ़ाइल तक पहुंच का प्रकार |

### ReturnValue

वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई फ़ाइल से जुड़ा एक [FileStream](../../filestream/) ऑब्जेक्ट

## संबंधित देखें

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
