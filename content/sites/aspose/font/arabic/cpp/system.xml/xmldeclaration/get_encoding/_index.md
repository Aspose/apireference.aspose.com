---
title: "System::Xml::XmlDeclaration::get_Encoding طريقة"
linktitle: "get_Encoding"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlDeclaration::get_Encoding طريقة. تُرجع مستوى الترميز لمستند XML في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


تُرجع مستوى الترميز لمستند XML.

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

اسم الترميز الحرفي الصالح.
## ملاحظات



أكثر أسماء ترميز الحروف المدعومة شيوعًا لـ XML هي التالية: |||
|-|-|
| الفئة | أسماء الترميز |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (حيث "n" هو رقم من 1 إلى 9) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

هذه القيمة اختيارية. إذا لم يتم تعيين قيمة، تُعيد هذه الطريقة [String::Empty](../../../system/string/empty/). إذا لم يتم تضمين سمة الترميز، يُفترض ترميز UTF-8 عند كتابة المستند أو حفظه.
## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
