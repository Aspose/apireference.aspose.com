---
title: "طريقة System::Xml::XmlReader::Create"
linktitle: "Create"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReader::Create. تنشئ مثالًا جديدًا من XmlReader باستخدام الدفق المحدد مع الإعدادات الافتراضية في C++."
type: docs
weight: 7700
url: /ar/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


ينشئ مثالًا جديدًا من [XmlReader](../) باستخدام الدفق المحدد مع الإعدادات الافتراضية.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML. يقوم [XmlReader](../) بمسح البايتات الأولى من الدفق بحثًا عن علامة ترتيب البايت أو أي إشارة أخرى للترميز. عندما يتم تحديد الترميز، يُستخدم الترميز لمتابعة قراءة الدفق، وتستمر المعالجة في تحليل الإدخال كدفق من الأحرف (Unicode). |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


ينشئ مثالًا جديدًا من [XmlReader](../) باستخدام الدفق المحدد والإعدادات.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML. يقوم [XmlReader](../) بمسح البايتات الأولى من الدفق بحثًا عن علامة ترتيب البايت أو أي إشارة أخرى للترميز. عندما يتم تحديد الترميز، يُستخدم الترميز لمتابعة قراءة الدفق، وتستمر المعالجة في تحليل الإدخال كدفق من الأحرف (Unicode). |
| settings | const SharedPtr\<XmlReaderSettings\>\& | الإعدادات الخاصة بمثال [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


ينشئ مثالًا جديدًا من [XmlReader](../) باستخدام الدفق المحدد والإعدادات ومعلومات السياق للتحليل.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML. يقوم [XmlReader](../) بمسح البايتات الأولى من الدفق بحثًا عن علامة ترتيب البايت أو أي إشارة أخرى للترميز. عندما يتم تحديد الترميز، يُستخدم الترميز لمتابعة قراءة الدفق، وتستمر المعالجة في تحليل الإدخال كدفق من الأحرف (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بمثال [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | معلومات السياق المطلوبة لتحليل جزء XML. يمكن أن تشمل معلومات السياق الـ [XmlNameTable](../../xmlnametable/) المراد استخدامها، والترميز، ونطاق مساحة الأسماء، ونطاق **xml:lang** و**xml:space** الحاليين، وURI الأساسي، وتعريف نوع المستند. يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


ينشئ مثالًا جديدًا من [XmlReader](../) باستخدام الدفق المحدد وURI الأساسي والإعدادات.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML. يقوم [XmlReader](../) بمسح البايتات الأولى من الدفق بحثًا عن علامة ترتيب البايت أو أي إشارة أخرى للترميز. عندما يتم تحديد الترميز، يُستخدم الترميز لمتابعة قراءة الدفق، وتستمر المعالجة في تحليل الإدخال كدفق من الأحرف (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بمثال [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| baseUri | const String\& | URI الأساسي للكيان أو المستند الجاري قراءته. يمكن أن تكون هذه القيمة **nullptr**. **[Security](../../../system.security/) Note** يُستخدم URI الأساسي لحل URI النسبي لمستند XML. لا تستخدم URI أساسي من مصدر غير موثوق. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


إنشاء نسخة جديدة من [XmlReader](../) باستخدام قارئ النص المحدد.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص الذي يتم منه قراءة بيانات XML. يُعيد قارئ النص تدفقًا من الأحرف Unicode، لذا لا يستخدم القارئ XML الترميز المحدد في إعلان XML لفك ترميز تدفق البيانات. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


إنشاء نسخة جديدة من [XmlReader](../) باستخدام قارئ النص المحدد والإعدادات.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص الذي يتم منه قراءة بيانات XML. يُعيد قارئ النص تدفقًا من الأحرف Unicode، لذا لا يستخدم القارئ XML الترميز المحدد في إعلان XML لفك ترميز تدفق البيانات. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | الإعدادات للـ [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


إنشاء نسخة جديدة من [XmlReader](../) باستخدام قارئ النص المحدد، والإعدادات، ومعلومات السياق للتحليل.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص الذي يتم منه قراءة بيانات XML. يُعيد قارئ النص تدفقًا من الأحرف Unicode، لذا لا يستخدم القارئ XML الترميز المحدد في إعلان XML لفك ترميز تدفق البيانات. |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بمثال [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | معلومات السياق المطلوبة لتحليل جزء XML. يمكن أن تشمل معلومات السياق الـ [XmlNameTable](../../xmlnametable/) المراد استخدامها، والترميز، ونطاق مساحة الأسماء، ونطاق **xml:lang** و**xml:space** الحاليين، وURI الأساسي، وتعريف نوع المستند. يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


إنشاء نسخة جديدة من [XmlReader](../) باستخدام قارئ النص المحدد، والإعدادات، وURI الأساسي.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | قارئ النص الذي يتم منه قراءة بيانات XML. يُعيد قارئ النص تدفقًا من الأحرف Unicode، لذا لا يستخدم [XmlReader](../) الترميز المحدد في إعلان XML لفك ترميز تدفق البيانات. |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بمثال [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| baseUri | const String\& | URI الأساسي للكيان أو المستند الجاري قراءته. يمكن أن تكون هذه القيمة **nullptr**. **[Security](../../../system.security/) Note** يُستخدم URI الأساسي لحل URI النسبي لمستند XML. لا تستخدم URI أساسي من مصدر غير موثوق. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


إنشاء نسخة جديدة من [XmlReader](../) باستخدام قارئ XML المحدد والإعدادات.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| القارئ | const SharedPtr\<XmlReader\>\& | الكائن الذي تريد استخدامه كقارئ XML الأساسي. |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات للنسخة الجديدة من [XmlReader](../). يجب أن يتطابق مستوى التوافق لكائن [XmlReaderSettings](../../xmlreadersettings/) إما مع مستوى التوافق للقارئ الأساسي، أو يجب ضبطه على [ConformanceLevel::Auto](../../conformancelevel/). |

### ReturnValue

كائن يتم تغليفه حول كائن [XmlReader](../) المحدد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&) method


إنشاء نسخة جديدة من [XmlReader](../) باستخدام URI المحدد.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputUri | const String\& | URI للملف الذي يحتوي على بيانات XML. تُستخدم الفئة [XmlUrlResolver](../../xmlurlresolver/) لتحويل المسار إلى تمثيل بيانات قياسي. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


إنشاء نسخة جديدة من [XmlReader](../) باستخدام URI والإعدادات المحددين.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputUri | const String\& | URI للملف الذي يحتوي على بيانات XML. يُستخدم كائن [XmlResolver](../../xmlresolver/) الموجود في كائن [XmlReaderSettings](../../xmlreadersettings/) لتحويل المسار إلى تمثيل بيانات قياسي. إذا كانت قيمة XmlReaderSettings::get_XmlResolver هي **nullptr**, يتم استخدام كائن [XmlUrlResolver](../../xmlurlresolver/) جديد. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | الإعدادات الخاصة بمثال [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


إنشاء نسخة جديدة من [XmlReader](../) باستخدام URI، والإعدادات، ومعلومات السياق للتحليل.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputUri | const String\& | URI للملف الذي يحتوي على بيانات XML. يُستخدم كائن [XmlResolver](../../xmlresolver/) الموجود في كائن [XmlReaderSettings](../../xmlreadersettings/) لتحويل المسار إلى تمثيل بيانات قياسي. إذا كانت قيمة XmlReaderSettings::get_XmlResolver هي **nullptr**, يتم استخدام كائن [XmlUrlResolver](../../xmlurlresolver/) جديد. |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بمثال [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | معلومات السياق المطلوبة لتحليل جزء XML. يمكن أن تشمل معلومات السياق الـ [XmlNameTable](../../xmlnametable/) المراد استخدامها، والترميز، ونطاق مساحة الأسماء، ونطاق **xml:lang** و**xml:space** الحاليين، وURI الأساسي، وتعريف نوع المستند. يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
