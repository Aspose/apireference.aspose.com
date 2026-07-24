---
title: "طريقة System::Xml::XmlReader::ReadElementContentAsObject"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReader::ReadElementContentAsObject. يقرأ العنصر الحالي ويعيد المحتويات ككائن Object في C++."
type: docs
weight: 6200
url: /ar/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


يقرأ العنصر الحالي ويعيد المحتويات كـ [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

كائن معبأ من النوع الأنسب. قيمة [XmlReader::get_ValueType](../get_valuetype/) تحدد النوع المناسب. إذا كان المحتوى من نوع قائمة، تُرجع هذه الطريقة مصفوفة من الكائنات المعبأة من النوع المناسب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان ما للعنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات كـ [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعنصر. |
| namespaceURI | String | معرف URI للمساحة الاسمية للعنصر. |

### ReturnValue

كائن معبأ من النوع الأنسب. قيمة [XmlReader::get_ValueType](../get_valuetype/) تحدد النوع المناسب. إذا كان المحتوى من نوع قائمة، تُرجع هذه الطريقة مصفوفة من الكائنات المعبأة من النوع المناسب.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
