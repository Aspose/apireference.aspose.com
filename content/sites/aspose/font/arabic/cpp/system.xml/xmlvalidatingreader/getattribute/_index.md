---
title: "طريقة System::Xml::XmlValidatingReader::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlValidatingReader::GetAttribute. تُرجع قيمة السمة ذات الفهرس المحدد في C++."
type: docs
weight: 3200
url: /ar/cpp/system.xml/xmlvalidatingreader/getattribute/
---
## XmlValidatingReader::GetAttribute(int32_t) method


يعيد قيمة السمة ذات الفهرس المحدد.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(int32_t i) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| i | int32_t | فهرس السمة. الفهرس يبدأ من الصفر. (السمة الأولى لها فهرس 0.) |

### ReturnValue

قيمة السمة المحددة.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::GetAttribute(String, String) method


يعيد قيمة السمة ذات الاسم المحلي المحدد ومعرف المورد الموحد (URI) للمساحة الاسمية.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String localName, String namespaceURI) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للخاصية. |
| namespaceURI | String | مسار URI للمساحة الاسمية للخاصية. |

### ReturnValue

قيمة السمة المحددة. إذا لم يتم العثور على السمة، يتم إرجاع **nullptr**. لا تقوم هذه الطريقة بتحريك القارئ.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::GetAttribute(String) method


يعيد قيمة السمة ذات الاسم المحدد.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String name) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المؤهل للسمة. |

### ReturnValue

قيمة السمة المحددة. إذا لم تُعثر على السمة، يتم إرجاع **nullptr**.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
