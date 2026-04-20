---
title: "طريقة System::Xml::XmlReader::ReadElementContentAsObject"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::ReadElementContentAsObject. تقرأ العنصر الحالي وتعيد المحتويات ككائن Object في C++."
type: docs
weight: 6200
url: /ar/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


تقرأ العنصر الحالي وتعيد المحتويات كـ [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

كائن معبأ من النوع الأنسب. قيمة [XmlReader::get_ValueType](../get_valuetype/) تحدد النوع المناسب. إذا كان المحتوى من نوع قائمة، فإن هذه الطريقة تُرجع مصفوفة من الكائنات المعبأة من النوع المناسب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


يتحقق من أن الاسم المحلي المحدد وURI مساحة الاسم يطابقان ما للعنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات كـ [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعنصر. |
| namespaceURI | String | معرف مساحة الاسم (URI) للعنصر. |

### ReturnValue

كائن معبأ من النوع الأنسب. قيمة [XmlReader::get_ValueType](../get_valuetype/) تحدد النوع المناسب. إذا كان المحتوى من نوع قائمة، فإن هذه الطريقة تُرجع مصفوفة من الكائنات المعبأة من النوع المناسب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
