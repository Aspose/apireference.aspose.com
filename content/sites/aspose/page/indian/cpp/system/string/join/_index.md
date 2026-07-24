---
title: "System::String::Join मेथड"
linktitle: "Join"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::Join मेथड। C++ में स्ट्रिंग को विभाजक के रूप में उपयोग करके एरे को जोड़ता है।"
type: docs
weight: 7300
url: /hi/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


ऐरे को स्ट्रिंग को विभाजक के रूप में उपयोग करके जोड़ता है।

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| separator | const String\& | [String](../) को एरे तत्वों के बीच जोड़ते समय रखा जाता है। |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | जोड़ने के लिए भागों की [Array](../../array/)। |

### ReturnValue

[String](../) representing joint elements.

## संबंधित देखें

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


ऐरे को स्ट्रिंग को विभाजक के रूप में उपयोग करके जोड़ता है।

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| separator | const String\& | [String](../) को एरे तत्वों के बीच जोड़ते समय रखा जाता है। |
| parts | const ArrayPtr\<String\>\& | जोड़ने के लिए भागों की [Array](../../array/)। |
| startIndex | int | जोड़ना शुरू करने के लिए एरे में पहला इंडेक्स। |
| count | int | जोड़ने के लिए एरे तत्वों की संख्या। -1 का अर्थ है 'एरे के अंत तक'। |

### ReturnValue

[String](../) representing joint array elements.

## संबंधित देखें

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


ऐरे को स्ट्रिंग को विभाजक के रूप में उपयोग करके जोड़ता है।

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| separator | const String\& | [String](../) को एरे तत्वों के बीच जोड़ते समय रखा जाता है। |
| parts | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - parts एनेरेबल ऑब्जेक्ट |

### ReturnValue

[String](../) representing joint elements.

## संबंधित देखें

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


ऐरे को स्ट्रिंग को विभाजक के रूप में उपयोग करके जोड़ता है।

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| separator | const String\& | [String](../) को एरे तत्वों के बीच जोड़ते समय रखा जाता है। |
| parts | const System::Details::ArrayView\<String\>\& | जोड़ने के लिए भागों का ArrayView। |
| startIndex | int | जोड़ना शुरू करने के लिए एरे में पहला इंडेक्स। |
| count | int | जोड़ने के लिए एरे तत्वों की संख्या। -1 का अर्थ है 'एरे के अंत तक'। |

### ReturnValue

[String](../) representing joint array elements.

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
