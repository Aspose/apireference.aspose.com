---
title: "System::String::Split मेथड"
linktitle: "स्प्लिट"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::Split मेथड। C++ में अक्षर के आधार पर स्ट्रिंग को विभाजित करता है।"
type: docs
weight: 4300
url: /hi/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


स्ट्रिंग को कैरेक्टर द्वारा विभाजित करता है।

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| विभाजक | char_t | स्ट्रिंग को विभाजित करने के लिए अक्षर। |
| count | int32_t | वापसी के लिए अधिकतम उपस्ट्रिंग्स की संख्या। |
| opt | StringSplitOptions | विभाजन विकल्प। |

### ReturnValue

[Array](../../array/) of substrings.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


स्ट्रिंग को कैरेक्टर द्वारा विभाजित करता है।

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| विभाजक | char_t | स्ट्रिंग को विभाजित करने के लिए अक्षर। |
| opt | StringSplitOptions | विभाजन विकल्प। |

### ReturnValue

[Array](../../array/) of substrings.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


स्ट्रिंग को दो में से एक कैरेक्टर द्वारा विभाजित करता है।

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| separatorA | char_t | स्ट्रिंग को विभाजित करने के लिए पहला अक्षर। |
| separatorB | char_t | स्ट्रिंग को विभाजित करने के लिए दूसरा अक्षर। |
| opt | StringSplitOptions | विभाजन विकल्प। |

### ReturnValue

[Array](../../array/) of substrings.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


निर्दिष्ट किए गए अक्षरों में से एक द्वारा स्ट्रिंग को विभाजित करता है।

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) विभाजक अक्षरों का। यदि खाली हो, तो कोई भी व्हाइटस्पेस अक्षर विभाजक माना जाता है। |
| count | int32_t | वापसी के लिए अधिकतम उपस्ट्रिंग्स की संख्या। |
| opt | StringSplitOptions | विभाजन विकल्प। |

### ReturnValue

[Array](../../array/) of substrings.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


निर्दिष्ट किए गए अक्षरों में से एक द्वारा स्ट्रिंग को विभाजित करता है।

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) विभाजक अक्षरों का। यदि खाली हो, तो कोई भी व्हाइटस्पेस अक्षर विभाजक माना जाता है। |
| opt | StringSplitOptions | विभाजन विकल्प। |

### ReturnValue

[Array](../../array/) of substrings.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


सबस्ट्रिंग द्वारा स्ट्रिंग को विभाजित करता है। वर्तमान में, केवल शून्य या एक तत्व वाले सेपरेटर एरे को समर्थन देता है।

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) विभाजक स्ट्रिंग्स का। यदि खाली हो, तो कोई विभाजन नहीं किया जाता। |
| count | int | विभाजनों की एरे में तत्वों की अधिकतम संख्या। |
| opt | StringSplitOptions | विभाजन विकल्प। |

### ReturnValue

[Array](../../array/) of substrings.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


सबस्ट्रिंग द्वारा स्ट्रिंग को विभाजित करता है।

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) विभाजक स्ट्रिंग्स का। यदि खाली हो, तो कोई विभाजन नहीं किया जाता। |
| opt | StringSplitOptions | विभाजन विकल्प। |

### ReturnValue

[Array](../../array/) of substrings.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


सबस्ट्रिंग द्वारा स्ट्रिंग को विभाजित करता है।

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| विभाजक | const String\& | विभाजक के रूप में कार्य करने वाली उपस्ट्रिंग। यदि खाली हो, तो व्हाइटस्पेस अक्षर विभाजक के रूप में कार्य करता है। |
| count | int | विभाजनों की एरे में तत्वों की अधिकतम संख्या। |
| opt | StringSplitOptions | विभाजन विकल्प। |

### ReturnValue

[Array](../../array/) of substrings.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


सबस्ट्रिंग द्वारा स्ट्रिंग को विभाजित करता है।

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| विभाजक | const String\& | विभाजक के रूप में कार्य करने वाली उपस्ट्रिंग। यदि खाली हो, तो व्हाइटस्पेस अक्षर विभाजक के रूप में कार्य करता है। |
| opt | StringSplitOptions | विभाजन विकल्प। |

### ReturnValue

[Array](../../array/) of substrings.

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
