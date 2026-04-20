---
title: "System::Drawing::Graphics::DrawString method"
linktitle: "DrawString"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Graphics::DrawString method. يرسم السلسلة المحددة في الموقع المحدد باستخدام الخط والفرشاة المحددين في C++."
type: docs
weight: 2800
url: /ar/cpp/system.drawing/graphics/drawstring/
---
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


يرسم السلسلة المحددة في الموقع المحدد باستخدام الخط والفرشاة المحددين.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, float x, float y, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة المراد رسمها |
| font | const SharedPtr\<Font\>\& | خط للاستخدام |
| brush | const SharedPtr\<Brush\>\& | كائن [Brush](../../brush/) لاستخدامه في الرسم |
| x | float | الإحداثي X لموقع الزاوية العلوية اليسرى للسلسلة المرسومة |
| y | float | الإحداثي Y لموقع الزاوية العلوية اليسرى للسلسلة المرسومة |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | تم تحديد تنسيق السلسلة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


يرسم السلسلة المحددة في الموقع المحدد باستخدام الخط والفرشاة المحددين.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, PointF topLeft, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة المراد رسمها |
| font | const SharedPtr\<Font\>\& | خط للاستخدام |
| brush | const SharedPtr\<Brush\>\& | كائن [Brush](../../brush/) لاستخدامه في الرسم |
| topLeft | PointF | يحدد موقع الزاوية العلوية اليسرى للسلسلة المرسومة |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | تم تحديد تنسيق السلسلة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


يرسم السلسلة المحددة داخل المستطيل المحدد باستخدام الخط والفرشاة المحددين.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, RectangleF layoutRectangle, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة المراد رسمها |
| font | const SharedPtr\<Font\>\& | خط للاستخدام |
| brush | const SharedPtr\<Brush\>\& | كائن [Brush](../../brush/) لاستخدامه في الرسم |
| layoutRectangle | RectangleF | يحدد مستطيلًا لرسم السلسلة فيه |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | تم تحديد تنسيق السلسلة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
