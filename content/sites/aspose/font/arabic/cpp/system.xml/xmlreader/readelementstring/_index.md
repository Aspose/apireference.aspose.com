---
title: "System::Xml::XmlReader::ReadElementString method"
linktitle: "ReadElementString"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlReader::ReadElementString method. يقرأ عنصرًا نصيًا فقط. ومع ذلك، يُنصح باستخدام الطريقة XmlReader::ReadElementContentAsString بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية في C++."
type: docs
weight: 6400
url: /ar/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


يقوم بقراءة عنصر نصي فقط. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية.

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

النص الموجود في العنصر الذي تم قراءته. سلسلة فارغة إذا كان العنصر فارغًا.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String, String) method


يتحقق من أن قيمتي [XmlReader::get_LocalName](../get_localname/) و[XmlReader::get_NamespaceURI](../get_namespaceuri/) للعنصر الموجود تطابق السلاسل المعطاة قبل قراءة عنصر نصي فقط. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الاسم المحلي | String | الاسم المحلي للتحقق منه. |
| ns | String | معرف مساحة الاسم للتحقق منه. |

### ReturnValue

النص الموجود في العنصر الذي تم قراءته. سلسلة فارغة إذا كان العنصر فارغًا.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String) method


يتحقق من أن قيمة [XmlReader::get_Name](../get_name/) للعنصر الموجود تطابق السلسلة المعطاة قبل قراءة عنصر نصي فقط. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم للتحقق منه. |

### ReturnValue

النص الموجود في العنصر الذي تم قراءته. سلسلة فارغة إذا كان العنصر فارغًا.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
