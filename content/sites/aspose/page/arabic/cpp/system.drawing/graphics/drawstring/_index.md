---
title: "طريقة System::Drawing::Graphics::DrawString"
linktitle: "DrawString"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Drawing::Graphics::DrawString. تقوم برسم السلسلة المحددة في الموقع المحدد باستخدام الخط والفرشاة المحددين في C++."
type: docs
weight: 2800
url: /ar/cpp/system.drawing/graphics/drawstring/
---
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


يرسم السلسلة المحددة في الموقع المحدد باستخدام الخط والفرشاة المحددين.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, float x, float y, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة المراد رسمها |
| الخط | const SharedPtr\<Font\>\& | خط لاستخدامه |
| brush | const SharedPtr\<Brush\>\& | كائن [Brush](../../brush/) لاستخدامه في الرسم |
| x | عدد عائم | الإحداثي X لموقع الزاوية العلوية اليسرى للسلسلة المرسومة |
| y | عدد عائم | الإحداثي Y لموقع الزاوية العلوية اليسرى للسلسلة المرسومة |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | حدد تنسيق السلسلة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


يرسم السلسلة المحددة في الموقع المحدد باستخدام الخط والفرشاة المحددين.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, PointF topLeft, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة المراد رسمها |
| الخط | const SharedPtr\<Font\>\& | خط لاستخدامه |
| brush | const SharedPtr\<Brush\>\& | كائن [Brush](../../brush/) لاستخدامه في الرسم |
| topLeft | PointF | يحدد موقع الزاوية العلوية اليسرى للسلسلة المرسومة |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | حدد تنسيق السلسلة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


يرسم السلسلة المحددة في المستطيل المحدد باستخدام الخط والفرشاة المحددين.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, RectangleF layoutRectangle, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | السلسلة المراد رسمها |
| الخط | const SharedPtr\<Font\>\& | خط لاستخدامه |
| brush | const SharedPtr\<Brush\>\& | كائن [Brush](../../brush/) لاستخدامه في الرسم |
| layoutRectangle | RectangleF | يحدد مستطيلًا لرسم السلسلة داخله |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | حدد تنسيق السلسلة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
