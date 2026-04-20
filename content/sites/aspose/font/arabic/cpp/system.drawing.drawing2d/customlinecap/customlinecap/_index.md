---
title: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap منشئ"
linktitle: "CustomLineCap"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap منشئ. يُنشئ كائنًا جديدًا من الفئة CustomLineCap التي تمثل قبعة خط معرفة من قبل المستخدم بالخصائص المحددة في C++."
type: docs
weight: 100
url: /ar/cpp/system.drawing.drawing2d/customlinecap/customlinecap/
---
## CustomLineCap::CustomLineCap constructor


يُنشئ كائنًا جديدًا من الفئة [CustomLineCap](../) التي تمثل قبعة خط معرفة من قبل المستخدم بالخصائص المحددة.

```cpp
System::Drawing::Drawing2D::CustomLineCap::CustomLineCap(const SharedPtr<GraphicsPath> &fillPath, const SharedPtr<GraphicsPath> &strokePath, LineCap baseCap=LineCap::Flat, float baseInset=0)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| fillPath | const SharedPtr\<GraphicsPath\>\& | يحدد ملءً للقبعة المخصصة |
| strokePath | const SharedPtr\<GraphicsPath\>\& | يحدد مخططًا للقبعة المخصصة |
| baseCap | LineCap | قبعة الخط الأساسية التي تُنشأ منها القبعة المخصصة |
| baseInset | float | يحدد المسافة بين الخط والقبعة |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../graphicspath/)
* Enum [LineCap](../../linecap/)
* Class [CustomLineCap](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Font for C++](../../../)
