---
title: "System::Xml::XmlReader::MoveToAttribute method"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlReader::MoveToAttribute method. عند تجاوزها في فئة مشتقة، تنتقل إلى السمة ذات الفهرس المحدد في C++."
type: docs
weight: 3200
url: /ar/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


عند تجاوزها في فئة مشتقة، ينتقل إلى السمة ذات الفهرس المحدد.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| i | int32_t | فهرس الخاصية. |

## انظر أيضًا

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


عند تجاوزها في فئة مشتقة، تنتقل إلى السمة ذات القيمة المحددة لـ [XmlReader::get_Name](../get_name/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المؤهل للخاصية. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


عند تجاوزها في فئة مشتقة، تنتقل إلى السمة ذات القيم المحددة لـ [XmlReader::get_LocalName](../get_localname/) و [XmlReader::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المحلي للسمة. |
| ns | String | مسار مساحة الاسم للسمة. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
