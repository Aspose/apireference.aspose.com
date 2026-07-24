---
title: "طريقة Aspose::Page::XPS::XpsDocument::InsertPage"
linktitle: "InsertPage"
second_title: "Aspose.Page لـ C++"
description: "طريقة Aspose::Page::XPS::XpsDocument::InsertPage. تُدرج صفحة فارغة إلى المستند بحجم الصفحة الافتراضي عند الفهرس position في C++."
type: docs
weight: 4500
url: /ar/cpp/aspose.page.xps/xpsdocument/insertpage/
---
## XpsDocument::InsertPage(int32_t, bool) method


يدرج صفحة فارغة إلى المستند بحجم صفحة افتراضي في موضع *index* .

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, bool activate=true)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الفهرس | int32_t | الموضع الذي يجب إدراج الصفحة فيه. |
| تفعيل | bool | علامة تشير إلى ما إذا كان يجب اختيار الصفحة المُدخلة كصفحة نشطة. |

### ReturnValue

الصفحة المُدخلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, float, float, bool) method


يدرج صفحة فارغة إلى المستند بأبعاد محددة *width* و *height* في موضع *index* .

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, float width, float height, bool activate=true)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الفهرس | int32_t | الموضع الذي يجب إدراج الصفحة فيه. |
| العرض | عدد عائم | عرض صفحة جديدة. |
| الارتفاع | عدد عائم | ارتفاع صفحة جديدة. |
| تفعيل | bool | علامة تشير إلى ما إذا كان يجب اختيار الصفحة المُدخلة كصفحة نشطة. |

### ReturnValue

الصفحة المُدخلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) method


يدرج صفحة إلى المستند في موضع *index* .

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, System::SharedPtr<XpsModel::XpsPage> page, bool activate=true)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الفهرس | int32_t | الموضع الذي يجب إضافة الصفحة فيه. |
| page | System::SharedPtr\<XpsModel::XpsPage\> | [Page](../../../aspose.page/) لتُدرج. |
| تفعيل | bool | علامة تشير إلى ما إذا كان يجب اختيار الصفحة المُدخلة كصفحة نشطة. |

### ReturnValue

الصفحة المُدخلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
