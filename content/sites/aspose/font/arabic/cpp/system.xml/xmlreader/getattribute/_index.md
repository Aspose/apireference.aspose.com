---
title: "طريقة System::Xml::XmlReader::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::GetAttribute. عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات الفهرس المحدد في C++."
type: docs
weight: 2800
url: /ar/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات الفهرس المحدد.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| i | int32_t | فهرس السمة. الفهرس يبدأ من الصفر. (السمة الأولى لها فهرس 0.) |

### ReturnValue

قيمة السمة المحددة. لا تقوم هذه الطريقة بتحريك القارئ.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String) method


عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيمة المحددة في [XmlReader::get_Name](../get_name/).

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المؤهل للسمة. |

### ReturnValue

قيمة السمة المحددة. إذا لم تُعثر على السمة أو كانت القيمة [String::Empty](../../../system/string/empty/)، تُعاد **nullptr**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String, String) method


عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيم المحددة في [XmlReader::get_LocalName](../get_localname/) و[XmlReader::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المحلي للخاصية. |
| namespaceURI | String | مسار URI للمساحة الاسمية للخاصية. |

### ReturnValue

قيمة السمة المحددة. إذا لم يتم العثور على السمة أو كانت القيمة [String::Empty](../../../system/string/empty/)، **nullptr** يتم إرجاعها. هذه الطريقة لا تحرك القارئ.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
