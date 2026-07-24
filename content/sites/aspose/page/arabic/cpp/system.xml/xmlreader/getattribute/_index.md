---
title: "طريقة System::Xml::XmlReader::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Page لـ C++"
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


| Parameter | Type | الوصف |
| --- | --- | --- |
| i | int32_t | فهرس السمة. الفهرس يبدأ من الصفر. (السمة الأولى لها فهرس 0.) |

### ReturnValue

قيمة السمة المحددة. هذه الطريقة لا تحرك القارئ.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String) method


عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيمة المحددة في [XmlReader::get_Name](../get_name/).

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المؤهل للخاصية. |

### ReturnValue

قيمة السمة المحددة. إذا لم يتم العثور على السمة أو كانت القيمة هي [String::Empty](../../../system/string/empty/)، يتم إرجاع **nullptr**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String, String) method


عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيم المحددة في [XmlReader::get_LocalName](../get_localname/) و[XmlReader::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المحلي للسمة. |
| namespaceURI | String | مسار مساحة الاسم للسمة. |

### ReturnValue

قيمة السمة المحددة. إذا لم يتم العثور على السمة أو كانت القيمة هي [String::Empty](../../../system/string/empty/)، يتم إرجاع **nullptr**. هذه الطريقة لا تحرك القارئ.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
