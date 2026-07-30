---
title: "System::Xml::XmlParserContext::XmlParserContext مُنشئ"
linktitle: "XmlParserContext"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Xml::XmlParserContext::XmlParserContext. يهيئ مثيلاً جديداً لفئة XmlParserContext مع XmlNameTable المحدد، XmlNamespaceManager، عنوان URI الأساسي، xml:lang، xml:space، وقيم نوع المستند في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


يهيئ مثيلاً جديداً للفئة [XmlParserContext](../) مع [XmlNameTable](../../xmlnametable/) المحدد، [XmlNamespaceManager](../../xmlnamespacemanager/)، عنوان URI الأساسي، **xml:lang**، **xml:space**، وقيم نوع المستند.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ [XmlNameTable](../../xmlnametable/) لاستخدامه في تجزئة السلاسل. إذا كان هذا **nullptr**، يتم استخدام جدول الأسماء المستخدم لإنشاء **nsMgr** بدلاً من ذلك. لمزيد من المعلومات حول السلاسل المجزأة، راجع [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | الـ [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في البحث عن معلومات الفضاء الاسمي، أو **nullptr**. |
| docTypeName | const String\& | اسم إعلان نوع المستند. |
| pubId | const String\& | المعرّف العام. |
| sysId | const String\& | معرف النظام. |
| internalSubset | const String\& | المجموعة الداخلية لـ DTD. تُستخدم مجموعة DTD لحل الكيانات، وليس للتحقق من صحة المستند. |
| baseURI | const String\& | عنوان URI الأساسي لجزء XML (الموقع الذي تم تحميل الجزء منه). |
| xmlLang | const String\& | نطاق **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | قيمة [XmlSpace](../../xmlspace/) تشير إلى نطاق **xml:space**. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


يهيئ مثيلاً جديداً للفئة [XmlParserContext](../) مع [XmlNameTable](../../xmlnametable/) المحدد، [XmlNamespaceManager](../../xmlnamespacemanager/)، عنوان URI الأساسي، **xml:lang**، **xml:space**، الترميز، وقيم نوع المستند.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ [XmlNameTable](../../xmlnametable/) لاستخدامه في تجزئة السلاسل. إذا كان هذا **nullptr**، يتم استخدام جدول الأسماء المستخدم لإنشاء **nsMgr** بدلاً من ذلك. لمزيد من المعلومات حول السلاسل المجزأة، راجع [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | الـ [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في البحث عن معلومات الفضاء الاسمي، أو **nullptr**. |
| docTypeName | const String\& | اسم إعلان نوع المستند. |
| pubId | const String\& | المعرّف العام. |
| sysId | const String\& | معرف النظام. |
| internalSubset | const String\& | المجموعة الداخلية لـ DTD. يُستخدم DTD لحل الكيانات، وليس للتحقق من صحة المستند. |
| baseURI | const String\& | عنوان URI الأساسي لجزء XML (الموقع الذي تم تحميل الجزء منه). |
| xmlLang | const String\& | نطاق **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | قيمة [XmlSpace](../../xmlspace/) تشير إلى نطاق **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | كائن Encoding يوضح إعداد الترميز. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


يهيئ مثيلاً جديداً للفئة [XmlParserContext](../) مع [XmlNameTable](../../xmlnametable/) المحدد، [XmlNamespaceManager](../../xmlnamespacemanager/)، قيم **xml:lang** و **xml:space**.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ [XmlNameTable](../../xmlnametable/) لاستخدامه في تجزئة السلاسل. إذا كان هذا **nullptr**، يتم استخدام جدول الأسماء المستخدم لإنشاء **nsMgr** بدلاً من ذلك. لمزيد من المعلومات حول السلاسل المجزأة، راجع [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | الـ [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في البحث عن معلومات الفضاء الاسمي، أو **nullptr**. |
| xmlLang | const String\& | نطاق **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | قيمة [XmlSpace](../../xmlspace/) تشير إلى نطاق **xml:space**. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


يهيئ مثيلاً جديداً للفئة [XmlParserContext](../) مع [XmlNameTable](../../xmlnametable/) المحدد، [XmlNamespaceManager](../../xmlnamespacemanager/)، **xml:lang**، **xml:space**، والترميز.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | الـ [XmlNameTable](../../xmlnametable/) لاستخدامه في تجزئة السلاسل. إذا كان هذا **nullptr**، يتم استخدام جدول الأسماء المستخدم لإنشاء **nsMgr** بدلاً من ذلك. لمزيد من المعلومات حول السلاسل المجزأة، راجع [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | الـ [XmlNamespaceManager](../../xmlnamespacemanager/) لاستخدامه في البحث عن معلومات الفضاء الاسمي، أو **nullptr**. |
| xmlLang | const String\& | نطاق **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | قيمة [XmlSpace](../../xmlspace/) تشير إلى نطاق **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | كائن Encoding يوضح إعداد الترميز. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
