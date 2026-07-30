---
title: "طريقة System::Xml::XmlTextReader::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlTextReader::GetAttribute. إرجاع قيمة السمة ذات الفهرس المحدد في C++."
type: docs
weight: 3300
url: /ar/cpp/system.xml/xmltextreader/getattribute/
---
## XmlTextReader::GetAttribute(int32_t) method


يعيد قيمة السمة ذات الفهرس المحدد.

```cpp
String System::Xml::XmlTextReader::GetAttribute(int32_t i) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| i | int32_t | فهرس السمة. الفهرس يبدأ من الصفر. (السمة الأولى لها فهرس 0.) |

### ReturnValue

قيمة السمة المحددة.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::GetAttribute(String, String) method


يعيد قيمة السمة ذات الاسم المحلي المحدد ومسار URI مساحة الاسم.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String localName, String namespaceURI) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للخاصية. |
| namespaceURI | String | مسار URI للمساحة الاسمية للخاصية. |

### ReturnValue

قيمة السمة المحددة. إذا لم يتم العثور على السمة، يتم إرجاع **nullptr**. لا تقوم هذه الطريقة بتحريك القارئ.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::GetAttribute(String) method


يعيد قيمة السمة ذات الاسم المحدد.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String name) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المؤهل للسمة. |

### ReturnValue

قيمة السمة المحددة. إذا لم تُعثر على السمة، يتم إرجاع **nullptr**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
