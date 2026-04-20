---
title: "طريقة System::Xml::XmlReader::MoveToAttribute"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::MoveToAttribute. عند تجاوزها في فئة مشتقة، تنتقل إلى السمة ذات الفهرس المحدد في C++."
type: docs
weight: 3200
url: /ar/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


عند تجاوزها في فئة مشتقة، تنتقل إلى السمة ذات الفهرس المحدد.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| i | int32_t | فهرس السمة. |

## انظر أيضًا

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String) method


عند تجاوزها في فئة مشتقة، تنتقل إلى السمة ذات القيمة المحددة لـ [XmlReader::get_Name](../get_name/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المؤهل للسمة. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


عند تجاوزها في فئة مشتقة، تنتقل إلى السمة ذات القيم المحددة لـ [XmlReader::get_LocalName](../get_localname/) و [XmlReader::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المحلي للخاصية. |
| ns | String | مسار URI للمساحة الاسمية للخاصية. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
