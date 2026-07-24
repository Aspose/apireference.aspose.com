---
title: "System::Xml::Schema::XmlSchemaCollection::Add method"
linktitle: "Add"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaCollection::Add method. يضيف XmlSchema إلى المجموعة في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


يضيف [XmlSchema](../../xmlschema/) إلى المجموعة.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) المراد إضافته إلى المجموعة. |

### ReturnValue

الكائن [XmlSchema](../../xmlschema/).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يضيف [XmlSchema](../../xmlschema/) إلى المجموعة. يُستخدم [XmlResolver](../../../system.xml/xmlresolver/) المحدد لحل أي مراجع خارجية.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) المراد إضافته إلى المجموعة. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل المساحات الاسمية المشار إليها في عناصر **include** و **import**. إذا كان هذا **nullptr**, لن يتم حل المراجع الخارجية. |

### ReturnValue

[XmlSchema](../../xmlschema/) المضاف إلى مجموعة المخططات.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


يضيف جميع المساحات الاسمية المعرفة في المجموعة المحددة (بما في ذلك المخططات المرتبطة بها) إلى هذه المجموعة.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | [XmlSchemaCollection](../) الذي تريد إضافته إلى هذه المجموعة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


يضيف المخطط الموجود في [XmlReader](../../../system.xml/xmlreader/) إلى مجموعة المخططات.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| ns | const String\& | معرف URI للمساحة الاسمية المرتبط بالمخطط. بالنسبة لمخططات XML، عادةً ما يكون هذا هو **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) الذي يحتوي على المخطط المراد إضافته. |

### ReturnValue

[XmlSchema](../../xmlschema/) المضاف إلى مجموعة المخططات؛ **nullptr** إذا كان المخطط المضاف مخطط XDR أو إذا كانت هناك أخطاء تجميع في المخطط.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


يضيف المخطط الموجود في [XmlReader](../../../system.xml/xmlreader/) إلى مجموعة المخططات. يُستخدم [XmlResolver](../../../system.xml/xmlresolver/) المحدد لحل أي موارد خارجية.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| ns | const String\& | معرف URI للمساحة الاسمية المرتبط بالمخطط. بالنسبة لمخططات XML، عادةً ما يكون هذا هو **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) الذي يحتوي على المخطط المراد إضافته. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) المستخدم لحل المساحات الاسمية المشار إليها في عناصر **include** و **import** أو سمة **x-schema** (مخططات XDR). إذا كان هذا **nullptr**, لن يتم حل المراجع الخارجية. |

### ReturnValue

[XmlSchema](../../xmlschema/) المضاف إلى مجموعة المخططات؛ **nullptr** إذا كان المخطط المضاف مخطط XDR أو إذا كانت هناك أخطاء تجميع في المخطط.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


يضيف المخطط الموجود عبر عنوان URL المحدد إلى مجموعة المخططات.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| ns | const String\& | معرف URI للمساحة الاسمية المرتبط بالمخطط. بالنسبة لمخططات XML، عادةً ما يكون هذا هو **targetNamespace**. |
| uri | const String\& | عنوان URL الذي يحدد المخطط المراد تحميله. |

### ReturnValue

[XmlSchema](../../xmlschema/) المضاف إلى مجموعة المخططات؛ **nullptr** إذا كان المخطط المضاف مخطط XDR أو إذا كانت هناك أخطاء تجميع في المخطط.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
