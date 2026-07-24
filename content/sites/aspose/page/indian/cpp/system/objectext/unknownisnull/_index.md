---
title: "System::ObjectExt::UnknownIsNull मेथड"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::UnknownIsNull मेथड. जाँच करता है कि अज्ञात प्रकार का ऑब्जेक्ट nullptr है या नहीं। C++ में गैर-स्केलर प्रकारों के लिए ओवरलोड।"
type: docs
weight: 1700
url: /hi/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


जाँचता है कि अज्ञात प्रकार का ऑब्जेक्ट nullptr है या नहीं। गैर-स्केलर प्रकारों के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Object](../../object/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T | [Object](../../object/) को जाँचने के लिए। |

### ReturnValue

'obj == nullptr' सत्य होने पर True, अन्यथा False।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


जाँचता है कि अज्ञात प्रकार का ऑब्जेक्ट nullptr है या नहीं। स्केलर प्रकारों के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Object](../../object/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T | [Object](../../object/) को जाँचने के लिए। |

### ReturnValue

हमेशा false लौटाता है।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
