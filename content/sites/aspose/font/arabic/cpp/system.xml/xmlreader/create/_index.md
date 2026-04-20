---
title: "طريقة System::Xml::XmlReader::Create"
linktitle: "Create"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::Create. تنشئ كائن XmlReader جديد باستخدام الدفق المحدد مع الإعدادات الافتراضية في C++."
type: docs
weight: 7700
url: /ar/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


تنشئ كائن [XmlReader](../) جديد باستخدام الدفق المحدد مع الإعدادات الافتراضية.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| معامل | نوع | الوصف |
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
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


ينشئ كائن [XmlReader](../) جديد باستخدام الدفق المحدد والإعدادات.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML. يقوم [XmlReader](../) بمسح البايتات الأولى من الدفق بحثًا عن علامة ترتيب البايت أو أي إشارة أخرى للترميز. عندما يتم تحديد الترميز، يُستخدم الترميز لمتابعة قراءة الدفق، وتستمر المعالجة في تحليل الإدخال كدفق من الأحرف (Unicode). |
| settings | const SharedPtr\<XmlReaderSettings\>\& | الإعدادات الخاصة بكائن [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


ينشئ مثيلاً جديدًا من [XmlReader](../) باستخدام الدفق المحدد، والإعدادات، ومعلومات السياق للتحليل.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML. يقوم [XmlReader](../) بمسح البايتات الأولى من الدفق بحثًا عن علامة ترتيب البايت أو أي إشارة أخرى للترميز. عندما يتم تحديد الترميز، يُستخدم الترميز لمتابعة قراءة الدفق، وتستمر المعالجة في تحليل الإدخال كدفق من الأحرف (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بكائن [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | معلومات السياق المطلوبة لتحليل جزء XML. يمكن أن تشمل معلومات السياق [XmlNameTable](../../xmlnametable/) للاستخدام، الترميز، نطاق مساحة الأسماء، نطاق **xml:lang** و**xml:space** الحالي، عنوان URI الأساسي، وتعريف نوع المستند. يمكن أن تكون هذه القيمة **nullptr**. |

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
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


ينشئ مثيلاً جديدًا من [XmlReader](../) باستخدام الدفق المحدد، وعنوان URI الأساسي، والإعدادات.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | الدفق الذي يحتوي على بيانات XML. يقوم [XmlReader](../) بمسح البايتات الأولى من الدفق بحثًا عن علامة ترتيب البايت أو أي إشارة أخرى للترميز. عندما يتم تحديد الترميز، يُستخدم الترميز لمتابعة قراءة الدفق، وتستمر المعالجة في تحليل الإدخال كدفق من الأحرف (Unicode). |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بكائن [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| baseUri | const String\& | عنوان URI الأساسي للكيان أو المستند الذي يتم قراءته. يمكن أن تكون هذه القيمة **nullptr**. **[Security](../../../system.security/) ملاحظة** يُستخدم عنوان URI الأساسي لحل عنوان URI النسبي لمستند XML. لا تستخدم عنوان URI أساسي من مصدر غير موثوق. |

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
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


ينشئ مثيلاً جديدًا من [XmlReader](../) باستخدام قارئ النص المحدد.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص الذي تُقرأ منه بيانات XML. يُعيد قارئ النص دفقًا من الأحرف Unicode، لذا لا يستخدم القارئ XML الترميز المحدد في إعلان XML لفك تشفير دفق البيانات. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


ينشئ مثيلاً جديدًا من [XmlReader](../) باستخدام قارئ النص المحدد والإعدادات.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص الذي تُقرأ منه بيانات XML. يُعيد قارئ النص دفقًا من الأحرف Unicode، لذا لا يستخدم القارئ XML الترميز المحدد في إعلان XML لفك تشفير دفق البيانات. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | الإعدادات للمثيل الجديد من [XmlReader](../). يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


ينشئ مثيلاً جديدًا من [XmlReader](../) باستخدام قارئ النص المحدد، والإعدادات، ومعلومات السياق للتحليل.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | const SharedPtr\<IO::TextReader\>\& | قارئ النص الذي تُقرأ منه بيانات XML. يُعيد قارئ النص دفقًا من الأحرف Unicode، لذا لا يستخدم القارئ XML الترميز المحدد في إعلان XML لفك تشفير دفق البيانات. |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بكائن [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | معلومات السياق المطلوبة لتحليل جزء XML. يمكن أن تشمل معلومات السياق [XmlNameTable](../../xmlnametable/) للاستخدام، الترميز، نطاق مساحة الأسماء، نطاق **xml:lang** و**xml:space** الحالي، عنوان URI الأساسي، وتعريف نوع المستند. يمكن أن تكون هذه القيمة **nullptr**. |

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
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


ينشئ مثيلاً جديدًا من [XmlReader](../) باستخدام قارئ النص المحدد، والإعدادات، وعنوان URI الأساسي.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | قارئ النص الذي تُقرأ منه بيانات XML. يُعيد قارئ النص دفقًا من الأحرف Unicode، لذا لا يستخدم [XmlReader](../) الترميز المحدد في إعلان XML لفك تشفير دفق البيانات. |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بكائن [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| baseUri | const String\& | عنوان URI الأساسي للكيان أو المستند الذي يتم قراءته. يمكن أن تكون هذه القيمة **nullptr**. **[Security](../../../system.security/) ملاحظة** يُستخدم عنوان URI الأساسي لحل عنوان URI النسبي لمستند XML. لا تستخدم عنوان URI أساسي من مصدر غير موثوق. |

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
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


ينشئ مثيلاً جديدًا من [XmlReader](../) باستخدام قارئ XML المحدد والإعدادات.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قارئ | const SharedPtr\<XmlReader\>\& | الكائن الذي تريد استخدامه كقارئ XML الأساسي. |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات للمثيل الجديد من [XmlReader](../). يجب أن يتطابق مستوى التوافق لكائن [XmlReaderSettings](../../xmlreadersettings/) إما مع مستوى التوافق للقارئ الأساسي، أو يجب ضبطه على [ConformanceLevel::Auto](../../conformancelevel/). |

### ReturnValue

كائن يُلف حول كائن [XmlReader](../) المحدد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&) method


ينشئ مثيلاً جديدًا من [XmlReader](../) بعنوان URI محدد.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputUri | const String\& | عنوان URI للملف الذي يحتوي على بيانات XML. تُستخدم الفئة [XmlUrlResolver](../../xmlurlresolver/) لتحويل المسار إلى تمثيل بيانات قياسي. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


ينشئ مثيلاً جديدًا من [XmlReader](../) باستخدام عنوان URI المحدد والإعدادات.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputUri | const String\& | عنوان URI للملف الذي يحتوي على بيانات XML. يُستخدم كائن [XmlResolver](../../xmlresolver/) الموجود في كائن [XmlReaderSettings](../../xmlreadersettings/) لتحويل المسار إلى تمثيل بيانات قياسي. إذا كانت قيمة XmlReaderSettings::get_XmlResolver هي **nullptr**, يُستخدم كائن جديد من [XmlUrlResolver](../../xmlurlresolver/). |
| settings | const SharedPtr\<XmlReaderSettings\>\& | الإعدادات الخاصة بكائن [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |

### ReturnValue

كائن يُستخدم لقراءة بيانات XML في الدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


ينشئ مثيلاً جديدًا من [XmlReader](../) باستخدام عنوان URI المحدد، والإعدادات، ومعلومات السياق للتحليل.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputUri | const String\& | عنوان URI للملف الذي يحتوي على بيانات XML. يُستخدم كائن [XmlResolver](../../xmlresolver/) الموجود في كائن [XmlReaderSettings](../../xmlreadersettings/) لتحويل المسار إلى تمثيل بيانات قياسي. إذا كانت قيمة XmlReaderSettings::get_XmlResolver هي **nullptr**, يُستخدم كائن جديد من [XmlUrlResolver](../../xmlurlresolver/). |
| settings | SharedPtr\<XmlReaderSettings\> | الإعدادات الخاصة بكائن [XmlReader](../) الجديد. يمكن أن تكون هذه القيمة **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | معلومات السياق المطلوبة لتحليل جزء XML. يمكن أن تشمل معلومات السياق [XmlNameTable](../../xmlnametable/) للاستخدام، الترميز، نطاق مساحة الأسماء، نطاق **xml:lang** و**xml:space** الحالي، عنوان URI الأساسي، وتعريف نوع المستند. يمكن أن تكون هذه القيمة **nullptr**. |

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
* Library [Aspose.Font for C++](../../../)
