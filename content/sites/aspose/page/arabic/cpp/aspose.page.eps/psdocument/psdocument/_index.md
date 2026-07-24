---
title: "Aspose::Page::EPS::PsDocument::PsDocument constructor"
linktitle: "PsDocument"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument constructor. يهيئ PsDocument فارغ. يُستخدم هذا المُنشئ فقط للعمليات الإضافية التي لا تتعلق بملفات PostScript، على سبيل المثال، تحويل الخطوط في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


يُهيئ [PsDocument](../) فارغًا. يُستخدم هذا المُنشئ فقط للعمليات الإضافية التي لا تتعلق بملفات PostScript، على سبيل المثال، تحويل الخطوط.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## انظر أيضًا

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


يُهيئ [PsDocument](../) باستخدام تدفق ملف PS/EPS.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | تدفق الإدخال لملف PS/EPS. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


يُهيئ [PsDocument](../) فارغًا بصفحة مهيأة.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | التدفق حيث يتم حفظ ملف PS/EPS. |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


يُهيئ مستند [PsDocument](../) فارغًا.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | التدفق حيث يتم حفظ ملف PS/EPS. |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |
| متعدد الصفحات | bool | إذا كان false فلن يتم تهيئة الصفحة. في هذه الحالة يجب إجراء تهيئة الصفحة عبر استدعاء صريح "openPage(width, height)". |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


يُهيئ مستند [PsDocument](../) فارغًا عندما يكون عدد صفحات مستند [Postscript](../../../aspose.page.eps.postscript/) معروفًا مسبقًا.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | التدفق حيث يتم حفظ ملف PS/EPS. |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |
| numberOfPages | int32_t | عدد الصفحات في مستند PostScript. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


يُهيئ [PsDocument](../) فارغًا بصفحة مهيأة.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| outPsFilePath | System::String | مسار ملف PS/EPS الناتج. |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


يُهيئ مستند [PsDocument](../) فارغًا.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| outPsFilePath | System::String | مسار ملف PS/EPS الناتج. |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |
| متعدد الصفحات | bool | إذا كان false فلن يتم تهيئة الصفحة. في هذه الحالة يجب إجراء تهيئة الصفحة عبر استدعاء صريح "openPage(width, height)". |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


يُهيئ مستند [PsDocument](../) فارغًا عندما يكون عدد صفحات مستند [Postscript](../../../aspose.page.eps.postscript/) معروفًا مسبقًا.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| outPsFilePath | System::String | مسار ملف PS/EPS الناتج. |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | مجموعة من المعلمات التي تتحكم في حفظ ملف PostScript. |
| numberOfPages | int32_t | عدد الصفحات في مستند PostScript. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


يُهيئ [PsDocument](../) باستخدام ملف PS/EPS إدخال.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| psFilePath | System::String | مسار ملف PS/EPS. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
