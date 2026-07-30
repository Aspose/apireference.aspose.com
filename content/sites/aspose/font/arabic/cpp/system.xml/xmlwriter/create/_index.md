---
title: "System::Xml::XmlWriter::Create method"
linktitle: "Create"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlWriter::Create method. ينشئ مثيلًا جديدًا من XmlWriter باستخدام الدفق المحدد في C++."
type: docs
weight: 3700
url: /ar/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام الدفق المحدد.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد الكتابة إليه. يقوم [XmlWriter](../) بكتابة صيغة نص XML 1.0 ويضيفها إلى الدفق المحدد. |

### ReturnValue

كائن [XmlWriter](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام الدفق وكائن [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | الدفق الذي تريد الكتابة إليه. يقوم [XmlWriter](../) بكتابة صيغة نص XML 1.0 ويضيفها إلى الدفق المحدد. |
| settings | SharedPtr\<XmlWriterSettings\> | كائن [XmlWriterSettings](../../xmlwritersettings/) المستخدم لتكوين مثيل [XmlWriter](../) الجديد. إذا كان هذا **nullptr**، يتم استخدام [XmlWriterSettings](../../xmlwritersettings/) بإعدادات افتراضية. إذا كان يتم استخدام [XmlWriter](../) مع طريقة XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)، يجب عليك استخدام قيمة XslCompiledTransform::get_OutputSettings للحصول على كائن [XmlWriterSettings](../../xmlwritersettings/) بالإعدادات الصحيحة. هذا يضمن أن كائن [XmlWriter](../) المُنشأ يحتوي على إعدادات الإخراج الصحيحة. |

### ReturnValue

كائن [XmlWriter](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام الـ TextWriter المحدد.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | الـ TextWriter الذي تريد الكتابة إليه. يقوم [XmlWriter](../) بكتابة صيغة نص XML 1.0 ويضيفها إلى الـ TextWriter المحدد. |

### ReturnValue

كائن [XmlWriter](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام الـ TextWriter وكائنات [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | الـ TextWriter الذي تريد الكتابة إليه. يقوم [XmlWriter](../) بكتابة صيغة نص XML 1.0 ويضيفها إلى الـ TextWriter المحدد. |
| settings | SharedPtr\<XmlWriterSettings\> | كائن [XmlWriterSettings](../../xmlwritersettings/) المستخدم لتكوين مثيل [XmlWriter](../) الجديد. إذا كان هذا **nullptr**، يتم استخدام [XmlWriterSettings](../../xmlwritersettings/) بإعدادات افتراضية. إذا كان يتم استخدام [XmlWriter](../) مع طريقة XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)، يجب عليك استخدام قيمة XslCompiledTransform::get_OutputSettings للحصول على كائن [XmlWriterSettings](../../xmlwritersettings/) بالإعدادات الصحيحة. هذا يضمن أن كائن [XmlWriter](../) المُنشأ يحتوي على إعدادات الإخراج الصحيحة. |

### ReturnValue

كائن [XmlWriter](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام الـ [Text::StringBuilder](../../../system.text/stringbuilder/) المحدد.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | الـ [Text::StringBuilder](../../../system.text/stringbuilder/) الذي ستكتب إليه. المحتوى الذي يكتبه [XmlWriter](../) يُضاف إلى الـ [Text::StringBuilder](../../../system.text/stringbuilder/). |

### ReturnValue

كائن [XmlWriter](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام الـ [Text::StringBuilder](../../../system.text/stringbuilder/) وكائنات [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | الـ [Text::StringBuilder](../../../system.text/stringbuilder/) الذي ستكتب إليه. المحتوى الذي يكتبه [XmlWriter](../) يُضاف إلى الـ [Text::StringBuilder](../../../system.text/stringbuilder/). |
| settings | SharedPtr\<XmlWriterSettings\> | كائن [XmlWriterSettings](../../xmlwritersettings/) المستخدم لتكوين مثيل [XmlWriter](../) الجديد. إذا كان هذا **nullptr**، يتم استخدام [XmlWriterSettings](../../xmlwritersettings/) بإعدادات افتراضية. إذا كان يتم استخدام [XmlWriter](../) مع طريقة XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)، يجب عليك استخدام قيمة XslCompiledTransform::get_OutputSettings للحصول على كائن [XmlWriterSettings](../../xmlwritersettings/) بالإعدادات الصحيحة. هذا يضمن أن كائن [XmlWriter](../) المُنشأ يحتوي على إعدادات الإخراج الصحيحة. |

### ReturnValue

كائن [XmlWriter](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام كائن [XmlWriter](../) المحدد.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | كائن [XmlWriter](../) الذي تريد استخدامه ككاتب أساسي. |

### ReturnValue

كائن [XmlWriter](../) ملفوف حول كائن [XmlWriter](../) المحدد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام كائنات [XmlWriter](../) و[XmlWriterSettings](../../xmlwritersettings/) المحددة.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | كائن [XmlWriter](../) الذي تريد استخدامه ككاتب أساسي. |
| settings | SharedPtr\<XmlWriterSettings\> | كائن [XmlWriterSettings](../../xmlwritersettings/) المستخدم لتكوين مثيل [XmlWriter](../) الجديد. إذا كان هذا **nullptr**، يتم استخدام [XmlWriterSettings](../../xmlwritersettings/) بإعدادات افتراضية. إذا كان يتم استخدام [XmlWriter](../) مع طريقة XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)، يجب عليك استخدام قيمة XslCompiledTransform::get_OutputSettings للحصول على كائن [XmlWriterSettings](../../xmlwritersettings/) بالإعدادات الصحيحة. هذا يضمن أن كائن [XmlWriter](../) المُنشأ يحتوي على إعدادات الإخراج الصحيحة. |

### ReturnValue

كائن [XmlWriter](../) ملفوف حول كائن [XmlWriter](../) المحدد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام اسم الملف المحدد.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| outputFileName | const String\& | الملف الذي تريد الكتابة إليه. يقوم [XmlWriter](../) بإنشاء ملف في المسار المحدد ويكتب فيه بصيغة نص XML 1.0. يجب أن يكون **outputFileName** مسار نظام ملفات. |

### ReturnValue

كائن [XmlWriter](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


ينشئ مثيلًا جديدًا من [XmlWriter](../) باستخدام اسم الملف و كائن [XmlWriterSettings](../../xmlwritersettings/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| outputFileName | const String\& | الملف الذي تريد الكتابة إليه. يقوم [XmlWriter](../) بإنشاء ملف في المسار المحدد ويكتب فيه بصيغة نص XML 1.0. يجب أن يكون **outputFileName** مسار نظام ملفات. |
| settings | SharedPtr\<XmlWriterSettings\> | كائن [XmlWriterSettings](../../xmlwritersettings/) المستخدم لتكوين مثيل [XmlWriter](../) الجديد. إذا كان هذا **nullptr**، يتم استخدام [XmlWriterSettings](../../xmlwritersettings/) بإعدادات افتراضية. إذا كان يتم استخدام [XmlWriter](../) مع طريقة XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>)، يجب عليك استخدام قيمة XslCompiledTransform::get_OutputSettings للحصول على كائن [XmlWriterSettings](../../xmlwritersettings/) بالإعدادات الصحيحة. هذا يضمن أن كائن [XmlWriter](../) المُنشأ يحتوي على إعدادات الإخراج الصحيحة. |

### ReturnValue

كائن [XmlWriter](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
