---
title: "طريقة Aspose::Page::IMultiPageDevice::OpenPage"
linktitle: "OpenPage"
second_title: "Aspose.Page لـ C++"
description: "طريقة Aspose::Page::IMultiPageDevice::OpenPage. تقوم بالتحضير اللازم للجهاز قبل كل عملية رسم للصفحة في C++."
type: docs
weight: 400
url: /ar/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


يقوم بالتحضير الضروري للجهاز قبل عرض كل صفحة.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| العرض | عدد عائم | عرض الصفحة. |
| الارتفاع | عدد عائم | ارتفاع الصفحة. |

### ReturnValue

يرجع true إذا كان للصفحة المفتوحة رقم يقع ضمن نطاق أرقام الصفحات المختارة وإلا يرجع false.

## انظر أيضًا

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


يقوم بالتحضير الضروري للجهاز قبل عرض الصفحة.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| العنوان | System::String | عنوان الصفحة. |

### ReturnValue

true إذا كانت الصفحة ضمن النطاق المطلوب، وإلا false. يُستخدم في الأجهزة التي يمكنها رسم مجموعة محددة من أرقام الصفحات.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
