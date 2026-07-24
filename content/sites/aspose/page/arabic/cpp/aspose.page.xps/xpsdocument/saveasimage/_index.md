---
title: "طريقة Aspose::Page::XPS::XpsDocument::SaveAsImage"
linktitle: "SaveAsImage"
second_title: "Aspose.Page لـ C++"
description: "طريقة Aspose::Page::XPS::XpsDocument::SaveAsImage. تحفظ المستند كملف صورة. سيكون دليل الإخراج واسم الملف هو نفسه كما في ملف XPS المُدخل. سيتطابق امتداد الملف مع تنسيق الصورة في معامل \\\"options\\\". إذا تم تهيئة المستند باستخدام تدفق ليس FileStream، سيتم حفظ ملف الصورة في المجلد الحالي باستخدام قالب اسم ملف افتراضي في C++."
type: docs
weight: 5500
url: /ar/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


يحفظ المستند كملف صورة. سيكون دليل الإخراج واسم الملف هو نفسه كما في ملف [XPS](../../) المدخل. سيتطابق امتداد الملف مع تنسيق الصورة في معامل "options". إذا تم تهيئة المستند باستخدام تدفق ليس FileStream، سيتم حفظ ملف الصورة في المجلد الحالي باستخدام قالب اسم ملف افتراضي.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| خيارات | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | خيارات حفظ المستند بتنسيق صورة نقطية. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


يحفظ المستند إلى ملف صورة في الدليل المحدد مع اسم الملف المحدد. سيتطابق امتداد الملف مع تنسيق الصورة في معامل \"options\".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| خيارات | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | خيارات حفظ المستند بتنسيق صورة نقطية. |
| outDir | System::String | دليل الإخراج حيث سيتم حفظ ملف الصورة. |
| fileNameTemplate | System::String | قالب اسم ملف الصورة (بدون امتداد). إذا كان ملف [XPS](../../) المدخل مكونًا من صفحة واحدة فسيكون الاسم هو اسم الملف بالضبط، وإلا "_[n]" حيث "n" هو رقم الصفحة بدءًا من 0، وسيتم إلحاق اللاحقة بهذا. سيتطابق امتداد الملف مع تنسيق الصورة في معامل "option". |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
