---
title: "طريقة System::Xml::XmlWriter::WriteStartElement"
linktitle: "WriteStartElement"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlWriter::WriteStartElement. عند تجاوزها في فئة مشتقة، تكتب علامة بدء بالاسم المحلي المحدد في C++."
type: docs
weight: 3200
url: /ar/cpp/system.xml/xmlwriter/writestartelement/
---
## XmlWriter::WriteStartElement(const String\&) method


عند تجاوزها في فئة مشتقة، تكتب علامة بداية بالاسم المحلي المحدد.

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | const String\& | الاسم المحلي للعنصر. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&) method


عند تجاوزها في فئة مشتقة، تكتب علامة البداية المحددة وتربطها بالمساحة الاسمية المعطاة.

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName, const String &ns)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | const String\& | الاسم المحلي للعنصر. |
| ns | const String\& | معرف URI للمساحة الاسمية لربطه بالعنصر. إذا كانت هذه المساحة الاسمية موجودة بالفعل في النطاق ولها بادئة مرتبطة، فإن الكاتب يكتب تلك البادئة تلقائيًا أيضًا. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&, const String\&) method


عند تجاوزها في فئة مشتقة، تكتب علامة البداية المحددة وتربطها بالمساحة الاسمية والبادئة المعطاة.

```cpp
virtual void System::Xml::XmlWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البادئة | const String\& | بادئة مساحة الاسم للعنصر. |
| localName | const String\& | الاسم المحلي للعنصر. |
| ns | const String\& | معرف URI للمساحة الاسمية لربطه بالعنصر. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
