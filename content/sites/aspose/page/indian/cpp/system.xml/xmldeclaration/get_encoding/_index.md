---
title: "System::Xml::XmlDeclaration::get_Encoding मेथड"
linktitle: "get_Encoding"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDeclaration::get_Encoding मेथड। C++ में XML दस्तावेज़ के एन्कोडिंग स्तर को लौटाता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


XML दस्तावेज़ के एन्कोडिंग स्तर को लौटाता है।

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

वैध कैरेक्टर एन्कोडिंग नाम।
## टिप्पणियाँ



XML के लिए सबसे अधिक सामान्यतः समर्थित कैरेक्टर एन्कोडिंग नाम निम्नलिखित हैं: |||
|-|-|
| श्रेणी | एन्कोडिंग नाम |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (जहाँ "n" 1 से 9 तक का अंक है) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

यह मान वैकल्पिक है। यदि कोई मान सेट नहीं किया गया है, तो यह विधि [String::Empty](../../../system/string/empty/) लौटाती है। यदि एन्कोडिंग गुण शामिल नहीं है, तो दस्तावेज़ लिखते या सहेजते समय UTF-8 एन्कोडिंग मान ली जाती है।
## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
