---
title: "منشئ System::Xml::XmlParserContext::XmlParserContext"
linktitle: "XmlParserContext"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::Xml::XmlParserContext::XmlParserContext. يهيئ نسخة جديدة من فئة XmlParserContext مع XmlNameTable المحدد، XmlNamespaceManager، عنوان URI الأساسي، xml:lang، xml:space، وقيم نوع المستند في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


يُهيئ نسخة جديدة من الفئة [XmlParserContext](../) مع [XmlNameTable](../../xmlnametable/) المحدد، [XmlNamespaceManager](../../xmlnamespacemanager/)، عنوان URI الأساسي، **xml:lang**، **xml:space**، وقيم نوع المستند.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ [XmlNameTable](../../xmlnametable/) لاستخدامه في تجميع السلاسل. إذا كان هذا **nullptr**، يُستَخدم جدول الأسماء المستخدم لإنشاء **nsMgr** بدلاً من ذلك. لمزيد من المعلومات حول السلاسل المُجمَّعة، راجع [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | الـ [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في البحث عن معلومات النطاق، أو **nullptr**. |
| docTypeName | const String\& | اسم إعلان نوع المستند. |
| pubId | const String\& | المعرّف العام. |
| sysId | const String\& | معرف النظام. |
| internalSubset | const String\& | مجموعة DTD الداخلية. تُستخدم مجموعة DTD لحل الكيانات، وليس للتحقق من صحة المستند. |
| baseURI | const String\& | عنوان URI الأساسي لجزء XML (الموقع الذي تم تحميل الجزء منه). |
| xmlLang | const String\& | نطاق **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | قيمة [XmlSpace](../../xmlspace/) تُشير إلى نطاق **xml:space**. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


يُنشئ مثيلًا جديدًا من الفئة [XmlParserContext](../) بالمعلمات المحددة [XmlNameTable](../../xmlnametable/)، [XmlNamespaceManager](../../xmlnamespacemanager/)، عنوان URI الأساسي، **xml:lang**، **xml:space**، الترميز، وقيم نوع المستند.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ [XmlNameTable](../../xmlnametable/) لاستخدامه في تجميع السلاسل. إذا كان هذا **nullptr**، يُستَخدم جدول الأسماء المستخدم لإنشاء **nsMgr** بدلاً من ذلك. لمزيد من المعلومات حول السلاسل المُجمَّعة، راجع [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | الـ [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في البحث عن معلومات النطاق، أو **nullptr**. |
| docTypeName | const String\& | اسم إعلان نوع المستند. |
| pubId | const String\& | المعرّف العام. |
| sysId | const String\& | معرف النظام. |
| internalSubset | const String\& | مجموعة DTD الداخلية. تُستخدم DTD لحل الكيانات، وليس للتحقق من صحة المستند. |
| baseURI | const String\& | عنوان URI الأساسي لجزء XML (الموقع الذي تم تحميل الجزء منه). |
| xmlLang | const String\& | نطاق **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | قيمة [XmlSpace](../../xmlspace/) تُشير إلى نطاق **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | كائن Encoding يحدد إعداد الترميز. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


يُنشئ مثيلًا جديدًا من الفئة [XmlParserContext](../) بالمعلمات المحددة [XmlNameTable](../../xmlnametable/)، [XmlNamespaceManager](../../xmlnamespacemanager/)، قيم **xml:lang** و **xml:space**.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ [XmlNameTable](../../xmlnametable/) لاستخدامه في تجميع السلاسل. إذا كان هذا **nullptr**، يُستَخدم جدول الأسماء المستخدم لإنشاء **nsMgr** بدلاً من ذلك. لمزيد من المعلومات حول السلاسل المُجمَّعة، راجع [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | الـ [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في البحث عن معلومات النطاق، أو **nullptr**. |
| xmlLang | const String\& | نطاق **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | قيمة [XmlSpace](../../xmlspace/) تُشير إلى نطاق **xml:space**. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


يُنشئ مثيلًا جديدًا من الفئة [XmlParserContext](../) بالمعلمات المحددة [XmlNameTable](../../xmlnametable/)، [XmlNamespaceManager](../../xmlnamespacemanager/)، **xml:lang**، **xml:space**، والترميز.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ [XmlNameTable](../../xmlnametable/) لاستخدامه في تجزئة السلاسل. إذا كان هذا **nullptr**، يُستَخدم جدول الأسماء المستخدم لإنشاء **nsMgr** بدلاً من ذلك. لمزيد من المعلومات حول السلاسل المجزأة، راجع [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | الـ [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في البحث عن معلومات النطاق، أو **nullptr**. |
| xmlLang | const String\& | نطاق **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | قيمة [XmlSpace](../../xmlspace/) تُشير إلى نطاق **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | كائن Encoding يحدد إعداد الترميز. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
