---
title: "طريقة System::Xml::Schema::XmlSchemaCollection::Add"
linktitle: "Add"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Schema::XmlSchemaCollection::Add. تُضيف الـ XmlSchema إلى المجموعة في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


يضيف الـ [XmlSchema](../../xmlschema/) إلى المجموعة.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | ‏[XmlSchema](../../xmlschema/) المراد إضافتها إلى المجموعة. |

### ReturnValue

كائن الـ [XmlSchema](../../xmlschema/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يضيف الـ [XmlSchema](../../xmlschema/) إلى المجموعة. يُستخدم الـ [XmlResolver](../../../system.xml/xmlresolver/) المحدد لحل أي مراجع خارجية.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | ‏[XmlSchema](../../xmlschema/) المراد إضافتها إلى المجموعة. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | ‏[XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل المساحات الاسمية المشار إليها في عناصر **include** و **import**. إذا كان هذا **nullptr**, لن يتم حل المراجع الخارجية. |

### ReturnValue

‏[XmlSchema](../../xmlschema/) المضافة إلى مجموعة المخططات.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


يضيف جميع المساحات الاسمية المعرفة في المجموعة المعطاة (بما في ذلك المخططات المرتبطة بها) إلى هذه المجموعة.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | ‏[XmlSchemaCollection](../) التي تريد إضافتها إلى هذه المجموعة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


يضيف المخطط الموجود في الـ [XmlReader](../../../system.xml/xmlreader/) إلى مجموعة المخططات.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ns | const String\& | معرّف URI للمساحة الاسمية المرتبط بالمخطط. بالنسبة لمخططات XML، يكون عادةً هو **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | ‏[XmlReader](../../../system.xml/xmlreader/) الذي يحتوي على المخطط للإضافة. |

### ReturnValue

‏[XmlSchema](../../xmlschema/) المضافة إلى مجموعة المخططات؛ **nullptr** إذا كان المخطط المضاف مخطط XDR أو إذا كانت هناك أخطاء تجميع في المخطط.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يضيف المخطط الموجود في الـ [XmlReader](../../../system.xml/xmlreader/) إلى مجموعة المخططات. يُستخدم الـ [XmlResolver](../../../system.xml/xmlresolver/) المحدد لحل أي موارد خارجية.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ns | const String\& | معرّف URI للمساحة الاسمية المرتبط بالمخطط. بالنسبة لمخططات XML، يكون عادةً هو **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | ‏[XmlReader](../../../system.xml/xmlreader/) الذي يحتوي على المخطط للإضافة. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | ‏[XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل المساحات الاسمية المشار إليها في عناصر **include** و **import** أو سمة **x-schema** (مخططات XDR). إذا كان هذا **nullptr**, لن يتم حل المراجع الخارجية. |

### ReturnValue

‏[XmlSchema](../../xmlschema/) المضافة إلى مجموعة المخططات؛ **nullptr** إذا كان المخطط المضاف مخطط XDR أو إذا كانت هناك أخطاء تجميع في المخطط.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


يضيف المخطط الموجود على عنوان URL المحدد إلى مجموعة المخططات.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ns | const String\& | معرّف URI للمساحة الاسمية المرتبط بالمخطط. بالنسبة لمخططات XML، يكون عادةً هو **targetNamespace**. |
| uri | const String\& | ‏URL الذي يحدد المخطط المراد تحميله. |

### ReturnValue

‏[XmlSchema](../../xmlschema/) المضافة إلى مجموعة المخططات؛ **nullptr** إذا كان المخطط المضاف مخطط XDR أو إذا كانت هناك أخطاء تجميع في المخطط.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
