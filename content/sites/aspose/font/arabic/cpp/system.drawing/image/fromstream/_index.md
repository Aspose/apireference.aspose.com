---
title: "طريقة System::Drawing::Image::FromStream"
linktitle: "FromStream"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Drawing::Image::FromStream. تُنشئ كائن Image من الدفق المحدد في C++."
type: docs
weight: 2900
url: /ar/cpp/system.drawing/image/fromstream/
---
## Image::FromStream method


ينشئ كائنًا من نوع [Image](../) من الدفق المحدد.

```cpp
static SharedPtr<Image> System::Drawing::Image::FromStream(const SharedPtr<System::IO::Stream> &stream, bool use_embedded_color_management=false, bool validate_image_data=true)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<System::IO::Stream\>\& | دفق يحتوي على بيانات الصورة |
| use_embedded_color_management | bool | متجاهل |
| validate_image_data | bool | متجاهل |

### ReturnValue

مؤشر مشترك إلى كائن [Image](../) الذي تم إنشاؤه.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../)
* Class [Stream](../../../system.io/stream/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
