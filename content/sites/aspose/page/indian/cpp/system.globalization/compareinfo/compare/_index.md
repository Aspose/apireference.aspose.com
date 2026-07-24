---
title: "System::Globalization::CompareInfo::Compare विधि"
linktitle: "Compare"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::CompareInfo::Compare विधि। स्ट्रिंग्स की तुलना करता है। केवल Ordinal और OrdinalIgnoreCase मोड C++ में समर्थित हैं।"
type: docs
weight: 200
url: /hi/cpp/system.globalization/compareinfo/compare/
---
## CompareInfo::Compare(const String\&, const String\&, CompareOptions) const method


स्ट्रिंग्स की तुलना करता है। केवल Ordinal और OrdinalIgnoreCase मोड समर्थित हैं।

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &a, const String &b, CompareOptions options) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| एक | const String\& | बाएँ‑हाथ स्ट्रिंग। |
| b | const String\& | दाएँ‑हाथ स्ट्रिंग। |
| options | CompareOptions | [String](../../../system/string/) तुलना प्रकार। |

### ReturnValue

यदि बाएँ‑हाथ स्ट्रिंग दाएँ‑हाथ स्ट्रिंग से पहले आती है तो नकारात्मक मान, यदि वे समान हों तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, const String\&) const method


स्ट्रिंग्स की तुलना करता है। लागू नहीं किया गया।

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, const String &string2) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| string1 | const String\& | बाएँ‑हाथ स्ट्रिंग। |
| string2 | const String\& | दाएँ‑हाथ स्ट्रिंग। |

### ReturnValue

यदि बाएँ‑हाथ स्ट्रिंग दाएँ‑हाथ स्ट्रिंग से पहले आती है तो नकारात्मक मान, यदि वे समान हों तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int) const method


एक स्ट्रिंग के अंत भाग की तुलना दूसरे स्ट्रिंग के अंत भाग से करता है। लागू नहीं किया गया।

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| string1 | const String\& | पहली स्ट्रिंग। |
| offset1 | int | **string1** में अक्षरों का प्रारंभिक सूचकांक। |
| string2 | const String\& | दूसरी स्ट्रिंग। |
| offset2 | int | **string2** में अक्षरों का प्रारंभिक सूचकांक। |

### ReturnValue

यदि पहला स्ट्रिंग भाग दूसरे स्ट्रिंग भाग से पहले आता है तो नकारात्मक मान, यदि वे मिलते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int, CompareOptions) const method


स्ट्रिंग तुलना विधियों का उपयोग करके एक स्ट्रिंग के अंत भाग की तुलना दूसरे स्ट्रिंग के अंत भाग से करता है। लागू नहीं किया गया।

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2, CompareOptions options) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| string1 | const String\& | पहली स्ट्रिंग। |
| offset1 | int | **string1** में अक्षरों का प्रारंभिक सूचकांक। |
| string2 | const String\& | दूसरी स्ट्रिंग। |
| offset2 | int | **string2** में अक्षरों का प्रारंभिक सूचकांक। |
| options | CompareOptions | [String](../../../system/string/) तुलना विकल्प। |

### ReturnValue

यदि पहला स्ट्रिंग भाग दूसरे स्ट्रिंग भाग से पहले आता है तो नकारात्मक मान, यदि वे मिलते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int) const method


एक स्ट्रिंग के एक भाग की तुलना दूसरे स्ट्रिंग के भाग से करता है। लागू नहीं किया गया।

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| string1 | const String\& | पहली स्ट्रिंग। |
| offset1 | int | **string1** में अक्षरों का प्रारंभिक सूचकांक। |
| length1 | int | **string1** में तुलना करने के लिए अक्षरों की संख्या। |
| string2 | const String\& | दूसरी स्ट्रिंग। |
| offset2 | int | **string2** में अक्षरों का प्रारंभिक सूचकांक। |
| length2 | int | **string2** में तुलना करने के लिए अक्षरों की संख्या। |

### ReturnValue

यदि पहला स्ट्रिंग भाग दूसरे स्ट्रिंग भाग से पहले आता है तो नकारात्मक मान, यदि वे मिलते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int, CompareOptions) const method


स्ट्रिंग तुलना विधियों का उपयोग करके एक स्ट्रिंग के भाग की तुलना दूसरे स्ट्रिंग के भाग से करता है। लागू नहीं किया गया।

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2, CompareOptions options) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| string1 | const String\& | पहली स्ट्रिंग। |
| offset1 | int | **string1** में अक्षरों का प्रारंभिक सूचकांक। |
| length1 | int | **string1** में तुलना करने के लिए अक्षरों की संख्या। |
| string2 | const String\& | दूसरी स्ट्रिंग। |
| offset2 | int | **string2** में अक्षरों का प्रारंभिक सूचकांक। |
| length2 | int | **string2** में तुलना करने के लिए अक्षरों की संख्या। |
| options | CompareOptions | [String](../../../system/string/) तुलना विकल्प। |

### ReturnValue

यदि पहला स्ट्रिंग भाग दूसरे स्ट्रिंग भाग से पहले आता है तो नकारात्मक मान, यदि वे मिलते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
