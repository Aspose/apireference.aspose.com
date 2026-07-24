---
title: "System::Xml::XmlTextReader::GetAttribute method"
linktitle: "GetAttribute"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlTextReader::GetAttribute method. تُرجع قيمة السمة ذات الفهرس المحدد في C++."
type: docs
weight: 3300
url: /ar/cpp/system.xml/xmltextreader/getattribute/
---
## XmlTextReader::GetAttribute(int32_t) method


يعيد قيمة السمة ذات الفهرس المحدد.

```cpp
String System::Xml::XmlTextReader::GetAttribute(int32_t i) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| i | int32_t | فهرس السمة. الفهرس يبدأ من الصفر. (السمة الأولى لها فهرس 0.) |

### ReturnValue

قيمة السمة المحددة.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String, String) method


يعيد قيمة السمة ذات الاسم المحلي المحدد وURI مساحة الاسم.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String localName, String namespaceURI) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للسمة. |
| namespaceURI | String | مسار مساحة الاسم للسمة. |

### ReturnValue

قيمة السمة المحددة. إذا لم تُعثر على السمة، يتم إرجاع **nullptr**. هذه الطريقة لا تحرك القارئ.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String) method


يعيد قيمة السمة ذات الاسم المحدد.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String name) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المؤهل للخاصية. |

### ReturnValue

قيمة السمة المحددة. إذا لم تُعثر على السمة، يتم إرجاع **nullptr**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
